import java.awt.Container
import java.util.Scanner

fun main() {
//    println(numCaracters("SIA."))
//    println(numCaractersA("SIA."))
    serieCreixent(12345670)
}

fun numCaracters(frase: String):Int{
    val lletres = Scanner(frase)
    lletres.useDelimiter("")
    var palabra = lletres.next()[0]
    var cont: Int = 0
    while(palabra != '.'){
        palabra = lletres.next()[0]
        cont++
    }
    return cont
}

fun numCaractersA(frase: String){
    val lletres = Scanner(frase)
    lletres.useDelimiter("")
    var paraula = lletres.next()[0]
    var contador: Int = 0
    while(paraula != '.'){
        if(paraula == 'a' || paraula == 'A') contador++
        else if(contador != 0) contador++;
        paraula = lletres.next()[0]
    }
}

fun serieCreixent(serie: Int){
    var numbers = serie.toString()
    val numeros = Scanner(numbers)
    numeros.useDelimiter("")
    var num = numeros.next()[0]
    var numAnt = 0
    var isCreixent: Boolean = true
    while (num != '0' && isCreixent != false){
        if(numAnt > num.code) isCreixent = false
        else {
            numAnt = num.code
            num = numeros.next()[0]
        }
    }
}

fun seriePos(serie: Int){
    var numbers = serie.toString()
    val numeros = Scanner(numbers)
    numeros.useDelimiter("")
    var num = numeros.next()[0]
    var isPos: Boolean = true
    while (num != '0' && isPos != false){
        if(num.code > 0) isPos = false
        else {
            num = numeros.next()[0]
        }
    }
}