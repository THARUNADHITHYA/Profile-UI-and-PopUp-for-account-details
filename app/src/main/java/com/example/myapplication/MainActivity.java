package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;
    int FollowersCount = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);



    }


    public void ShowPopup(View view)
    {
        TextView close;
        Button followBtn;
        myDialog.setContentView(R.layout.custom_design_popup);
        close = (TextView) myDialog.findViewById(R.id.closeBtn);
        followBtn = (Button) myDialog.findViewById(R.id.FollowBtn);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();



        TextView followersNo;
        followersNo = (TextView) myDialog.findViewById(R.id.FollowersNumber);

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FollowersCount +=1;
                followersNo.setText(Integer.toString(FollowersCount));
            }
        });

        Button UnfollowBtn = (Button) myDialog.findViewById(R.id.UnFollowBtn);
        UnfollowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FollowersCount -=1;
                followersNo.setText(Integer.toString(FollowersCount));
            }
        });

        followersNo.setText(Integer.toString(FollowersCount));

    }

}