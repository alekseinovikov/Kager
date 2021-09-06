package me.alekseinovikov.kager.core.types

sealed class Type {
    abstract val size: Int
}


class Bytes(override val size: Int): Type()
object Integer: Type() {
    override val size: Int
        get() = 4
}