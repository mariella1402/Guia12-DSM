package com.example.appcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CalculatorModel {
    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }
    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }
    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }
    fun divide(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}
