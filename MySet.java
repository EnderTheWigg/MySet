import java.util.LinkedList;
public class MySet<E> implements Set<E>
{
    private LinkedList list;
    public MySet()
    {
        list = new LinkedList();
    }
    public boolean isEmpty(){
        if(list.isEmpty())
            return true;
        return false;
    }
    public int size(){
        return list.size();
    }
    public boolean contains(Object obj){
        if(list.contains(obj))
            return true;
        return false;
    }
    public boolean remove(Object obj){
        if(contains(obj)){
            list.remove(obj);
            return true;
        }
        return false;
    }
    public boolean add(E item){
        if(contains(item))
            return false;
        else
            list.add(item);
        return true;
    }
}
