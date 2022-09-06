import com.Exception.EmptyArrayException;

import java.util.List;

public class Calculator {
    List <Integer> list;
    int total;

    public Calculator(List<Integer> list) {




    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public void sum(List<Integer> list) throws EmptyArrayException {
        if(list.size() != 0){
            for (int i = 0; i <list.size() ; i++) {
                this.total=total+list.get(i);


            }
            System.out.println(total);
        }else {
            throw new EmptyArrayException("Empty List");




        }



    }
}
