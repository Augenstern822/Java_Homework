package homework;

import java.util.ArrayList;

public class Sort{
    ArrayList<Number> list = new ArrayList<Number>();

    public Sort() {}
    public Sort(ArrayList<Number> list) {
        this.list = list;
    }
    public static void sort(ArrayList<Number> list) {
        if (list.size() == 0 || list == null)
            return ;
        for (int i = list.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
                    int index = j;
                    Number m = list.get(j);
                    list.set(index, list.get(j+1));
                    list.set(j+1, m);
                }
            }
        }
    }

    public static void main(String[] args) {
    	Sort s = new Sort();
    	s.list.add(21);
    	s.list.add(25);
    	s.list.add(66);
    	s.list.add(125);
    	s.list.add(521);
    	s.list.add(235);
    	s.list.add(1.5);
    	s.list.add(22.3);
    	Sort.sort(s.list);
    	for (Number tem: s.list) {
    		System.out.println(tem);
    		}
	}

}