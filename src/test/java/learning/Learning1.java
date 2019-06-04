package learning;

import mockdata.MockData;
import model.FailureModel;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.FieldComparisonFailure;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Learning1 {

    @Test
    public void compareJson() throws IOException {

        String jsonData1 = MockData.getJSONData("cars1.json");
        String jsonData2 = MockData.getJSONData("cars2.json");

        try {
            JSONCompareResult jsonCompareResult = JSONCompare.compareJSON(jsonData1, jsonData2, JSONCompareMode.STRICT_ORDER);
            List<FieldComparisonFailure> failures = jsonCompareResult.getFieldFailures();

            Map<String, String> collect = failures.stream()
                    .collect(Collectors.toMap(failure -> failure.getExpected().toString(), failure -> failure.getActual().toString()));

            List<FailureModel> collect1 = failures.stream()
                    .map(failure -> new FailureModel(failure.getField(), failure.getExpected().toString(), failure.getActual().toString()))
                    .collect(Collectors.toList());


            collect.entrySet().forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));

            collect1.forEach(failureModel -> {
                System.out.println(failureModel.getKeyValue() + ", " + failureModel.getExpectedValue() + ", " + failureModel.getActualValue());
            });


        } catch (JSONException e1) {

        }
    }
}
