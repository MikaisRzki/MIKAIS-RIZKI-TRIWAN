package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    for (i in 0..100 step 2) {
        println(i)
    }

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val bulan = mapOf<String,String>(
    "Jan" to "Januari",
    "Feb" to "Februari",
    "Mar" to "Maret",
    "Apr" to "April",
    "Mei" to "Mei",
    "Jun" to "Juni",
    "Jul" to "Juli",
    "Agu" to "Agustus",
    "Sep" to "September",
    "Okt" to "Oktober",
    "Nov" to "November",
    "Des" to "Desember")

    bulan.forEach { entry ->
        print("\n${entry.key} -> ${entry.value}")
    }
    val monthNow = bulan["Jun"]
    val birthMonth = bulan["Agu"]
    println("\nSekarang bulan {$monthNow} dan saya lahir dibulan {$birthMonth}")
}