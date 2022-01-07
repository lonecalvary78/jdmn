
import java.util.*;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = {"bkm.ftl", "decisionService_006"})
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "",
    name = "decisionService_006",
    label = "",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION_SERVICE,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.OTHER,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
public class DecisionService_006 extends com.gs.dmn.runtime.DefaultDMNBaseDecision {
    public static final com.gs.dmn.runtime.listener.DRGElement DRG_ELEMENT_METADATA = new com.gs.dmn.runtime.listener.DRGElement(
        "",
        "decisionService_006",
        "",
        com.gs.dmn.runtime.annotation.DRGElementKind.DECISION_SERVICE,
        com.gs.dmn.runtime.annotation.ExpressionKind.OTHER,
        com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
        -1
    );

    public static final DecisionService_006 INSTANCE = new DecisionService_006();

    private final Decision_006_2 decision_006_2;

    public DecisionService_006() {
        this(new Decision_006_2());
    }

    public DecisionService_006(Decision_006_2 decision_006_2) {
        this.decision_006_2 = decision_006_2;
    }

    public static String decisionService_006(String decision_006_3, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn.runtime.cache.Cache cache_) {
        return INSTANCE.apply(decision_006_3, annotationSet_, eventListener_, externalExecutor_, cache_);
    }

    private String apply(String decision_006_3, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn.runtime.cache.Cache cache_) {
        try {
            // Start DS 'decisionService_006'
            long decisionService_006StartTime_ = System.currentTimeMillis();
            com.gs.dmn.runtime.listener.Arguments decisionService_006Arguments_ = new com.gs.dmn.runtime.listener.Arguments();
            decisionService_006Arguments_.put("decision_006_3", decision_006_3);
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, decisionService_006Arguments_);

            // Bind input decisions
            cache_.bind("decision_006_3", decision_006_3);

            // Apply child decisions
            String decision_006_2 = this.decision_006_2.apply(annotationSet_, eventListener_, externalExecutor_, cache_);

            // Evaluate DS 'decisionService_006'
            String output_ = evaluate(decision_006_2, annotationSet_, eventListener_, externalExecutor_, cache_);

            // End DS 'decisionService_006'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, decisionService_006Arguments_, output_, (System.currentTimeMillis() - decisionService_006StartTime_));

            return output_;
        } catch (Exception e) {
            logError("Exception caught in 'decisionService_006' evaluation", e);
            return null;
        }
    }

    protected String evaluate(String decision_006_2, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn.runtime.cache.Cache cache_) {
        return decision_006_2;
    }
}