/* https://projecteuler.net/problem=14 */

int lengthOfColSeq(long x){
    int count = 0;
    while(x!=1){
        if (x%2==0){
            x = x/2;
        } else {
            x = 3*x+1;
        }
    count++;
}
return count;
}

long longestColSeq(long n){     // n = 1000000 to solve the euler problem//
    int cache = 0;
    long result = 0;
    int l = 0;
    for(long i = 1; i < n; i++){    
        l = lengthOfColSeq(i);
        if (cache<l){
            cache = l;
            result = i;
        }    
    }
    return result; 
}