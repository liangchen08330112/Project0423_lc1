package cn.edu.sict.moviedetails;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView, imageView2, imageView3, imageView4;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        textView = findViewById(R.id.textView);

        imageView.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView:
                textView.setText("签到成功！");
                break;
            case R.id.imageView3:
                Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent2);
                break;
            case R.id.imageView4:
                Intent intent3 = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}