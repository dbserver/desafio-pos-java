package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
  public static ArrayList<String[]> toArrayList(String filePath, String columnSeparator) {
    ArrayList<String[]> data = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String row = "";

      while ((row = reader.readLine()) != null) {
        data.add(row.split(columnSeparator));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return data;
  }
}
