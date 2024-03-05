package com.example.cubbi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class LoginActivity : AppCompatActivity() {
    lateinit var usernameInput : TextInputEditText
    lateinit var passwordInput : TextInputEditText
    lateinit var forgotPasswordBtn : MaterialTextView
    lateinit var loginBtn : MaterialButton
    lateinit var signupBtn : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        forgotPasswordBtn = findViewById(R.id.forgot_password_btn);
        loginBtn = findViewById(R.id.login_btn);
        signupBtn = findViewById(R.id.signup_btn);

        loginBtn.setOnClickListener() {
            val username = usernameInput.text.toString()
            val password =  passwordInput.text.toString()
            Log.i("Test Credentials", "Username: $username\nPassword: $password")
        }
    }
}