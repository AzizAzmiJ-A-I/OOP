#include <iostream>
using namespace std;
int main(){
    char a[5]={'x','y','z','h','g'};   int b;
    int x[3][2] = {{0,1}, {2,3}, {4,5}};
    cout<<"Nilai : "; cin>>b;           //input
    
    cout<<"Array 1D"<<endl;
    for(int i=0; i<5; i++){        //perulangan For & array 1D
        cout<<"index "<<i<<" = "<<a[i]<<endl;             //output
    }
    if (b%2==0){ //For percabngan
        cout<<b<<" bilangan genap"<<endl;
    }else{
        cout<<b<<" bilangan ganjil"<<endl;
    }
    cout<<endl<<endl<< "PERULANGAN"<<endl;
    int f = 0;
    while (f < 5) { //While
        cout << "helloworld!"<<endl;
        f++;
    }
    int e = 0;
    do { //Do while
        cout << "HellowDunia" <<endl;
    e++;
    }
    while (e < 5);

	cout<<endl<<endl<< "Array 2D"<<endl;
    for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			cout<<x[i][j]<<"\t";
		}
		cout<<endl;
	}
}