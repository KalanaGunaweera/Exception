import com.Exception.EmptyArrayException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            List<Integer> list = List.of(1,2,3,4,5,6,7);
            Calculator cal = new Calculator(list);

            cal.sum(list);




        }catch(EmptyArrayException e){
            e.getMessage();
        }



    }
}