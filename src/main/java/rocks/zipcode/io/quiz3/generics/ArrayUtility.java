package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Map<SomeType, Long> map = Arrays.stream(array).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        long occurrence = 0;
        SomeType value = null;
        for(Map.Entry<SomeType, Long> each : map.entrySet()){
            if(each.getValue() % 2 != 0){
                occurrence = each.getValue();
                value = each.getKey();
            }
        }
        return value;
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Long> map = Arrays.stream(array).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        SomeType value = null;
        for(Map.Entry<SomeType, Long> each : map.entrySet()){
            if(each.getValue() % 2 == 0){
                value = each.getKey();
            }
        }
        return value;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Arrays.stream(array).filter(x -> x == valueToEvaluate).toArray().length;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        //return Arrays.stream(array).filter( predicate ).collect(Collectors.<SomeType>toList()).toArray();
        return null;
    }
}
