package bank.ruts.ac.th.smartorganic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Product extends AppCompatActivity {
    TextView uname1,sname1,utel1,uadd1;
    private Button bt_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        uname1 = (TextView)findViewById(R.id.unametxt);
        sname1 = (TextView)findViewById(R.id.snametxt);
        utel1 = (TextView)findViewById(R.id.uteltxt);
        uadd1 = (TextView)findViewById(R.id.uaddtxt);

        bt_next = (Button)findViewById(R.id.btn_pronext);
        uname1.setText(getIntent().getStringExtra("uname"));
        sname1.setText(getIntent().getStringExtra("sname"));
        utel1.setText(getIntent().getStringExtra("utel"));
        uadd1.setText(getIntent().getStringExtra("uadd"));

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchase = new Intent(Product.this,Purchase.class);
                startActivity(purchase);
            }
        });


    }
}
