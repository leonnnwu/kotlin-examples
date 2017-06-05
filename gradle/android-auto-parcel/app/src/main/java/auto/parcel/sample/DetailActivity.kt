package auto.parcel.sample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*
import model3.Person

class DetailActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val person = intent.getParcelableExtra<Person>("Person")
        name.text = "Name:${person.name}"
        id.text = "Id:${person.id}"
        height.text = "Height:${person.heightType}"
        addresses.text = "Addresses:${person.addresses}"
        friends.text = "Friends:${person.friends}"
    }
}
