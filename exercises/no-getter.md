# No getter!

With the help of JavaParser implement a program that obtains the private fields of public classes that have no public getter in a Java project. 

A field has a public getter if, in the same class, there is a public method that simply returns the value of the field and whose name is `get<name-of-the-field>`.

For example, in the following class:

```Java

class Person {
    private int age;
    private String name;
    
    public String getName() { return name; }

    public boolean isAdult() {
        return age > 17;
    }
}
```

`name` has a public getter, while `age` doesn't.

The program should take as input the path to the source code of the project. It should produce a report in the format of your choice (TXT, CSV, Markdown, HTML, etc.) that lists for each detected field: its name, the name of the declaring class and the package of the declaring class.

Include in this repository the code of your application. Remove all unnecessary files like compiled binaries. See the [instructions](../sujet.md) for suggestions on the projects to use.

*Disclaimer* In a real project not all fields need to be accessed with a public getter.

## Answer

You will find the public elementPrinter class modified to get also the private attributs, the app and the main, at :

> javaparser-starter/src/main/java/fr/istic/vv


this contains the code for the question.
 ## How it works :

First we look for all public methode and all private attribut

With them in a table, we filter the methode starting with "get", and put the end of the string on another table.

The result is : 

- Table 1 : table with attributs name
- Table 2 : table with the names of the attributs accecible by a public methode starting with "get"

Then, we only have to verifying which of the attributs are not in the Table 2

If the attribut is not in the Table 2, we print a error like 
> " < attribut_Name > doesn't have public getter "
 
in a logFile.
