package com.example.hp.applearn.activity.activitymonhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hp.applearn.R;
import com.example.hp.applearn.activity.activitydanhsachlop.LopTiengAnhActivity;
import com.example.hp.applearn.activity.activitydanhsachlop.LopTiengVietActivity;
import com.example.hp.applearn.activity.activitydanhsachlop.LopToanActivity;
import com.example.hp.applearn.activity.activitydanhsachlop.LopXaHoiActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgMonToan;
    private ImageView imgMonTiengViet;
    private ImageView imgMonTiengAnh;
    private ImageView imgMonXaHoi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }

    private void initViews() {
        imgMonToan = findViewById(R.id.img_mon_toan);
        imgMonTiengViet = findViewById(R.id.img_mon_tieng_viet);
        imgMonTiengAnh = findViewById(R.id.img_mon_tieng_anh);
        imgMonXaHoi = findViewById(R.id.img_mon_xa_hoi);

        imgMonToan.setOnClickListener(this);
        imgMonTiengViet.setOnClickListener(this);
        imgMonTiengAnh.setOnClickListener(this);
        imgMonXaHoi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_mon_tieng_anh:
                Intent intentTiengAnh = new Intent(this, LopTiengAnhActivity.class);
                startActivity(intentTiengAnh);
                break;
            case R.id.img_mon_tieng_viet:
                Intent intentTiengViet = new Intent(this, LopTiengVietActivity.class);
                startActivity(intentTiengViet);
                break;

            case R.id.img_mon_toan:
                Intent intentToan = new Intent(this, LopToanActivity.class);
                startActivity(intentToan);
                break;
            case R.id.img_mon_xa_hoi:
                Intent intentXaHoi = new Intent(this, LopXaHoiActivity.class);
                startActivity(intentXaHoi);

                break;
        }

    }
}

