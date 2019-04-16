package serverPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeToFile {
	
	private String personalFileName = "personal.txt";
	private String academicFileName = "academic.txt";
    
    public void writeSerializeObject(PersonalInfo personal_Info){
        
        FileOutputStream fout = null;
        ObjectOutputStream object_out_for_serializable = null;
        
        try {
        	
            fout = new FileOutputStream(personalFileName,true);
            object_out_for_serializable = new ObjectOutputStream(fout);
            
            object_out_for_serializable.writeObject(personal_Info);
            object_out_for_serializable.flush();
                    
        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        } 
        
    }
    
    public void writeSerializeObject(AcademicInfo academic_Info){
        
        FileOutputStream fout = null;
        ObjectOutputStream object_out_for_serializable = null;
        
        try {
            
            fout = new FileOutputStream(academicFileName,true);
            object_out_for_serializable = new ObjectOutputStream(fout);
            
            object_out_for_serializable.writeObject(academic_Info);
            object_out_for_serializable.flush();
                    
        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        } 
        
    }

}
