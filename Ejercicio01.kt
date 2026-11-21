fun main() {
    val nombre: String = "Diego"

    var edad: Int = 24

    val correo: String = "dgh12031@gmail.com"
    var cuentaActiva: Boolean = true
    val satisfaccion: Double = 9.5

    println("INFORMACION DEL USUARIO")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

    edad = 25
    cuentaActiva = false

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Cuenta activa: $cuentaActiva")
}