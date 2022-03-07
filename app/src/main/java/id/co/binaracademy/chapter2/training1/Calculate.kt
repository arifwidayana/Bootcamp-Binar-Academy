package id.co.binaracademy.chapter2.training1

abstract class Calculate {
    abstract fun value(): Double
}

class LSegitiga(val alas: Int, val tinggi: Int): Calculate() {
    override fun value(): Double {
        return 0.5*alas*tinggi
    }
}

class KSegitiga(val sisi: Int): Calculate(){
    override fun value(): Double {
        return (sisi+sisi+sisi).toDouble()
    }
}