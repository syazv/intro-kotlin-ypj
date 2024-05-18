fun main() {

// Control flow in Kotlin
var myAge = 16

if (myAge < 18){
	println(“You are underage”)
 }
println(“The End”)

// If and else (Jika dan lain lain)
if (myAge < 18){
	println(“You are underage”)
 }
else{
	println(“You can watch the movie”)
 }

// If, else if, else (jika, jika tidak, dan lain lain)
If (myAge < 13){
	println(“You cannot watch the movie”)
 }
else if (myAge < 18){
	println(“You can watch with parent (PG)”)
 }
else {
	println(“You can watch the movie”)
 }


var childAge = 17
var parent = true
if (childAge < 13 || childAge < 18 && parent == false){
	println(“You can watch the movie”)
}
else {
	println(“You can watch the movie”)
}


//When (a.k.a Switch Case in other language)
var size = 1
var price:Int? = null

when (size){
	1 -> price = 5
	2 -> price = 7
	3 -> price = 10
	else -> println(“We don’t support other size”) // default
}
print(price)


// For loop
for (i in 0..5){
	println("i=$i") // Dari 0 sehingga 5, keluarkan nilai i
 }
for (i in 5 downTo 0){
	println("i=$i") // Dari 5 sehingga 0 keluarkan nilai i
 }
for (i in 1..5 step 2){
	println("i=$i")
 }
for (i in 5 downTo 1 step 2){
	println("i=$i")
 }

// For item in array

var languages = arrayOf(“Ruby”, “Kotlin”, “Python”, “Java”)

for (item in languages){
	println(item)
 }

// languages.size = 4
// dari 0 sehingga 3
// Item start from 0,1,2,3
for (i in 0 .. languages.size - 1){
 	println(“Item at index $i is $languages[i]”)
 }


// While loop
var x1 = 1
while (x1 < 5){
	println(“x1 = $x1”)
	x1++
 }


// Do while
var x2 = 1
	do {
		println(“x2 = $x2)
		x2++
	}
	while(x2 <= 5)


var x3 = 1
do {
	println(“x3=$x3”)
	x3++
	if (x3 == 3) break // Keluar dari Do While
 }
while (x <= 5)

var x4 = 0
do{
	x4++
	if (x4 == 3) {continue} // abaikan senario ini tetapi teruskan
	println(“x4=$x4”)
 }
while (x4 <= 5)


sayHello() // Function invocation / Memanggil function

sayGoodbye(“John”)

println(calculateBMI(172.0, 60.0))

}


// Function is a group expression that can be reusable in our code

fun sayHello(){
	println(“Hello World”)
 }

// Function with argument/parameter
fun sayGoodbye(name:String){
	println(“Goodbye $name”);
}

// Function with return
fun calculateBMI(height:Double, weight:Double):Double {
	return weight / ((height/100) * (height/100))
}
