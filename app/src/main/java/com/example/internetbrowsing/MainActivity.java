package com.example.internetbrowsing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText searchEditText;
    private Button searchButton;
    private WebView webView;
    //web component brave search.
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);
        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        searchButton.setOnClickListener(v -> {
            String query = searchEditText.getText().toString();
            if (!query.isEmpty())
            {
                String url = "https://search.brave.com/search?q=" + query;
                webView.loadUrl(url);
            }
        });
    }
    // this new line
}