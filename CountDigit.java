class CountDigit {
    public static void main(String[] args) {
        int num = 12345;
        int evensum = 0;
        int oddsum=0;
        int pos=1;
        
        
       /*  while (num > 0) {
            count++;
            num /= 10;
        } 
        System.out.println(count);  */
        while(num>0){
            int digit = num%10;
            if(pos %2==0){
                evensum+=digit;
            }else{
                oddsum+=digit;
            }
            num/=10;
            pos++;
        }
     System.out.println(evensum);
     System.out.println(oddsum);
        }

        }
  
      