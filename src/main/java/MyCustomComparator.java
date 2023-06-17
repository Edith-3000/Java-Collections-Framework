import java.util.Comparator;

public class MyCustomComparator implements Comparator<StudentMarks> {

    @Override
    public int compare(StudentMarks o1, StudentMarks o2) {
        if(o1.getMaths() > o2.getMaths()) return -1;
        if(o1.getMaths() == o2.getMaths()) return 0;
//        if(this.maths > o.maths) return 1;
        return 1;
    }
}
