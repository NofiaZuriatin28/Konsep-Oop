package id.ac.polbeng.depandi.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int){
    var firstName: String= _firstName
    var lastName: String= _lastName
    var age: Int =_age
}

fun main() {
    val budi = PersonB("Budi","Gunawan",21)
    println("name: ${budi.firstName} ${budi.lastName}")
    println("age : ${budi.age}")
}