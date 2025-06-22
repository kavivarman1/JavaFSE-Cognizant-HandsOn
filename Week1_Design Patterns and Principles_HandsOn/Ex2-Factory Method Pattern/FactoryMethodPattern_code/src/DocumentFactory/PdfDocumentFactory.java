package DocumentFactory;

import Document.Document;
import Document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}