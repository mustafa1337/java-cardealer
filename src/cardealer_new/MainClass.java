package cardealer_new;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Cars> cars = new ArrayList<Cars>();
		cars.add(new Cars(0, "Mercedes-Benz", "S-Class", "Coupe", 2018, 50000, 85499.99));
		cars.add(new Cars(1, "BMW", "5-Series", "Sedan", 2008, 225000, 6999.99));

		String filename = "Cars.bin";
		
		readObjectFromFile(cars, filename);
		writeObjectToFile(cars, filename);
		
		
		for (Cars car : cars) {
			System.out.println(car);
		}
		
		
	}

	private static void readObjectFromFile(List<Cars> cars, String filename) {
		try {
			FileInputStream fin = new FileInputStream(filename);
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			Object o;
			
			while(true) {
				
				try {
					o = ois.readObject();
					if(o instanceof Cars) {
						cars.add((Cars)o);
					} else {
						System.err.println("unexpected object in file.");
					}
					
				} catch(EOFException ex) {
					break;
				}
			}
			
			ois.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void writeObjectToFile(List<Cars> cars, String filename) {
		try {
			
			
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Cars car : cars) {
				oos.writeObject(car);
			}
		
			
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
