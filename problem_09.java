// https://projecteuler.net/problem=9 //

int triplet (){
    int p = 0;
    for (int a = 1; a < 1001; a++){
        for (int b = a + 1; b < 1000; b++){
            double cSqt = (a*a) + (b*b);
            double c = Math.pow(cSqt,0.5);
            
            if(a+b+c==1000){
                p = (int)(a*b*c);
            }
        }
    }
    return p; 
}
