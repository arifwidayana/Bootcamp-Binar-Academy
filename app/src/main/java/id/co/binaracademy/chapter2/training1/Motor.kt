package id.co.binaracademy.chapter2.training1

class Motor: KendaraanRodaDua {
    override fun lampu() {
        println("Lampu kecil")
    }

    override fun spion() {
        println("terdapat dua kaca")
    }

    override fun tank() {
        println("memiliki tangki maksimal 10 Liter")
    }
}

class Mobil: KendaraanRodaDua,KendaraanRodaEmpat {
    override fun lampu() {
        println("Lampu besar")
    }

    override fun spion() {
        println("terdapat tiga kaca")
    }

    override fun tank() {
        println("memiliki tangki maksimal 120 Liter")
    }

    override fun mesin() {
        println("Mesin yang digunakan adalah diesel")
    }
}