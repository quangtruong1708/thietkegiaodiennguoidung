package com.example.hp.applearn.activity.activitydanhsachlop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activitymonhoc.MonXaHoiActivity;

public class LopXaHoiActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llXaHoiLop1;
    private LinearLayout llXaHoiLop2;
    private LinearLayout llXaHoiLop3;
    private LinearLayout llXaHoiLop4;
    private LinearLayout llXaHoiLop5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop_xa_hoi);
        initViews();
    }

    private void initViews() {
        llXaHoiLop1 = findViewById(R.id.ll_xh_lop_1);
        llXaHoiLop2 = findViewById(R.id.ll_xh_lop_2);
        llXaHoiLop3 = findViewById(R.id.ll_xh_lop_3);
        llXaHoiLop4 = findViewById(R.id.ll_xh_lop_4);
        llXaHoiLop5 = findViewById(R.id.ll_xh_lop_5);
        llXaHoiLop1.setOnClickListener(this);
        llXaHoiLop2.setOnClickListener(this);
        llXaHoiLop3.setOnClickListener(this);
        llXaHoiLop4.setOnClickListener(this);
        llXaHoiLop5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_xh_lop_1:
                Intent intentxh1 = new Intent(this, MonXaHoiActivity.class);
                startActivity(intentxh1);
                break;
            case R.id.ll_xh_lop_2:
                Intent intentxh2 = new Intent(this, MonXaHoiActivity.class);
                startActivity(intentxh2);
                break;
            case R.id.ll_xh_lop_3:
                Intent intentxh3 = new Intent(this, MonXaHoiActivity.class);
                startActivity(intentxh3);
                break;
            case R.id.ll_xh_lop_4:
                Intent intentxh4 = new Intent(this, MonXaHoiActivity.class);
                startActivity(intentxh4);
                break;
            case R.id.ll_xh_lop_5:
                Intent intentxh5 = new Intent(this, MonXaHoiActivity.class);
                startActivity(intentxh5);
                break;
        }

    }
}
