import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.exceptions.COSVisitorException;
/**
 * 
 */
import org.apache.pdfbox.util.PDFMergerUtility;

/**
 * @author 238630
 *
 */
public class MergePdfFiles {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public static void main(String[] args) throws IOException, COSVisitorException {
		String dirPath= "C:\\Users\\238630\\OneDrive\\Personal\\Scrum.org\\Results";
		File dir = new File(dirPath);
								//Path of your source pdf files
		String[] extensions = new String[] { "pdf"};
								//This files extensions, you can also put docx also
		System.out.println("Getting all .pdf files in " + dir.getCanonicalPath()
				+ " including those in subdirectories");
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		PDFMergerUtility ut = new PDFMergerUtility();
		for (File file : files) {
			System.out.println("file: " + file.getCanonicalPath());
			ut.addSource(file.getCanonicalPath());
		}
		ut.setDestinationFileName(dirPath+"\\FinalSheet.pdf");
								//Path of your destination pdf files
		ut.mergeDocuments();
		System.out.println("Merged File Created on "+ dirPath+"\\FinalSheet.pdf");

	}

}
