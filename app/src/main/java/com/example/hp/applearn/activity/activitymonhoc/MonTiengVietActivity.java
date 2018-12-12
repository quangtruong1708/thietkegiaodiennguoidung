package com.example.hp.applearn.activity.activitymonhoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activityhocbai.HBTiengVietActivity;
import com.example.hp.applearn.activity.activitykiemtra.KTTiengVietAcivity;

public class MonTiengVietActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgTiengVietHocBai;
    private ImageView imgTiengVietKiemTra;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_tieng_viet);
        initViews();
    }

    private void initViews() {
        imgTiengVietHocBai = findViewById(R.id.img_tieng_viet_hoc_bai);
        imgTiengVietKiemTra = findViewById(R.id.img_tieng_viet_kiem_tra);
        imgTiengVietHocBai.setOnClickListener(this);
        imgTiengVietKiemTra.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.img_tieng_viet_hoc_bai:
                Intent intentHB = new Intent(this, HBTiengVietActivity.class);
                startActivity(intentHB);
                break;

            case R.id.img_tieng_viet_kiem_tra:
                Intent intentKT = new Intent(this, KTTiengVietAcivity.class);
                startActivity(intentKT);
                break;
        }

    }
}
