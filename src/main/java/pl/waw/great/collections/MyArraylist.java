package pl.waw.great.collections;

public class MyArraylist implements MyList {

    private String[] elements = new String[16];
    private int index = 0;

    public MyArraylist() {
    }

    @Override
    public boolean add(String element) {

        elements[index] = element;
        this.index = index + 1;
        return true;
    }

    @Override
    public String get(int index) {

        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String set(int index, String element) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        String old = this.elements[index];
        this.elements[index] = element;
        return old;
    }

    @Override
    public int size() {
        return index;
    }
}
