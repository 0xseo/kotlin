// Generated by view binder compiler. Do not edit!
package com.example.ch11_jetpack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ch11_jetpack.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecyclerviewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView itemData;

  @NonNull
  public final LinearLayout itemRoot;

  private ItemRecyclerviewBinding(@NonNull LinearLayout rootView, @NonNull TextView itemData,
      @NonNull LinearLayout itemRoot) {
    this.rootView = rootView;
    this.itemData = itemData;
    this.itemRoot = itemRoot;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecyclerviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecyclerviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recyclerview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecyclerviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_data;
      TextView itemData = ViewBindings.findChildViewById(rootView, id);
      if (itemData == null) {
        break missingId;
      }

      LinearLayout itemRoot = (LinearLayout) rootView;

      return new ItemRecyclerviewBinding((LinearLayout) rootView, itemData, itemRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
