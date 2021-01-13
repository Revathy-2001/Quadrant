#include<iostream>
using namespace std;
int main(){
  int x,y;
  cin >> x >> y;
  if(x >= -1000 && x <= 1000 && y >= -1000 && y <= 1000 && x != 0 && y != 0){
    if(x >= 1 && y >= 1)
      cout << "1";
    else if(x >= 1 && y < 1)
      cout << "4";
    else if(x < 1 && y < 1)
      cout << "3";
    else if(x < 1 && y >= 1)
      cout << "2"; 
  } 
}