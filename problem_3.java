// https://projecteuler.net/problem=3 //

long findLargestPrimeFactor(long number) {
    long largestPrime = 1;
    for (int i = 3; i <= number; i++) {
        while (number % i == 0) {
            largestPrime = i;
            number /= i;
        }
    }
    return largestPrime;
}