package org.example

import kotlin.math.abs

fun main() {

    println("Лабороторная работа №1")
    println("<--------->")
    writline()
    println("<--------->")
    taskTwo()
    println("<--------->")
    var number: Int = 5934
    print("Число $number")
    println("")
    taskThre(number)
    println("")
    println("<--------->")
    taskFour(2642)
    println("<--------->")
    taskFive(23)
    println("<--------->")
    println("Введите пожалуйста имя господин!)")
    val consoleOne = readln()
    println("Введите пожвлуйста ваш возраст!)")
    val consoleTwo = readln()
    var age: Int = consoleTwo.toInt()
    taskSix(consoleOne, age)
    println("<--------->")
    println("Лабороторная работа №2")
    println("<--------->")
    labTwoTaskOne()
    println("<--------->")
    println("Введите пожвлуйста ваш возраст!)")
    val consoleThe = readln()
    var ageLabTwo: Int = consoleThe.toInt()
    labTwoTaskTwo(ageLabTwo)
    println("<--------->")
    println("Калькулятор")
    println("У вас есть числа: 2 и 6\n" +
            "1. Добавить\n" +
            "2. Отнять\n" +
            "0. Ничего")
    val consoleFour = readln()
    var operation: Int = consoleFour.toInt()
    labTwoTaskThre(operation)
    println("<--------->")
    println("Введите число от 1 до 7, которое будет соответствовать дню недели.")
    val consoleFive = readln()
    var weekDay: Int = consoleFive.toInt()
    labTwoTaskFour(weekDay)
    println("<--------->")
    println("Введите 3 числа для поиска среднего из них")
    println("Введите первое число")
    val consoleSixOne = readln()
    println("Введите второе число")
    val consoleSixTwo = readln()
    println("Введите третье число")
    val consoleSixThree = readln()
    var numberOne: Int = consoleSixOne.toInt()
    var numberTwo: Int = consoleSixTwo.toInt()
    var numberThre: Int = consoleSixThree.toInt()
    labTwoTaskFive(numberOne,numberTwo,numberThre)
    println("<--------->")
    println("Введите ваши потери: ")
    val consoleSevenOne = readln()
    var loss: Int = consoleSevenOne.toInt()
    println("Введите вашу прибыль")
    val consoleSeveTwo = readln()
    var profit: Int = consoleSeveTwo.toInt()
    labTwoTaskSix(loss,profit)
    println("<--------->")
    println("Введите два числа для проверки их на четность")
    println("Введите первое число")
    val consoleEightOne = readln()
    var one: Int = consoleEightOne.toInt()
    println("Введите второе число")
    val consoleEightTwo = readln()
    var two: Int = consoleEightTwo.toInt()
    labTwoTaskSeven(one, two)
    println("<--------->")
    println("Лабороторная работа №3")
    labThreeTaskOne(5)
    println("<--------->")
    labThreeTaskTwo()
    println("<--------->")
    println("Введите любое целое число")
    val consoleTenTwo = readln()
    var three: Int = consoleTenTwo.toInt()
    labThreeTaskThree(three)
    println(" ")
    println("<--------->")
    val consoleElevenTwo = readln()
    var four: Int = consoleElevenTwo.toInt()
    labThreeTaskFour(four)
    println("<--------->")
    labThreeTaskFive()
    println("<--------->")
    labThreeTaskSix()
}




fun writline(){
    println("Иван")
    println(35)
    println(true)
}

fun taskTwo(){
    var num: Int = 5
    var oneLaters: Char = 'F'
    var word: String = "Привет"
    var numDouble: Double = 90.2
    val numNotUpdate: Int = 67
    println(word)
}

fun taskThre(numbers: Int){
    var numstr = numbers.toString()
    print("Результат ")
    for (i in numstr){
        print(i + ", ")
    }

}

fun taskFour(days: Int){

    var year: Int = days / 365
    println(year)
    var week: Int = (days - (year * 365)) / 7
    println(week)
    var day: Int = days - (week * 7) - (year * 365)
    println(day)


}

fun taskFive(num: Int){
    var numStr: String = num.toString()
    println(numStr + (num * 2))
}

fun taskSix(name: String, age:Int){
    println("Привет, $name! Тебе уже $age")
}

fun labTwoTaskOne(){
    val numOne: Int = 20
    val numTwo: Int = 17
    var result: Int = numOne % numTwo
    if (result > 0){
        println("Получилось значение большее чем ноль!")
    } else{
        println("Получилось значение меньшее чем ноль!")
    }
}

fun labTwoTaskTwo(age: Int){
    if (age > 18){
        println("Вам уже все можно")
    }else if (age == 18){
        println("Ура, Вам 18 лет!")
    }
    else{
        println("Вы еще слишком молоды")
    }
}

fun labTwoTaskThre(operation: Int){
    val numOne: Int = 2
    val numTwo: Int = 6
    when (operation){
        1 -> println(numOne + numTwo)
        2 -> println(numOne - numTwo)
        0 -> println("Тута ничего")
    }
}

fun labTwoTaskFour(weekDay: Int){
    when(weekDay){
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
    }

}

fun labTwoTaskFive(numOne: Int, numTwo: Int, numThree: Int){
    if (((numOne == numTwo) && (numTwo == numThree) && (numThree == numOne)) || ((numOne == numTwo) || (numTwo == numThree))){
        println("Ошибка")
    }else if (((numOne >= numTwo) && (numOne <= numThree)) || ((numOne <= numTwo) && (numOne >= numThree)) ){
            println("Среднее: $numOne")
    }else if(((numTwo >= numOne) && (numTwo <= numThree)) || ((numTwo <= numOne) && (numTwo >= numThree))){
        println("Среднее: $numTwo")
    }else{
        println("Среднее: $numThree")
    }
}

fun labTwoTaskSix(loss: Int, profit: Int){
    if ((profit - loss) > 0){
        println("Ваша прибыль составит: " + (profit - loss))
    }else{
        println("Ваши убытки составляют: " + abs(profit - loss))
    }
}

fun labTwoTaskSeven(numOne: Int, numTwo: Int){
    if ((numOne % 2) == 0){
        if ((numTwo % 2) == 0){
            println("true")
        }else{
            println("false")
        }
    }else if ((numTwo % 2) == 0){
        if ((numOne % 2) == 0){
            println("true")
        }else{
            println("false")
        }
    }
}

fun labThreeTaskOne(size: Int){
    for (i in 1..size){
       for (j  in 1..i){
           print(i)
       }
        println()
    }
}


fun labThreeTaskTwo(){
    val valueSecret: Int = (1..9).random()
//    println(valueSecret)
    println("Введите число:")
    while (true){
        val consoleLabThree = readln()
        var valueNum: Int = consoleLabThree.toInt()
        if (valueNum == valueSecret){
            println("Вы угадали!")
            break
        }else{
            println("Вы не угадали повторите попытку")
        }
    }

}

fun labThreeTaskThree(numberTestOne: Int){
    val testNumber: Double = numberTestOne.toDouble()
    for (i in 1..numberTestOne){
        if (numberTestOne % i == 0) {
            print(" $i")

        }
    }
}

fun labThreeTaskFour(num: Int){
    var even: Int = 0;
    var odd: Int = 0;
    for (i in 0..num){
        if (i % 2 == 0){
            even++
        }else{
            odd++
        }
    }
    println("Количетсво четных чисел: $even")
    println("Количество не четных чисел: $odd")

}


fun labThreeTaskFive(){
    var result: Int = 0;
    var noResult: Int = 0;
    var fullResult: Int = 0;
    for (i in 1..100){
        fullResult += i
        if (i % 4 == 0){
            result += i
        }else{
            noResult += i
        }
    }
    println("Результат задания пять: $result")
//    println("Результат задания пять: $noResult")
//    println("Результат задания пять: $fullResult")

}

fun labThreeTaskSix(){
    var counter: Int = 5;
    var result: Int = 0;
    while (true){
        if (counter <= 57){
            if ((counter != 34) && (counter != 46) && (counter != 52)) {
//                println(counter)
                result += counter
            }else{

            }
        }else{
            break
        }
        counter += 1
    }
    println(result)
}