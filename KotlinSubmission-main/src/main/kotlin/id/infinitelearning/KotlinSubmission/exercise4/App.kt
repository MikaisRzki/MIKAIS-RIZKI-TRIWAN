package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val n1 = 60 / 5
        println(n1)
        try {
            val n2 = 60 / 0
            println(n2)
        }
        catch(e: NumberFormatException){
            println("Number Format Exprection")
        }
    }
    catch(e: ArithmeticException){
        println("Aritmetic Exception")
    }

}