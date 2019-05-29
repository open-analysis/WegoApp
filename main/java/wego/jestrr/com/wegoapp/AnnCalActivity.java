package wego.jestrr.com.wegoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import java.util.Calendar;
import java.util.Date;

public class AnnCalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announ);

        Intent intent = getIntent();
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE).equals("Announcements")){
            String url = "https://www.d94.org/cms/lib/IL01905539/Centricity/domain/71/student%20announcements/";
            Date date= new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int year = cal.get(Calendar.YEAR);
            url += month;
            url += "-";
            url += day;
            url += "-";
            url += year;
            url += ".pdf";

            System.out.println(url);
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        } else{
            Uri uriUrl = Uri.parse("https://www.d94.org/Page/2");
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
    }
}
