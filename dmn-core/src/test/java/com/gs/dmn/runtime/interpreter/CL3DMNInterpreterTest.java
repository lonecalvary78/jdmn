/*
 * Copyright 2016 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.gs.dmn.runtime.interpreter;

import com.gs.dmn.runtime.Pair;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public abstract class CL3DMNInterpreterTest<NUMBER, DATE, TIME, DATE_TIME, DURATION> extends AbstractDMNInterpreterTest<NUMBER, DATE, TIME, DATE_TIME, DURATION> {
    @Override
    protected String getDMNInputPath() {
        return "tck/%s/cl3/%s/translator";
    }

    //
    // DMN 1.1 files
    //

    @Test
    public void test_11_cl3_0001_filter() {
        doSingleModelTest("1.1", "0001-filter");
    }

    @Test
    public void test_11_cl3_0002_string_functions() {
        doSingleModelTest("1.1", "0002-string-functions");
    }

    @Test
    public void test_11_cl3_0003_iteration() {
        doSingleModelTest("1.1", "0003-iteration");
    }

    @Test
    public void test_11_cl3_0004_lending() {
        doSingleModelTest("1.1", "0004-lending");
    }

    @Test
    public void test_11_cl3_0005_literal_invocation() {
        doSingleModelTest("1.1", "0005-literal-invocation");
    }

    @Test
    public void test_11_cl3_0006_join() {
        doSingleModelTest("1.1", "0006-join");
    }

    @Test
    public void test_11_cl3_0007_date_time() {
        doSingleModelTest("1.1", "0007-date-time");
    }

    @Test
    public void test_11_cl3_0008_listGen() {
        doSingleModelTest("1.1", "0008-listGen");
    }

    @Test
    public void test_11_cl3_0009_append_flatten() {
        doSingleModelTest("1.1", "0009-append-flatten");
    }

    @Test
    public void test_11_cl3_0010_concatenate() {
        doSingleModelTest("1.1", "0010-concatenate");
    }

    @Test
    public void test_11_cl3_0011_insert_remove() {
        doSingleModelTest("1.1", "0011-insert-remove");
    }

    @Test
    public void test_11_cl3_0013_sort() {
        doSingleModelTest("1.1", "0013-sort");
    }

    @Test
    public void test_11_cl3_0014_loan_comparison() {
        doSingleModelTest("1.1", "0014-loan-comparison");
    }

    @Test
    public void test_11_cl3_0016_some_every() {
        doSingleModelTest("1.1", "0016-some-every");
    }

    @Test
    public void test_11_cl3_0017_tableTests() {
        doSingleModelTest("1.1", "0017-tableTests");
    }

    @Test
    public void test_11_cl3_0020_vacation_days() {
        doSingleModelTest("1.1", "0020-vacation-days");
    }

    @Test
    public void test_11_cl3_0021_singleton_list() {
        doSingleModelTest("1.1", "0021-singleton-list");
    }

    @Test
    public void test_11_cl3_0030_user_defined_functions() {
        doSingleModelTest("1.1", "0030-user-defined-functions");
        doSingleModelTest("1.1", "0030-static-user-defined-functions");
    }

    @Test
    public void test_11_cl3_0031_user_defined_functions() {
        doSingleModelTest("1.1", "0031-user-defined-functions");
        doSingleModelTest("1.1", "0031-static-user-defined-functions");
    }

    @Test
    public void test_11_cl3_0032_conditionals() {
        doSingleModelTest("1.1", "0032-conditionals");
    }

    @Test
    public void test_11_cl3_0033_for_loops() {
        doSingleModelTest("1.1", "0033-for-loops");
    }

    @Test
    public void test_11_cl3_0034_drg_scopes() {
        doSingleModelTest("1.1", "0034-drg-scopes");
    }

    @Test
    public void test_11_cl3_0035_test_structure_output() {
        doSingleModelTest("1.1", "0035-test-structure-output");
    }

    @Test
    public void test_11_cl3_0036_dt_variable_input() {
        doSingleModelTest("1.1", "0036-dt-variable-input");
    }

    @Test
    public void test_11_cl3_0037_dt_on_bkm_implicit_params() {
        doSingleModelTest("1.1", "0037-dt-on-bkm-implicit-params");
    }

    @Test
    public void test_11_cl3_0038_dt_on_bkm_explicit_params() {
        doSingleModelTest("1.1", "0038-dt-on-bkm-explicit-params");
    }

    @Test
    public void test_11_cl3_0039_dt_list_semantics() {
        doSingleModelTest("1.1", "0039-dt-list-semantics");
    }

    @Test
    public void test_11_cl3_0040_singlenestedcontext() {
        doSingleModelTest("1.1", "0040-singlenestedcontext");
    }

    @Test
    public void test_11_cl3_0041_multiple_nestedcontext() {
        doSingleModelTest("1.1", "0041-multiple-nestedcontext");
    }

    @Test
    public void test_11_cl3_1100_feel_decimal_function() {
        doSingleModelTest("1.1", "1100-feel-decimal-function");
    }

    @Test
    public void test_11_cl3_1101_feel_floor_function() {
        doSingleModelTest("1.1", "1101-feel-floor-function");
    }

    @Test
    public void test_11_cl3_1102_feel_ceiling_function() {
        doSingleModelTest("1.1", "1102-feel-ceiling-function");
    }

    @Test
    public void test_11_cl3_1103_feel_substring_function() {
        doSingleModelTest("1.1", "1103-feel-substring-function");
    }

    @Test
    public void test_11_cl3_1104_feel_string_length_function() {
        doSingleModelTest("1.1", "1104-feel-string-length-function");
    }

    @Test
    public void test_11_cl3_1105_feel_upper_case_function() {
        doSingleModelTest("1.1", "1105-feel-upper-case-function");
    }

    @Test
    public void test_11_cl3_1106_feel_lower_case_function() {
        doSingleModelTest("1.1", "1106-feel-lower-case-function");
    }

    @Test
    public void test_11_cl3_1107_feel_substring_before_function() {
        doSingleModelTest("1.1", "1107-feel-substring-before-function");
    }

    @Test
    public void test_11_cl3_1108_feel_substring_after_function() {
        doSingleModelTest("1.1", "1108-feel-substring-after-function");
    }

    @Test
    public void test_11_cl3_1109_feel_replace_function() {
        doSingleModelTest("1.1", "1109-feel-replace-function");
    }

    @Test
    public void test_11_cl3_1110_feel_contains_function() {
        doSingleModelTest("1.1", "1110-feel-contains-function");
    }

    @Test
    public void test_11_cl3_1115_feel_date_function() {
        doSingleModelTest("1.1", "1115-feel-date-function");
    }

    @Test
    public void test_11_cl3_1116_feel_time_function() {
        doSingleModelTest("1.1", "1116-feel-time-function");
    }

    @Test
    public void test_11_cl3_1117_feel_date_and_time_function() {
        doSingleModelTest("1.1", "1117-feel-date-and-time-function");
    }

    @Test
    public void test_11_cl3_1120_feel_duration_function() {
        doSingleModelTest("1.1", "1120-feel-duration-function");
    }

    @Test
    public void test_11_cl3_1121_feel_years_and_months_duration_function() {
        doSingleModelTest("1.1", "1121-feel-years-and-months-duration-function");
    }

    @Test
    public void test_11_cl3_9001_recursive_function() {
        doSingleModelTest("1.1", "9001-recursive-function");
    }

    //
    // DMN 1.2 files
    //

    @Test
    public void test_12_cl3_0012_list_functions() {
        doSingleModelTest("1.2", "0012-list-functions");
    }

    @Test
    public void test_12_cl3_0034_drg_scopes() {
        doSingleModelTest("1.2", "0034-drg-scopes");
        doSingleModelTest("1.2", "0034-drg-scopes-2");
    }

    @Test
    public void test_12_cl3_0068_feel_equality() {
        doSingleModelTest("1.2", "0068-feel-equality");
    }

    @Test
    public void test_12_cl3_0070_feel_instance_of() {
        doSingleModelTest("1.2", "0070-feel-instance-of");
    }

    @Test
    public void test_12_cl3_0074_feel_properties() {
        doSingleModelTest("1.2", "0074-feel-properties");
    }

    @Test
    public void test_12_cl3_0076_feel_external_java() {
        doSingleModelTest("1.2", "0076-feel-external-java");
    }

    @Disabled("incorrect DS type")
    public void test_12_cl3_0082_feel_coercion() {
        doSingleModelTest("1.2", "0082-feel-coercion");
    }

    @Test
    public void test_12_cl3_0085_decision_services() {
        doSingleModelTest("1.2", "0085-decision-services");
    }

    @Disabled("incorrect DS type")
    public void test_12_cl3_0086_import() {
        doMultipleModelsTest("1.2", Arrays.asList("0086-import", "0086-imported-model"), new Pair<>("singletonInputData", "false"));
    }

    @Test
    public void test_12_cl3_0087_chapter_11_example() {
        doSingleModelTest("1.2", "0087-chapter-11-example");
    }

    @Test
    public void test_12_cl3_0089_nested_inputdata_imports() {
        doMultipleModelsTest("1.2", Arrays.asList("0089-nested-inputdata-imports", "0089-model-b", "0089-model-b2", "0089-model-a"), new Pair<>("singletonInputData", "false"));
    }

    //
    // DMN 1.3 files
    //

    @Test
    public void test_13_cl3_0004_lending() {
        doSingleModelTest("1.3", "0004-lending", new Pair<>("singletonInputData", "false"));
    }

    @Test
    public void test_13_cl3_0016_some_every() {
        doSingleModelTest("1.3", "0016-some-every");
    }

    @Test
    public void test_13_cl3_0020_vacation_days() {
        doSingleModelTest("1.3", "0020-vacation-days");
    }

    @Test
    public void test_13_cl3_0031_user_defined_functions() {
        doSingleModelTest("1.3", "0031-user-defined-functions");
    }

    @Test
    public void test_13_cl3_0050_feel_abs_function() {
        doSingleModelTest("1.3", "0050-feel-abs-function");
    }

    @Test
    public void test_13_cl3_0057_feel_context() {
        doSingleModelTest("1.3", "0057-feel-context");
    }

    @Test
    public void test_13_cl3_0058_feel_number_function() {
        doSingleModelTest("1.3", "0058-feel-number-function");
    }

    @Test
    public void test_13_cl3_0068_feel_equality() {
        doSingleModelTest("1.3", "0068-feel-equality", new Pair<>("strongTyping", "false") );
    }

    @Test
    public void test_13_cl3_0071_feel_between() {
        doSingleModelTest("1.3", "0071-feel-between");
    }

    @Test
    public void test_13_cl3_0074_feel_properties() {
        doSingleModelTest("1.3", "0074-feel-properties");
    }

    @Test
    public void test_13_cl3_0080_feel_getvalue_function() {
        doSingleModelTest("1.3", "0080-feel-getvalue-function", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0081_feel_getentries_function() {
        doSingleModelTest("1.3", "0081-feel-getentries-function");
    }

    @Test
    public void test_13_cl3_0082_feel_coercion() {
        doSingleModelTest("1.3", "0082-feel-coercion");
    }

    @Test
    public void test_13_cl3_0083_feel_unicode() {
        doSingleModelTest("1.3", "0083-feel-unicode");
    }

    @Test
    public void test_13_cl3_0084_feel_for_loops() {
        doSingleModelTest("1.3", "0084-feel-for-loops");
    }

    @Test
    public void test_13_cl3_0085_decision_services() {
        doSingleModelTest("1.3", "0085-decision-services");
    }

    @Test
    public void test_13_cl3_0086_import() {
        doMultipleModelsTest("1.3", Arrays.asList("0086-import", "Imported_Model"), new Pair<>("singletonInputData", "false"));
    }

    @Test
    public void test_13_cl3_0087_chapter_11_example() {
        doSingleModelTest("1.3", "0087-chapter-11-example");
    }

    @Test
    public void test_13_cl3_0088_no_decision_logic() {
        doSingleModelTest("1.3", "0088-no-decision-logic");
    }

    @Test
    public void test_13_cl3_0091_local_hrefs() {
        doSingleModelTest("1.3", "0091-local-hrefs", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0092_feel_lambda() {
        doSingleModelTest("1.3", "0092-feel-lambda", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0093_feel_at_literals() {
        doSingleModelTest("1.3", "0093-feel-at-literals");
    }

    @Test
    public void test_13_cl3_0094_feel_product_function() {
        doSingleModelTest("1.3", "0094-feel-product-function");
    }

    @Test
    public void test_13_cl3_0095_feel_day_of_year_function() {
        doSingleModelTest("1.3", "0095-feel-day-of-year-function", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0096_feel_day_of_week_function() {
        doSingleModelTest("1.3", "0096-feel-day-of-week-function", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0097_fel_month_of_year_function() {
        doSingleModelTest("1.3", "0097-feel-month-of-year-function", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0098_feel_week_of_year_function() {
        doSingleModelTest("1.3", "0098-feel-week-of-year-function", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_cl3_0099_arithmetic_negation() {
        doSingleModelTest("1.3", "0099-arithmetic-negation");
    }

    @Test
    public void test_13_cl3_100_arithmetic() {
        doSingleModelTest("1.3", "0100-arithmetic");
    }

    @Test
    public void test_13_cl3_0103_feel_is_function() {
        doSingleModelTest("1.3", "0103-feel-is-function");
    }

    @Test
    public void test_13_cl3_1130_feel_interval() {
        doSingleModelTest("1.3", "1130-feel-interval");
    }

    //
    // DMN 1.4 files
    //

    @Test
    public void test_14_cl3_0070_feel_instance_of() {
        doSingleModelTest("1.4", "0070-feel-instance-of");
    }

    @Test
    public void test_14_cl3_0072_feel_in() {
        doSingleModelTest("1.4", "0072-feel-in");
    }

    @Test
    public void test_14_cl3_0082_feel_coercion() {
        doSingleModelTest("1.4", "0082-feel-coercion");
    }

    @Test
    public void test_14_cl3_0086_import() {
        doMultipleModelsTest("1.4", Arrays.asList("0086-import", "Imported_Model"), new Pair<>("singletonInputData", "false"));
    }

    @Test
    public void test_14_cl3_0085_decision_services() {
        doSingleModelTest("1.4", "0085-decision-services");
    }

    @Test
    public void test_14_cl3_0092_feel_lambda() {
        doSingleModelTest("1.4", "0092-feel-lambda", new Pair<>("strongTyping", "false"));
    }

    @Test
    public void test_13_0104_allowed_values() {
        doSingleModelTest("1.3", "0104-allowed-values", new Pair<>("strongTyping", "true"), new Pair<>("checkConstraints", "true"));
    }

    @Test
    public void test_14_cl3_100_arithmetic() {
        doSingleModelTest("1.4", "0100-arithmetic");
    }

    @Test
    public void test_14_cl3_1111_feel_matches_function() {
        doSingleModelTest("1.4", "1111-feel-matches-function");
    }

    @Test
    public void test_14_cl3_1145_feel_context_function() {
        doSingleModelTest("1.4", "1145-feel-context-function");
    }

    @Test
    public void test_14_cl3_1146_feel_context_put_function() {
        doSingleModelTest("1.4", "1146-feel-context-put-function");
    }

    @Test
    public void test_14_cl3_1147_feel_context_merge_function() {
        doSingleModelTest("1.4", "1147-feel-context-merge-function");
    }

    @Test
    public void test_14_cl3_1150_boxed_conditional() {
        doSingleModelTest("1.4", "1150-boxed-conditional");
    }

    @Test
    public void test_14_cl3_1151_boxed_filter() {
        doSingleModelTest("1.4", "1151-boxed-filter");
    }

    @Test
    public void test_14_cl3_1152_boxed_for() {
        doSingleModelTest("1.4", "1152-boxed-for");
    }

    @Test
    public void test_14_cl3_1153_boxed_some() {
        doSingleModelTest("1.4", "1153-boxed-some");
    }

    @Test
    public void test_14_cl3_1154_boxed_every() {
        doSingleModelTest("1.4", "1154-boxed-every");
    }

    @Test
    public void test_14_cl3_1101_feel_floor_function() {
        doSingleModelTest("1.4", "1101-feel-floor-function");
    }

    @Test
    public void test_14_cl3_1102_feel_ceiling_function() {
        doSingleModelTest("1.4", "1102-feel-ceiling-function");
    }

    @Test
    public void test_14_cl3_1131_feel_function_invocation() {
        doSingleModelTest("1.4", "1131-feel-function-invocation");
    }

    @Test
    public void test_14_cl3_1141_feel_round_up_function() {
        doSingleModelTest("1.4", "1141-feel-round-up-function");
    }

    @Test
    public void test_14_cl3_1142_feel_round_down_function() {
        doSingleModelTest("1.4", "1142-feel-round-down-function");
    }

    @Test
    public void test_14_cl3_1143_feel_round_half_up_function() {
        doSingleModelTest("1.4", "1143-feel-round-half-up-function");
    }

    @Test
    public void test_14_cl3_1144_feel_round_half_down_function() {
        doSingleModelTest("1.4", "1144-feel-round-half-down-function");
    }

    @Test
    public void test_14_cl3_1148_feel_now_function() {
        doSingleModelTest("1.4", "1148-feel-now-function");
    }

    @Test
    public void test_14_cl3_1148_feel_today_function() {
        doSingleModelTest("1.4", "1149-feel-today-function");
    }

    @Test
    public void test_14_cl3_1140_feel_string_join_function() {
        doSingleModelTest("1.4", "1140-feel-string-join-function");
    }
}
