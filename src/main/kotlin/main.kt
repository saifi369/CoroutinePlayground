import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main() =
    runBlocking {
        joinAll(
            async { coroutineOne() },
            async { coroutineTwo() }
        )
    }

suspend fun coroutineOne() {
    println("Coroutine one is started")
    delay(3000)
    println("Coroutine one is complete")
}

suspend fun coroutineTwo() {
    println("Coroutine two is started")
    delay(2000)
    println("Coroutine two is complete")
}

fun routineOne() {
    println("Routine one is started")
    Thread.sleep(3000)
    println("Routine one is complete")
}

fun routineTwo() {
    println("Routine two is started")
    Thread.sleep(2000)
    println("Routine two is complete")
}