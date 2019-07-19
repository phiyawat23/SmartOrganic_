package bank.ruts.ac.th.smartorganic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    MediaPlayer bg,btn_click;
    Button bt_log;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bg = MediaPlayer.create(this,R.raw.sound_bg);
        bg.start();
        bg.setLooping(true);
        btn_click = MediaPlayer.create(this,R.raw.effect_btn_shut);

        bt_log = (Button)findViewById(R.id.btn_login);
        username = (EditText)findViewById(R.id.u_name);
        password = (EditText)findViewById(R.id.passwd);

        bt_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Login.this,homepage.class);
                home.putExtra("name",username.getText().toString());
                home.putExtra("passwd",password.getText().toString());
                btn_click.start();
                bg.stop();
                startActivity(home);

            }
        });


    }
}
