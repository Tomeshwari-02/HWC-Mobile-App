package org.piramalswasthya.cho.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EarDiagnosisNetwork(
    val beneficiaryID: String,
    val beneficiaryRegID: String,
    val data: EarDiagnosisAssessment
)