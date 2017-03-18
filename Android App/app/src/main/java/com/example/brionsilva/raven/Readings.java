package com.example.brionsilva.raven;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;

public class Readings extends AppCompatActivity {

    private TextView ReadingsTV=null;
    private TextView ReadingTextView = null;
    private TextView Unit = null;

    //Pressure button action method
    public void getPressure(View view)
    {
        new getPressure().execute("ddd", "fdf", "dfdf");
    }
    //Humidity button action method
    public void getHumidity(View view)
    {
        new getHumidity().execute("ddd", "fdf", "dfdf");
    }
    //Altitude button action method
    public void getAltitude(View view)
    {
        new getAltitude().execute("ddd", "fdf", "dfdf");
    }
    //SLPressure button action method
    public void getSLPressure(View view)
    {
        new getSLPressure().execute("ddd", "fdf", "dfdf");
    }
    //Rain button action method
    public void getRain(View view)
    {
        new getRain().execute("ddd", "fdf", "dfdf");
    }
    //CO button action method
    public void getCOLevel(View view)
    {
        new getCOLevel().execute("ddd", "fdf", "dfdf");
    }

    //Home button action method
    public void goHome2(View view)
    {
        Intent intent = new Intent(Readings.this, firstPage.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readings);

        ReadingsTV = (TextView) findViewById(R.id.readingstv);
        Typeface font = Typeface.createFromAsset(getAssets(), "HelveticaNeueBd.ttf");
        ReadingsTV.setTypeface(font);

        ReadingTextView = (TextView) findViewById(R.id.valuetextView);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "HelveticaNeue.ttf");
        ReadingTextView.setTypeface(font1);

        Unit = (TextView) findViewById(R.id.unit);
        Unit.setTypeface(font1);
    }
    //getPressure method
    private class getPressure extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            ReadingTextView.setText(s);
            Unit.setText("mbar");

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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/2/last?key=REHOBWG80ORSBC8C");
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
    //Humidity Method
    private class getHumidity extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            ReadingTextView.setText(s);
            Unit.setText("%");


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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/4/last?key=REHOBWG80ORSBC8C");
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
    //Altitude Method
    private class getAltitude extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            ReadingTextView.setText(s);
            Unit.setText("m");

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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/5/last?key=REHOBWG80ORSBC8C");
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
    //SLPressure Method
    private class getSLPressure extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            ReadingTextView.setText(s);
            Unit.setText("Pascal");

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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/6/last?key=REHOBWG80ORSBC8C");
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
    //Rain Method
    private class getRain extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            Double rain = Double.valueOf(s);

            if(rain==0){

                ReadingTextView.setText("HIGH");
                Unit.setText("Possibility");

            }if(rain==1){

                ReadingTextView.setText("LOW");
                Unit.setText("Possibility");
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
    //COLevel Method
    private class getCOLevel extends AsyncTask<String, String, String> {
        String content = "";

        @Override
        protected void onPostExecute(String s) {

            Double co = Double.valueOf(s);

            if(co==0){

                ReadingTextView.setText("HIGH");
                Unit.setText("Level");

            }if(co==1){

                ReadingTextView.setText("LOW");
                Unit.setText("Level");
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
                URL url = new URL("https://api.thingspeak.com/channels/116206/fields/8/last?key=REHOBWG80ORSBC8C");
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
