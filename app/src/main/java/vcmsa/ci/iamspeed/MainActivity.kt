package vcmsa.ci.iamspeed

import android.R.integer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Calling variables
        //==========================================================================================
        val txtHeading = findViewById<TextView>(R.id.txtHeading)
        val txtSpeedMessage = findViewById<TextView>(R.id.txtSpeedMessage)
        val edtUserSpeed = findViewById<TextView>(R.id.edtUserSpeed)
        val btnSpeed = findViewById<Button>(R.id.btnSpeed)
        //==========================================================================================

        btnSpeed.setOnClickListener{
            val speed=edtUserSpeed.text.toString().toInt()
            if (speed < 60)
              {txtSpeedMessage.text="You are driving safely!"}
            else if (speed >= 60 && speed <= 80)
              {txtSpeedMessage.text="Warning! Drive carefully!"}
            else if (speed >= 81 && speed <= 100)
              {txtSpeedMessage.text="Fine:R500"}
            else if (speed > 101)
            {txtSpeedMessage.text="Fine:R2000"}
            else
              {txtSpeedMessage.text="The data written is invalid or the car is not moving"+"Please enter a valid CAR SPEED"}
        }
    }
}