package com.example.tiwi.jhotel_android_pratiwi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class BuatPesananActivity extends AppCompatActivity {
    private int currentUserId;
    private int banyakHari;
    private int idHotel;
    private double tariff;
    private String roomNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent orderInt = getIntent();
        currentUserId = orderInt.getIntExtra("id customer", 0);
        roomNumber = orderInt.getStringExtra("nomor kamar", 0);
        idHotel = orderInt.getIntExtra("id hotel",0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_pesanan);

        final TextView total_biaya = (TextView) findViewById(R.id.total_biaya);
        final TextView tariff = (TextView) findViewById(R.id.tariff);
        final TextView room_number = (TextView) findViewById(R.id.room_number);
        final EditText durasi_hari = (EditText) findViewById(R.id.durasi_hari);
        final Button hitung = (Button) findViewById(R.id.hitung);
        final Button pesan = (Button) findViewById(R.id.pesan);

        hitung.setVisibility(View.VISIBLE);
        pesan.setVisibility(View.INVISIBLE);
        room_number.setText(roomNumber);
        tariff.setText(Double.toString(tariff));
        total_biaya.setText("0");

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung.setVisibility(View.INVISIBLE);
                pesan.setVisibility(View.VISIBLE);

                banyakHari = Integer.parseInt(durasi_hari.getText().toString());
                total_biaya.setText(Double.toString(tariff*banyakHari));

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            if (jsonResponse != null){
                                AlertDialog.Builder builder = new AlertDialog.Builder(BuatPesananActivity.this);
                                builder.setMessage("Booking success.")
                                        .create()
                                        .show();
                            }
                        }
                        catch (JSONException e){
                            AlertDialog.Builder builder = new AlertDialog.Builder(BuatPesananActivity.this);
                            builder.setMessage("Booking failed.")
                                    .create()
                                    .show();
                        }
                    }
                };
            }
        });
    }

}
