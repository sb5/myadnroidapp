package com.example.fartgallery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gameOver extends Activity {
//TextView hiscores;
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gameover);

    final Button b = (Button) findViewById(R.id.button1);
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Perform action on click
  
            Toast.makeText(gameOver.this, "button was pressed",
                    Toast.LENGTH_SHORT).show();
            try {
                JSONObject json = new JSONObject(); 
                json.put("timestamp", 1351181576.64078); 
                json.put("name", "engine_speed");
                json.put("value", 714.0);
                postData(json);
         
                JSONObject json2 = new JSONObject(); 
                json2.put("timestamp", 1351181576.7207818); 
                json2.put("name", "steering_wheel_angle");
                json2.put("value", 11.1633);
                postData(json2);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    });     
}

public void postData(JSONObject json) throws JSONException {
    HttpClient httpclient = new DefaultHttpClient();
String URL = "http://www.ltap.org/s.php";
    try { 
        HttpPost httppost = new HttpPost(URL);

        List<NameValuePair> nvp = new ArrayList<NameValuePair>(2);    
        nvp.add(new BasicNameValuePair("json", json.toString()));
        
        httppost.setEntity(new UrlEncodedFormEntity(nvp));
        HttpResponse response = httpclient.execute(httppost); 

        if(response != null) {
            InputStream is = response.getEntity().getContent();
            //input stream is response that can be shown back on android
            Toast.makeText(gameOver.this, (CharSequence) is,
                    Toast.LENGTH_SHORT).show();
        }else{       Toast.makeText(gameOver.this, "data Not sent",
                Toast.LENGTH_SHORT).show();}

        
    }catch (Exception e) {
        e.printStackTrace();
    } 
}

}