package com.example.myfoodapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
   Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeHorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHorAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.cf_daxay,"Đá Xay","10:00 - 23:00","4","Min - $50"));
            homeVerModels.add(new HomeVerModel(R.drawable.cf_den,"Đen","09:00 - 22:00","5","Min - $40"));
            homeVerModels.add(new HomeVerModel(R.drawable.cf_dua,"Dừa","07:00 - 12:00","5","Min - $60"));
            homeVerModels.add(new HomeVerModel(R.drawable.cf_muoi,"Muối","13:00 - 23:00","1","Min - $30"));
            homeVerModels.add(new HomeVerModel(R.drawable.cf_sua,"Sữa","13:00 - 23:00","1","Min - $30"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();
                    if (position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.cf_daxay,"Đá Xay","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cf_den,"Đen","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cf_dua,"Dừa","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cf_muoi,"Muối","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cf_sua,"Sữa","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.bm_cha,"Chả","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bm_heoquay,"Heo Quay","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bm_thapcam,"Thập Cẩm","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bm_thitnuong,"Thịt Nướng","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bm_trung,"Trứng","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.kem_cay,"Kem Cây","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.kem_dua,"Kem Dừa","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.kem_ly,"Kem Ly","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.kem_ocque,"Kem Ốc Quế","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.kem_traicay,"Trái Cây","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.nuoc_bia,"Bia","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.nuoc_coca,"Cocacola","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.nuoc_ep,"Ép Trái Cây","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.nuoc_loc,"Lọc","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.nuoc_sting,"Sting","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.com_ga,"Gà","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.com_haisan,"Hải Sản","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.com_tho,"Thố","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.com_suong,"Sường","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.com_tron,"Trộn","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 5){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.bun_daumamtom,"Đậu Mắm Tôm","10:00 - 23:00","4","Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bun_gio,"Giò","09:00 - 22:00","5","Min - $40"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bun_haisan,"Hải Sản","07:00 - 12:00","5","Min - $60"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bun_tai,"Tái","13:00 - 23:00","1","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bun_thitnuong,"Thịt Nướng","13:00 - 23:00","1","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if(select){
                if(position ==0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
