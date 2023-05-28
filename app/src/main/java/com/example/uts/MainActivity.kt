package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val krList = listOf<KamenRiderClass>(
            KamenRiderClass(
                R.drawable.kr1,
                krname = "Kamen Rider Build",
                krdate = "Tanggal Tayang: \n3 September 2017 - 26 Agustus 2018",
                krauthor = "Total Episode: \n49 Episode",
                krrate = "Rating: (8,5)",
                ratingbar = 4.5,
                krdesc = "Sinopsis: \nSepuluh tahun yang lalu, sebuah artefak misterius yang dinamai \"Kotak Pandora\" (Pandora Box) ditemukan di planet Mars dan dibawa ke Bumi. Namun, saat konferensi terkait penemuan artefak tersebut berlangsung, Kotak Pandora tersebut menjadi aktif dan menimbulkan Bencana Skywall yaitu timbulnya gejala alam aneh yang menyebabkan terbentuknya dinding pembatas raksasa yang disebut Skywall yang membagi wilayah Jepang menjadi tiga wilayah: Seito di barat, Hokuto di utara, dan Touto di timur. \n" +
                        "\nSaat ini, seorang fisikawan jenius bernama Sento Kiryu (diperankan oleh Atsuhiro Inukai) direkrut oleh Laboratorium Fisika Tingkat Lanjut di bawah naungan Touto Institute yang dibiayai langsung pemerintah Touto untuk menyelidiki dan menguak rahasia dari Kotak Pandora. Tetapi Sento, kehilangan ingatan akan masa lalunya ketika ia diculik oleh Night Rogue yang misterius dari organisasi bernama Faust, di mana di lain sisi ia berubah menjadi Kamen Rider Build untuk melawan Smash, monster yang diciptakan dari hasil eksperimen terhadap manusia yang dilakukan Faust. \n" +
                        "\nBersamanya ia dibantu oleh Misora Isurugi (diperankan oleh Kaho Takada) yang dapat memurnikan elemen dari Smash, lalu Souichi Isurugi (diperankan oleh Yasuyuki Maekawa) yang merupakan ayah Misora, dan seorang buronan bernama Ryuga Banjou (diperankan oleh Eiji Akaso) yang juga sempat diculik oleh Faust sebelum akhirnya berhasil meloloskan diri dan dicap sebagai seorang pembunuh dan buronan pemerintah. Seiring waktu, Ryuga kemudian berubah menjadi Kamen Rider Cross-Z dan bersamanya, Build bertarung menghadapi Night Rogue serta salah satu petinggi Faust lainnya bernama Blood Stalk, yang tidak lain adalah Souichi di mana Souichi lah yang menyebabkan terjadinya Bencana Skywall sepuluh tahun yang lalu. Diketahui kemudian Souichi bekerja untuk Nanba Heavy Industries dengan mencuri blue print data penelitian Proyek Build dan mengelola pasukan Guardian untuk memanipulasi tiga wilayah Jepang pasca Bencana Skywall untuk memulai perang besar. "
            ),
            KamenRiderClass(
                R.drawable.kr2,
                krname = "Kamen Rider Faiz",
                krdate = "Tanggal Tayang: \n26 Januari 2003 - 18 Januari 2004",
                krauthor = "Total Episode: \n50 Episode",
                krrate = "Rating: (8,4)",
                ratingbar = 4.4,
                krdesc = "Sinopsis: \nSebuah perompak besar yang bernama Smart Brain mengembangkan berbagai macam eksperimen terhadap manusia. Namun di balik itu semua Smart Brain juga mengembangkan tiga belt untuk mengubah Orphenochs menjadi seperti pemimpin mereka, Arch Orphenoch. Di mana belt itu digunakan oleh penjaga dan pembunuh yang bekerja untuk Arch Orphenoch. \n" +
                        "\nSatu Orphenoch, berusaha mencegah kebangkitan dari Arch Orphenoch, mencuri ketiga belt tersebut dan menyembunyikannya. Secara acak, tiga orang akan menerima belt tersebut, dan semuanya akan tergantung kepada mereka. Akankah mereka menorehkan takdir mereka sendiri dengan kekuatan tersebut."
            ),
            KamenRiderClass(
                R.drawable.kr3,
                krname = "Kamen Rider W",
                krdate = "Tanggal Tayang: \n6 September 2009 - 29 Agustuus 2010",
                krauthor = "Total Episode: \n49 Episode",
                krrate = "Rating: (8,3)",
                ratingbar = 4.3,
                krdesc = "Sinopsis: \nDi sebuah kota ekologis bernama Fuuto (風都 Fūto, \"Kota Angin\"), kota yang memiliki banyak kincir angin, orang-orang hidup dalam keharmonisan. Namun, sebuah organisasi misterius yaitu Museum yang dibentuk oleh sebuah keluarga misterius yaitu Keluarga Sonozaki (diketuai Ryubee Sonozaki/Terror Dopant) dan Foundation X (diketuai oleh Jun Kazu/Eternal Red Flare/Utopia Dopant) menjual sebuah alat misterius yang menyerupai USB flashdisk yang disebut Gaia Memory kepada penjahat dan pihak yang tidak berkepentingan lainnya yang mengubah mereka menjadi monster yang disebut Dopant dan melakukan kejahatan di kota tersebut. Polisi pun tidak berdaya untuk menghentikan mereka. Yang membuat keadaan menjadi lebih buruk, Gaia Memory membawa dampak berbahaya yang menyebabkan penggunanya menjadi lebih kuat lagi sampai ke titik di mana mereka bisa mati dari perangkat yang mengancam jiwa itu (yaitu benar-benar menjadi monster dalam kasus Isaka/Weather dopant, menjadi debu di neraka).\n" +
                        "\nSetelah kematian bosnya, yaitu Soukichi Narumi/Kamen Rider Skull, detektif Shotaro Hidari menyatakakan dirinya sebagai detektif yang keras (yang pada kenyataannya sifatnya lembut karena ia masih memikirkan teman-temannya) dan bekerja sama dengan Philip yang misterius (kemudian diketahui nama aslinya yaitu Raito Sonozaki) untuk melindungi kota Fuuto dari serangan Dopant menggunakan Gaia Memory murni dan sebuah driver khusus bernama Double Driver, yang digunakan untuk berubah (henshin) dan menggabungkan diri menjadi satu tubuh menjadi Kamen Rider Double (W). "
            ),
            KamenRiderClass(
                R.drawable.kr4,
                krname = "Kamen Rider Kuuga",
                krdate = "Tanggal Tayang: \n30 Januari 2000 - 21 Januari 2001",
                krauthor = "Total Episode: \n49 Episode",
                krrate = "Rating: (8,2)",
                ratingbar = 4.2,
                krdesc = "Sinopsis: \nPada suatu kala,para GRONGI (para monster) menyerang penduduk linto pada saat itu muncul seorang ksatria yang bernama KUUGA untuk mengalahkan para GRONGI. Pertarungan yang sengit terjadi antara Pemimpin GRONGI dan KUUGA. Akhirnya KUUGA menang, lalu menyegel para GRONGI di suatu gua  untuk selama-lamanya.\n" +
                        "\nLalu setelah beribu-ribu tahun, tepatnya pada tahun 2000 manusia menemukan gua yang ternyata berisi makam KUUGA setelah makam tersebut di buka mereka hanya menemukan seorang pemuda yang memakai belt mereka menamakan belt itu \"ARCLE\".Mereka melepaskan belt itu dari mayat tersebut, muncul sesosok GRONGI yang lepas dari segelan KUUGA(jika belt ditarik dari mayat tersebut,segelan KUUGA akan menghilang)lalu menyerang para peneliti gua tersebut. Ketika polisi setempat datang, yang dapat ditemukan di gua tersebut hanya Belt KUUGA dan rekaman video yang berisi rekaman serangan GRONGI .\n" +
                        "\nLalu seorang pemuda yang bernama Yuusuke Godai ingin melihat kejadian yg terjadi di gua tersebut, lalu dia bertemu dengan inspektur kepolisian yang bernama Kaoru Ichijo, setelah ichijo menjelaskan apa yang terjadi Yuusuke melihat belt KUUGA yang diamankan oleh polisi, tiba-tiba dipikiran Yuusuke dia melihat sosok KUUGA yang sedang melawan grongi. Setelah menuju kota Ichijo dan Yuusuke diserang oleh sesosok grongi yang menginginkan belt KUUGA. Lalu yuusuke memakai belt itu dan berubah menjadi KUUGA growing form, setelah mengalahkan grongi tersebut Ichijo membawanya ke tempat temannya yang bernama Hikari Enokida yang sedang mempelajari bahasa Linto dan GOURAM(pelindung besi yg berbentuk kumbang untuk armor kuda tetapi armor ini dapat hidup dan terbang,lucunya armor ini dapat melekat di motor KUUGA) yang terletak di makam KUUGA. Setelah menganalisa belt tersebut Ia mengatakan bahwa ARCLE dapat meningkatkan kekuatan manusia dan dapat menambah usia hidup tetapi belt itu tidak dapat dilepas tetapi dapat di hilangkan sesuai keinginan penggunanya lalu hikari menjelaskan bahwa Yuusuke harus berhati-hati menggunakan kekuatan KUUGA karena hanya KUUGA yg dapat memusnahkan grongi.\n"
            ),
            KamenRiderClass(
                R.drawable.kr5,
                krname = "Kamen Rider Gaim",
                krdate = "Tanggal Tayang: \n16 Oktober 2013 - 28 September 2014",
                krauthor = "Total Episode: \n47 Episode",
                krrate = "Rating: (8,1)",
                ratingbar = 4.1,
                krdesc = "Sinopsis: \nDi sebuah kota yang bernama kota Zawame City (沢芽市 Zawame-shi), yang menjadi seperti sebuah kota dalam benteng setelah sebuah perusahaan besar, Yggdrasill Corporation, mendirikan Toko dan perusahaannya di tengah-tengah kota yang ramai tersebut. Orang-orang merasa seperti tinggal di sebuah kota yang dibentengi. Untuk menghilangkan rasa jenuh dan tertekan, para penduduknya seperti anak-anak muda di kota tersebut membentuk grup-grup dance untuk menghilangkan rasa kejenuhan tersebut. Di sisi lain, ada sebuah permainan baru dan sangat populer disana yang dimana mereka menggunakan sebuah gembok misterius yang disebut Lockseed yang dapat mengeluarkan monster yang disebut Inves yang katanya berasal dari dimensi lain untuk di adu tanding. Semakin populer permainan tersebut ternyata membuat dinding pemisah antara dimensi Inves (Hutan Helheim) dengan bumi terbuka dan membuat Inves bisa masuk ke bumi dengan bebasnya. Tokoh utama dari seri ini ialah bernama Kouta Kazuraba. Dia adalah mantan anggota grup dance Team Gaim. Pada suatu hari, ketika Kouta yang ingin mencari leader Team Gaim yang hilang ke mana, tidak sengaja menemukan lubang pemisah dunia Inves dengan bumi dan memasukinya. \n" +
                        "\nDi dalam dimensi Inves tersebut dia menemukan belt dan gembok atau Lockseed yang membuatnya bisa berubah menjadi Armored Rider Gaim (nama lain dari Kamen Rider Gaim) dengan bentuk buah jeruk. Nantinya pemimpin Team Baron, Kumon Kaito juga akan bergabung menjadi Armored Rider Baron (Kamen Rider Baron) dengan bentuk buah pisang, disusul dengan grup dance lainnya, dan teman se-team Kouta, Mitsuzane Kureshima alias Mitchy sebagai Armored Rider Ryugen (Kamen Rider Ryugen) dengan bentuk buah anggur. Mereka diajak di dalam permainan baru bernama \"Beat Riders\" yang dibuat Dj Sagara dan dipelopori oleh Sid, sang penjual Lockseed tersebut. Dibalik itu semua, Yggdrasill Corp menyembunyikan sebuah rahasia ke publik tentang Hutan Helheim dunianya Inves yang ternyata berhubungan dengan bumi. Sebagai seorang pemimpin perusahaan, Takatora Kureshima (Kamen Rider Zangetsu) menyimpan rahasia ini kepada semua orang di kota tersebut dan kepada adiknya, Mitsuzane. Lama-kelamaan rahasia ini mulai terbongkar oleh Kouta dan anggota team dance lainnya yang ingin mengetahui dibalik rencana Yggdrasill. Mereka mulai sadar bahwa dunia mereka saat ini dalam ancaman bahaya yang besar. "
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KamenRiderAdapter(this, krList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}