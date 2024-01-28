import java.util.Scanner

fun main() {
    msg()
    val num = checkScanner()
    val janken = Janken(num)
    janken.playJanken()
}

fun msg() {
    println("じゃんけん1回勝負です")
    println("1:グー 2:チョキ 3:パー")
}

fun checkScanner(): Int {
    Scanner(System.`in`).use { scanner ->
        return if (scanner.hasNextInt()) {
            scanner.nextInt()
        }else {
            throw IllegalArgumentException("Invalid input. Please enter an integer.")
        }
    }
}