
import java.io.*;
import java.util.*;
import java.util.HashMap;


public class NgramExtractor {

    public static String scanned;
    public static String[] splitarray;
    public static String textfile;
    public static String outputfile ;
    public static String gramSize;

    public static void main(String[] args) {


        try {
            if (args.length != 3) {
                System.out.println("Lütfen dosya yolunu doğru veriniz");
                if (args.length == 0) {
                    System.out.println("Dosya yolu girilmedi");
                } else
                    System.out.println("Birden fazla parametre girildi");
                return;
            }
            textfile = args[0];
            outputfile = args[1];
            gramSize = args[2];
            File file = new File(textfile);
            BufferedReader buffread = new BufferedReader(new FileReader(file));
            String readline = "";

            while ((readline = buffread.readLine()) != null) {
                scanned = readline.replaceAll("[[-+^,?]*]", "");
                splitarray = scanned.toLowerCase().split(" ");
            }



                uniGram();




        } catch (IOException e) {
            e.printStackTrace();



        }


    }
    public static void uniGram() throws IOException {

        HashMap<String, Integer> ngrams = new HashMap<String, Integer>();
        for (String str : splitarray) {
            if (ngrams.containsKey(str)) {
                ngrams.put(str, 1 + ngrams.get(str));
            } else {
                ngrams.put(str, 1);
            }
        }

        HashMap<String,Float> frequencyList = new HashMap<String, Float>();

        for (String i : ngrams.keySet()) {
            int j = 0;
            frequencyList.put(i, ngrams.get(i).floatValue());
            j++;
        }


        double numOfTokens = new StringTokenizer(scanned, " ").countTokens();


       

        FileWriter csvWriter = new FileWriter(outputfile);
        csvWriter.append("Total number of tokens: " + (int)numOfTokens);
        csvWriter.append("\n");
        csvWriter.append("ngram");
        csvWriter.append(",");
        csvWriter.append("count");
        csvWriter.append(",");
        csvWriter.append("frequency");
        csvWriter.append("\n");


        for (String i : ngrams.keySet()) {
            int j = 0;
            csvWriter.append(  i + "," + ngrams.get(i) + "," + frequencyList.get(i) / numOfTokens);
            csvWriter.append("\n");
            j += 1;
        }


        csvWriter.flush();
        csvWriter.close();

    }

    public static void biGram() throws IOException {

        HashMap<String, Integer> ngrams = new HashMap<String, Integer>();
        for (String str : splitarray) {
            if (ngrams.containsKey(str)) {
                ngrams.put(str, 1 + ngrams.get(str));
            } else {
                ngrams.put(str, 1);
            }
        }

        HashMap<String,Float> frequencyList = new HashMap<String, Float>();

        for (String i : ngrams.keySet()) {
            System.out.println("key: " + i + "|  value: " + ngrams.get(i));
            int j = 0;
            frequencyList.put(i, ngrams.get(i).floatValue());
            j++;
        }


        double numOfTokens = new StringTokenizer(scanned, " ").countTokens();


        System.out.println(frequencyList.toString());
        System.out.println("Total number of tokens: " + (int)numOfTokens);


        for (String i : ngrams.keySet()) {
            int j = 0;
            System.out.println(  i + "," + ngrams.get(i) + "," + frequencyList.get(i) / numOfTokens);
            j += 1;
        }

        FileWriter csvWriter = new FileWriter(outputfile);
        csvWriter.append("Total number of tokens: " + (int)numOfTokens);
        csvWriter.append("\n");
        csvWriter.append("ngram");
        csvWriter.append(",");
        csvWriter.append("count");
        csvWriter.append(",");
        csvWriter.append("frequency");
        csvWriter.append("\n");


        for (String i : ngrams.keySet()) {
            int j = 0;
            csvWriter.append(  i + "," + ngrams.get(i) + "," + frequencyList.get(i) / numOfTokens);
            csvWriter.append("\n");
            j += 1;
        }


        csvWriter.flush();
        csvWriter.close();

    }
}










