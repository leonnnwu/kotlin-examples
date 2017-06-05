package auto.parcel.sample

import java.util.Arrays
import java.util.Collections
import java.util.HashMap

import model1.HeightBucket
import model2.Address
import model3.Person

interface SampleData {
    companion object {
        val ALICE = Person("Alice", 1L, HeightBucket.AVERAGE,
                addresses = hashMapOf("home" to Address(doubleArrayOf(0.3, 0.7), "Rome")),
                friends = emptyList<Person>())

        val BOB = Person(
                "Bob",
                2L,
                HeightBucket.TALL,
                hashMapOf("home" to Address(doubleArrayOf(3.2, 143.2), "Turin"),
                        "work" to Address(doubleArrayOf(5.9, 156.1), "Genoa")),

                (Arrays.asList(ALICE))
        )
    }
}
