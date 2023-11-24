package com.example.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DailyMealAdapter;
import com.example.myfoodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Bữa Sáng","10% OFF","Bữa Sáng","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Bữa Trưa","10% OFF","Bữa Trưa","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Bữa Tối","10% OFF","Bữa Tối","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Đồ Ngọt","10% OFF","Đồ Ngọt","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffe","10% OFF","coffe","Description"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }


}