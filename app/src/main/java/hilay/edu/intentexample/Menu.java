package hilay.edu.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Android2017 on 4/4/2017.
 */

public class Menu extends AppCompatActivity implements View.OnClickListener {

    TextView tvName;
    Button btnBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
//        String name = intent.getStringExtra(MainActivity.name);
        String name = intent.getStringExtra(MainActivity.EXTRA_USER_NAME);

        tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText("Hello " + name + "!");

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
