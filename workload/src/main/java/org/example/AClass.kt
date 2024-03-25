package org.example

@Builder
class AClass(private val a: Int, val b: String, val c: Double) {
    val p = "$a. $b"
    fun foo() = p
}