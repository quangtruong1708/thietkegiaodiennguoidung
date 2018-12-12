package com.example.hp.applearn.activity.activitydanhsachlop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activitymonhoc.MonTiengVietActivity;

public class LopTiengVietActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llTiengVietLop1;
    private LinearLayout llTiengVietLop2;
    private LinearLayout llTiengVietLop3;
    private LinearLayout llTiengVietLop4;
    private LinearLayout llTiengVietLop5;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop_tieng_viet);
        initViews();
    }

    private void initViews() {
        llTiengVietLop1 = findViewById(R.id.ll_tv_lop_1);
        llTiengVietLop2 = findViewById(R.id.ll_tv_lop_2);
        llTiengVietLop3 = findViewById(R.id.ll_tv_lop_3);
        llTiengVietLop4 = findViewById(R.id.ll_tv_lop_4);
        llTiengVietLop5 = findViewById(R.id.ll_tv_lop_5);
        llTiengVietLop1.setOnClickListener(this);
        llTiengVietLop2.setOnClickListener(this);
        llTiengVietLop3.setOnClickListener(this);
        llTiengVietLop4.setOnClickListener(this);
        llTiengVietLop5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_tv_lop_1:
                Intent intenttv1 = new Intent(this, MonTiengVietActivity.class);
                startActivity(intenttv1);
                break;
            case R.id.ll_tv_lop_2:
                Intent intenttv2 = new Intent(this, MonTiengVietActivity.class);
                startActivity(intenttv2);
                break;
            case R.id.ll_tv_lop_3:
                Intent intenttv3 = new Intent(this, MonTiengVietActivity.class);
                startActivity(intenttv3);
                break;
            case R.id.ll_tv_lop_4:
                Intent intenttv4 = new Intent(this, MonTiengVietActivity.class);
                startActivity(intenttv4);
                break;
            case R.id.ll_tv_lop_5:
                Intent intenttv5 = new Intent(this, MonTiengVietActivity.class);
                startActivity(intenttv5);
                break;
        }
    }
}
