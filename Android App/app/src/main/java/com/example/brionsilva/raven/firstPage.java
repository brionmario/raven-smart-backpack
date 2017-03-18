package com.example.brionsilva.raven;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;

public class firstPage extends AppCompatActivity {

    private TextView Temperature = null;
    private TextView Condition = null;
    //private TextView Raining = null;
    private ImageView WeatherIcon = null;
    private TextView Date = null;

    //Reading button action method
    public void switchToReadings(View view)
    {
        Intent intent = new Intent(firstPage.this, Readings.class);
        startActivity(intent);
    }

    //Location button action method
    public void switchToLocation(View view)
    {
        Intent intent = new Intent(firstPage.this, Location.class);
        startActivity(intent);
    }
    //BagLocation button action method
    public void switchToBagLocation(View view)
    {
        Intent intent = new Intent(firstPage.this, BagLocation.class);
        startActivity(intent);
    }

    //About button action method
    public void switchToAbout(View view)
    {
        Intent intent = new Intent(firstPage.this, AboutPage.class);
        startActivity(intent);
    }
    //Team button action method
    public void switchToTeam(View view)
    {
        Intent intent = new Intent(firstPage.this, OurTeam.class);
        startActivity(intent);
    }
    //Help button action method
    public void switchToHelp(View view)
    {
        Intent intent = new Intent(firstPage.this, HelpPage.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Temperature = (TextView) findViewById(R.id.temperature);
        Typeface font = Typeface.createFromAsset(getAssets(), "HelveticaNeue.ttf");
        Temperature.setTypeface(font);

        Condition = (TextView) findViewById(R.id.condition);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "HelveticaNeueMed.ttf");
        Condition.setTypeface(font1);

        Date = (TextView) findViewById(R.id.date) ;
        Typeface font2 = Typeface.createFromAsset(getAssets(), "HelveticaNeue.ttf");
        Condition.setTypeface(font2);


        //Raining = (TextView) findViewById(R.id.rain);
        WeatherIcon = (ImageView) findViewById(R.id.weatherIconimageView);
        new setTemperature().execute("ddd", "fdf", "dfdf");
        new setRaining().execute("ddd", "fdf", "dfdf");

    }

    private class setTemperature extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            RelativeLayout  relativeLayout = (RelativeLayout) findViewById(R.id.background);

            Calendar rightNow = Calendar.getInstance();
            //getting the date
            int date = rightNow.get(Calendar.DATE);
            int month = rightNow.get(Calendar.MONTH);
            month = month +1;
            int year = rightNow.get(Calendar.YEAR);
            //getting the time
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            int minute = rightNow.get(Calendar.MINUTE);
            //int second = rightNow.get(Calendar.SECOND);

            //Convert the values to string
            String dom = String.valueOf(date);
            String moy = String.valueOf(month);
            String currentYear = String.valueOf(year);

            String hod = String.valueOf(hour);
            String mod = String.valueOf(minute);
            //String sod = String.valueOf(second);

            Temperature.setText(s+"°C");

            Date.setText(dom + "/" + moy + "/" + currentYear +" "+ hod +":"+mod);
            //setting the condition depending on the temperature
            Double temp = Double.valueOf(s);

            if(temp>30 && (hour>=0 && hour<6)){
                Condition.setText("Feeling Warm");
                WeatherIcon.setBackgroundResource(R.drawable.clearnighticon);
                relativeLayout.setBackgroundResource(R.drawable.sunnynight);
            }
            if(temp>30 && (hour>=6 && hour<8)){
                Condition.setText("Sunrise");
                WeatherIcon.setBackgroundResource(R.drawable.sunnyeveningicon);
                relativeLayout.setBackgroundResource(R.drawable.sunnysunrise);
            }
            if(temp>30 && (hour>=8 && hour<16)){
                Condition.setText("Bright & Sunny");
                WeatherIcon.setBackgroundResource(R.drawable.sunnydayicon);
                relativeLayout.setBackgroundResource(R.drawable.sunnyday);
            }
            if(temp>30 && (hour>=16 && hour<19)){
                Condition.setText("Sunny Evening");
                WeatherIcon.setBackgroundResource(R.drawable.sunnyeveningicon);
                relativeLayout.setBackgroundResource(R.drawable.sunnyevening);
            }
            if(temp>30 && (hour>=19)){
                Condition.setText("Warm Night");
                WeatherIcon.setBackgroundResource(R.drawable.clearnighticon);
                relativeLayout.setBackgroundResource(R.drawable.sunnynight);
            }

            //greater than 30
            if((temp>25 && temp<=30) && (hour>=0 && hour<6)){
                Condition.setText("Clear Sky");
                WeatherIcon.setBackgroundResource(R.drawable.clearnighticon);
                relativeLayout.setBackgroundResource(R.drawable.clearnight);

            }
            if((temp>25 && temp<=30) && (hour>=6 && hour<8)){
                Condition.setText("Sunrise");
                WeatherIcon.setBackgroundResource(R.drawable.sunnyeveningicon);
                relativeLayout.setBackgroundResource(R.drawable.clearsunrise);
            }
            if((temp>25 && temp<=30) && (hour>=8 && hour<16)){
                Condition.setText("Clear");
                WeatherIcon.setBackgroundResource(R.drawable.cleardayicon);
                relativeLayout.setBackgroundResource(R.drawable.clearday);

            }
            if((temp>25 && temp<=30) && (hour>=16 && hour<19)){
                Condition.setText("Partially Cloudy");
                WeatherIcon.setBackgroundResource(R.drawable.partiallycloudyicon);
                relativeLayout.setBackgroundResource(R.drawable.clearday);

            }
            if((temp>25 && temp<=30) && (hour>=19)){
                Condition.setText("Clear Night");
                WeatherIcon.setBackgroundResource(R.drawable.clearnighticon);
                relativeLayout.setBackgroundResource(R.drawable.clearnight);

            }

            //greater than 25
            if((temp>20 && temp<=25) && (hour>=0 && hour<6)) {
                Condition.setText("Cloudy Sky");
                WeatherIcon.setBackgroundResource(R.drawable.partiallycloudynighticon);
                relativeLayout.setBackgroundResource(R.drawable.cloudynight);

            }
            if((temp>20 && temp<=25) && (hour>=6 && hour<8)) {
                Condition.setText("Sunrise");
                WeatherIcon.setBackgroundResource(R.drawable.sunnyeveningicon);
                relativeLayout.setBackgroundResource(R.drawable.cloudysunrise);
            }
            if((temp>20 && temp<=25) && (hour>=8 && hour<16)) {
                Condition.setText("Cloudy Morning");
                WeatherIcon.setBackgroundResource(R.drawable.cloudyicon);
                relativeLayout.setBackgroundResource(R.drawable.cloudyday);
            }
            if((temp>20 && temp<=25) && (hour>=16 && hour<19)) {
                Condition.setText("Cloudy Evening");
                WeatherIcon.setBackgroundResource(R.drawable.cloudyicon);
                relativeLayout.setBackgroundResource(R.drawable.cloudyevening);
            }
            if((temp>20 && temp<=25) && (hour>=19)) {
                Condition.setText("Cloudy Night");
                WeatherIcon.setBackgroundResource(R.drawable.clearnighticon);
                relativeLayout.setBackgroundResource(R.drawable.cloudynight);
            }
            //greater than 15
            if((temp>0 && temp<=20) && (hour>=0 && hour<16)) {
                Condition.setText("Gloomy");
                WeatherIcon.setBackgroundResource(R.drawable.gloomydayicon);
                relativeLayout.setBackgroundResource(R.drawable.gloomynight);
            }
            if((temp>0 && temp<=20) && (hour>=16 && hour<19)) {
                Condition.setText("Gloomy Evening");
                WeatherIcon.setBackgroundResource(R.drawable.gloomyeveningicon);
                relativeLayout.setBackgroundResource(R.drawable.gloomyevening);
            }
            if((temp>0 && temp<=20) && hour>=19) {
                Condition.setText("Gloomy Night");
                WeatherIcon.setBackgroundResource(R.drawable.gloomynighticon);
                relativeLayout.setBackgroundResource(R.drawable.gloomynight);
            }
        }

        @Override
        protected void onProgressUpdate(String... values) {
            Temperature.setText("background working....");
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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/1/last?key=REHOBWG80ORSBC8C");
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String read;

                while ((read = br.readLine()) != null) {
                    //System.out.println(read);
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

    //Raining Detection class
    private class setRaining extends AsyncTask<String, String, String> {
        String content = "";
        RelativeLayout  relativeLayout = (RelativeLayout) findViewById(R.id.background);
        @Override
        protected void onPostExecute(String s) {

            Calendar rightNow = Calendar.getInstance();
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);

            //Raining.setText(s);

            //setting the condition depending on the temperature
            Double rain = Double.valueOf(s);

            if(rain==0 && hour<18){
                Condition.setText("Raining");
                WeatherIcon.setBackgroundResource(R.drawable.rainydayicon);
                relativeLayout.setBackgroundResource(R.drawable.rainyday);

            }if(rain==0 && hour>18){
                Condition.setText("Rainy Night");
                WeatherIcon.setBackgroundResource(R.drawable.rainynighticon);
                relativeLayout.setBackgroundResource(R.drawable.rainynight);
            }

        }

        @Override
        protected void onProgressUpdate(String... values) {
            //Raining.setText("background working....");
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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/7/last?key=REHOBWG80ORSBC8C");
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String read;

                while ((read = br.readLine()) != null) {
                    //System.out.println(read);
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
