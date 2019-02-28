package sorting;

public class SelectionSorting {

        void sort(int num[])
        {
            int n = num.length;

            for (int i = 0; i < n-1; i++)
            {

                int min_num = i;
                for (int j = i+1; j < n; j++)
                    if (num[j] < num[min_num])
                        min_num = j;


                int temp = num[min_num];
                num[min_num] = num[i];
                num[i] = temp;
            }
        }


        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }


        public static void main(String args[])
        {
            SelectionSorting ob = new SelectionSorting();
            int num[] = {99,55,32,86,5};
            ob.sort(num);
            System.out.println("Sorted array");
            ob.printArray(num);
        }
    }

