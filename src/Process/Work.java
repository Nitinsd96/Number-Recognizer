package Process;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work {

    public String Work() {
        try
        {
            // the line that reads the image file
//            BufferedImage image = ImageIO.read(new File("C:\\Users\\scara\\Pictures\\Capture.png"));
//            String command = "python /c start python path\to\script\script.py";
//            Process p = Runtime.getRuntime().exec(command + param );
//            System.out.println("In Work.java file");
//            return "C:\\Users\\scara\\Pictures\\Ara.jpg";
            String s=null;
            Process p=Runtime.getRuntime().exec("c:/Users/scara/tensorflow-demo/my_env/Scripts/python.exe c:/Users/scara/tensorflow-demo/my_env/main.py");
            BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s=in.readLine())!=null)
            {
                if(s.contains("Prediction for test image:"))
                {
                    System.out.println(s.charAt(27));
                    if(s.charAt(27)==1)
                    {
                        return "C:\\Users\\scara\\Pictures\\1.jpg";
                    }
                    else if(s.charAt(27)=='0')
                    {
                       return "C:\\Users\\scara\\Pictures\\0.jpg";
                    }
                    else if(s.charAt(27)=='3')
                    {
                        return "C:\\Users\\scara\\Pictures\\3.jpg";
                    }
                    else if(s.charAt(27)=='2')
                    {
                        return "C:\\Users\\scara\\Pictures\\2.jpg";
                    }
                    else if(s.charAt(27)=='4')
                    {
                        return "C:\\Users\\scara\\Pictures\\4.jpeg";
                    }
                    else if(s.charAt(27)=='5')
                    {
                        return "C:\\Users\\scara\\Pictures\\5.jpg";
                    }
                    else if(s.charAt(27)=='6')
                    {
                        return "C:\\Users\\scara\\Pictures\\6.jpg";
                    }
                    else if(s.charAt(27)=='7')
                    {
                        return "C:\\Users\\scara\\Pictures\\7.jpg";
                    }
                    else if(s.charAt(27)=='8')
                    {
                        return "C:\\Users\\scara\\Pictures\\8.png";
                    }
                    else if(s.charAt(27)=='9')
                    {
                        return "C:\\Users\\scara\\Pictures\\9.jpg";
                    }

                }
            }
            return "C:\\Users\\scara\\Pictures\\Error.jpg";

        }
        catch (IOException e)
        {
            //BufferedImage err=ImageIO.read((new File("")));
            return "C:\\Users\\scara\\Pictures\\Error.jpg";
            // log the exception
            // re-throw if desired
        }

    }
}
