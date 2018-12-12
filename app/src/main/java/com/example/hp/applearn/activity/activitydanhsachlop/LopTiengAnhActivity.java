package com.example.hp.applearn.activity.activitydanhsachlop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activitymonhoc.MonTiengAnhActivity;

public class LopTiengAnhActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout llTiengAnhLop1;
    private LinearLayout llTiengAnhLop2;
    private LinearLayout llTiengAnhLop3;
    private LinearLayout llTiengAnhLop4;
    private LinearLayout llTiengAnhLop5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop_tieng_anh);
        initViews();
    }

    private void initViews() {
        llTiengAnhLop1 = findViewById(R.id.ll_ta_lop_1);
        llTiengAnhLop2 = findViewById(R.id.ll_ta_lop_2);
        llTiengAnhLop3 = findViewById(R.id.ll_ta_lop_3);
        llTiengAnhLop4 = findViewById(R.id.ll_ta_lop_4);
        llTiengAnhLop5 = findViewById(R.id.ll_ta_lop_5);
        llTiengAnhLop1.setOnClickListener(this);
        llTiengAnhLop2.setOnClickListener(this);
        llTiengAnhLop3.setOnClickListener(this);
        llTiengAnhLop4.setOnClickListener(this);
        llTiengAnhLop5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_ta_lop_1:
                Intent intentta1 = new Intent(this, MonTiengAnhActivity.class);
                startActivity(intentta1);
                break;
            case R.id.ll_ta_lop_2:
                Intent intentta2 = new Intent(this, MonTiengAnhActivity.class);
                startActivity(intentta2);
                break;
            case R.id.ll_ta_lop_3:
                Intent intentta3 = new Intent(this, MonTiengAnhActivity.class);
                startActivity(intentta3);
                break;
            case R.id.ll_ta_lop_4:
                Intent intentta4 = new Intent(this, MonTiengAnhActivity.class);
                startActivity(intentta4);
                break;
            case R.id.ll_ta_lop_5:
                Intent intentta5 = new Intent(this, MonTiengAnhActivity.class);
                startActivity(intentta5);
                break;

        }
    }
}
