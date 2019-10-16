package com.k004.Yeu_cau

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}
    class Triangle(
    var sideA: Double,
    var sideB: Double,
    var sideC: Double
    ) : Shape(listOf(sideA, sideB, sideC)) {
        override fun calculateArea(): Double {
            val s = perimeter / 2
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }
    }
fun main(){
    val triangle = Triangle(5.0, 6.0, 7.0)
  println("Diện tích hình tam giác có ba cạnh 5, 6, 7 là ${triangle.calculateArea()}")
}