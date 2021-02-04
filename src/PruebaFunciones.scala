/*
 * 1. Crea de forma ITERATIVA el programa que calcula la raíz cuadrada de un numero a través del algoritmo de Newton.
 * 
 * El método computacional más común para calcular raíces cuadradas (y otras funciones también) 
 * es el método de Newton de aproximaciones sucesivas. Cada vez que tenemos una estimación y del 
 * valor de la raíz cuadrada de un número x, podemos hacer una pequeña manipulación para obtener una 
 * mejor aproximación (una más cercana a la verdadera raíz cuadrada) promediando y con x/y.
 * 
 */
import scala.math._

object PruebaFunciones {
  var res=0.0000
  
  def raizCuadrada(x:Double, y:Double): Unit ={
    var cuociente = x/y
    var promedio= (cuociente+y)/2
    
    var estimacion=promedio*promedio
    var dif=estimacion-x
    if(dif<0.0001)
      res=promedio
    else
      raizCuadrada(x,promedio) 
  }
  
  def main(args: Array[String]): Unit = {
    raizCuadrada(2,1)
    println("La raiz cuadrada es :"+res)
  }
  
}