package com.example.simpleloginapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.SimpleLoginApp.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val etUsername = findViewById<EditText>(R.id.etUsername)
//        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
//            val username = etUsername.text.toString()
//            val password = etPassword.text.toString()
//
//
//
//            // Perform a simple authentication check (for demonstration purposes)
//            //if (username == "teacher" && password == "12356") {
//                // Successful login
            val intent = Intent(this, ClientInfoActivity::class.java)
            startActivity(intent)
//
//            } else {
//                // Failed login
//                showToast(this, "Login failed. Please check your credentials.")
//
//
//            }
        }
    }

//    companion object {
//        fun showToast(mainActivity: MainActivity, message: String) {
//            Toast.makeText(mainActivity, message, Toast.LENGTH_SHORT).show()
//        }
    // }
}
