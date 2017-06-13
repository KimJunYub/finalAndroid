package com.example.kosta.beautymateandroid.survey;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kosta.beautymateandroid.R;

public class Pt1Survey extends Fragment implements View.OnClickListener {
    int fragmentController = 0;
    Fragment fg;

    public static Pt1Survey newInstance() {
        return new Pt1Survey();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_pt1_survey,container,false);
        Button btn_pt1_start = (Button) fv.findViewById(R.id.btn_pt1_next);
        btn_pt1_start.setOnClickListener(this);
        return fv;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pt1_next:
                fragmentController ++;
                //여기서 각번호 조건 처리
                goFragment();
                break;
            case R.id.btn_pt1_back:
                fragmentController --;
                goFragment();
                break;
            case R.id.btn_pt1_new:
                fg = Pt1Qu0FragmentChild.newInstance();
                setChildFragment(fg);
                break;
        }
    }

    private void goFragment(){
        if(fragmentController == 0 ) {
            fg = Pt1Qu0FragmentChild.newInstance();
            setChildFragment(fg);
        }else if (fragmentController == 1) {
            fg = Pt1Qu1FragmentChild.newInstance();
            setChildFragment(fg);
        }
    }

    private void setChildFragment(Fragment child){
        FragmentTransaction childFt = getChildFragmentManager().beginTransaction();

        if (!child.isAdded()){
            childFt.replace(R.id.pt1_qu_child_fragment, child);
            childFt.addToBackStack(null);
            childFt.commit();
        }
    }
}


