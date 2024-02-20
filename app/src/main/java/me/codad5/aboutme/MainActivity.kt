package me.codad5.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            setNickname(it)
        }

    }

    private fun setNickname(view : View) {
        val nickname_input = findViewById<EditText>(R.id.nickname_edit)
        val show_nickname = findViewById<TextView>(R.id.nickname_show)

        show_nickname.text = nickname_input.text
        nickname_input.visibility = View.GONE
        view.visibility = View.GONE
        show_nickname.visibility = View.VISIBLE

//        to hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}