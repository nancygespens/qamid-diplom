// Generated by view binder compiler. Do not edit!
package ru.iteco.fmhandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.iteco.fmhandroid.R;

public final class FragmentOurMissionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TopCustomAppBarBinding containerCustomAppBarIncludeOnFragmentOurMission;

  @NonNull
  public final RecyclerView ourMissionItemListRecyclerView;

  @NonNull
  public final TextView ourMissionTitleTextView;

  private FragmentOurMissionBinding(@NonNull LinearLayout rootView,
      @NonNull TopCustomAppBarBinding containerCustomAppBarIncludeOnFragmentOurMission,
      @NonNull RecyclerView ourMissionItemListRecyclerView,
      @NonNull TextView ourMissionTitleTextView) {
    this.rootView = rootView;
    this.containerCustomAppBarIncludeOnFragmentOurMission = containerCustomAppBarIncludeOnFragmentOurMission;
    this.ourMissionItemListRecyclerView = ourMissionItemListRecyclerView;
    this.ourMissionTitleTextView = ourMissionTitleTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOurMissionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOurMissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_our_mission, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOurMissionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_custom_app_bar_include_on_fragment_our_mission;
      View containerCustomAppBarIncludeOnFragmentOurMission = ViewBindings.findChildViewById(rootView, id);
      if (containerCustomAppBarIncludeOnFragmentOurMission == null) {
        break missingId;
      }
      TopCustomAppBarBinding binding_containerCustomAppBarIncludeOnFragmentOurMission = TopCustomAppBarBinding.bind(containerCustomAppBarIncludeOnFragmentOurMission);

      id = R.id.our_mission_item_list_recycler_view;
      RecyclerView ourMissionItemListRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (ourMissionItemListRecyclerView == null) {
        break missingId;
      }

      id = R.id.our_mission_title_text_view;
      TextView ourMissionTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (ourMissionTitleTextView == null) {
        break missingId;
      }

      return new FragmentOurMissionBinding((LinearLayout) rootView,
          binding_containerCustomAppBarIncludeOnFragmentOurMission, ourMissionItemListRecyclerView,
          ourMissionTitleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}