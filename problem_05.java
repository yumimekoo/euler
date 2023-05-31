// https://projecteuler.net/problem=5 //

int maxPrime(){
    int sum = 520;
    int counter = 0;
        while (true){
            for (int i = 1; i<21;i++){
                if(sum%i==0){
                    counter++;
                    if(counter==20){
                        return sum;
                    }
                }   
            }
            counter = 0;
            sum++;    
        }
}
