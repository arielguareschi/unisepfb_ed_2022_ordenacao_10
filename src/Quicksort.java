public class Quicksort {

    public void quicksort(int[] array, int first, int last) {
        // Garante que o método continue caso haja números
        if (first < last) {
            // Caso o primeiro número seja menor que o ultimo da array,
            // é chamado o método que organiza as subArrays
            int mainArray = subArraySorter(array, first, last);

            // Array é re-montada usando recursividade
            quicksort(array, first, mainArray - 1);
            quicksort(array, mainArray + 1, last);
        }
    }

    public static int subArraySorter(int[] subArray, int first, int last) {
        // Utiliza o ultimo elemento como pivot.
        int pivot = subArray[last];
        int i = (first - 1);

        // Confere cada número e analisa se é menor ou maior que o pivot
        for (int j = first; j < last; j++) {
            // Realiza o trabalho de organização.
            if (subArray[j] <= pivot) {
                i++;

                int tmp = subArray[i];
                subArray[i] = subArray[j];
                subArray[j] = tmp;
            }
        }

        int tmp = subArray[i + 1];
        subArray[i + 1] = subArray[last];
        subArray[last] = tmp;

        // Retorna a posição final do pivot.
        return i + 1;
    }

}