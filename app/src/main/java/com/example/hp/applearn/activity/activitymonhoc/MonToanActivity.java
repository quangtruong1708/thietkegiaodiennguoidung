package com.example.hp.applearn.activity.activitymonhoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activityhocbai.HBToanActivity;
import com.example.hp.applearn.activity.activitykiemtra.KTToanActivity;

public class MonToanActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgToanHocBai;
    private ImageView imgToanKiemTra;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_toan);
        initViews();
    }

    private void initViews() {
        imgToanHocBai = findViewById(R.id.img_toan_hoc_bai);
        imgToanKiemTra = findViewById(R.id.img_toan_kiem_tra);
        imgToanHocBai.setOnClickListener(this);
        imgToanKiemTra.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_toan_hoc_bai:
                Intent intentHB = new Intent(this, HBToanActivity.class);
                startActivity(intentHB);
                break;
            case R.id.img_toan_kiem_tra:
                Intent intentKT = new Intent(this, KTToanActivity.class);
                startActivity(intentKT);
                break;
        }
    }
}
