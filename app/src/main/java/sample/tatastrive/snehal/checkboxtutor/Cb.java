package sample.tatastrive.snehal.checkboxtutor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Cb extends AppCompatActivity implements View.OnClickListener {
    CheckBox box1, box2, box3, box4, box5;
    static int flag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        box1 = findViewById(R.id.ck1);
        box2 = findViewById(R.id.ck2);
        box3 = findViewById(R.id.ck3);
        box4 = findViewById(R.id.ck4);
        box5 = findViewById(R.id.ck5);

        box1.setOnClickListener(this);
        box2.setOnClickListener(this);
        box3.setOnClickListener(this);
        box4.setOnClickListener(this);
        box5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ck1:
                if (box1.isChecked()) {
                    Toast.makeText(this, box1.getText(), Toast.LENGTH_SHORT).show();
                    flag = 1;
                }break;

            case R.id.ck2:
                if (box1.isChecked()) {
                    Toast.makeText(this, box2.getText(), Toast.LENGTH_SHORT).show();
                }break;

            case R.id.ck3:
                if (box1.isChecked()) {
                    Toast.makeText(this, box3.getText(), Toast.LENGTH_SHORT).show();
                }break;

            case R.id.ck4:
                if (box1.isChecked()) {
                    Toast.makeText(this, box4.getText(), Toast.LENGTH_SHORT).show();
                }break;

            case R.id.ck5:
                if (box1.isChecked()) {
                    Toast.makeText(this, box5.getText(), Toast.LENGTH_SHORT).show();
                }break;
        }
    }
}
