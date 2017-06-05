package model3

import model1.HeightBucket
import model2.Address
import paperparcel.PaperParcel
import paperparcel.PaperParcelable

@PaperParcel
data class Person(
        val name: String,
        val id: Long,
        val heightType: HeightBucket,
        val addresses: Map<String, Address>,
        val friends: List<Person>
): PaperParcelable {
    companion object {
        @JvmField val CREATOR = PaperParcelPerson.CREATOR
    }
}