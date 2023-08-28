package com.example.fitness_optimal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout

import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {






    lateinit var toggle: ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navbar
        var drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        var navView : NavigationView = findViewById(R.id.nav_view)



        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)

       drawerLayout.addDrawerListener(toggle)
       toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_Workout -> Toast.makeText(applicationContext,"Clicked Workout",Toast.LENGTH_SHORT).show()
                R.id.nav_Contect-> Toast.makeText(applicationContext,"Clicked Contect us",Toast.LENGTH_SHORT).show()
                R.id.nav_setting -> Toast.makeText(applicationContext,"Clicked setting",Toast.LENGTH_SHORT).show()
                R.id.nav_login -> Toast.makeText(applicationContext,"Clicked login",Toast.LENGTH_SHORT).show()
                R.id.nav_share -> Toast.makeText(applicationContext,"Clicked share",Toast.LENGTH_SHORT).show()
                R.id.nav_review -> Toast.makeText(applicationContext,"Clicked review",Toast.LENGTH_SHORT).show()


            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){

            return true
        }


        return super.onOptionsItemSelected(item)
    }


}