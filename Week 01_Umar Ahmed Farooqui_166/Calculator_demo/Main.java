/*
 * File: Main.java
 * Purpose: Creates a Calculator object and demonstrates every operation,
 *          including a normal case and an edge case for each new one
 *          (Part B requirement).
 *
 * Stack vs Heap note (same idea as the Car demo):
 *   "calc" is a stack reference variable; "new Calculator()" creates the
 *   actual object on the heap and calc stores its address. Because
 *   Calculator has no stored attributes, every call is independent and
 *   nothing about calc's "state" changes between calls.
 */
public class Main {
    public static void main(String[] args) {

 
        Calculator calc = new Calculator();
 
        System.out.println("add(2, 3) = " + calc.add(2, 3));               // normal
        System.out.println("add(2, 3, 5, 1) = " + calc.add(2, 3, 5, 1));   // normal, varargs
 
        System.out.println("divide(10, 2) = " + calc.divide(10, 2));       // normal
        System.out.println("divide(10, 0) = " + calc.divide(10, 0));       // edge case
 
        System.out.println("modulus(10, 3) = " + calc.modulus(10, 3));     // normal
        System.out.println("modulus(10, 0) = " + calc.modulus(10, 0));     // edge case
 
        System.out.println("power(2, 3) = " + calc.power(2, 3));           // normal
        System.out.println("power(5, 0) = " + calc.power(5, 0));           // edge case, exponent 0
 
        System.out.println("average(2, 4, 6) = " + calc.average(2, 4, 6)); // normal
        System.out.println("average() = " + calc.average());              // edge case, no numbers
 
        System.out.println("maximum(4, 9, 1) = " + calc.maximum(4, 9, 1)); // normal
        System.out.println("maximum() = " + calc.maximum());              // edge case, no numbers
    }
}
 