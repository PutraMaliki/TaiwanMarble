package com.leiguoliang.taiwanmarble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton satu;
    private RadioButton dua;
    private RadioButton tiga;
    private RadioButton empat;
    private String selectedPlayer;
    private Button button;

    public MainActivity(RadioGroup radioGroup) {
        this.radioGroup = radioGroup;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //rdg=(RadioGroup)findViewById(R.id.rdg);
        satu=(RadioButton)findViewById(R.id.satu);
        dua=(RadioButton)findViewById(R.id.dua);
        tiga=(RadioButton)findViewById(R.id.tiga);
        empat=(RadioButton)findViewById(R.id.empat);


        /*radioGroup.setOnCheckedChangeListener((radioGroup, i) -> {
            if (satu.isChecked()) {
                selectedPlayer = satu.getText().toString();
            } else if (dua.isChecked()) {
                selectedPlayer = dua.getText().toString();
            } else if (tiga.isChecked()) {
                selectedPlayer = tiga.getText().toString();
            } else if (empat.isChecked()) {
                selectedPlayer = empat.getText().toString();
            }
        });*/
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this,MapsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("selectedPlayer",selectedPlayer.toString());
                openMapsActivity();
            }
        });
       /* rdg.setOnClickListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i){
                if (i==R.id.satu){
                    satu.getText().toString();
                }else if (i==R.id.dua){
                    dua.getText().toString();
                }else if (i==R.id.tiga){
                    tiga.getText().toString();
                }else if (i==R.id.empat){
                    empat.getText().toString();
                }
            }
        });*/

    }
    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}