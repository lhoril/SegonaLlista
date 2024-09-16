import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("posa una frase que acabi en .")
    println(numCaracters(scanner.next()))
    println("posa una frase que acabi en .")
    println(numCaractersA(scanner.next()))
    println("posa una serie de numeros que acabi en 0")
    println(serieCreixent(scanner.nextInt()))
    println("posa una serie de numeros que acabi en 0")
    println(seriePos(scanner.nextInt()))
    println("posa una serie de numeros")
//    println(numMajor(scanner.nextInt()))
    println("posa una frase amb espais que acabi en .")
    println(senseEspaiBlancs(scanner.next()))
    println("posa un serie de numeros")
    println(numMajorsIMultiples(scanner.nextInt()))
    println("posa un serie de numeros")
    println(numMesPetit(scanner.nextInt()))
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

fun numCaractersA(frase: String):Int{
    val lletres = Scanner(frase)
    lletres.useDelimiter("")
    var paraula = lletres.next()[0]
    var contador: Int = 0
    while(paraula != '.'){
        if(paraula == 'a' || paraula == 'A') contador++
        else if(contador != 0) contador++;
        paraula = lletres.next()[0]
    }
    return contador
}

fun serieCreixent(serie: Int):Boolean{
    var numbers = serie.toString()
    val numeros = Scanner(numbers)
    numeros.useDelimiter("")
    var num = numeros.nextInt()
    var numAnt = 0
    var isCreixent: Boolean = true
    while (num != 0 && isCreixent != false){
        if(numAnt > num) isCreixent = false
        else {
            numAnt = num
            num = numeros.nextInt()
        }
    }
    return isCreixent
}

fun seriePos(serie: Int):Boolean{
    val numbers = serie.toString()
    val numeros = Scanner(numbers)
    numeros.useDelimiter("")
    var num = numeros.next()[0]
    var isPos: Boolean = true
    while (num != '0' && isPos != false){
        if(num == '-') isPos = false
        else {
            num = numeros.next()[0]
        }
    }
    return isPos
}

fun numMajor(serie: Int):String{
    val numbers = serie.toString()
    val numeros = Scanner(numbers)
    numeros.useDelimiter("")
    var num = Int.MIN_VALUE
    var num1:Int = 0; var num2:Int = 0;
    var sum:Int = 0;
    var contador:Int = 0;
    while (num <= sum)
    {
        sum = 0
        num = numeros.nextInt()
        num2 = num
        num = numeros.nextInt()
        sum = num1 + num2
        num1 = num2
        contador++
    }
    return "Repeticiones: ${contador} Numero: ${num}  ${num1} + ${num2} = ${sum}"
}

fun senseEspaiBlancs(frase: String):String{
    val scanner = Scanner(frase)
    scanner.useDelimiter("")
    var lletra = scanner.next()[0]
    var msg:String = ""
    while (lletra != '.'){
        if(lletra  != ' ')msg+= lletra
        lletra = scanner.next()[0]
    }
    return msg
}

fun numMajorsIMultiples(serie: Int):String{
    val numbers = serie.toString()
    val scanner = Scanner(numbers)
    scanner.useDelimiter("")
    var num = 0
    var contMult3 = 0
    var contGransOIguals5 = 0
    for (i in 0..<numbers.length){
        num = scanner.nextInt()
        if(num % 3 == 0 && num != 0) contMult3++
        if (num >= 5) contGransOIguals5++
    }
    return "Multiples de 3: ${contMult3} i Majors o iguals de 5: ${contGransOIguals5}"
}

fun numMesPetit(serie: Int):String{
    val numbers = serie.toString()
    val scanner = Scanner(numbers)
    scanner.useDelimiter("")
    var num = 0
    var numMespetit = Int.MAX_VALUE
    for (i in 0..<numbers.length){
        num = scanner.nextInt()
        if(numMespetit > num) numMespetit = num
    }
    return "El numero més petit: ${numMespetit}"
}