package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.ConnectInterceptor;

public class MainActivity extends AppCompatActivity {

    String url = "http://wwww.baidu.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        final Call call = client.newCall(request);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Response response = call.execute();
//                    Log.d("adsd","response = " + response.body().string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
        call.enqueue(new Callback() {
            @Override
            public void onFailure( Call call,  IOException e) {
                Log.d("adsd","fail");
            }

            @Override
            public void onResponse( Call call,  Response response) throws IOException {
                Log.d("adsd","response = " + response.body().string());
            }
        });
        ConnectInterceptor c;

    }
}
