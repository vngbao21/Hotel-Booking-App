package com.example.angodafake.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.angodafake.Hotel_infor
import com.example.angodafake.PurchaseExtra
import com.example.angodafake.R
import com.example.angodafake.Utilities.HotelUtils
import com.example.angodafake.Utilities.PictureUtils
import com.example.angodafake.db.Hotel
import com.example.angodafake.db.Picture_Hotel
import com.example.angodafake.db.Purchase
import com.squareup.picasso.Picasso
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class PastCancelPurchaseAdapter(private val fragment: Fragment, private var past_cancelPurchase: MutableList<PurchaseExtra>) : RecyclerView.Adapter<PastCancelPurchaseAdapter.MyViewHolder>() {
    var onItemClick: ((PurchaseExtra) -> Unit)? = null
    private var listener: OnItemClickListener? = null
    interface OnItemClickListener {
        fun onItemClick(purchase: Purchase)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val past_cancelPurchaseItem = LayoutInflater.from(parent.context).inflate(R.layout.custom_past_cancel_purchase_adapter, parent, false)
        return MyViewHolder(past_cancelPurchaseItem)
    }

    override fun getItemCount(): Int {
        return past_cancelPurchase.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = past_cancelPurchase[position]

        holder.namehotel.text = currentItem.nameHotel
        Picasso.get().load(currentItem.imageHotel).into(holder.imagehotel)
        holder.timebooking.text = currentItem.Purchase?.time_booking
        holder.idorder.text = currentItem.Purchase?.ID.toString()

        if (currentItem.Purchase?.status_purchase == "DA_HOAN_TIEN") {
            holder.statuspurchase1.text = "Đã hoàn tiền"
        } else if (currentItem.Purchase?.status_purchase == "DA_THANH_TOAN"){
            holder.statuspurchase1.text = "Đã thanh toán"
        } else if (currentItem.Purchase?.status_purchase == "CHUA_HOAN_TIEN") {
            holder.statuspurchase2.text = "Chưa hoàn tiền"
        } else {
            holder.statuspurchase3.text = "Không hoàn tiền"
        }

        holder.checkin.text = format(currentItem.Purchase?.date_come.toString())
        holder.checkout.text = format(currentItem.Purchase?.date_go.toString())

        holder.reorderbtn.setOnClickListener {
//            Toast.makeText(context, "Press", Toast.LENGTH_SHORT).show()
            val arg = Bundle()
            val idUser = currentItem.Purchase?.ID_Owner
            arg.putString("Flow_1", "reorder")
            arg.putString("hotelPosition", currentItem.Purchase?.ID_Hotel)

            // Khởi tạo Fragment Filter và đính kèm Bundle
            val Fragment = idUser?.let { it1 -> Hotel_infor(it1) }
            Fragment?.arguments = arg

            val fragmentManager = fragment.requireActivity().supportFragmentManager
            if (Fragment != null) {
                fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, Fragment)
                    .addToBackStack(null)  // Để quay lại Fragment Home khi ấn nút Back
                    .commit()
            }
        }

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun format (temp: String) : String {
        val inputFormatter = DateTimeFormatter.ofPattern("d/M/yyyy")
        val outputFormatter = DateTimeFormatter.ofPattern("d 'thg' M, yyyy", Locale("vi"))

        val date = LocalDate.parse(temp, inputFormatter)
        val formattedDate = date.format(outputFormatter)

        return formattedDate
    }

    class MyViewHolder(past_cancelPurchaseItem: View) : RecyclerView.ViewHolder(past_cancelPurchaseItem) {
        val timebooking: TextView = past_cancelPurchaseItem.findViewById(R.id.time_booking)
        val idorder: TextView = past_cancelPurchaseItem.findViewById(R.id.id_order)
        val statuspurchase1: TextView = past_cancelPurchaseItem.findViewById(R.id.status1)
        val statuspurchase2: TextView = past_cancelPurchaseItem.findViewById(R.id.status2)
        val statuspurchase3: TextView = past_cancelPurchaseItem.findViewById(R.id.status3)
        val imagehotel: ImageView = past_cancelPurchaseItem.findViewById(R.id.image_hotel)
        val namehotel: TextView = past_cancelPurchaseItem.findViewById(R.id.name_hotel)
        val checkin: TextView = past_cancelPurchaseItem.findViewById(R.id.check_in)
        val checkout: TextView = past_cancelPurchaseItem.findViewById(R.id.check_out)
        val reorderbtn: Button = past_cancelPurchaseItem.findViewById(R.id.btn_reorder2)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(newList: List<PurchaseExtra>) {
        past_cancelPurchase = newList.toMutableList()
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }
}