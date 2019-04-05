package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;
import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива значениями
 * последовательности случайных чисел.
 *
 * <p>
 * Экземпляры класса можно использовать многократно для инициализации любого
 * числа массивов.
 *
 * <p>
 * Диапазон, в пределах которого будут получены случайные значения, передаётся в
 * конструктор класса при инициализации.
 */
public class RandomInitializer implements Initializer {

    private final int MIN_LIMIT;
    private final int MAX_LIMIT;

    public RandomInitializer(int MIN_LIMIT, int MAX_LIMIT) {
        this.MIN_LIMIT = MIN_LIMIT;
        this.MAX_LIMIT = MAX_LIMIT;
    }

    private final Random random = new Random();

    /**
     * Выполняет инициализацию массива, значениями последовательности случайных
     * чисел.
     *
     * @param array - инициализируемый массив
     */
    @Override
    public void initialize(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_LIMIT - MIN_LIMIT) + MIN_LIMIT;
        }

    }
}
