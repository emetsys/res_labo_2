package ch.heigvd.res.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileRecorder implements IRecorder{
	
	public FileRecorder(String fileName, String delimiteur){
		this.fileName = fileName;
		this.delimiteur = delimiteur;
	}


	public void init () throws FileNotFoundException{
		File outputFile = new File(this.fileName);
		this.printStream = new PrintStream(outputFile);
	}
	
	public void record(IData data) {
		CsvSerializer serializer = new CsvSerializer();
		serializer.serialize(data, printStream, delimiteur);
	}
	
	private String delimiteur;
	private String fileName;
	private PrintStream printStream;
}