package com.example.hp.applearn.activity.activitymonhoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activityhocbai.HBXaHoiActivity;
import com.example.hp.applearn.activity.activitykiemtra.KTXaHoiActivity;

public class MonXaHoiActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgXaHoiHocBai;
    private ImageView imgXaHoiKiemTra;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_xa_hoi);
        initViews();
    }

    private void initViews() {
        imgXaHoiHocBai = findViewById(R.id.img_xa_hoi_hoc_bai);
        imgXaHoiKiemTra = findViewById(R.id.img_xa_hoi_kiem_tra);
        imgXaHoiHocBai.setOnClickListener(this);
        imgXaHoiKiemTra.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_xa_hoi_hoc_bai:
                Intent intentHB = new Intent(this, HBXaHoiActivity.class);
                startActivity(intentHB);
                break;
            case R.id.img_xa_hoi_kiem_tra:
                Intent intentKT = new Intent(this, KTXaHoiActivity.class);
                startActivity(intentKT);
                break;

        }
    }
}
