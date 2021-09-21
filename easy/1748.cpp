#include<bits/stdc++.h>
using namespace std;

int sumOfUnique(vector<int>& nums) {
        
        // just simple hashmap solution..
        unordered_map<int,int> mp;
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
            if(mp[nums[i]] == 1){
                sum += nums[i];
            }
            else if(mp[nums[i]] == 2){
                sum -= nums[i];
            }
        }
        return sum;
}