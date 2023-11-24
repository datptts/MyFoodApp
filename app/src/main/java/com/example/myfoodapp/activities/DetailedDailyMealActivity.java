package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DetailedDailyAdapter;
import com.example.myfoodapp.models.DetailedDailyModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_imgg);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("Bữa Sáng")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bm_cha,"Chả","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bm_heoquay,"Heo Quay","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bm_thapcam,"Thập Cẩm","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bm_thitnuong,"Thịt Nướng","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bm_trung,"Trứng","Description","5.0","30","7:00 - 12:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("Đồ Ngọt")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.kem_traicay,"traicay","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.kem_ly,"ly","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.kem_ocque,"ocque","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.kem_dua,"dua","Description","5.0","30","7:00 - 12:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("Bữa Tối")){

            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bun_tai,"tai","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bun_gio,"gio","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bun_thitnuong,"thit nuong","Description","5.0","30","7:00 - 12:00"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("coffe")){

            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cf_dua,"dua","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cf_daxay,"da xay","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cf_sua,"sua","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cf_den,"den","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cf_muoi,"muoi","Description","5.0","30","7:00 - 12:00"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("Bữa Trưa")){

            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.com_haisan,"hai san","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.com_ga,"ga","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.com_suong,"suong","Description","5.0","30","7:00 - 12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.com_tron,"tron","Description","5.0","30","7:00 - 12:00"));

            dailyAdapter.notifyDataSetChanged();
        }
    }
}