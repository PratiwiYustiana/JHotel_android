package com.example.tiwi.jhotel_android_pratiwi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * java untuk request fetch pesanan
 *
 * @author Pratiwi Yustiana
 * @version 08/05/2018
 */


public class PesananFetchRequest extends StringRequest {
    private static final String PesananFetch_URL = "http://192.168.43.114:8080/pesanancustomer/";
    private Map<String, String> params;

    public PesananFetchRequest(String id_customer, Response.Listener<String> listener) {
        super(Method.GET, PesananFetch_URL +id_customer, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

