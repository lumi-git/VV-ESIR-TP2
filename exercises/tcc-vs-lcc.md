# TCC *vs* LCC

Explain under which circumstances *Tight Class Cohesion* (TCC) and *Loose Class Cohesion* (LCC) metrics produce the same value for a given Java class. Build an example of such as class and include the code below or find one example in an open-source project from Github and include the link to the class below. Could LCC be lower than TCC for any given class? Explain.

## Answer

Class Exemple:
```java
class A{

    private String s;
    
    public void resetS(){
        s = "";
    }

}
```
Ici le TCC et le LCC sont égaux. réspectivement 1 et 1 .

Il est impossible d'avoir un LCC inferieur au TCC d'apres leurs formules :

TCC = ConnectionsDirectes/connectionsTotales

LCC = ConnectionsDirectes+ConnectionsIndirectes/ConnectionsTotales

Source : https://www.aivosto.com/project/help/pm-oo-cohesion.html

