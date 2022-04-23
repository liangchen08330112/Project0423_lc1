package cn.edu.sict.moviedetails;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button, button2;
    private TextView textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("选择音乐");
                //设定数据
                String[] items = new String[]{"古典","民乐","流行","摇滚"};
                //将所有数据设置为未选中状态
                boolean[] checkedItems = new boolean[]{false,false,false,false};
                //绑定多选按钮监听器
                builder.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                        checkedItems[which] = isChecked;
                    }
                });
                //点击确定按钮时
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //新建StringBuffer对象
                        StringBuffer buffer = new StringBuffer();
                        //for循环，如果选中了，“”会被数据取代掉
                        for(int i=0;i<=checkedItems.length-1;i++){
                            if(checkedItems[i]){
                                buffer.append(items[i]).append(" ");
                            }
                        }
                        //如果选项不是空的
                        if(buffer!=null){
                            Toast.makeText(MainActivity2.this, "你喜欢"+buffer, Toast.LENGTH_SHORT).show();
                        }
                        //对话框消失
                        dialogInterface.dismiss();
                        textView3.setText("你喜欢"+buffer);
                    }
                });
                //点击取消按钮时
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //对话框消失
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("选择运动");
                //设定数据
                String[] items = new String[]{"足球","羽毛球","篮球","乒乓球"};
                //将所有数据设置为未选中状态
                boolean[] checkedItems = new boolean[]{false,false,false,false};
                //绑定多选按钮监听器
                builder.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                        checkedItems[which] = isChecked;
                    }
                });
                //点击确定按钮时
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //新建StringBuffer对象
                        StringBuffer buffer = new StringBuffer();
                        //for循环，如果选中了，“”会被数据取代掉
                        for(int i=0;i<=checkedItems.length-1;i++){
                            if(checkedItems[i]){
                                buffer.append(items[i]).append(" ");
                            }
                        }
                        //如果选项不是空的
                        if(buffer!=null){
                            Toast.makeText(MainActivity2.this, "你喜欢"+buffer, Toast.LENGTH_SHORT).show();
                        }
                        //对话框消失
                        dialogInterface.dismiss();
                        textView4.setText("你喜欢"+buffer);
                    }
                });
                //点击取消按钮时
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //对话框消失
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}