package com.example.capstone.utils

import com.example.capstone.R
import com.example.capstone.model.Destination

//list hanya bisa menampung 10 data
object Data {
    private val name = arrayOf(
        "Pantai Kuta",
        "Ubud Monkey Forest",
        "Pantai Pandawa",
        "Pantai Jimbaran",
        "Pulau Nusa Lembongan",

        "Pura Tanah Lot",
        "Pura Luhur Uluwatu",
        "Garuda Wisnu Kencana",
        "Pura Tirta Empul Tampak Siring",
        "Pura Besakih",

        /*"Bali Safari Marine Park",
        "Seminyak",
        "Taman air Sukasada",
        "Museum Semarajaya",
        "Pura Besakih",
        "Desa Penglipuran"*/
    )



    private val description = arrayOf(
        "Objek wisata pantai Kuta akan selalu masuk dalam daftar tempat wisata di kunjungi di pulau Bali bagi wisatawan yang pertama kali liburan ke Bali. Hal utama yang membuat pantai Kuta ramai mendapat kunjungan wisatawan karena menawarkan pantai pasir putih dengan bentangan panjang, serta pemandangan sunset.\n" +
                "\n" +
                "Ombak di pantai Kuta lumayan besar dan cocok untuk aktivitas selancar pemula. Jika anda ingin berenang bersama anak-anak, maka anak anda harus selalu dalam pengawasan orang dewasa.\n" +
                "\n" +
                "Aktivitas utama wisatawan saat liburan ke pantai Kuta adalah duduk santai di tepi pantai, berenang, dan melihat pemandangan sunset. Karena tingginya minat wisatawan liburan ke pantai Kuta, maka hampir setiap hari jalan raya sekitar pantai akan terjadi kemacetan. \n" +
                "\n" +
                "Selain daya tarik pantai, fasilitas pariwisata di sekitar area tempat wisata Kuta sangat lengkap. Anda akan dengan mudah menemukan akomodasi, tempat makan, pusat perbelanjaan, dan klub malam.\n",
        "Tempat wisata Ubud memiliki banyak pilihan objek liburan. Dari sekian banyak pilihan objek wisata yang ada di Ubud, Ubud Monkey Forest selalu menjadi tempat wisata favorit wisatawan yang pertama kali liburan ke pulau Bali.\n" +
                "\n" +
                "Hal menarik yang wisatawan dapat lihat saat liburan ke Monkey Forest Ubud seperti;\n" +
                "\n" +
                "Area hutan lindung dengan pepohonan yang sangat tinggi.\n" +
                "Wisatawan dapat melihat kera ekor panjang.\n" +
                "Pura yang berada di dalam area hutan.\n",
        "Jika anda liburan keluarga bersama anak-anak, maka pantai Pandawa di desa Kutuh wajib anda kunjungi. Di beri nama pantai Pandawa karena pada tebing karang menuju akses masuk ke area pantai terdapat patung dari panca Pandawa.\n" +
                "\n" +
                "Saat ini, pantai Pandawa menjadi destinasi populer di pulau Bali terutama untuk wisatawan Indonesia. Daya tarik utama dari pantai Pandawa terdapat pada bentangan pasir putih sekitar 1 kilometer. Ombak di pantai Pandawa sangat tenang, sehingga sangat aman untuk anak-anak berenang. Selain itu, di area tepi pantai tersedia jasa penyewaan kano.\n" +
                "\n" +
                "Kelebihan lain dari pantai Pandawa, terdapat pada area parkir kendaraan yang sangat luas serta lokasi parkir berdekatan dengan garis pantai. Di sepanjang tepi pantai terdapat warung yang menyediakan makanan dan minuman dengan harga terjangkau.\n",
        "Apakah anda pernah melihat foto wisatawan sedang menikmati wisata kuliner tepi pantai pasir putih, view sunset, dengan menu seafood bakar? Jika iya, kemungkinan besar anda akan bertanya, dimanakah lokasinya di pulau Bali. Nama tempatnya adalah pantai Jimbaran Bali.\n" +
                "\n" +
                "Daya tarik utama yang membuat wisatawan tertarik liburan ke pantai Jimbaran karena keindahan pantai pasir putih, dengan bentangan garis pantai yang sangat panjang. Karena posisis pantai menghadap ke sisi barat, maka di sore hari pantai Jimbaran menjadi salah satu spot terbaik melihat pemandangan sunset di pulau Bali.\n" +
                "\n" +
                "Keunikan dari pantai Jimbaran, karena di bibir pantai Jimbaran terdapat banyak cafe seafood bakar, dengan view pemandangan pantai. Suasana makan malam, dengan cahaya lilin, lokasi di tepi pantai, sambil melihat sunset inilah yang menjadi daya tarik utama pantai Jimbaran sebagai tempat wisata.\n",
        "Bagi wisatawan yang pertama kali liburan ke pulau Bali dan memiliki rentang waktu liburan di Bali lumayan panjang sekitar 8 – 10 hari, pasti akan liburan ke pulau Nusa Lembongan. Walaupun pulau Nusa Lembongan masuk dalam wilayah pulau Bali, namun pulau Nusa Lembongan dipisahkan oleh lautan dengan pulau Bali.\n" +
                "\n" +
                "Ada banyak hal menarik yang wisatawan dapat lakukan atau lihat saat berada di pulau Nusa Lembongan. Jika anda ingin tahu lebih detail mengenai daya tarik pulau Nusa Lembongan.\n",

        "Tanah Lot jika diterjemahkan ke bahasa Indonesia artinya daratan di tengah laut. Tanah berarti daratan, Lot artinya laut.\n" +
                "\n" +
                "Sesuai dengan namanya, saat anda liburan ke pura Tanah Lot, anda akan menemukan pura yang berada di atas batu karang besar dengan latar belakang laut selatan. Batu karang besar ini berada di tengah laut dan saat air pasang, batu karang terlihat terpisah dengan daratan.\n" +
                "\n" +
                "Daya tarik utama dari Tanah Lot temple terdapat pada keindahan pemandangan matahari terbenam, dengan siluet pura Tanah Lot. Berpadu dengan ombak laut selatan yang menerjang batu karang. Saat momen ini, akan terlihat banyak wisatawan yang akan mengambil foto.\n",
        "Uluwatu temple atau Pura Luhur Uluwatu selalu menjadi tempat wisata populer untuk wisatawan yang pertama kali liburan ke pulau Bali. Hal menarik yang wisatawan dapat lihat di pura Uluwatu seperti;\n" +
                "\n" +
                "Pura yang berada di ujung atas tebing tinggi, dengan ketinggian tebing sekitar 70 meter.\n" +
                "Keunikan arsitektur pura.\n" +
                "Terdapat banyak kera ekor panjang sekitar area pura.\n" +
                "Dari atas tebing wisatawan dapat melihat pemandangan samudra Hindia. \n" +
                "Menjelang sunset, wisatawan dapat menyaksikan pemandangan sunset Samudera Hindia dari atas tebing tanpa halangan.\n" +
                "Lokasi menonton tari Kecak Api yang paling terkenal di pulau Bali.\n",
        "Taman Budaya Garuda Wisnu Kencana atau yang dikenal dengan nama GWK Bali, salah satu tempat wisata keluarga populer di pulau Bali. Hampir setiap hari objek wisata Taman Budaya Garuda Wisnu Kencana ramai dikunjungi wisatawan.\n" +
                "\n" +
                "Daya tarik utama yang membuat wisatawan tertarik liburan ke GWK Bali karena di GWK Bali terdapat patung tertinggi di Indonesia. Patung Garuda Wisnu Kencana memiliki tinggi 75 meter, dengan lebar patung 65 meter.\n",
        "Wisatawan Indonesia yang pertama kali liburan ke Bali selalu tertarik liburan ke pura Tirta Empul Tampak Siring. Daya tarik objek wisata pura Tirta Empul karena lokasinya berdekatan dengan Istana Kepresidenan Tampaksiring.\n" +
                "\n" +
                "Selain itu, pengunjung akan melihat banyak kolam air di pura Tirta Empul dengan keunikan arsitektur pura.\n" +
                "\n" +
                "Hal paling menarik yang akan pengunjung lihat saat memasuki area dalam pura. Di dalam area pura akan terdapat sebuah kolam, dan ditengah kolam terdapat sumber mata air. Karena air dari kolam berasal dari mata air, maka air terlihat sangat jernih.\n" +
                "\n" +
                "Air dari kolam utama kemudian di aliarkan ke kolam kedua tempat umat hindu melakukan ritual penyucian. Di lokasi kolam kedua, pengunjung akan melihat umat hindu Bali menyucikan diri menggunakan air pancuran dari kolam utama.\n",
        "Pulau Bali dikenal memiliki banyak objek wisata pura, namun tahukah anda pura Hindu terbesar dan terluas di pulau Bali? Nama puranya adalah Pura Besakih.\n" +
                "\n" +
                "Lokasi area pura Besakih berada di kaki Gunung Agung, gunung berapi aktif tertinggi di pulau Bali. Karena berada di area kaki gunung Agung, maka udara sejuk terlalu terasa saat liburan ke pura Besakih.\n" +
                "\n" +
                "Pengunjung yang liburan ke Pura Besakih akan melihat area pura yang sangat luas, arsitektur megah dan area yang asri. Dari area pura Besakih pengunjung juga dapat melihat pemandangan area sawah, dan bukit. Waktu terbaik berkunjung di pagi hari, karena kabut belum turun sehingga anda akan dapat melihat pemandangan Gunung Agung.\n",

        /*"Jika anda liburan keluarga ke pulau Bali dengan anak, maka tempat wisata Bali Safari & Marine Park wajib anda kunjungi. Bali Safari & Marine Park adalah sebuah kebun binatang yang memiliki luas area sangat luas, sekitar 400,000 meter persegi.\n" +
                "\n" +
                "Keunikan Bali Safari & Marine Park, setiap jenis satwa berkeliaran bebas dalam sebuah area besar. Karena area sangat luas, agar pengunjung dapat melihat satwa secara langsung, pengunjung akan menaiki kendaraan safari. Aktivitas ini terkenal dengan nama Safari Journey.\n" +
                "\n" +
                "Hal menarik yang membuat banyak wisatawan tertarik liburan ke Bali Safari & Marine Park seperti;\n" +
                "\n" +
                "Terdapat lebih dari 400 spesies binatang.\n" +
                "Pengunjung dapat melihat satwa langka harimau putih India dan Komodo.\n" +
                "Tersedia pertunjukan Theater, bernama Bali Agung Show.\n",
        "Kawasan pariwisata Seminyak terkenal sebagai kawasan pariwisata mewah dan pusat shopping barang mewah di pulau Bali. Di area Seminyak, anda akan dengan mudah menemukan restoran mewah, resort mewah, butik dan Spa. Kelengkapan fasiltas tersebut membuat area tempat wisata Seminyak menjadi salah satu destinasi wisata populer di pulau Bali.\n" +
                "\n" +
                "Lokasi area pariwisata Seminyak sangat strategis, karena berdekatan dengan kawasan tempat wisata Kuta serta area wisata Canggu.\n",
        "Taman air ini terletak di kota Ujung, tepatnya di bibir laut Lombok. Taman air ini memiliki pemandangan laut dan taman klasik yang indah. Taman air Sukasada merupakan taman klasik khas Karang Asem.\n" +
                "\n" +
                "Wisatawan yang datang bisa melihat arsitektur unik yang merupakan kombinasi antara kebun khas Eropa dan reruntuhan bangunan yang menciptakan harmonisasi bentuk unik.\n" +
                "\n" +
                "Tempat ini awalnya merupakan tempat pemandian raja. Lalu sempat juga menjadi rumah peristirahatan bagi delegasi kerajaan Karang Asem. Kini, taman air ini menjadi salah satu tempat wisata populer dan sering dijadikan lokasi prewedding.\n",
        "Museum Budaya Semaraja sebenarnya dulu merupakan gedung sekolah yang dipakai saat masa penjajahan Belanda. Lokasi museum ini adalah di dalam kompleks Kertha Gosa dan Taman Gili.\n" +
                "\n" +
                "Museum ini memajang benda-benda yang merupakan produk budaya Bali asli. Selain itu wisatawan yang datang juga bisa menemukan benda-benda peninggalan prasejarah. Kebanyakan benda ini digunakan pada Perang Puputan Klungkung.\n" +
                "\n" +
                "Museum ini diresmikan pada 1992 oleh Menteri Dalam Negeri Republik Indonesia. Selain melihat benda-benda bersejarah wisatawan juga bisa bersantai di pelataran museum yang sangat asri.\n",
        "Desa Penglipuran merupakan sebuah desa adat yang memiliki struktur dan arsitektur yang unik. Desa ini juga dinobatkan sebagai salah satu desa terbersih.\n" +
                "\n" +
                "Saat masuk ke desa Penglipuran, wisatawam seolah diajak masuk ke dalam sebuah kawasan asing dengan kumpulan rumah adat Bali yang berjajar dengan rapi. Lokasinya ada di kabupaten Bangli di sebelah Timur Bali.\n" +
                "\n" +
                "Desa Penglipuran ini awalnya ditinggali oleh penduduk seniman yang menghibur raja. Sesuai dengan namanya “Penglipur” yang artinya Penghibur. Hingga saat ini warisan budaya masyarakat Penglipuran tetap lestari.\n"*/
    )



    private val image = intArrayOf(
        R.drawable.kuta,
        R.drawable.ubud,
        R.drawable.pandawa,
        R.drawable.jimbaran,
        R.drawable.nusa_lembongan,

        R.drawable.tanah_lot,
        R.drawable.uluwatu,
        R.drawable.gwk,
        R.drawable.tirta_empul,
        R.drawable.besakih,

        /*R.drawable.safari,
        R.drawable.seminyak,
        R.drawable.sukasada,
        R.drawable.semarajaya,
        R.drawable.penglipuran*/
    )


    val listData: ArrayList<Destination>
    get() {
        val list = arrayListOf<Destination>()
        for (position in name.indices){
            val data = Destination()
            data.name = name[position]
            data.des = description[position]
            data.image = image[position]
            list.add(data)
        }
        return list
    }
}