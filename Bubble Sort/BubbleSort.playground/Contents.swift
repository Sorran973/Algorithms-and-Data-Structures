import UIKit

/* --------------- Bubble Sort --------------- */


func swap(in array: inout [Int], element i: Int) {
    let temp = array[i+1]
    array[i+1] = array[i]
    array[i] = temp
}

func classicBubbleSort(for array: [Int]) -> [Int] {
    var newArr = array
    for i in 0..<newArr.count {
        for j in 0..<newArr.count-1-i {
            if newArr[j] > newArr[j+1] {
                swap(in: &newArr, element: j)
///                newArr.swapAt(j, j+1) - swift method

            }
        }
    }
    return newArr
}

func whileBubbleSort(for array: [Int]) -> [Int] {
    var newArr = array
    var flag: Bool
    repeat {
        flag = false
        for i in 0..<newArr.count-1 {
            if newArr[i] > newArr[i+1] {
                swap(in: &newArr, element: i)
///                newArr.swapAt(i, i+1) - swift method
                flag = true
            }
        }
    } while flag
    
    return newArr
}

func recurciveBubbleSort(for array: inout [Int], arrayLength n: Int) -> [Int] {
    if n == 1 {
        print("end")
        return array
    }

    for i in 0..<n-1 {
        if array[i] > array[i+1] {
            array.swapAt(i, i+1)
        }
    }
    recurciveBubbleSort(for: &array, arrayLength: n-1)

    return array
}


var array = [90, 64, 34, 25, 22, 12, 11]
print(classicBubbleSort(for: array))
print(whileBubbleSort(for: array))
print(recurciveBubbleSort(for: &array, arrayLength: array.count))
