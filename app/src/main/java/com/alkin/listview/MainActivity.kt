package com.alkin.listview

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import java.util.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_listView =findViewById<Button>(R.id.btn_listview)
        val btn_fragment =findViewById<Button>(R.id.btn_fragment)
        val btn_intent =findViewById<Button>(R.id.btn_intent)
        val btn_show =findViewById<Button>(R.id.btn_file_management);
        val btn_jgdipencet =findViewById<Button>(R.id.troll)

        val sfx = listOf<Int>(
            R.raw.sfx,
            R.raw.brot,
            R.raw.kaget,
            R.raw.cingcong
            )

        var mp:MediaPlayer
        //= MediaPlayer.create(this,sfx.random())

        btn_listView.setOnClickListener {
            startActivity(Intent(this,ListViewActivity::class.java))
        }
        btn_intent.setOnClickListener {
            startActivity(Intent(this, IntentActivity::class.java))
        }
        btn_fragment.setOnClickListener {
            startActivity(Intent(this,FragmentActivity::class.java))
        }
        btn_show.setOnClickListener {
            startActivity(Intent(this,FileManagementActivity::class.java))
        }
        btn_jgdipencet.setOnClickListener {
            mp = MediaPlayer.create(this,sfx.random())
            mp.start()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}