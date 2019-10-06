package com.example.rahamsutan.webviewentertainment;

import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;

public class MovlistActivity extends Activity implements OnItemClickListener {
    private WebView webView;
    private static final String[] items = { "Ant Man 2", "Transylvania", "MI:Fallout",
            "The Nun", "Purge", "Skyscraper" };

    private int[] imageID = { R.drawable.antman, R.drawable.hotel, R.drawable.mission,
            R.drawable.nun, R.drawable.purge, R.drawable.skyscrapper };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movlist_activity);
        GridView g = (GridView) findViewById(R.id.grid);

        g.setAdapter(new IconAdapter());

        g.setOnItemClickListener(this);
    }
    private class IconAdapter extends ArrayAdapter<String> {
        // konstruktor memanggil method super() dari class parent nya
        public IconAdapter() {
            super(MovlistActivity.this, R.layout.cell, items);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup
                parent) {
            View row = convertView;
            if (row == null) {
                LayoutInflater inflater = getLayoutInflater();
                row = inflater.inflate(R.layout.cell, parent, false);
            }
            ImageView imageView = (ImageView)
                    row.findViewById(R.id.imageView1);
            TextView keterangan = (TextView)
                    row.findViewById(R.id.keterangan);

            imageView.setScaleType(ScaleType.FIT_XY);

            keterangan.setText(items[position]);
            imageView.setImageResource(imageID[position]);

            return row;
        }
    }
    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int p, long arg3) {
        Toast.makeText(MovlistActivity.this, items[p] + " picked!",
                Toast.LENGTH_SHORT).show();

        final Dialog dialog;
        Button dialobButton, detail;




        switch(items[p]){
            case "Ant Man 2":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.antman_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                detail = (Button) dialog.findViewById(R.id.detail);

                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });

                dialog.show();
                break;
            case "Transylvania":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.transylvania_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                detail = (Button) dialog.findViewById(R.id.detail);

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });
                dialog.show();
                break;
            case "MI:Fallout":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fallout_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                detail = (Button) dialog.findViewById(R.id.detail);

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });
                dialog.show();
                break;
            case "The Nun":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.nun_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            case "Purge":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.purge_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                detail = (Button) dialog.findViewById(R.id.detail);

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });
                dialog.show();
                break;
            case "Skyscraper":
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.sky_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                detail = (Button) dialog.findViewById(R.id.detail);

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });
                dialog.show();
                break;
            default:
                dialog = new Dialog(arg1.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.alert_layout);
                dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                detail = (Button) dialog.findViewById(R.id.detail);

                detail.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        dialog.dismiss();
                        setContentView(R.layout.webview_activity);
                        webView = (WebView) findViewById(R.id.webview);
                        webView.setWebViewClient(new WebViewClient());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl("http://www.google.com");
                    }
                });
                dialog.show();
                break;
        }



    }

}
