import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String absolutepath = "E:\\Akshay\\CAD\\Spotify\\nirvana";
        File dir = new File(absolutepath);
        File[] filesinfolder = dir.listFiles();

        for(File file : filesinfolder){
            String name = file.getName();
            if(name.charAt(0) == '['){
                System.out.println(name);
                String newname = name.substring(25, name.length());
                System.out.println(newname);
                String newPath = absolutepath + "\\" + newname;
                file.renameTo(new File(newPath));
                System.out.println(name + " changed to " + newname);
            }
            
        }

        // String[] filenames = {"[SPOTIFY-DOWNLOADER.COM] Downer", "[SPOTIFY-DOWNLOADER.COM] Aneurysm", "[SPOTIFY-DOWNLOADER.COM] Been A Son - BBC Mark Goodier Session"};
        
        // for(int i=0; i<filenames.length; i++){
        //     String name = filenames[i].substring(25, filenames[i].length());
        //     System.out.println("File name is :" + name);
        // }
    }
}

