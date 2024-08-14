#include<bits/stdc++.h>
using namespace std;

class Person{ //base class
public:
  string name;
  int age;

  Person(string name, int age){
    this->name = name;
    this->age = age;
  }
};

class Student : public Person{ // derived class
public:
  int rollno;

  Student(string name, int age, int rollno) : Person(name, age){
    this->rollno = rollno;
  }
  void print(){
    cout<<"Name: "<<name<<endl;
    cout<<"age: "<<age<<endl;
    cout<<"rollno: "<<rollno<<endl;
  }
};

class Teacher : public Person{
  public:
  double salary;
  string empID;

  Teacher(string name, int age, double salary, string empID) : Person(name, age){
    this->salary = salary;
    this->empID = empID;
  }
};

class TA : public Student, public Teacher{
  
};

int main(){

  Student s("Himanshu", 22, 71);
  s.print();

  return 0;
} 