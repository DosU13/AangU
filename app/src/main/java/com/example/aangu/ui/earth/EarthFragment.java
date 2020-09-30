package com.example.aangu.ui.earth;

import android.os.Bundle;
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

public class EarthFragment extends Fragment {

    private EarthViewModel earthViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        earthViewModel =
                ViewModelProviders.of(this).get(EarthViewModel.class);
        View root = inflater.inflate(R.layout.fragment_earth, container, false);
        final TextView textView = root.findViewById(R.id.text_earth);
        earthViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        PlayGifView earthGif = (PlayGifView) root.findViewById(R.id.earth_gif);
        earthGif.setImageResource(R.drawable.earth);
        return root;
    }
}