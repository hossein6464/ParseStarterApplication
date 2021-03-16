package diana.soleil.friendfinderversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is how to find objects in a specific Class of Objects
       /*ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Score");
       query.findInBackground(new FindCallback<ParseObject>() {
           @Override
           public void done(List<ParseObject> objects, ParseException e) {
               if (e == null && objects.size()>0) {
                   for (ParseObject object: objects) {
                       Log.i("Score Is", object.get("score").toString());
                   }
               } else {
                   Log.i("Error", e.getMessage());
               }
           }
       });*/
        //// This is how to Place an objects in a specific Class of Objects
        /*object.put("score", "Nice");
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.i("Save", "Successful");
                } else {
                    Log.i("Error", e.getMessage());
                }
            }
        });*/
    }
}