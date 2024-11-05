package com.dzaki_aryavega.wisata_app.model

data class ModelWisata(
    var image : Int,
    var nama : String,
    var daerah : String,
    var deskripsi : String,
    val latitude: Double,
    val longitude: Double
)