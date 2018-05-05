package com.example.tiwi.jhotel_android_pratiwi;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;

public class MenuRequest extends StringRequest {
    private static final String Vacant_URL = "http://192.168.43.114:8080/vacantrooms";

    public MenuRequest(Response.Listener<String> listener){
        super(Method.GET, Vacant_URL, listener, null);


    }


}
