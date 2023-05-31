// https://projecteuler.net/problem=6 //

int euler(int n){
    int j = 0;
    int k = 0;
    int sum;
    for (int i = 0; i<=n; i++){
        j = i+j;
    }
    j = j*j;
    for (int i = 0; i<=n; i++){
        k = i*i+k;
    }
    sum = j-k;
    return sum;
}