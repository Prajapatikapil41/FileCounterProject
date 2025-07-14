import java.io.*;

public class FileWordLineCounter {

    public static void main(String[] args) {
        String inputFile  = "data/input.txt";
        String outputFile = "data/output.txt";
        
        int lineCount = 0;
        int wordCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            
            writer.write("Input file:  " + inputFile);
            writer.newLine();
            writer.write("Total lines: " + lineCount);
            writer.newLine();
            writer.write("Total words: " + wordCount);
            writer.newLine();
            
            System.out.println("Processed successfully. See " + outputFile);
            
        } catch (FileNotFoundException fnfe) {
            System.err.println("ERROR: Input file not found: " + inputFile);
        } catch (IOException ioe) {
            System.err.println("I/O error while processing files: " + ioe.getMessage());
        }
    }
}