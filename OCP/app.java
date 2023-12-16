import java.util.Scanner;;

public class app {
    public static void main(String[] args) {
        ISorting st = new Sorting();
        Scanner in = new Scanner(System.in);

        System.out.println("Select Sort Algorithms");
        System.out.println("1.Insertion Sort 2.Merge Sort 3.Selection Sort");
        int stalgo = in.nextInt();

        if (stalgo == 1) {
            st.process(new InsertionSort());
        }
        else if (stalgo == 2) {
            st.process(new MergeSort());
        }1
        else if (stalgo == 3) {
            st.process(new SelectionSort());
        }
        else {
            System.out.println("error");
        }
    }
}
