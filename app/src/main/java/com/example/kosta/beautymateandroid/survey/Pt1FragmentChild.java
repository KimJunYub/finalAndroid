package com.example.kosta.beautymateandroid.survey;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kosta.beautymateandroid.R;

public class Pt1FragmentChild extends Fragment {
    public static Pt1FragmentChild newInstance(){
        return new Pt1FragmentChild();
    }

    public Pt1FragmentChild() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pt1_child, container, false);

        return view;
    }
}
