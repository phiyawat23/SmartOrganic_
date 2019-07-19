package bank.ruts.ac.th.smartorganic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    Button bt_logout;
    MediaPlayer bg,btn_click;
    TextView name1,passwd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btn_click = MediaPlayer.create(this,R.raw.effect_btn_shut);

        bt_logout = (Button)findViewById(R.id.btn_logout);
        name1 = (TextView)findViewById(R.id.textname);
        passwd1 = (TextView)findViewById(R.id.textpass);

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(homepage.this,Login.class);
                btn_click.start();
                startActivity(login);
            }
        });

        name1.setText(getIntent().getStringExtra("name"));
        passwd1.setText(getIntent().getStringExtra("passwd"));

        Toast toast = Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT);// แบบที่2
        toast.show();
    }
}
