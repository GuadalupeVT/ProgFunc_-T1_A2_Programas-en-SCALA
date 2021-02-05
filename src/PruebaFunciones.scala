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
  var res=0.0
  
  
  //Funcion para el cuociente
  def cuociente(x:Double,y:Double): Double= {x/y}
  
  //Funcion para el promedio
  def promedio(cuociente:Double,y:Double): Double={(cuociente+y)/2}
  
  //Funcion para calcular la salida
  def dif(promedio:Double,x:Double): Boolean={
    var estimacion=promedio*promedio
    var dif=estimacion-x
    if(dif<0.0001)
      true
    else
      false
  }
     
  //Calcular la raiz con el metodo de Newton
  def raizCuadrada(x:Double, y:Double): Unit ={
    var prom= promedio(cuociente(x,y),y)
    if(dif(prom, x))
      res=prom
    else
      raizCuadrada(x,prom) 
  }
  
  
  //Mostrar uso
  def main(args: Array[String]): Unit = {
    raizCuadrada(2,1)
    println("La raiz cuadrada de 2 es :"+res)
    
    res=0
    raizCuadrada(89,9)
    println("La raiz cuadrada de 89 es :"+res)
  }
  
}