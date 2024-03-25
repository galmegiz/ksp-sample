package org.example

import HELLO

class AClassBuilder{
    private var a: kotlin.Int? = null
    internal fun withA(a: kotlin.Int): AClassBuilder {
        this.a = a
        return this
    }

    private var b: kotlin.String? = null
    internal fun withB(b: kotlin.String): AClassBuilder {
        this.b = b
        return this
    }

    private var c: kotlin.Double? = null
    internal fun withC(c: kotlin.Double): AClassBuilder {
        this.c = c
        return this
    }

    internal fun build(): org.example.AClass {
        return org.example.AClass(a!!, b!!, c!!)
    }
}
