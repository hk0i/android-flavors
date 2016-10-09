package onebigfunction.com.flavorflav;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.class.getSimpleName(),
                String.format(Locale.US, "Running %s flavor on %s build type.",
                        BuildConfig.FLAVOR, BuildConfig.BUILD_TYPE));

        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(Html.fromHtml(getString(R.string.app_info, BuildConfig.FLAVOR, BuildConfig
                .BUILD_TYPE)));
    }
}
