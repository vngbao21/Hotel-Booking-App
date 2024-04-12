// Generated by view binder compiler. Do not edit!
package com.example.angodafake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.angodafake.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBookmarkBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout bookmark;

  @NonNull
  public final TextView bookmarkTittle;

  @NonNull
  public final RecyclerView contactsRV;

  private FragmentBookmarkBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout bookmark, @NonNull TextView bookmarkTittle,
      @NonNull RecyclerView contactsRV) {
    this.rootView = rootView;
    this.bookmark = bookmark;
    this.bookmarkTittle = bookmarkTittle;
    this.contactsRV = contactsRV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBookmarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBookmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_bookmark, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBookmarkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout bookmark = (ConstraintLayout) rootView;

      id = R.id.bookmarkTittle;
      TextView bookmarkTittle = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkTittle == null) {
        break missingId;
      }

      id = R.id.contactsRV;
      RecyclerView contactsRV = ViewBindings.findChildViewById(rootView, id);
      if (contactsRV == null) {
        break missingId;
      }

      return new FragmentBookmarkBinding((ConstraintLayout) rootView, bookmark, bookmarkTittle,
          contactsRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}