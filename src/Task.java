public class Task {

    /**
     * Сортировка простыми вставками, в заданном диапазоне. Если индекс "from"
     * сортировки больше индекса "to" сортировки, то сортирует в порядке убывания.
     *
     * @param <T> Сравнимый тип элементов списка
     * @param data Сортируемый список типа T
     * @param from Идекс элемента, с которого начинается сортировка
     * @param to Идекс элемента, на котором кончается сортировка
     * @throws Exception, если диапозон задан неверно
     */
    public static <T extends Comparable<T>> void sort(T[] data, int from, int to) throws Exception {
        if (from >= 0 && to >= 0 && from != to) {
            if (from < to) {

                for (int i = from; i <= to; i++) {
                    T value = data[i];
                    // поиск места элемента в готовой последовательности
                    int j;
                    for (j = i - 1; j >= from && data[j].compareTo(value) > 0; j--) {
                        data[j + 1] = data[j];     // сдвигаем элемент направо, пока не дошли
                    }
                    // место найдено, вставить элемент
                    data[j + 1] = value;
                }
            } else {

                for (int i = from; i >= to; i--) {
                    T value = data[i];
                    int j;
                    for (j = i + 1; j <= from && data[j].compareTo(value) > 0; j++) {
                        data[j - 1] = data[j];// сдвигаем элемент налево, пока не дошли
                    }
                    data[j - 1] = value;
                }
            }
        } else {
            throw new Exception("You entered the wrong range.");
        }
    }
}