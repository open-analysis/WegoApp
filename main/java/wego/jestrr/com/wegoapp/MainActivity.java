package wego.jestrr.com.wegoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.jestrr.wego.WegoApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPlanner(View view){
        Intent intent = new Intent(this, PlannerActivity.class);
        startActivity(intent);
    }

    public void goToAnnoun(View view){
        Intent intent = new Intent(this, AnnCalActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Announcements");
        startActivity(intent);
    }

    public void goToCal(View view){
        Intent intent = new Intent(this, AnnCalActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Calendar");
        startActivity(intent);
    }

    public void goToMap(View view){
        /*Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);*/
    }
}
