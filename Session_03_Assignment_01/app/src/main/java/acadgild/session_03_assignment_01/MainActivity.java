package acadgild.session_03_assignment_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
    TextView textView;
    private Boolean flag_isVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_toggle);
        textView = (TextView)findViewById(R.id.TextView4Img);

    }

public void toggleImageView(View view){
    if (flag_isVisible == false){
        textView.setVisibility(View.VISIBLE);
        flag_isVisible = true;
        button.setText("Hide");
        Log.e("FROM TOGGLE IMAGE :: ","IMAGE VISIBLE");
    }
    else{
        textView.setVisibility(View.INVISIBLE);
        flag_isVisible = false;
        button.setText("Show");
        Log.e("FROM TOGGLE IMAGE :: ","IMAGE INVISIBLE");
    }

}

}
