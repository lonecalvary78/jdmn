
import java.util.*
import java.util.stream.Collectors

@javax.annotation.Generated(value = ["decision.ftl", "BureauCallType"])
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "",
    name = "BureauCallType",
    label = "",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.INVOCATION,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
class BureauCallType(val preBureauRiskCategory : PreBureauRiskCategory = PreBureauRiskCategory()) : com.gs.dmn.runtime.DefaultDMNBaseDecision() {
    override fun applyMap(input_: MutableMap<String, String>, context_: com.gs.dmn.runtime.ExecutionContext): String? {
        try {
            return apply(input_.get("ApplicantData")?.let({ com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(it, object : com.fasterxml.jackson.core.type.TypeReference<type.TApplicantDataImpl>() {}) }), context_)
        } catch (e: Exception) {
            logError("Cannot apply decision 'BureauCallType'", e)
            return null
        }
    }

    fun apply(applicantData: type.TApplicantData?, context_: com.gs.dmn.runtime.ExecutionContext): String? {
        try {
            // Start decision 'BureauCallType'
            var annotationSet_: com.gs.dmn.runtime.annotation.AnnotationSet = context_.getAnnotations()
            var eventListener_: com.gs.dmn.runtime.listener.EventListener = context_.getEventListener()
            var externalExecutor_: com.gs.dmn.runtime.external.ExternalFunctionExecutor = context_.getExternalFunctionExecutor()
            var cache_: com.gs.dmn.runtime.cache.Cache = context_.getCache()
            val bureauCallTypeStartTime_ = System.currentTimeMillis()
            val bureauCallTypeArguments_ = com.gs.dmn.runtime.listener.Arguments()
            bureauCallTypeArguments_.put("ApplicantData", applicantData)
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, bureauCallTypeArguments_)

            // Evaluate decision 'BureauCallType'
            val output_: String? = evaluate(applicantData, context_)

            // End decision 'BureauCallType'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, bureauCallTypeArguments_, output_, (System.currentTimeMillis() - bureauCallTypeStartTime_))

            return output_
        } catch (e: Exception) {
            logError("Exception caught in 'BureauCallType' evaluation", e)
            return null
        }
    }

    fun applyProto(bureauCallTypeRequest_: proto.BureauCallTypeRequest, context_: com.gs.dmn.runtime.ExecutionContext): proto.BureauCallTypeResponse {
        // Create arguments from Request Message
        val applicantData: type.TApplicantData? = type.TApplicantData.toTApplicantData(bureauCallTypeRequest_.getApplicantData())

        // Invoke apply method
        val output_: String? = apply(applicantData, context_)

        // Convert output to Response Message
        val builder_: proto.BureauCallTypeResponse.Builder = proto.BureauCallTypeResponse.newBuilder()
        val outputProto_ = (if (output_ == null) "" else output_!!)
        builder_.setBureauCallType(outputProto_)
        return builder_.build()
    }

    private inline fun evaluate(applicantData: type.TApplicantData?, context_: com.gs.dmn.runtime.ExecutionContext): String? {
        var annotationSet_: com.gs.dmn.runtime.annotation.AnnotationSet = context_.getAnnotations()
        var eventListener_: com.gs.dmn.runtime.listener.EventListener = context_.getEventListener()
        var externalExecutor_: com.gs.dmn.runtime.external.ExternalFunctionExecutor = context_.getExternalFunctionExecutor()
        var cache_: com.gs.dmn.runtime.cache.Cache = context_.getCache()
        // Apply child decisions
        val preBureauRiskCategory: String? = this@BureauCallType.preBureauRiskCategory.apply(applicantData, context_)

        return BureauCallTypeTable.instance().apply(preBureauRiskCategory, context_) as String?
    }

    companion object {
        val DRG_ELEMENT_METADATA : com.gs.dmn.runtime.listener.DRGElement = com.gs.dmn.runtime.listener.DRGElement(
            "",
            "BureauCallType",
            "",
            com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
            com.gs.dmn.runtime.annotation.ExpressionKind.INVOCATION,
            com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
            -1
        )

        @JvmStatic
        fun requestToMap(bureauCallTypeRequest_: proto.BureauCallTypeRequest): kotlin.collections.Map<String, Any?> {
            // Create arguments from Request Message
            val applicantData: type.TApplicantData? = type.TApplicantData.toTApplicantData(bureauCallTypeRequest_.getApplicantData())

            // Create map
            val map_: kotlin.collections.MutableMap<String, Any?> = mutableMapOf()
            map_.put("ApplicantData", applicantData)
            return map_
        }

        @JvmStatic
        fun responseToOutput(bureauCallTypeResponse_: proto.BureauCallTypeResponse): String? {
            // Extract and convert output
            return bureauCallTypeResponse_.getBureauCallType()
        }
    }
}
