// https://projecteuler.net/problem=1 //

int multiplesOf3or5 (int x){
int sum = 0;
    for(int i = 1; i<x; i++){
        if(i%3==0 || i%5==0){
            sum = sum+i;
        }
    }
return sum;
}