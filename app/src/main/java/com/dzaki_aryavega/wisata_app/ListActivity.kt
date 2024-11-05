package com.dzaki_aryavega.wisata_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.wisata_app.adapter.AdapterWisata
import com.dzaki_aryavega.wisata_app.model.ModelWisata

class ListActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: AdapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)

        val menuIcons = listOf(
            ModelWisata(
                R.drawable.tamanhutanir,
                "Taman Hutan Ir. H Djuanda",
                "Bandung",
                "Taman Hutan Ir. H. Djuanda atau lebih dikenal dengan Taman Djuanda, adalah sebuah kawasan hutan lindung yang terletak di Bandung, Jawa Barat, Indonesia. Taman ini memiliki nilai sejarah, ekologi, dan rekreasi yang sangat penting bagi warga Bandung dan wisatawan yang berkunjung. Taman Hutan Djuanda juga dikenal sebagai Hutan Kota Djuanda atau Taman Hutan Raya Djuanda, dan merupakan salah satu taman hutan terbesar di Indonesia.",
                -6.858793516435331, 107.63117987636565
            ),
            ModelWisata(
                R.drawable.benteng_marlborough,
                "Benteng Marlborough",
                "Bengkulu",
                "Benteng Marlborough adalah sebuah benteng bersejarah yang terletak di Bengkulu, provinsi di bagian barat Pulau Sumatra, Indonesia. Benteng ini dibangun oleh pihak Inggris pada awal abad ke-18 selama masa pendudukan mereka di wilayah tersebut.",
                -3.7871731204882133, 102.25213703399479
            ),
            ModelWisata(
                R.drawable.kebunrayabogor,
                "Kebun Raya Bogor",
                "Magelang",
                "Kebun Raya Bogor (Bogor Botanical Gardens) adalah salah satu kebun botani tertua dan terbesar di Indonesia, yang terletak di Kota Bogor, Jawa Barat. Kebun ini tidak hanya menjadi destinasi wisata alam, tetapi juga memiliki nilai ilmiah dan sejarah yang sangat penting.",
                -6.597490342167999, 106.7999023880062
            ),
            ModelWisata(
                R.drawable.monas,
                "Monas",
                "Jakarta Pusat",
                "Monumen Nasional (Monas) adalah salah satu ikon utama Kota Jakarta dan simbol kemerdekaan Indonesia. Terletak di pusat kota Jakarta, Monas adalah monumen yang dibangun untuk memperingati perjuangan bangsa Indonesia dalam meraih kemerdekaan dari penjajahan.",
                -6.17516301242964, 106.82709355223545
            ),
            ModelWisata(
                R.drawable.lubang_jepang,
                "Lubang Jepang",
                "Sumatera Barat",
                "Lubang Jepang adalah sebuah situs bersejarah yang terletak di Bukit Batu, Kecamatan Batu Ceper, Kota Tangerang, Banten, Indonesia. Situs ini merupakan sebuah kompleks terowongan bawah tanah yang dibangun oleh tentara Jepang pada masa penjajahan Jepang di Indonesia, sekitar tahun 1942 hingga 1945.",
                -0.3075808338121462, 100.3653632182249
            )

        )

        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = AdapterWisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}