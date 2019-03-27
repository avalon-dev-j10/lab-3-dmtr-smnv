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

    private final int minLimit;
    private final int maxLimit;

    public RandomInitializer(int minLimit, int maxLimit) {
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
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
            array[i] = random.nextInt(maxLimit - minLimit) + minLimit;
        }

    }
}
