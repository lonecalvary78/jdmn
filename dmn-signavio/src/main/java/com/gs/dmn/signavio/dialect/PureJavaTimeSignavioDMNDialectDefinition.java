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
package com.gs.dmn.signavio.dialect;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.context.environment.EnvironmentFactory;
import com.gs.dmn.feel.lib.FEELLib;
import com.gs.dmn.feel.synthesis.type.NativeTypeFactory;
import com.gs.dmn.feel.synthesis.type.PureJavaTimeNativeTypeFactory;
import com.gs.dmn.log.BuildLogger;
import com.gs.dmn.serialization.TypeDeserializationConfigurer;
import com.gs.dmn.signavio.feel.lib.PureJavaTimeSignavioLib;
import com.gs.dmn.signavio.runtime.PureJavaTimeSignavioBaseDecision;
import com.gs.dmn.signavio.testlab.TestLab;
import com.gs.dmn.signavio.transformation.SignavioDMNToJavaTransformer;
import com.gs.dmn.signavio.transformation.basic.BasicSignavioDMNToJavaTransformer;
import com.gs.dmn.transformation.DMNToNativeTransformer;
import com.gs.dmn.transformation.DMNTransformer;
import com.gs.dmn.transformation.InputParameters;
import com.gs.dmn.transformation.basic.BasicDMNToJavaTransformer;
import com.gs.dmn.transformation.lazy.LazyEvaluationDetector;
import com.gs.dmn.transformation.template.TemplateProvider;
import com.gs.dmn.validation.DMNValidator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;

public class PureJavaTimeSignavioDMNDialectDefinition extends AbstractSignavioDMNDialectDefinition<BigDecimal, LocalDate, TemporalAccessor, TemporalAccessor, TemporalAmount> {
    //
    // DMN processors
    //
    @Override
    public DMNToNativeTransformer createDMNToNativeTransformer(DMNValidator dmnValidator, DMNTransformer<TestLab> dmnTransformer, TemplateProvider templateProvider, LazyEvaluationDetector lazyEvaluationDetector, TypeDeserializationConfigurer typeDeserializationConfigurer, InputParameters inputParameters, BuildLogger logger) {
        return new SignavioDMNToJavaTransformer<>(this, dmnValidator, dmnTransformer, templateProvider, lazyEvaluationDetector, typeDeserializationConfigurer, inputParameters, logger);
    }

    @Override
    public BasicDMNToJavaTransformer createBasicTransformer(DMNModelRepository repository, LazyEvaluationDetector lazyEvaluationDetector, InputParameters inputParameters) {
        EnvironmentFactory environmentFactory = createEnvironmentFactory();
        return new BasicSignavioDMNToJavaTransformer(this, repository, environmentFactory, createNativeTypeFactory(), lazyEvaluationDetector, inputParameters);
    }

    //
    // Execution engine
    //
    @Override
    public NativeTypeFactory createNativeTypeFactory() {
        return new PureJavaTimeNativeTypeFactory();
    }

    @Override
    public FEELLib<BigDecimal, LocalDate, TemporalAccessor, TemporalAccessor, TemporalAmount> createFEELLib() {
        return new PureJavaTimeSignavioLib();
    }

    @Override
    public String getDecisionBaseClass() {
        return PureJavaTimeSignavioBaseDecision.class.getName();
    }

    @Override
    public String getNativeNumberType() {
        return  BigDecimal.class.getName();
    }

    @Override
    public String getNativeDateType() {
        return LocalDate.class.getName();
    }

    @Override
    public String getNativeTimeType() {
        return TemporalAccessor.class.getName();
    }

    @Override
    public String getNativeDateAndTimeType() {
        return TemporalAccessor.class.getName();
    }

    @Override
    public String getNativeDurationType() {
        return TemporalAmount.class.getName();
    }
}
