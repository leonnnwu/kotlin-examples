package model2

import paperparcel.PaperParcel
import paperparcel.PaperParcelable

@PaperParcel
data class Address(
        val coordinates: DoubleArray,
        val cityName: String
): PaperParcelable {
    companion object {
        @JvmField val CREATOR = PaperParcelAddress.CREATOR
    }
}
