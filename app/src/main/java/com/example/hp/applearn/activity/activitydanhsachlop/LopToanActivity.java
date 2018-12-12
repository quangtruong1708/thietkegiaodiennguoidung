package com.example.hp.applearn.activity.activitydanhsachlop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activitymonhoc.MonToanActivity;

public class LopToanActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llToanLop1;
    private LinearLayout llToanLop2;
    private LinearLayout llToanLop3;
    private LinearLayout llToanLop4;
    private LinearLayout llToanLop5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop_toan);
        initView();
    }

    private void initView() {
        llToanLop1 = findViewById(R.id.ll_t_lop_1);
        llToanLop2 = findViewById(R.id.ll_t_lop_2);
        llToanLop3 = findViewById(R.id.ll_t_lop_3);
        llToanLop4 = findViewById(R.id.ll_t_lop_4);
        llToanLop5 = findViewById(R.id.ll_t_lop_5);
        llToanLop1.setOnClickListener(this);
        llToanLop2.setOnClickListener(this);
        llToanLop3.setOnClickListener(this);
        llToanLop4.setOnClickListener(this);
        llToanLop5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_t_lop_1:
                Intent intentt1 = new Intent(this, MonToanActivity.class);
                startActivity(intentt1);
                break;

            case R.id.ll_t_lop_2:
                Intent intentt2 = new Intent(this, MonToanActivity.class);
                startActivity(intentt2);
                break;

            case R.id.ll_t_lop_3:
                Intent intentt3 = new Intent(this, MonToanActivity.class);
                startActivity(intentt3);
                break;

            case R.id.ll_t_lop_4:
                Intent intentt4 = new Intent(this, MonToanActivity.class);
                startActivity(intentt4);
                break;

            case R.id.ll_t_lop_5:
                Intent intentt5 = new Intent(this, MonToanActivity.class);
                startActivity(intentt5);
                break;
        }

    }
}
