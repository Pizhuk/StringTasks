package test.com.tasks;

import main.com.tasks.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class Task3Test {
    Task3 cut = new Task3();

    static List<Arguments> getSmallestLengthOfWordTestArgs() {
        return List.of(
                Arguments.arguments("qwre hdhch qiqiiqoq jd", 2),
                Arguments.arguments(", ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getSmallestLengthOfWordTestArgs")
    void getSmallestLengthOfWordTest(String str, int expected){
        int actual = cut.getSmallestLengthOfWord(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> replaceBy$TestArgs() {
        return List.of(
                Arguments.arguments(new String[] {"laks", "dk", "hfkd", "", "dsaa", "edcs"}, 4, new String[] {"l$$$", "dk", "h$$$", "", "d$$$", "e$$$"}),
                Arguments.arguments(new String[] {"laks", "dk", "hfkd", "", "dsaa", "edcs"}, 2, new String[] {"laks", "$$$", "hfkd", "", "dsaa", "edcs"}),
                Arguments.arguments(new String[] {}, 2, new String[] {})

                );
    }

    @ParameterizedTest
    @MethodSource("replaceBy$TestArgs")
    void replaceBy$Test(String[] array, int lengthOfWords, String[] expected){
        String[] actual = cut.replaceBy$(array, lengthOfWords);
        Assertions.assertArrayEquals(expected, actual);
    }

    static List<Arguments> pushSpaceIntoStrTestArgs() {
        return List.of(
                Arguments.arguments("stdg,dhfhn;edhncd, edhbubhudcx edjjnd","stdg, dhfhn; edhncd, edhbubhudcx edjjnd"),
                Arguments.arguments("strg", "strg"),
                Arguments.arguments("str.", "str. ")

        );
    }

    @ParameterizedTest
    @MethodSource("pushSpaceIntoStrTestArgs")
    void pushSpaceIntoStrTest(String str, String expected){
        String actual = cut.pushSpaceIntoStr(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> getOnlyOneSuchASymTestArgs() {
        return List.of(
                Arguments.arguments("qwerrw", "qwer"),
                Arguments.arguments("davad ", "dav "),
                Arguments.arguments("david is the best", "davi stheb"),
                Arguments.arguments(" ", " "),
                Arguments.arguments("", "")

        );
    }

    @ParameterizedTest
    @MethodSource("getOnlyOneSuchASymTestArgs")
    void getOnlyOneSuchASymTest(String str, String expected){
        String actual = cut.getOnlyOneSuchASym(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> getAmountOfWordsTestArgs() {
        return List.of(
                Arguments.arguments("qwerrw, dk djeks; edn", 4),
                Arguments.arguments("davad", 1),
                Arguments.arguments("", 0),
                Arguments.arguments(" ", 0)

        );
    }

    @ParameterizedTest
    @MethodSource("getAmountOfWordsTestArgs")
    void getAmountOfWordsTest(String str, int expected){
        int actual = cut.getAmountOfWords(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> deletePartOfStrTestArgs() {
        return List.of(
                Arguments.arguments("qwerrw, dk djeks; edn", 4, 7, "qwerdjeks; edn"),
                Arguments.arguments("davad", 1, 7, "d"),
                Arguments.arguments("", 0, 78, "")

        );
    }

    @ParameterizedTest
    @MethodSource("deletePartOfStrTestArgs")
    void deletePartOfStrTest(String str, int position, int length, String expected){
        String actual = cut.deletePartOfStr(str, position, length);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> reverseStrTestArgs() {
        return List.of(
                Arguments.arguments("david", "divad"),
                Arguments.arguments("davad p", "p davad"),
                Arguments.arguments("", "")

        );
    }

    @ParameterizedTest
    @MethodSource("reverseStrTestArgs")
    void reverseStrTest(String str, String expected){
        String actual = cut.reverseStr(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> deleteLastWordTestArgs() {
        return List.of(
                Arguments.arguments("david", ""),
                Arguments.arguments("davad, p", "davad,"),
                Arguments.arguments("", "")

        );
    }

    @ParameterizedTest
    @MethodSource("deleteLastWordTestArgs")
    void deleteLastWordTest(String str, String expected){
        String actual = cut.deleteLastWord(str);
        Assertions.assertEquals(expected, actual);
    }
}
