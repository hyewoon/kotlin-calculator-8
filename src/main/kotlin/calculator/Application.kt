package calculator

import camp.nextstep.edu.missionutils.Console.readLine


fun main() {
    // TODO: 프로그램 구현
    println("덧셈할 문자열을 입력해 주세요.")
    val input = readLine()
    val list = if (input.startsWith("//")) {
        val code = input.substring(2, 3)
        input.substring(5).trim().split(code)
    } else if(input.isEmpty()){
        0
    } else{
        input.split(",", ":")
    }

    println("결과 : $list")
}
