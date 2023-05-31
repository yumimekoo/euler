// https://projecteuler.net/problem=4 //

int palNumber(){
    int sum;
    int c = 0;
    int x = 0;
    int y = 0;
    for(int a = 999; a >= 100; a--){
        for(int b = 999; b >= 100; b--){
            sum = a*b;
            if(isPal(sum)==true){
                if(c<sum){
                    c=sum;
                    x = a;
                    y = b;
                }
                
            }       
        }       
    }
    return c;
}
  
boolean isPal (int x){
    String s = String.valueOf(x);
    for(int i = 0; i < s.length()/2; i++){
        if((int)s.charAt(i)!=(int)s.charAt(s.length()-1-i)){
            return false;
        }
    }
    return true;
}