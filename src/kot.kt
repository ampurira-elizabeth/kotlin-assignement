fun main(){
    var note = "hello"
    var name = "liz"
    var sum = "hello"+"liz"
    println("hello"+ " "+"liz")
    one()
    two()
three()
    four()
    five()
}
fun sum(hello:String,liz:String):String{
    var sum =("fact"+"liz")
    return sum

}




fun one(){
   var x= remainder(90,19)
    println(x)

}
fun remainder(number1:Int,number2:Int):Int{
    var modulus=number1 % number2
    return modulus
}

fun two(){
    var al=l(50,3)
    println(al)

}
fun l(x:Int,y:Int):Int{
    var modulus =x%y
            return modulus
}

fun three (){
    var u=add(30, 40)
    println(u)
}
fun add(y:Int,h:Int):Int{
    var sum=y+h
    return sum

}

fun four(){
  var name=" liz"
  var tribe="bakiiga"
    var both= "liz "+" is a" +"bakiiga"
    println(both)
}
fun tribe(liz:String,bakiiga:String ):String{
     var tribe=liz+bakiiga
     return tribe
}
fun five(){
 var peep= product(400,30)
  var product= 400*30

    println(peep)
}
fun product(m:Int,n:Int):Int{
    var product=m*n
    return product
}