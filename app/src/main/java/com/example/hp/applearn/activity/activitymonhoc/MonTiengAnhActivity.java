package com.example.hp.applearn.activity.activitymonhoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activityhocbai.HBTiengAnhActivity;
import com.example.hp.applearn.activity.activitykiemtra.KTTiengAnhActivity;

public class MonTiengAnhActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgTiengAnhHocBai;
    private ImageView imgTiengAnhKiemTra;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_tieng_anh);
        initViews();

    }

    private void initViews() {
        imgTiengAnhHocBai = findViewById(R.id.img_tieng_anh_hoc_bai);
        imgTiengAnhKiemTra = findViewById(R.id.img_tieng_anh_kiem_tra);
        imgTiengAnhHocBai.setOnClickListener(this);
        imgTiengAnhKiemTra.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_tieng_anh_hoc_bai:
                Intent intentHB = new Intent(this, HBTiengAnhActivity.class);
                startActivity(intentHB);
                break;

            case R.id.img_tieng_anh_kiem_tra:
                Intent intentKT = new Intent(this, KTTiengAnhActivity.class);
                startActivity(intentKT);
                break;
        }
    }
}
