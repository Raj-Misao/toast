package misao.toastdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void display(View v)
    {
        Toast.makeText(getApplicationContext(),"Welcome in Misao !!!!",Toast.LENGTH_LONG).show();
    }
}
