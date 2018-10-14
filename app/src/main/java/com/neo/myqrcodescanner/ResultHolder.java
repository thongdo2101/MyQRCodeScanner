package com.neo.myqrcodescanner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultHolder extends AppCompatActivity {
    public static TextView tvresult;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_creator:
                    return true;
                case R.id.nav_scanner:
                    Intent intent = new Intent(getThis(), ScanActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_result:
                    return true;
            }
            return false;
        }
    };
    public ResultHolder getThis() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_holder);
        tvresult = (TextView) findViewById(R.id.tvresult);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
