package ch.heigvd.res.io;

import java.io.PrintStream;

public class CsvSerializer implements ISerializer {
	
	public void serialize(IData data, PrintStream ps, String delimiteur) {
		String csv = "";
		for(String key : data.getKeys()){
			csv += data.getValue(key);
			csv += delimiteur;
		}
		csv = csv.substring(0, csv.length()-1);
		ps.println(csv);		
	}
}