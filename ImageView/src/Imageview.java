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
		ImagePlus ip = new ImagePlus("C:\\Users\\HP\\Downloads\\Scolopendra_polymorpha_1.jpg");
		ImagePlus ipnew = IJ.createImage("Scolo-gray", "jpg", 900, 644, 32);
		ImageProcessor iproc = ipnew.getProcessor();
		ip.show();
		int[] arr;
		arr = ip.getPixel(0, 0);
		int height = ip.getHeight();
		int Width = ip.getWidth();
		int[][] img = new int[height][Width];
		
		Image I ;
		I = ip.getImage();
		Graphics G = I.getGraphics();
		//System.out.println(arr.length + "\t" + height + "\t " + Width);
		for(int m = 0 ; m < height ; m ++) {
			for(int n = 0 ; n < Width ; n ++) {
				img[m][n] = ip.getPixel(m, n)[0];
				
			}
			
		}
		//for(int j = 0; j < arr.length; j ++ )
			//System.out.print(arr[j] + "\t");
		/**for(int m = 0 ; m < height; m ++) {
			for(int n = 0; n < Width ; n++) {
				System.out.print(img[m][n] + " ");
			}
			System.out.println("");
		}**/
		//System.out.println(img[10][1]);
		
		System.out.println(ip.getBitDepth() + " " + img[0].length + " HIIII");
		int[] arr1 =  ip.getDimensions();
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2] + " " + arr1[3] + " " + arr1[4] );
		System.out.println(img[643][899]);
		int[][]img1 = img;
		iproc.setIntArray(img1);
		Image img2 = iproc.createImage();
		ImagePlus ip3 = new ImagePlus("shiva",img2);
		ip3.show();
		//
		/** for(int jj = 0 ; jj < height ; jj ++ )
			for(int ii=0 ; )
				img1[jj][ii] = img1[jj][ii] + 50 ;
		//ipnew.cre **/
	}

}
