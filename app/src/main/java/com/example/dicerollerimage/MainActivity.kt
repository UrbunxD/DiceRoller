package com.example.dicerollerimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.ConsoleMessage
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {rollDice()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val number: TextView = findViewById(R.id.edtNumber)


        val drawableResource = when(randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceImage.setImageResource(drawableResource)

        if ( number.text.toString() == randomInt.toString()){

            Toast.makeText(this, "You Win!",
                Toast.LENGTH_SHORT).show()

        }else{

            Toast.makeText(this, "You Lose!",
                Toast.LENGTH_SHORT).show()

        }
    }
}