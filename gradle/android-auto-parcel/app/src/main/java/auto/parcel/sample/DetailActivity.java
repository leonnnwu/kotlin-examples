package auto.parcel.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import model3.Person;

public class DetailActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    Person person = getIntent().getParcelableExtra("Person");
    textView(R.id.name).setText("Name:" + person.getName());
    textView(R.id.id).setText("Id:" + person.getId());
    textView(R.id.height).setText("Height:" + person.getHeightType());
    textView(R.id.addresses).setText("Addresses:" + person.getAddresses());
    textView(R.id.friends).setText("Friends:" + person.getFriends());
  }

  private TextView textView(int id) {
    return (TextView) findViewById(id);
  }
}
