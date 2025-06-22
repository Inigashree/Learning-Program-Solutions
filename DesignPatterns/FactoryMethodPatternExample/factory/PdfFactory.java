package factory;

import document.Document;
import document.PdfDocument;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}