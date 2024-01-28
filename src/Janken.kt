class Janken(private val playerHandInt: Int) {

    fun playJanken()
    {
        try {
            val playerName = handResult(playerHandInt)

            val cpuHand = cpuHand()
            val cpuName = handResult(cpuHand)

            val judge = judge(playerHandInt, cpuHand)

            println("PLAYER:$playerName")
            println("CPU:$cpuName")
            println("結果:$judge")

        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun cpuHand(): Int {
        return (1..3).random()
    }

    private fun judge(player: Int, cpu: Int): String
    {
        return if (player == cpu) {
            Constants.Results.DRAW
        } else if ((player == Constants.Hands.GU && cpu == Constants.Hands.CHOKI) || (player == Constants.Hands.CHOKI && cpu == Constants.Hands.PA) || (player == Constants.Hands.PA && cpu == Constants.Hands.GU)){
            Constants.Results.WIN
        } else {
            Constants.Results.LOSE
        }
    }

    private fun handResult(handNum:Int): String
    {
        return if (handNum == Constants.Hands.GU){
            Constants.Calls.GU
        }
        else if(handNum == Constants.Hands.CHOKI) {
            Constants.Calls.CHOKI
        }
        else {
            Constants.Calls.PA
        }
    }
}