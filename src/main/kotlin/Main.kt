fun main() {
    // Palindrome
    println(palindrome("katak"))
    println(palindrome("basi"))
    println(palindrome("isi"))

    // Penjumlahan diagonal
    val matrix = arrayListOf(arrayListOf(11,2,4), arrayListOf(4,5,6), arrayListOf(10,8,12))
    println(penjumlahahanMatrix(matrix))
}

fun palindromeRecursive(
    str: String,
    s: Int, e: Int
): Boolean {
    if (s == e) return true

    if (str[s] != str[e]) return false

    return if (s < e + 1) palindromeRecursive(str, s + 1, e - 1) else true
}

fun palindrome(str: String): Boolean {
    return if (str.isEmpty()) true else palindromeRecursive(str, 0, str.length - 1)
}

fun penjumlahahanMatrix(matrix: ArrayList<ArrayList<Int>>): Int {
    // Diagonal ke Kanan
    var diagonalKeKanan = 0
    for ((index, i) in matrix.withIndex()) {
        diagonalKeKanan+=i[index]
    }

    // diagonal ke Kiri
    var diagonalKeKiri = 0
    var indexkiri = matrix.size-1
    for (i in matrix) {
        diagonalKeKiri+=i[indexkiri]
        indexkiri--
    }

    return diagonalKeKanan + diagonalKeKiri
}