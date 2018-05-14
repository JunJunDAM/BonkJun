package cat.flx.plataformes.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cat.flx.plataformes.Game.Activity.GameActivity;
import cat.flx.plataformes.R;

/**
 * Created by alu2015059 on 14/05/2018.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button pagPrincipal_btn = findViewById(R.id.btn_playGame);
        pagPrincipal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });

    }
}
