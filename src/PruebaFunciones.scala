/*
 * 1. Crea de forma ITERATIVA el programa que calcula la ra�z cuadrada de un numero a trav�s del algoritmo de Newton.
 * 
 * El m�todo computacional m�s com�n para calcular ra�ces cuadradas (y otras funciones tambi�n) 
 * es el m�todo de Newton de aproximaciones sucesivas. Cada vez que tenemos una estimaci�n y del 
 * valor de la ra�z cuadrada de un n�mero x, podemos hacer una peque�a manipulaci�n para obtener una 
 * mejor aproximaci�n (una m�s cercana a la verdadera ra�z cuadrada) promediando y con x/y.
 * 
 */
import scala.math._

object PruebaFunciones {
  var res=0.0
  
  def raizCuadrada(x:Double, y:Double): Unit ={
    var cuociente = x/y
    var promedio= (cuociente+y)/2
    
    var estimacion=promedio*promedio
    var dif=x-estimacion
    if(estimacion<0.0001)
      res=promedio
    else
      raizCuadrada(x,promedio) 
  }
  
}