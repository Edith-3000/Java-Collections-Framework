import javafx.util.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(10);
//        list.add(78);
//
//        System.out.println(list);
//
//        System.out.println(list.set(1, 420));
//        System.out.println(list);
//
//        List<Integer> list2 = new ArrayList<>(list);
//        System.out.println(list2);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.indexOf(780));
//
//        List<Integer> list3 = list.subList(1, 5);
//        System.out.println(list3);

//        List<Integer> llist = new LinkedList<>();
//        llist.add(1);
//        llist.add(2);
//        llist.add(4);
//
//        ListIterator<Integer> iterator = llist.listIterator();
//
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());

//        Integer[] a = list.toArray(new Integer[0]);
//        for(Integer x: a) {
//            System.out.print(x + " ");
//        }

//        Queue<Integer> q = new LinkedList<>();
//        q.offer(40);
//        q.offer(70);
//        q.offer(1450);
//
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());

//        Stack<Integer> stk = new Stack<>();
//        stk.push(7);
//        stk.push(8);
//
//        while(!stk.isEmpty()) {
//            System.out.println(stk.peek());
//            stk.pop();
//        }

//        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(21);
//        dq.offerFirst(96);
//        System.out.println(dq);
//        dq.pollFirst();
//        dq.peekFirst();
//        System.out.println(dq);

//        List<StudentMarks> stMarks = new ArrayList<>();
//        stMarks.add(new StudentMarks(70, 80));
//        stMarks.add(new StudentMarks(38, 10));
//        stMarks.add(new StudentMarks(100, 38));
//        stMarks.add(new StudentMarks(40, 88));
//        stMarks.add(new StudentMarks(97, 19));

//        Queue<StudentMarks> pq = new PriorityQueue<>(stMarks);

//        Queue<StudentMarks> pq = new PriorityQueue<>(new MyCustomComparator());

//        Queue<StudentMarks> pq = new PriorityQueue<>(((o1, o2) -> {
//            if(o1.getMaths() > o2.getMaths()) return -1;
//            if(o1.getMaths() < o2.getMaths()) return 1;
//            return 0;
//        }));
//
//        for(StudentMarks sm: stMarks) {
//            pq.offer(sm);
//        }
//
//        List<StudentMarks> res = new ArrayList<>();
//        int ind = 0;
//
//        while(!pq.isEmpty()) {
//            if(ind == 3) break;
//            res.add(pq.poll());
//            ind += 1;
//        }
//
//        System.out.println(res);

//        Set<Integer> st = new HashSet<>();
//        st.add(2);
//        st.add(1);
//        st.add(3);
//        st.add(3);
//        System.out.println(st);
//
//        Set<Integer> st1 = new LinkedHashSet<>();
//        st1.add(2);
//        st1.add(1);
//        st1.add(3);
//        st1.add(3);
//        System.out.println(st1);

//        Set<Pair<Integer, Integer>> st = new TreeSet<Pair<Integer, Integer>>((a, b) -> a.getKey().compareTo(b.getKey()));
//        st.add(new Pair<>(1, 2));
//        st.add(new Pair<>(1, 3));
//
//        System.out.println(st);

//        NavigableSet<Integer> st1 = new TreeSet<>();
//        st1.add(8);
//        st1.add(3);
//        st1.add(1);
//        st1.add(0);
//
//        System.out.println(st1);
//
//        System.out.println(st1.floor(4));
//        System.out.println(st1.lower(4));
//        System.out.println(st1.ceiling(4));
//        System.out.println(st1.higher(4));

//        Map<String, Integer> map = new HashMap<>();
//        map.put("Kapil", 23);
//        map.put("John", 78);
//        map.put("Virat", 18);
//
//        System.out.println(map);
//        System.out.println(map.get("Kapil"));
//        System.out.println(map.getOrDefault("HELLO", 123456));
//        System.out.println(map.containsKey("Kapil"));
//        map.remove("Virat");
//
//        map.computeIfAbsent("XYZ", f -> 8);
//
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//
//        for(Map.Entry<String, Integer> entry: entrySet) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        for(String key: keys) {
//            System.out.println(key);
//        }

//        NavigableMap<String, Integer> tmap = new TreeMap<>(((o1, o2) -> o2.compareTo(o1)));
        NavigableMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Kapil", 23);
        tmap.put("John", 78);
        tmap.put("Virat", 18);
        System.out.println(tmap);

//        System.out.println(tmap.pollFirstEntry());
        System.out.println(tmap);
        System.out.println(tmap.ceilingKey("Kapi"));
    }
}
