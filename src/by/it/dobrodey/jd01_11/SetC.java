package by.it.dobrodey.jd01_11;
/*
TaskC. Свой SetC. Напишите класс SetC<T>, который реализует toString()как в HashSet и 8 методов add(T e),
remove(Object o), contains(Object o),  size(), isEmpty(), addAll(List<?> c),
containsAll(Collection<?> c), removeAll(Collection<?> c) интерфейса Set<T> (реализация остальных –фиктивная).
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetC<T> implements Set<T> {

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
// not reals
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public void clear() {

    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}

