package io.keepcoding.todo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.keepcoding.todo.ui.base.BaseActivity
import io.todo.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
