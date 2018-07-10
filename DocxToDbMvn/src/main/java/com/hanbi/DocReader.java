package com.hanbi;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class DocReader {
	public DocReader() {
	}

	public static String reader() {
		String docxText;
		try {
			FileInputStream fis = new FileInputStream("C:/Gradle/data1.docx");
			XWPFDocument document = new XWPFDocument(OPCPackage.open(fis));
		
			XWPFWordExtractor wordExtractor = new XWPFWordExtractor(document);
			System.out.print(wordExtractor.getText());
			docxText = wordExtractor.getText();
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
			docxText = null;
		}
		return docxText;
	}
}