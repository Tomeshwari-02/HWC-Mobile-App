package org.piramalswasthya.cho.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OphthalmicNetwork(
    val beneficiaryID: String,
    val beneficiaryRegID: String,
    val data: OphthalmicVisit
)