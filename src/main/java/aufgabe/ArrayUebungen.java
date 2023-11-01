package aufgabe;

public class ArrayUebungen {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for(int i=0; i< numbers.length; i++){
            numbers[i]=i+1;
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Summe der Zahlen im Array: ");
        System.out.println(arraySum(numbers));
        System.out.println();
        System.out.println("Maximales Element im Array: ");
        System.out.println(findArrayMaximum(numbers));
        System.out.println();

        //Deklaration des 2. Arrays
        int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};




    }

    public static int arraySum(int[] numberArray){
        int sum = 0;
        for(int i = 0; i < numberArray.length; i++){
            sum += numberArray[i];
        }
        return sum;
    }

    public static int findArrayMaximum(int[] numberArray){
        int max = numberArray[0];
        for(Integer number : numberArray){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public static int[] elementwiseArraySum(int[] numberArray1, int[] numberArray2){
        //Überprüfe ob die Arrays selbe Länge haben, da sonst keine elementweise Addition der Arrays möglich ist.

        if(numberArray1.length!=numberArray2.length) {
            System.out.println("Die Arrays haben nicht die selbe Größe");
            return null;
        }

        int[] resultingNumberArray = new int[numberArray1.length];

        for(int i = 0; i<numberArray1.length; i++){

            resultingNumberArray[i] = numberArray1[i] + numberArray2[i];
        }

        return resultingNumberArray;

    }

}
