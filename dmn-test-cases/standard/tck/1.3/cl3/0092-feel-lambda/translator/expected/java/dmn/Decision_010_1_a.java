
import java.util.*;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = {"decision.ftl", "decision_010_1_a"})
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "",
    name = "decision_010_1_a",
    label = "",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
public class Decision_010_1_a extends com.gs.dmn.runtime.DefaultDMNBaseDecision {
    public static final com.gs.dmn.runtime.listener.DRGElement DRG_ELEMENT_METADATA = new com.gs.dmn.runtime.listener.DRGElement(
        "",
        "decision_010_1_a",
        "",
        com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
        com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
        com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
        -1
    );

    private final Decision_010_2_a decision_010_2_a;

    public Decision_010_1_a() {
        this(new Decision_010_2_a());
    }

    public Decision_010_1_a(Decision_010_2_a decision_010_2_a) {
        this.decision_010_2_a = decision_010_2_a;
    }

    @java.lang.Override()
    public java.math.BigDecimal applyMap(java.util.Map<String, String> input_, com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            return apply(context_);
        } catch (Exception e) {
            logError("Cannot apply decision 'Decision_010_1_a'", e);
            return null;
        }
    }

    public java.math.BigDecimal apply(com.gs.dmn.runtime.ExecutionContext context_) {
        try {
            // Start decision 'decision_010_1_a'
            com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
            com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
            com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
            com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;
            long decision_010_1_aStartTime_ = System.currentTimeMillis();
            com.gs.dmn.runtime.listener.Arguments decision_010_1_aArguments_ = new com.gs.dmn.runtime.listener.Arguments();
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, decision_010_1_aArguments_);

            // Evaluate decision 'decision_010_1_a'
            java.math.BigDecimal output_ = lambda.apply(context_);

            // End decision 'decision_010_1_a'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, decision_010_1_aArguments_, output_, (System.currentTimeMillis() - decision_010_1_aStartTime_));

            return output_;
        } catch (Exception e) {
            logError("Exception caught in 'decision_010_1_a' evaluation", e);
            return null;
        }
    }

    public com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal> lambda =
        new com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal>() {
            public java.math.BigDecimal apply(Object... args_) {
                com.gs.dmn.runtime.ExecutionContext context_ = 0 < args_.length ? (com.gs.dmn.runtime.ExecutionContext) args_[0] : null;
                com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = context_ != null ? context_.getAnnotations() : null;
                com.gs.dmn.runtime.listener.EventListener eventListener_ = context_ != null ? context_.getEventListener() : null;
                com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_ = context_ != null ? context_.getExternalFunctionExecutor() : null;
                com.gs.dmn.runtime.cache.Cache cache_ = context_ != null ? context_.getCache() : null;

                // Apply child decisions
                com.gs.dmn.runtime.LambdaExpression<java.math.BigDecimal> decision_010_2_a = Decision_010_1_a.this.decision_010_2_a.apply(context_);

                return decision_010_2_a.apply(number("5"), context_);
            }
        };
}
