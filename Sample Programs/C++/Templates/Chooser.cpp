// Beschreibung: German / Deutsch
//

/*
Dies ist eine Vorlage für Datenwählen.
Bitte Beache die Kommentare
"Unbelegt" Heißt, hier kann man eigene befehle ausführen
case 1 = bei tastendruch auf 1 zeigt er dies an
code 1001 sorgt für die lizenzinfos

*/
#include <iostream>
#include <cstdlib>
#include <fstream>
using namespace std;

int main()
{
	int cooseing;
	int var = 1;
	while (var < 12) {
		int ending = 3;
		cout << "Gebe eine Befehls-Id ein." << endl;
		cout << "2 = Hilfe" << endl;
		cin >> cooseing;


		switch (cooseing) {
		   case 0:
			   cerr << "Software wird Beendet " << endl;
			   while (var < 13) {
				   ++var;
			   }
			   break;
			   
		   case 1: 
			   cerr << "Soll die Software Beendet werden?" << endl;
			   cout << "Gebe 1 fuer Ja und 0 fuer Nein ein." << endl;
			   cin >> ending;
			   break;
		   case 2:
			   //Helpcase
			   cout << "Hilfe:" << endl;
			   cout << "  0 = Beenden Erzwingen" << endl;
			   cout << "  1 = Software Beenden" << endl;
			   cout << "  2 = Hilfe" << endl;

			   //Helpcase Ende
			   cout << " " << endl;
			   break;
		   case 3:
			   //Unbelegt
			   break;
		   case 4:
			   //Unbelegt
			   break;
		   case 5:
			   //Unbelegt
			   break;
		   case 6:
			   //Unbelegt
			   break;
		   case 7:
			   //Unbelegt
			   break;
		   case 8:
			   //Unbelegt
			   break;
		   case 9:
			   //Unbelegt
			   break;
		   case 10:
			   //Unbelegt
			   break;

		   case 1001:
			   cout << "Lizenzinformationen:" << endl;
			   //Gebe Hier Lizenzinfos ein. (In cout << " Lizenzinfos " << endl;
			   break;
		}
		switch (ending) {
		case 0:
			cout << "Beenden abgebrochen" << endl;
			system("PAUSE");
			break;
		case 1:
			cerr << "Beendet" << endl;
			while (var < 13)
			{
				++var;
			}
			break;
		}
	}
	system("PAUSE");
    return 0;
}

