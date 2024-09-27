package com.ilham.latihan21sept.model

import com.ilham.latihan21sept.R

data class WisataModel(
    val gambar : Int,
    val nama : String,
    val tempat : String,
    val detail : String
    )

object WisataList {
    fun getModel(): List<WisataModel> {
        val itemModel1 = WisataModel(
            R.drawable.harajuku,
            "Harajuku",
            "Tokyo",
            "Harajuku (原宿) adalah sebutan populer untuk kawasan di sekitar Stasiun JR Harajuku, Distrik Shibuya, Tokyo. Kawasan ini terkenal sebagai tempat anak-anak muda berkumpul dengan menggunakan pakaian yang nyentrik dan mencolok."
        )
        val itemModel2 = WisataModel(
            R.drawable.sensoji2,
            "Sensoji",
            "Asakusa",
            "Kuil Sensoji, yang juga dikenal sebagai Kuil Asakusa Kannon, adalah kuil tertua dan paling penting di Tokyo. Awalnya selesai dibangun pada tahun 645 Masehi, kuil ini telah menjadi mercusuar yang memiliki makna spiritual dan keajaiban arsitektur selama berabad-abad."
        )
        val itemModel3 = WisataModel(
            R.drawable.arashiyama,
            "Arashiyama",
            "Kyoto",
            "Arashiyama sendiri berarti pegunungan sebelah barat merupakan salah satu destinasi utama yang ada di Kyoto selain kawasan Higashiyama. Arashiyama terkenal akan jembatannya yang terkenal itu, yaitu Togetsu-kyo, kuil Tenryu, dan juga hutan bambunya."
        )
        val itemModel4 = WisataModel(
            R.drawable.furano,
            "Furano",
            "Hokkaido",
            "Kota ini terkenal akan ladang lavendernya dan berbagai produk alam. Akhir-akhir ini Furano terkenal sebagai kota tujuan wisata musim dingin karena tersedianya arena ski. Wilayah Furano dibelah dua oleh sungai Sorachi, dengan bagian timur adalah pusat kotanya, sementara arena ski Kitanomine terletak di sebelah barat."
        )

        val itemList: ArrayList<WisataModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)


        return itemList
    }
}
