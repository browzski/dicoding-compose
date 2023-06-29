package com.putri.dicodingtask.objects

object MakananData{
    val makanan = listOf(
        Makanan(
            "1",
            "Nasi Goreng",
            "https://cdn1-production-images-kly.akamaized.net/EjwV7j3Y4JrlqUFuavke4NtRWtM=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3108566/original/079979700_1587487794-Sajiku_1.jpg",
            "Nasi goreng adalah makanan khas Indonesia yang terdiri dari nasi yang digoreng dengan bumbu-bumbu seperti bawang merah, bawang putih, cabai, dan kecap manis. Biasanya disajikan dengan telur mata sapi, kerupuk, dan acar."
        ),
        Makanan(
            "2",
            "Rendang",
            "https://www.astronauts.id/blog/wp-content/uploads/2023/03/Resep-Rendang-Daging-Sapi-Untuk-Lebaran-Gurih-dan-Nikmat-1200x900.jpg",
            "Rendang adalah masakan daging yang berasal dari Sumatera Barat. Daging dimasak dalam rempah-rempah kering seperti cabai, bawang merah, bawang putih, jahe, lengkuas, serai, dan santan kelapa hingga kuahnya kental dan dagingnya empuk."
        ),
        Makanan(
            "3",
            "Gado-gado",
            "https://asset-2.tstatic.net/bogor/foto/bank/images/gado-gado-1_20160216_141650.jpg",
            "Gado-gado adalah hidangan berbahan sayuran yang direbus seperti kacang panjang, kangkung, taoge, dan tahu. Disajikan dengan bumbu kacang yang kental, kerupuk, dan telur rebus. Biasanya dimakan dengan nasi atau lontong."
        ),
        Makanan(
            "4",
            "Sate Ayam",
            "https://kbu-cdn.com/dk/wp-content/uploads/sate-ayam.jpg",
            "Sate ayam adalah makanan yang terdiri dari potongan daging ayam yang ditusuk menggunakan tusuk sate, kemudian dipanggang. Disajikan dengan bumbu kacang, irisan bawang merah, dan ketupat atau lontong."
        ),
        Makanan(
            "5",
            "Tahu Bulat",
            "https://asset.kompas.com/crops/N31EHtZDMjprQtDT-IOD5-YRZj4=/0x0:1000x667/750x500/data/photo/2021/06/17/60cadbd0727cc.jpg",
            "Tahu bulat adalah makanan yang terbuat dari tahu yang digoreng hingga berwarna kecokelatan dan berbentuk bulat. Tahu bulat sering disajikan sebagai jajanan atau makanan ringan dan bisa dinikmati dengan saus sambal atau saus kacang."
        ),
        Makanan(
            "6",
            "Bakso",
            "https://awsimages.detik.net.id/api/wm/2019/08/12/dca21bf3-923c-486f-bc2e-a3dcd759b1df_169.jpeg?wid=60&w=650&v=1&t=jpeg",
            "Bakso adalah bola daging yang terbuat dari campuran daging sapi giling dan tepung tapioka. Biasanya disajikan dengan mie, bihun, tahu goreng, pangsit, dan kuah kaldu. Dilengkapi dengan bawang goreng, seledri, dan sambal."
        ),
        Makanan(
            "7",
            "Sate Padang",
            "https://asset.kompas.com/crops/rqGBRurZqX4_a5qY31V_4tQfdEo=/0x0:1000x667/750x500/data/photo/2021/03/28/60607a72127cd.jpg",
            "Sate Padang adalah sate khas Sumatera Barat yang terbuat dari daging sapi yang dipotong kecil-kecil, disajikan dengan kuah gulai khas Padang. Biasanya disajikan dengan ketupat, irisan bawang merah, dan kerupuk."
        ),
        Makanan(
            "8",
            "Martabak Manis",
            "https://asset.kompas.com/crops/ECg5EWKFbhg6tjt5VNZCEupy_24=/0x0:1000x667/750x500/data/photo/2020/08/22/5f40bfe4e8c16.jpg",
            "Martabak manis adalah makanan penutup yang terbuat dari adonan tepung terigu dan telur, kemudian diisi dengan cokelat, kacang, atau keju. Digoreng hingga matang dan disajikan dengan taburan keju parut dan kacang."
        ),
        Makanan(
            "9",
            "Sambal Goreng Ati",
            "https://img-global.cpcdn.com/recipes/b15e365cc10bc193/680x482cq70/sambal-goreng-ati-ampela-ala-nekmer-nenek-mertua-foto-resep-utama.jpg",
            "Sambal goreng ati adalah masakan olahan hati ayam yang digoreng dengan bumbu sambal terasi, cabai, bawang merah, bawang putih, dan gula merah. Biasanya disajikan dengan nasi dan pelengkap seperti tahu, tempe, dan telur dadar."
        ),
        Makanan(
            "10",
            "Pempek",
            "https://suarakampus.com/wp-content/uploads/2021/01/pempek.jpg",
            "Pempek adalah makanan khas Palembang yang terbuat dari adonan tepung ikan tenggiri yang dicampur dengan tepung sagu. Biasanya disajikan dengan kuah cuka, irisan timun, dan ebi (udang kering)."
        ),
    )
}
data class Makanan(
    val id: String,
    val judul: String,
    val foto : String,
    val detail : String,
    )
