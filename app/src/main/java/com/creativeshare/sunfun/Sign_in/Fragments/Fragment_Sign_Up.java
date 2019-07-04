package com.creativeshare.sunfun.Sign_in.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.creativeshare.sunfun.R;
import com.creativeshare.sunfun.Sign_in.Activities.SignInActivity;

public class Fragment_Sign_Up extends Fragment {
    private SignInActivity signInActivity;
    private TextView tv_login;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        signInActivity=(SignInActivity) getActivity();
        tv_login=view.findViewById(R.id.tv_login);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signInActivity.Back();
            }
        });

    }

    public static Fragment_Sign_Up newInstance()
    {
        return new Fragment_Sign_Up();
    }
}
