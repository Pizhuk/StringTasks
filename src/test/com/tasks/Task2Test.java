package test.com.tasks;

import main.com.tasks.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class Task2Test {
    Task2 cut = new Task2();

    static List<Arguments> pushIntToStringTestArgs() {
        return List.of(
                Arguments.arguments(3, "3"),
                Arguments.arguments(-12, "-12")
        );
    }

    @ParameterizedTest
    @MethodSource("pushIntToStringTestArgs")
    void pushIntToStringTest(int integer, String expected){
        String actual = cut.pushIntToString(integer);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> pushDoubleToStringTestArgs() {
        return List.of(
                Arguments.arguments(3.13697, "3.13697"),
                Arguments.arguments(-1, "-1.0")
        );
    }

    @ParameterizedTest
    @MethodSource("pushDoubleToStringTestArgs")
    void pushDoubleToStringTest(double d, String expected){
        String actual = cut.pushDoubleToString(d);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> countOfSymbolTestArgs() {
        return List.of(
                Arguments.arguments("qwertty", 't', 2),
                Arguments.arguments("hfdjke", '/', 0)
        );
    }

    @ParameterizedTest
    @MethodSource("countOfSymbolTestArgs")
    void countOfSymbolTest(String str, char sym, int expected){
        int actual = cut.countOfSymbol(str, sym);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> pushStringToIntTestArgs() {
        return List.of(
                Arguments.arguments("32", 32),
                Arguments.arguments("3.2", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("pushStringToIntTestArgs")
    void pushStringToIntTest(String str, int expected){
        int actual = cut.pushStringToInt(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> pushStringToDoubleTestArgs() {
        return List.of(
                Arguments.arguments("0.9", 0.9),
                Arguments.arguments("3", 3.0),
                Arguments.arguments("3.1.", 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("pushStringToDoubleTestArgs")
    void pushStringToDoubleTest(String str, double expected){
        double actual = cut.pushStringToDouble(str);
        Assertions.assertEquals(expected, actual);
    }
}
