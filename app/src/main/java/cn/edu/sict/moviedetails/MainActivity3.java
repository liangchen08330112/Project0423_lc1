package cn.edu.sict.moviedetails;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView2,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView2:
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.imageView3:
                Intent intent1 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}