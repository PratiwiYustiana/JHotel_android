package com.example.tiwi.jhotel_android_pratiwi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * java untuk request menu
 *
 * @author Pratiwi Yustiana
 * @version 08/05/2018
 */


public class MenuRequest extends StringRequest{

    private static final String Vacant_URL = "http://192.168.43.114:8080/vacantrooms";
    private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Vacant_URL, listener, null);
        params = new HashMap<>();

    }
    @Override
    public  Map<String, String> getParams(){
        return params;
    }
}