package hilay.edu.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext;
    EditText etName;
    Intent intent;
    public static final String EXTRA_USER_NAME = "EXTRA_USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = (Button) findViewById(R.id.btnNext);
        etName = (EditText) findViewById(R.id.etName);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this,Menu.class);
        String name = etName.getText().toString();
        intent.putExtra(EXTRA_USER_NAME,name);
        startActivity(intent);
    }
}
