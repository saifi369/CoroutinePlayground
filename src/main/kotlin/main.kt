import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    println("Main starts")

    joinAll(
        async { coroutineOne() },
        async { coroutineTwo() }
    )

    println("Main ends")


}

suspend fun coroutineOne(){
    println("Coroutine one is started")
    delay(1000)
    println("Coroutine one is complete")
}

suspend fun coroutineTwo(){
    println("Coroutine two is started")
    delay(2000)
    println("Coroutine two is complete")
}