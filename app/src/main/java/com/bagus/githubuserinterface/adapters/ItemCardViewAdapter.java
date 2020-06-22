package com.bagus.githubuserinterface.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bagus.githubuserinterface.R;
import com.bagus.githubuserinterface.activities.DetailActivity;
import com.bagus.githubuserinterface.models.User;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ItemCardViewAdapter extends RecyclerView.Adapter<ItemCardViewAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<User> listUser;

    public ItemCardViewAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, final int position) {
        holder.tvUsername.setText(getListUser().get(position).getUsername());
        holder.tvName.setText(getListUser().get(position).getName());
        holder.tvCompany.setText(getListUser().get(position).getCompany());
        holder.tvLocation.setText(getListUser().get(position).getLocation());
        holder.tvRepository.setText(getListUser().get(position).getRepository());
        holder.tvFollower.setText(getListUser().get(position).getFollower());
        holder.tvFollowing.setText(getListUser().get(position).getFollowing());
        Glide.with(context).load(getListUser().get(position).getPhoto()).into(holder.imgPhoto);

        // intent parcel able to detail
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_MOUNTAIN, listMountain.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListUser().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button button;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_card);
            tvName = itemView.findViewById(R.id.tv_name_card);
            tvDescription = itemView.findViewById(R.id.tv_desc_card);
            button = itemView.findViewById(R.id.button);
        }
    }
}
