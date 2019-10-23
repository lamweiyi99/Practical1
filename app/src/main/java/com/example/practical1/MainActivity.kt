package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

       // val countUpButton: Button = findViewById<Button>(R.id.countUp_button)
        //countUpButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {

        Toast.makeText(this, "Roll Dice button clicked",
            Toast.LENGTH_SHORT).show()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val diceImage3: ImageView = findViewById(R.id.dice_image3)

        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1


        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        val drawableResource2 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)

        val drawableResource3 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage3.setImageResource(drawableResource3)


    }
/*
    private fun countUp() {
        Toast.makeText(
            this, "Count Up button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Hello World!") {
            resultText.text = "Counted Up!"
            resultText.text = "1"
            resultText1.text = "1"
            resultText2.text = "1"
        }

        if (resultText.text != "6") {
            val ans = resultText.text.toString().toInt() + 1
            resultText.text = "Counted Up!"
            resultText.text = ans.toString()
        }

        if (resultText1.text != "6") {
            val ans1 = resultText1.text.toString().toInt() + 1
            resultText1.text = "Counted Up!"
            resultText1.text = ans1.toString()
        }

        if (resultText2.text != "6"){
            val ans2 = resultText2.text.toString().toInt() + 1
            resultText2.text = "Counted Up!"
            resultText2.text = ans2.toString()

        }


    }*/
}
