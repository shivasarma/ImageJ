/**
 * The following algorithm is a basic program that extracts the red component of the RGB image. An input of 32 bit image is given and output
 * image of 8-bit came out.
 * 
 */



import java.awt.Graphics;
import java.awt.Image;

import ij.IJ;
import ij.ImageJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Imageview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IJ ij = new IJ();
		ImageJ i = new ImageJ();
		ImageProcessor ip2;
		
		//Creating Imageplus image with reference to the location to the image
		ImagePlus ip = new ImagePlus("C:\\Users\\HP\\Downloads\\Scolopendra_polymorpha_1.jpg");
		
		//Creating the new imageplus reference
		ImagePlus ipnew = IJ.createImage("Scolo-gray", "jpg", 900, 644, 32);  //here 32 refers to depth of the image but still 8 bit image is the output
		
		//creating processor with reference to the ipnew
		ImageProcessor iproc = ipnew.getProcessor();
		ip.show();
		int[] arr;
		arr = ip.getPixel(0, 0);
		int height = ip.getHeight();
		int Width = ip.getWidth();
		
		//Creating matrix to store the values with Width vs Height
		int[][] img = new int[Width][height];
		
		
		//copying the pixels to the new matrix
		for(int m = 0 ; m < Width ; m ++) {
			for(int n = 0 ; n < height ; n ++) {
				img[m][n] = ip.getPixel(m, n)[0];			//img now contains the raw data
				
			}
			
		}
		
		//Making a copy of the same image(only for reference purpose)
		int[][]img1 = img;
		
		//Don't know what this process does. Assuming it buffers all the pixel values
		iproc.setIntArray(img1);
		
		//Creating Image of AWT standard libraries
		Image img2 = iproc.createImage();
		
		//Creating a reference to the img2 with ip3 for ease in programming with Image J libraries
		ImagePlus ip3 = new ImagePlus("shiva",img2);
		ip3.show();
		
		}

}
