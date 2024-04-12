// Generated by view binder compiler. Do not edit!
package com.example.angodafake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.angodafake.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyRoomBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView border1;

  @NonNull
  public final TextView border2;

  @NonNull
  public final TextView border3;

  @NonNull
  public final TextView border4;

  @NonNull
  public final TextView border5;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final ViewPager2 pager;

  @NonNull
  public final TabLayout tabHandler;

  @NonNull
  public final Toolbar toolbar;

  private FragmentMyRoomBinding(@NonNull RelativeLayout rootView, @NonNull TextView border1,
      @NonNull TextView border2, @NonNull TextView border3, @NonNull TextView border4,
      @NonNull TextView border5, @NonNull ImageButton btnBack, @NonNull ViewPager2 pager,
      @NonNull TabLayout tabHandler, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.border1 = border1;
    this.border2 = border2;
    this.border3 = border3;
    this.border4 = border4;
    this.border5 = border5;
    this.btnBack = btnBack;
    this.pager = pager;
    this.tabHandler = tabHandler;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_room, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyRoomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.border1;
      TextView border1 = ViewBindings.findChildViewById(rootView, id);
      if (border1 == null) {
        break missingId;
      }

      id = R.id.border2;
      TextView border2 = ViewBindings.findChildViewById(rootView, id);
      if (border2 == null) {
        break missingId;
      }

      id = R.id.border3;
      TextView border3 = ViewBindings.findChildViewById(rootView, id);
      if (border3 == null) {
        break missingId;
      }

      id = R.id.border4;
      TextView border4 = ViewBindings.findChildViewById(rootView, id);
      if (border4 == null) {
        break missingId;
      }

      id = R.id.border5;
      TextView border5 = ViewBindings.findChildViewById(rootView, id);
      if (border5 == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.pager;
      ViewPager2 pager = ViewBindings.findChildViewById(rootView, id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.tab_handler;
      TabLayout tabHandler = ViewBindings.findChildViewById(rootView, id);
      if (tabHandler == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentMyRoomBinding((RelativeLayout) rootView, border1, border2, border3,
          border4, border5, btnBack, pager, tabHandler, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}