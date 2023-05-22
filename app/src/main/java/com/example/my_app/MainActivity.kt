package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//вызов родительской реализации
        setContentView(R.layout.activity_main)//file gde my zapisyvaly xml code/interface
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
