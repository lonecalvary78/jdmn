package model_b2;

import java.util.*;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = {"decision.ftl", "evaluatingB2SayHello"})
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "model_b2",
    name = "evaluatingB2SayHello",
    label = "Evaluating B2 Say Hello",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
public class EvaluatingB2SayHello extends com.gs.dmn.runtime.DefaultDMNBaseDecision {
    public static final com.gs.dmn.runtime.listener.DRGElement DRG_ELEMENT_METADATA = new com.gs.dmn.runtime.listener.DRGElement(
        "model_b2",
        "evaluatingB2SayHello",
        "Evaluating B2 Say Hello",
        com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
        com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
        com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
        -1
    );

    private final model_b1.GreetThePerson model_b1_greetThePerson;

    public EvaluatingB2SayHello() {
        this(new model_b1.GreetThePerson());
    }

    public EvaluatingB2SayHello(model_b1.GreetThePerson model_b1_greetThePerson) {
        this.model_b1_greetThePerson = model_b1_greetThePerson;
    }

    @java.lang.Override()
    public String applyMap(java.util.Map<String, String> input_, com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            return apply(input_.get("model-a.Person Name"), context_);
        } catch (Exception e) {
            logError("Cannot apply decision 'EvaluatingB2SayHello'", e);
            return null;
        }
    }

    public String apply(String model_a_personName, com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            // Start decision 'evaluatingB2SayHello'
            com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
            com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
            com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
            com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;
            long evaluatingB2SayHelloStartTime_ = System.currentTimeMillis();
            com.gs.dmn.runtime.listener.Arguments evaluatingB2SayHelloArguments_ = new com.gs.dmn.runtime.listener.Arguments();
            evaluatingB2SayHelloArguments_.put("model-a.Person Name", model_a_personName);
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, evaluatingB2SayHelloArguments_);

            // Evaluate decision 'evaluatingB2SayHello'
            String output_ = lambda.apply(model_a_personName, context_);

            // End decision 'evaluatingB2SayHello'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, evaluatingB2SayHelloArguments_, output_, (System.currentTimeMillis() - evaluatingB2SayHelloStartTime_));

            return output_;
        } catch (Exception e) {
            logError("Exception caught in 'evaluatingB2SayHello' evaluation", e);
            return null;
        }
    }

    public com.gs.dmn.runtime.LambdaExpression<String> lambda =
        new com.gs.dmn.runtime.LambdaExpression<String>() {
            public String apply(Object... args_) {
                String model_a_personName = 0 < args_.length ? (String) args_[0] : null;
                com.gs.dmn.runtime.ExecutionContext context_ = 1 < args_.length ? (com.gs.dmn.runtime.ExecutionContext) args_[1] : null;
                com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
                com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
                com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
                com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;

                // Apply child decisions
                String model_b1_greetThePerson = EvaluatingB2SayHello.this.model_b1_greetThePerson.apply(model_a_personName, context_);

                return stringAdd("Evaluating Say Hello to: ", model_b1_greetThePerson);
            }
        };
}
