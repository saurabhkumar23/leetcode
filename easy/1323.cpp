#include<bits/stdc++.h>
using namespace std;

int maximum69Number (int num) {
    // brute works...
        int i = 0;
        int j = -1;
        int n = num;
        int factor = 0;
        while(num){
            if(num%10 == 6){
                j = i;
            }
            i++;
            num /= 10;
        }
        if(j != -1){
            factor = pow(10,j)*3;
        }
        return n+factor;
    }