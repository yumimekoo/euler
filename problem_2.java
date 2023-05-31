// https://projecteuler.net/problem=2 //

int evenFiboNum (){
int sum = 2; // because we need to add the 2 from the start "1..2..3..5....." //
int fOne = 1;
int fTwo = 2;
int fSum = 0;
    while (fSum<4000000){
        fSum = fOne+fTwo;
        fOne = fTwo;
        fTwo = fSum;
        if (fSum%2==0){
            sum= sum+fSum;
        }
    }
    return sum;
}