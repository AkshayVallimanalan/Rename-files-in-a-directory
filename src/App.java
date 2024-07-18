import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String absolutepath = "E:\\Akshay\\CAD\\Spotify\\nirvana"; //Enter your folder location
        File dir = new File(absolutepath);
        File[] filesinfolder = dir.listFiles();

        for(File file : filesinfolder){
            String name = file.getName();
            //Change the if statements according to your requirements
            //In this case the file is renamed from 
            //"[SPOTIFY-DOWNLOADER.COM] Heart-Shaped Box" to "Heart-Shaped Box" and so.
            if(name.charAt(0) == '['){
                String newname = name.substring(25, name.length());
                String newPath = absolutepath + "\\" + newname;
                file.renameTo(new File(newPath));
                System.out.println(name + " changed to " + newname);
            }
            
        }
    }
}

