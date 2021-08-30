// Array ya da listenin elemanlarını tersine çevir.
// input : [1,3,5,7]   number = 1   "1. indisten itibaren ters çevir"
// Output [1,7,5,3]
// Default : ilk eleman(sıfırıncı İndex) 
// extension function 

public fun reversedArray(array: IntArray, number: Int=0): IntArray {     // Default olarak İndis[0]

    var length = array.size-1                // array uzunluğu
    var temp:Int
    var k2 = (array.size - number) / 2   // k2 : kaç kere swap işlemi yapılacak
    var k3 = number                      // istenilen indis 

    while(k2 > 0){            
    
        temp = array[k3]               // baştan alınacak sayı
        array[k3] = array[length]          // swap işlemi
        array[length] = temp 
        length -= 1
        k3 +=1   
            
        k2 -= 1                        // her swap işlemi bittiğinde k2 bir azalt.
    }

    return array
}
    
    
fun main() {
    
    var array: IntArray = intArrayOf(1,3,5,7) // İnput = [1,3,5,7]  number=3  Output = [1,7,5,3]
        
    print("Dizinin kaçıncı indisten itibaren çevireleceğini giriniz = ")  
    var number = readLine()!!.toInt()
                                                                    // Eğer number parametresini göndermezseniz: 
    var result_array:IntArray = reversedArray(array,number)         // Default olarak indis[0] olur. Ve bütün diziyi çevirir

    if(number > array.size){
        print("Yanlis Numara Girdiniz !!!")
    }
    
    for(i in result_array){  // println(result_array.contentToString())
        println(i)
    }
}
    