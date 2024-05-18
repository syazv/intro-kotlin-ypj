fun main() {

    println("Hello, Android ATC")
    
    val x = 1
    val y = 3
    
    // Creating constant variable
    println(x)
    val z = x + y
    
    println(z)
    
    val name = "Syaz"
    // name = "Syazani"
    println(name)
    
    var fullName = "Syazani"
    fullName = "Muhammad Syazani"
    println(fullName)
	
    val address:String = "Bandar Baru Bangi"
    println(address)
    
    var jantina:Char = 'L'
    println(jantina)
	
    val message = "My name is " + name
    println(message)
    
    // String interpolation , $ -> cari variable yang ditetapkan
    val anotherMessage = "My name is $name and I live in $address"
    println(anotherMessage)
    
    var num1:Int = 9
    var num2:Int = 5
    var sum = num1+num2
    println(sum)
    
    var minus = num1-num2
    println(minus)
    
    var product = num1*num2
    println(product)
    
    var division = num1/num2
    println(division)
    
    var modulo = num1%num2
    println(modulo)


    var eaten = true
    var tired:Boolean = false
    
    println(eaten && tired)
    println(eaten || tired)
    println(!eaten)


 var profession:Int? = null
    
    var newProfession:String? = null
    
    println(profession)
    println(newProfession)
    profession = 21
    newProfession = "Trainer"
    println(newProfession)
    println(profession)
    
    var scores = arrayOf(70,90,100,80,85,60)
    println(scores[2])
    println(scores.size)


var tinggi:Double = 170.0
var berat = 70
var bmi = berat /((tinggi / 100) * (tinggi / 100))
println(bmi)

}
