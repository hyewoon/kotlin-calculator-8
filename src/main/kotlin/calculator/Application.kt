package calculator

import camp.nextstep.edu.missionutils.Console.readLine
import net.bytebuddy.pool.TypePool.Resolution.Illegal


fun main() {
    // TODO: 프로그램 구현
    println("덧셈할 문자열을 입력해 주세요.")
    val input = readLine()!!
    if(input.isEmpty()) {
        println("결과 : 0")
        return
    }

    val list: List<String> = if (input.startsWith("//")) {
        val divider: String = input.substring(2, 3)
        input.substring(5).trim().split(divider)
    } else {
        input.split(",", ":")
    }

    val number: List<Int> = list.map{ it.toInt() }
    number.forEach {
        if (it <= 0) throw IllegalArgumentException()
    }
    val result = number.sum()

    println("결과 : $result")
}
