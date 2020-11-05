package com.example.logogame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnLevelClicked , InsideLevel.OnFragmentInteractionListener {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterActivity adapter;
    ArrayList <Integer>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayList=new ArrayList<>();

        setContentView(R.layout.activity_main);
        layoutManager=new LinearLayoutManager(this);
        recyclerView=findViewById(R.id.MA_levels_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AdapterActivity(MainActivity.this, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onLevelClicked(int itemPosition) {
        Toast.makeText(this, String.valueOf(++itemPosition), Toast.LENGTH_SHORT).show();
        recyclerView.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace( R.id.frame_layout,new InsideLevel()).commit();
    }

    @Override
    public void onFragmentInteraction(int position) {
        Toast.makeText(this, String.valueOf(++position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        recyclerView.setVisibility(View.VISIBLE);
    }
}
