package vas;

import com.spire.doc.*;
import com.spire.doc.documents.*;

public class VasMain {
    public void custom_report() {
        //Create word document.
        Document document =new Document();
        //Add a new section.
        Section section = document.addSection();
        //Add a new paragraph.
        Paragraph paragraph = section.addParagraph();
        //Append Text.
        paragraph.appendText("Hello World!");
        //Save to file.
        document.saveToFile("output/helloWorld.docx", FileFormat.Docx);
        System.out.println("report created");
    }
}
