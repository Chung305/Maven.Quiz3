package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs=labs;
    }

    public Lab getLab(String labName) {
        for(Lab each : labs){
            if(each.getName().equals(labName)){
                return each;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try{
            getLab(labName).setStatus(labStatus);

        }catch(Exception e){
            throw new UnsupportedOperationException(e);
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {
        for(Lab each: labs){
            if(each.getName().equals(labName)){
                return each.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = labs.size()-1; i >= 0; i--){
            if(i != 0)
                result += labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n";
            else
                result += labs.get(i).getName() + " > " + labs.get(i).getStatus();

        }

        return result;
    }
}
