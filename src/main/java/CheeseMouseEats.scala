//package com.CheeseMouseEats
//src/main/java/CheeseMouseEats.scala


import java.util.Properties
import org.apache.spark._
import org.apache.spark.SparkContext._
//import Goto._
import scala.util.control.Breaks._
import scala.math._
import scala.collection.mutable.WrappedArray

object CheeseMouseEats
{

  def T_input : Int = {
    print("\n Enter the number of test cases, TestCase limit T is 200: ")
    val temp = scala.io.StdIn.readInt()
    temp
  }

  def len_input : Int = {
    print("\n Enter the length of array, array lenght limit 1000: ")
    val temp = scala.io.StdIn.readInt()
    temp
  }

  def insert_element : Int = {

    print("\n Enter the element of array should be between 1,10000: ")
    val temp = scala.io.StdIn.readInt()
    temp

  }

  def calcAltSum( arr_input: Array[Int]) ={

    println("Given weights of cheese are ")
    println(arr_input.mkString(" "))

    var odd_sum = 0
    var even_sum = 0

    for(i <- 1 to arr_input.length){

      if((i-1)%2 == 0) {
          even_sum += arr_input(i-1)
      }else{
        odd_sum += arr_input(i-1)
      }
    }
      val big = if(odd_sum > even_sum){
        odd_sum
      }else{
        even_sum
      }
      println(s"Rat eats $big amount of cheese")

  }

  def insertArray( numberOfArrays: Int) ={

    var i: Int = 0
    var T: Int = numberOfArrays

    for( i  <- 1 to T )
    {
      var length = 0
      var flag =0
      length = len_input


      breakable {
        do {
          if ((1<=length) && (1000>=length)) {
            println("length of array is:" + length)
            flag = 1
            break
          }else{
            length = len_input
          }
        } while (flag == 0)
      }

      var arr = new Array[Int] (length)

      for(i <- 1 to length )
        {
          var pos = i-1
          println(s"Insert element between (1,10000) into position $pos of array")
//          val temp1 = scala.io.StdIn.readInt()

          var elem = 0
          var flag1 =0
          elem = insert_element

          breakable {
            do {
              if ((1<=elem) && (10000>=elem)) {
                println("element of array is:" + elem)
                flag = 1
                break
              }else{
                elem = insert_element
              }
            } while (flag == 0)
          }
//          arr +:=  temp
          arr(i-1) = elem

          println("Printing entire elements of array")
          println(arr.mkString(" "))

        }

      println("Cacluculating maximum cheese Rat can eat \n ")

//      calcAltSum(arr)

      calcMax(arr)

    }

  }


  def calcMax( arr: Array[Int]):  Int  ={

    println(arr.mkString(" "))

    val a = arr.toList

    /*println("array length :" + arr.length)

    val max_ind = arr.indices.maxBy(arr)
    println("index of max number" + max_ind)
    val arr_len = arr.length


    var sum = 0
//    adding right elements
    breakable {
      for (i <- max_ind to ((arr.length) - 1) by 2) {

        var last_added = 0
        println("Index position :" + i)

        if (i <= ((arr.length) - 1)) {


          breakable {
            if ( (
                  0 < i &
                  (arr.length - 1) > i &
                  i != last_added &
                  arr(i) > arr(i + 1)
                                      ) ||
              ( i == (arr.length - 1))

            ) {


              last_added = i
              println("last_added : "+last_added)

              sum += arr(i)

              println(sum)
              println( "index of element added: " +last_added)
            }
            else {

            }
          }

        }
      }

      }
    println("sum = "+sum)
    sum*/

    var withoutPrev=0
    var withPrev=0

    for(x <- a){

      println( "Value of x: " + x )

      var withoutPrev_temp = withoutPrev
      withoutPrev = max(withoutPrev,withPrev)
      withPrev = withoutPrev_temp + x

    }

    print(max(withPrev,withoutPrev))

    max(withPrev,withoutPrev)

    }







  def main(args: Array[String]) {

    println(" This Program for weight of cheese eaten by Rat")
//    print("Enter the number of test cases, TestCase limit T is 200: ")
    var flag =0
//    var T = scala.io.StdIn.readInt()
    var T = T_input
//    def T_input : Int = scala.io.StdIn.readInt()

    breakable {
      do {
          if ((1<=T) && (200>=T)) {
            println("Value of T equalTo:" + T)
            flag = 1
              break
            }else{
            println("input length exceeds, re-enter again ")
            T = T_input
          }
      } while (flag == 0)
    }
    insertArray(T)
  }

}