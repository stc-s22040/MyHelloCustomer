package jp.suntech.s22040.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //送信
        Button btSend = findViewById(R.id.btSend);

        HelloListner listner = new HelloListner();

        btSend.setOnClickListener(listner);
        //住まいクリア
        Button btClear1 = findViewById(R.id.btClear1);

        btClear1.setOnClickListener(listner);
        //お名前クリア
        Button btClear2 = findViewById(R.id.btClear2);

        btClear2.setOnClickListener(listner);
    }
    private class HelloListner implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            EditText input1 = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etAddress);

            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

           if(id == R.id.btSend) {

               String input1Str = input1.getText().toString();
               String input2Str = input2.getText().toString();

               output.setText(input1Str + "にお住まいの" + input2Str + "さん、こんにちは！");
           }
            else if(id == R.id.btClear1)
                    input1.setText("");
            else if(id == R.id.btClear2)
                    input2.setText("");

            }
        }
    }
