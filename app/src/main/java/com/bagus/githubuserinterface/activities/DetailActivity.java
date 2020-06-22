package com.bagus.githubuserinterface.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bagus.githubuserinterface.R;
import com.bagus.githubuserinterface.models.User;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_USER = "extra_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView username = findViewById(R.id.tv_username_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView company = findViewById(R.id.tv_company_detail);
        TextView location = findViewById(R.id.tv_location_detail);
        TextView repository = findViewById(R.id.tv_repository_detail);
        TextView follower = findViewById(R.id.tv_followers_detail);
        TextView following = findViewById(R.id.tv_following_detail);

        User user = getIntent().getParcelableExtra(Intent.EXTRA_USER);

        Glide.with(this).load(user.getPhoto()).into(imageView);
        username.setText(user.getUsername());
        name.setText(user.getName());
        company.setText(user.getCompany());
        location.setText(user.getLocation());
        repository.setText(user.getRepository());
        follower.setText(user.getFollower());
        following.setText(user.getFollowing());

    }
}
