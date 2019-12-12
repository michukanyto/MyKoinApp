package com.example.mykoinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.context.GlobalContext.get
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val student = get<Student>{parametersOf("louise",987)}

        val teacher = get<Teacher>{parametersOf("Gregory",555)}




        val course = get<Course>{ parametersOf("Math",student)}
        course.student.printCourse()
        course.teacher.printName()
        println("------------ ${course.name}")

        val course1 = get<Course>{ parametersOf("English",student)}
        course1.student.printCourse()
        course1.teacher.printName()
        println("------------ ${course1.name}")
    }
}
