package lv.sda;

public class Main {

    public static void main(String[] args) {

        //[[13, 45], [26, 22], [19, 24], [20, 30], [90, 12]] Multidimensional arrays. 2 dimensional array
	 int[] numbers = {13, 45, 26, 22, 19, 24, 20, 30, 90, 12};

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                System.out.println("Even number: " + numbers[i]);
            }
        }
    }
}
