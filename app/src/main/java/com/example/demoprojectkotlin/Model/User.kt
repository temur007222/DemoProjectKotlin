package com.example.demoprojectkotlin.Model

import java.io.Serializable

class User(var name: String, private var age: Int) : Serializable {

    override fun toString(): String {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}