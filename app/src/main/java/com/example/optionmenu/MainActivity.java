package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menumain,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this, "option 1 is selected", Toast.LENGTH_SHORT).show();
            case R.id.item2:
                Toast.makeText(this, "option 2 is selected", Toast.LENGTH_SHORT).show();
            case R.id.item3:
                Toast.makeText(this, "option 3 is selected", Toast.LENGTH_SHORT).show();
            case R.id.item4:
                Toast.makeText(this, "option 4 is selected", Toast.LENGTH_SHORT).show();
            case R.id.item5:
                Toast.makeText(this, "option 5 is selected", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}