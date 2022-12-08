package fr.istic.vv;


import com.github.javaparser.utils.SourceRoot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;   // Import the FileWriter class


public class Main {
	
	
	private static String errorString;
	
	public static void adderrorString(String error) {
		
		if(errorString == null) {
			errorString = new String();
		}
		
		errorString += error +"\n";
		
	}
	

    public static void main(String[] args) throws IOException {
        
    	if(args.length == 0) {
            System.err.println("Should provide the path to the source code");
            System.exit(1);
        }

        File file = new File(args[0]);
        if(!file.exists() || !file.isDirectory() || !file.canRead()) {
            System.err.println("Provide a path to an existing readable directory");
            System.exit(2);
        }
        
        FileWriter output = new FileWriter("output.txt");

        app appli = new app();
        
        SourceRoot root = new SourceRoot(file.toPath());
        PublicElementsPrinter printer = new PublicElementsPrinter();
        
        root.parse("", (localPath, absolutePath, result) -> {
            result.ifSuccessful(unit -> unit.accept(printer, null));
            return SourceRoot.Callback.Result.DONT_SAVE;
        });
        
        //-----------------------------------
        
        
        appli.compare(printer.getData());
        
        
        output.write(errorString);
        output.close();
    }
}
