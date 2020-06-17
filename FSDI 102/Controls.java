public class Controls {
    public static void main(String args[]){
        String userName="Leticia";
        String password="123";

        if(userName.equals("Leticia")&& password.equals("123")){
            System.out.println("Welcome to the system "+userName);
        }else if(userName.equals("Leticia") || password.equals("123")){
            System.out.println("Error..!! the password or username is incorrect");
        }else{
            System.out.println("Error..!! You can not access to the system");
        }

        for(int i=1;i<10;i++){
            System.out.println("The value of is: "+i);
            
            if(i==7){
                System.out.println("My favorite number");
            }
        }

        int arr[]={3,5,8,9,11,2};
        //enhanced for loop
        for (int num : arr) {
            System.out.println(num);
        }

        //clasic for loop
        for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

        /**While */
        int i=10;
        while (i>1) {
            System.out.println(i);
            i--;   
        }

        int k=0;
        while (k<10) {
            System.out.println("Round "+k);
            k++;
            
        }

    }
}


/**  int num=70;

        if(num<100){
            System.out.println("number less than 100");
        
            if(num>50){
                System.out.println("The num is greater than 50");
            }
        } */