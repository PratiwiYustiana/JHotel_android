package com.example.tiwi.jhotel_android_pratiwi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        private ArrayList<Hotel> listHotel= new ArrayList<>();
        private ArrayList<Room> listRoom = new ArrayList<>();
        private HashMap<Hotel, ArrayList<Room>> childMapping = new HashMap<>();
        private int currentUserId;

        Intent mIntent = getIntent();
        currentUserId = mIntent.getIntExtra("id cutomer", 0);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MenuListAdapter listAdapter;
        ExpandableListView expListView;
        expListView = (ExpandableListView) findViewById(R.id.expListView);

        listAdapter = new MenuListAdapter(MainActivity.this, listHotel, childMapping);
        expListView.setAdapter(listAdapter);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Room selected = childMapping.get(listHotel.get(groupPosition)).get(childPosition);
                Hotel hotel = listHotel.get(groupPosition);
                String nomor_kamar = selected.getRoomNumber();
                Intent childIntent = new Intent(MainActivity.this, BuatPesananActivity.class);
                childIntent.putExtra("id customer", currentUserId);
                childIntent.putExtra("nomor_kamar", nomor_kamar);
                childIntent.putExtra("id hotel", hotel.getId());
                startActivity(childIntent);
                return true;
            }
        });

    }



    public void refreshList() {
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonResponse = new JSONArray(response);
                    JSONObject e = jsonResponse.getJSONObject(0).getJSONObject("hotel");
                    JSONObject lokasi = e.getJSONObject("lokasi");
                    JSONObject room = e.getJSONObject("room");
                    listHotel.add(new Hotel(e.getInt("id"), e.getString("nama"), new Lokasi(lokasi.getDouble("x_coord"), lokasi.getDouble("y_coord"), lokasi.getString("deskripsi")), e.getInt("bintang")));
                    listRoom.add(new Room(room.getString("roomNumber"), room.getString("statusKamar"), room.getDouble("dailyTariff"), room.getString("tipeKamar")));
                    childMapping.put(listHotel.get(0),listRoom);
                } catch (JSONException e) {

                }
            }
        };
    }


}
