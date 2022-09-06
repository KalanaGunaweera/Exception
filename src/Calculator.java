import com.Exception.EmptyArrayException;

import java.util.List;

public class Calculator {
    List <Integer> list;


    public void sum(List<Integer> list) throws EmptyArrayException {
        int total =0;
        if(list.size() != 0){
            for (int i = 0; i <list.size() ; i++) {
                total=total+list.get(i);


            }
            System.out.println(total);
        }else {
            throw new EmptyArrayException("Empty List");




        }



    }
}
