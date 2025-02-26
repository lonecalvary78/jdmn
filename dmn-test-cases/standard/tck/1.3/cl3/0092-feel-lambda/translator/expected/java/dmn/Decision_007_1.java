
import java.util.*;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = {"decision.ftl", "decision_007_1"})
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "",
    name = "decision_007_1",
    label = "",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
public class Decision_007_1 extends com.gs.dmn.runtime.DefaultDMNBaseDecision {
    public static final com.gs.dmn.runtime.listener.DRGElement DRG_ELEMENT_METADATA = new com.gs.dmn.runtime.listener.DRGElement(
        "",
        "decision_007_1",
        "",
        com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
        com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
        com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
        -1
    );

    private final Decision_007_2 decision_007_2;

    public Decision_007_1() {
        this(new Decision_007_2());
    }

    public Decision_007_1(Decision_007_2 decision_007_2) {
        this.decision_007_2 = decision_007_2;
    }

    @java.lang.Override()
    public java.math.BigDecimal applyMap(java.util.Map<String, String> input_, com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            return apply((input_.get("input_007_1") != null ? number(input_.get("input_007_1")) : null), context_);
        } catch (Exception e) {
            logError("Cannot apply decision 'Decision_007_1'", e);
            return null;
        }
    }

    public java.math.BigDecimal apply(java.math.BigDecimal input_007_1, com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            // Start decision 'decision_007_1'
            com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
            com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
            com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
            com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;
            long decision_007_1StartTime_ = System.currentTimeMillis();
            com.gs.dmn.runtime.listener.Arguments decision_007_1Arguments_ = new com.gs.dmn.runtime.listener.Arguments();
            decision_007_1Arguments_.put("input_007_1", input_007_1);
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, decision_007_1Arguments_);

            // Evaluate decision 'decision_007_1'
            java.math.BigDecimal output_ = lambda.apply(input_007_1, context_);

            // End decision 'decision_007_1'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, decision_007_1Arguments_, output_, (System.currentTimeMillis() - decision_007_1StartTime_));

            return output_;
        } catch (Exception e) {
            logError("Exception caught in 'decision_007_1' evaluation", e);
            return null;
        }
    }

    public com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal> lambda =
        new com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal>() {
            public java.math.BigDecimal apply(Object... args_) {
                java.math.BigDecimal input_007_1 = 0 < args_.length ? (java.math.BigDecimal) args_[0] : null;
                com.gs.dmn.runtime.ExecutionContext context_ = 1 < args_.length ? (com.gs.dmn.runtime.ExecutionContext) args_[1] : null;
                com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
                com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
                com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
                com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;

                // Apply child decisions
                com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal> decision_007_2 = Decision_007_1.this.decision_007_2.apply(input_007_1, context_);

                return decision_007_2.apply(number("5"), context_);
            }
        };
}
