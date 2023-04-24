package HomeWork5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private String[][] data;

    public AppData() {

    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public String dataToString(String[] data) {
        String str = "";
        for (int i = 0; i < data.length; i++) {
            str = str + data[i].toString();
            if (i != data.length - 1) {
                str += ";";
            }
        }
        str += "\n";
        return str;
    }

    private String[] stringsToData(String str) {
        String[] fio = str.split(";");
        String[] data = new String[fio.length];
        for (int i = 0; i < fio.length; i++) {
            data[i] = fio[i];
        }
        return data;
    }

    public void save(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(dataToString(header));
            for (String[] fio : data) {
                writer.write(dataToString(fio));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            ArrayList<String[]> dataList = new ArrayList<>();
            String tmpStr;
            while ((tmpStr = bufferedReader.readLine()) != null) {
                dataList.add(stringsToData(tmpStr));
            }
            data = dataList.toArray(new String[][]{{}});
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

