package tatastrive.application.dayzerozero3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b = findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText( MainActivity.this, "click ", Toast.LENGTH_SHORT ).show();
                //activity change next page;
                Intent rachita=new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity( rachita );

            }
        } );


    }
}
