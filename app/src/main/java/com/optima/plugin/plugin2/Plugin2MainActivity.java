package com.optima.plugin.plugin2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.optima.plugin.repluginlib.base.BaseActivity;

//import org.webrtc.EglBase;

public class Plugin2MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener listener = view -> {
            Toast.makeText(Plugin2MainActivity.this,"dddddd",Toast.LENGTH_SHORT).show();
        };
        findViewById(R.id.btn_test).setOnClickListener(listener);
//        EglBase eglBase = EglBase.create();

    }
}
