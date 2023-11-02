package delft;

import org.h2.engine.ConnectionInfo;
import org.h2.engine.Database;

import java.io.File;

public class ReadingFromDb {

    Database myDb;

    public ReadingFromDb(){
        myDb = new Database(new ConnectionInfo("dunno"), "df" );
    }

    public ReadingFromDb(Database db){
        myDb = db;
    }

    public void populateFromFile(String filepath) throws Exception {
        if(!myDb.isStarting())
            if(!myDb.isReadOnly()){
                File dbToOpen = new File(filepath);
                if(dbToOpen.exists()) {
                    myDb.openFile(filepath, "full", false);
                }else{
                    throw new Exception("Db file does not exist");
                }
            }
    }

}
