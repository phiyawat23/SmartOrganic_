package bank.ruts.ac.th.smartorganic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserLogin extends AppCompatActivity {
    Button bt_next;
    EditText name,surname,tel,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        bt_next = (Button)findViewById(R.id.btn_next);
        name = (EditText) findViewById(R.id.u_name);
        surname = (EditText)findViewById(R.id.u_surname);
        tel = (EditText)findViewById(R.id.u_tel);
        address = (EditText)findViewById(R.id.u_address);

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent product = new Intent(UserLogin.this,Product.class);
                product.putExtra("uname",name.getText().toString());
                product.putExtra("sname",surname.getText().toString());
                product.putExtra("utel",tel.getText().toString());
                product.putExtra("uadd",address.getText().toString());
                startActivity(product);

            }
        });
    }
}
