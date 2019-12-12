package com.example.mykoinapp

import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

val appModule = module {



    factory { (name: String, id: Int) -> Student(name,id) }
//    single { Student()}

    single { (name: String, id: Int) -> Teacher(name,id) }

//    factory { Course(get(), get()) }

    factory { (name: String, student: Student) -> Course(name, student, get()) }


}