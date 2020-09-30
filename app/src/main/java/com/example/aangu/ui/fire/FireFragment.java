package com.example.aangu.ui.fire;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.aangu.PlayGifView;
import com.example.aangu.R;

import java.util.Objects;

public class FireFragment extends Fragment {

    private FireViewModel fireViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fireViewModel =
                ViewModelProviders.of(this).get(FireViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fire, container, false);
        final TextView textView = root.findViewById(R.id.text_fire);
        fireViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        PlayGifView fireGif = (PlayGifView) root.findViewById(R.id.fire_gif);
        fireGif.setImageResource(R.drawable.fire);

//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        ((Activity) requireContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        float width  = displayMetrics.widthPixels;
//        fireGif.setScaleX(width/600);
//        fireGif.setScaleY(width/600);
        return root;
    }
}