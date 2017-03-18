package com.example.brionsilva.raven;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BagLocation extends AppCompatActivity {

    public static TextView Latitude = null;
    public static TextView Longitude = null;

    //Home button action method
    public void goHome6(View view)
    {
        Intent intent = new Intent(BagLocation.this, firstPage.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag_location);

        Longitude = (TextView) findViewById(R.id.longitudeTV);
        Latitude = (TextView) findViewById(R.id.latitudeTV);

        new getLatitude().execute("ddd", "fdf", "dfdf");
        new getLongitude().execute("ddd", "fdf", "dfdf");
    }

    //getLatitude method
    private class getLatitude extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {
            Latitude.setText(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {

        }

        @Override
        protected String doInBackground(String... params) {
            content = getContent();
            return content;
        }

        private String getContent() {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            HttpURLConnection urlConnection = null;
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL("https://api.thingspeak.com/channels/123846/fields/1/last?key=E9INMIY8A805YZY8");
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String read;

                while ((read = br.readLine()) != null) {

                    sb.append(read);
                }


                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                urlConnection.disconnect();
            }
            return sb.toString();
        }


    }

    //getLongitude method
    private class getLongitude extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            Longitude.setText(s);

        }

        @Override
        protected void onProgressUpdate(String... values) {

        }

        @Override
        protected String doInBackground(String... params) {
            content = getContent();
            return content;
        }

        private String getContent() {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            HttpURLConnection urlConnection = null;
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL("https://api.thingspeak.com/channels/123846/fields/2/last?key=E9INMIY8A805YZY8");
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String read;

                while ((read = br.readLine()) != null) {
                    sb.append(read);
                }


                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                urlConnection.disconnect();
            }
            return sb.toString();
        }


    }
}
