package com.gardify.groupielibrarysample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Item;
import com.xwray.groupie.OnItemClickListener;
import com.xwray.groupie.ViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyleView = findViewById(R.id.main_recycle_view);

        ArrayList<Friends> friendsArrayList = new ArrayList<>();

        friendsArrayList.add(new Friends("Adam", "adam@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Layla", "Layla@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Mono", "Mono@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Zee", "Zee@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Eny", "Eny@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Mary", "Mary@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Mary", "adam@gmail.com", R.drawable.ic_launcher_background));
        friendsArrayList.add(new Friends("Jay", "adam@gmail.com", R.drawable.ic_launcher_background));


        //create groupAdapter and add the adapter

        GroupAdapter groupAdapter = new GroupAdapter<ViewHolder>();
        for (Friends friend: friendsArrayList) {
            groupAdapter.add(new MyAdapter(friend));
        }

        groupAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull Item item, @NonNull View view) {
                Toast.makeText(MainActivity.this, "clicked" + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        mRecyleView.setAdapter(groupAdapter);
    }
}