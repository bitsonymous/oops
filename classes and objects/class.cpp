#include<bits/stdc++.h>
using namespace std;
class Account{         // encapsulation  
  private: // access modifiers public, protected and private
  double balance;
  string password;


  public:                                
  string accountID;
  string username;

  public:
  // constructor 
  Account(){  // non-parameterised constructor
    balance = 0.0;
    accountID = "#";
  }

   Account(string id,string u,string p, double x){  // parameterised constructor 
  //  overriding
    accountID = id;
    username = u;
    password = p;
    balance = x;
  }

  // destruuctor
  ~Account(){
    // delete accountID;

  }
  // setter
  void setPass(string s){
    password = s;
  }
  void setBalance(double x){
    balance = x;
  }


  // getter
  int getBalance(){
    return balance;
  }


  void print(){
    cout<<"account ID: "<<accountID<<endl<<"Username: "<<username<<endl<<"Balance: "<<balance<<endl;
    cout<<endl;
  }

  
};
int main(){

  Account a;
  a.accountID = "547983425";
  a.username = "himanshu_yadav";
  a.setPass("794859");
  a.setBalance(32445);
  a.print();

  Account b("34234", "himanshu", "qwdSD", 32534);
  Account c(a); // default copy constructed 
  b.print();
  c.print();
  return 0;
} 