import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T objekt;

    public void setObjekt(T objekt){
        this.objekt = objekt;
    }

    public T getObjekt(){
        return objekt;
    }
}
class Counter<T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }
    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}

public class TestGeneryczne {

    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Integer> box22 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setObjekt("slowo");
        System.out.println(box1.getObjekt());

        box2.setObjekt(3);
        System.out.println(box2.getObjekt());

        box22.setObjekt(3);
        System.out.println(box22.getObjekt());

        box3.setObjekt(3.);
        System.out.println(box3.getObjekt());

        System.out.println(isEqual(box1.getObjekt(),box2.getObjekt()));
        System.out.println(isEqual(box2.getObjekt(),box3.getObjekt()));
        System.out.println(isEqual(box2.getObjekt(),box22.getObjekt()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add(box1.getObjekt());
        stringCounter.add("slowo2");
        stringCounter.add("slowo3");
        System.out.println(stringCounter.getCount());
    }
}