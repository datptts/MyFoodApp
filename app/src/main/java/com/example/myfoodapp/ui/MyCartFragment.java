package com.example.myfoodapp.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myfoodapp.MainActivity;
import com.example.myfoodapp.R;
import com.example.myfoodapp.activities.LoginActivity;
import com.example.myfoodapp.activities.RegistrationActivity;
import com.example.myfoodapp.adapters.CartAdapter;
import com.example.myfoodapp.models.CartModel;
import com.example.myfoodapp.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cartrec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.bun_thitnuong,"Thịt Nướng","30","5"));
        list.add(new CartModel(R.drawable.bm_heoquay,"Heo Quay","30","4"));
        list.add(new CartModel(R.drawable.kem_dua,"Dừa","10","3"));
        list.add(new CartModel(R.drawable.com_ga,"Gà","110","4.5"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);


        return view;


    }

}