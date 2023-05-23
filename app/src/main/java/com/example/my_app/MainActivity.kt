package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//вызов родительской реализации
        setContentView(R.layout.activity_main)//file gde my zapisyvaly xml code/interface


        val bottomView=findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navController=findNavController(R.id.container)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if(destination.id==R.id.createNoteFragment){
                bottomView.visibility= View.GONE
            }//добавление видемости кодга добавляем заметки
            else bottomView.visibility=View.VISIBLE

        }
        AppBarConfiguration(
            navController.graph
        )
        bottomView.setupWithNavController(navController)

    }

    override fun onStart() {
        super.onStart()//redko primenyetsa
    }

    override fun onResume() {
        super.onResume()
    }
//mejdu resume i pause klient work with app

    override fun onPause() {
        super.onPause()
    }//when we svernuli

    override fun onStop() {
        super.onStop()
    }//activiy snachala v pausu potom ostanovka

    override fun onDestroy() {
        super.onDestroy()
    }
}
//voobje zakryly

//acitivity konteiner prilojeniya
//chto ne menaytsy to v xml maincode
//acitiviy toje fragmenty raznye
//fragment bez activiti ne mojet byt
//fragment stranitha prilojeniy ,acitiviti sam site
