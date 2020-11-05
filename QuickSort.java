package com.company;

public class QuickSort {
    static void sort(char items[]) {
        quicksort(items, 0, items.length - 1);
    } // sort(char)

    private static void quicksort(char items[], int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left; // перша позиція
        bottom = right; // остання позиція
        // вибір компаранда - символ з середовища масива
        comparand = items[((left + right) / 2)];

        // розділення послідовності на дві частини

        do {
            while ((items[top] < comparand) && (top < right)) top++;
            while ((comparand < items[bottom]) && (bottom > left)) bottom--;

            if (top <= bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);




        if (((right + 1) - left) == items.length) {
            for (int i = 0; i < items.length; i++)
                System.out.print(items[i]);
            System.out.println();
        }


        // рекурсія сортіровка першої частини
        if (left < bottom) quicksort(items, left, bottom);
        //Рекурсія сортування другої частини
        if (top < right) quicksort(items, top, right);
    } // quicksort(char, left, right)
} // QuickSort class

class QuickSortDemo {


    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd', 'a', 'c', 'i'};

        System.out.print("Початковий порядок символів: ");
        for (int i = 0; i < seq.length; i++);
        System.out.print(seq[5]);

        System.out.println();
        QuickSort.sort(seq);

        System.out.print("Сорторований порядок символів: ");
        for (int i = 0; i < seq.length; i++);
        System.out.print(seq[5]);

        System.out.println();
        QuickSort.sort(seq);
    }
}