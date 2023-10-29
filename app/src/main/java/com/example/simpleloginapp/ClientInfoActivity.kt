package com.example.simpleloginapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.SimpleLoginApp.R

class ClientInfoActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_info)


        val buttonSaveClient = findViewById<Button>(R.id.saveButton)

        // Handle the save button click event
        buttonSaveClient.setOnClickListener {
            // Get user inputs from the UI components
//            val clientName = editTextClientName.text.toString()
//            val clientCharacteristics = spinnerClientCharacteristics.selectedItem.toString()

            // Save the client information (e.g., in a database)
//            // Implement data storage logic here
//            if (clientName.isNotEmpty()) {
//                // Do something with clientName, for example, display it
//                Toast.makeText(this, "Client Name: $clientName", Toast.LENGTH_SHORT).show()
//            }
//            if (clientCharacteristics.isNotEmpty()) {
//                // Do something with clientCharacteristics, for example, display it
//                Toast.makeText(this, "Client Characteristics: $clientCharacteristics", Toast.LENGTH_SHORT).show()
//            }
//            // Provide user feedback (e.g., toast message)
//            Toast.makeText(this, "Client information saved.", Toast.LENGTH_SHORT).show()
//        }
//    }
        }
    }
}
