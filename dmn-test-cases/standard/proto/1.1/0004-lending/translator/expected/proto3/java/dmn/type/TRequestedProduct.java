package type;

import java.util.*;

@javax.annotation.Generated(value = {"itemDefinitionInterface.ftl", "tRequestedProduct"})
@com.fasterxml.jackson.annotation.JsonPropertyOrder(alphabetic = true)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = type.TRequestedProductImpl.class)
public interface TRequestedProduct extends com.gs.dmn.runtime.DMNType {
    static TRequestedProduct toTRequestedProduct(Object other) {
        if (other == null) {
            return null;
        } else if (TRequestedProduct.class.isAssignableFrom(other.getClass())) {
            return (TRequestedProduct)other;
        } else if (other instanceof com.gs.dmn.runtime.Context) {
            TRequestedProductImpl result_ = new TRequestedProductImpl();
            if (((com.gs.dmn.runtime.Context)other).keySet().contains("ProductType")) {
                result_.setProductType((String)((com.gs.dmn.runtime.Context)other).get("ProductType"));
            } else {
                return  null;
            }
            if (((com.gs.dmn.runtime.Context)other).keySet().contains("Amount")) {
                result_.setAmount((java.math.BigDecimal)((com.gs.dmn.runtime.Context)other).get("Amount"));
            } else {
                return  null;
            }
            if (((com.gs.dmn.runtime.Context)other).keySet().contains("Rate")) {
                result_.setRate((java.math.BigDecimal)((com.gs.dmn.runtime.Context)other).get("Rate"));
            } else {
                return  null;
            }
            if (((com.gs.dmn.runtime.Context)other).keySet().contains("Term")) {
                result_.setTerm((java.math.BigDecimal)((com.gs.dmn.runtime.Context)other).get("Term"));
            } else {
                return  null;
            }
            return result_;
        } else if (other instanceof com.gs.dmn.runtime.DMNType) {
            return toTRequestedProduct(((com.gs.dmn.runtime.DMNType)other).toContext());
        } else if (other instanceof proto.TRequestedProduct) {
            TRequestedProductImpl result_ = new TRequestedProductImpl();
            result_.setProductType(((proto.TRequestedProduct) other).getProductType());
            result_.setAmount(java.math.BigDecimal.valueOf(((proto.TRequestedProduct) other).getAmount()));
            result_.setRate(java.math.BigDecimal.valueOf(((proto.TRequestedProduct) other).getRate()));
            result_.setTerm(java.math.BigDecimal.valueOf(((proto.TRequestedProduct) other).getTerm()));
            return result_;
        } else {
            throw new com.gs.dmn.runtime.DMNRuntimeException(String.format("Cannot convert '%s' to '%s'", other.getClass().getSimpleName(), TRequestedProduct.class.getSimpleName()));
        }
    }

    static proto.TRequestedProduct toProto(TRequestedProduct other) {
        proto.TRequestedProduct.Builder result_ = proto.TRequestedProduct.newBuilder();
        if (other != null) {
            String productTypeProto_ = (((TRequestedProduct) other).getProductType() == null ? "" : ((TRequestedProduct) other).getProductType());
            result_.setProductType(productTypeProto_);
            Double amountProto_ = (((TRequestedProduct) other).getAmount() == null ? 0.0 : ((TRequestedProduct) other).getAmount().doubleValue());
            result_.setAmount(amountProto_);
            Double rateProto_ = (((TRequestedProduct) other).getRate() == null ? 0.0 : ((TRequestedProduct) other).getRate().doubleValue());
            result_.setRate(rateProto_);
            Double termProto_ = (((TRequestedProduct) other).getTerm() == null ? 0.0 : ((TRequestedProduct) other).getTerm().doubleValue());
            result_.setTerm(termProto_);
        }
        return result_.build();
    }

    static List<proto.TRequestedProduct> toProto(List<TRequestedProduct> other) {
        if (other == null) {
            return null;
        } else {
            return other.stream().map(o -> toProto(o)).collect(java.util.stream.Collectors.toList());
        }
    }

    @com.fasterxml.jackson.annotation.JsonGetter("ProductType")
    String getProductType();

    @com.fasterxml.jackson.annotation.JsonGetter("Amount")
    java.math.BigDecimal getAmount();

    @com.fasterxml.jackson.annotation.JsonGetter("Rate")
    java.math.BigDecimal getRate();

    @com.fasterxml.jackson.annotation.JsonGetter("Term")
    java.math.BigDecimal getTerm();

    default com.gs.dmn.runtime.Context toContext() {
        com.gs.dmn.runtime.Context context = new com.gs.dmn.runtime.Context();
        context.put("productType", getProductType());
        context.put("amount", getAmount());
        context.put("rate", getRate());
        context.put("term", getTerm());
        return context;
    }

    default boolean equalTo(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRequestedProduct other = (TRequestedProduct) o;
        if (this.getAmount() != null ? !this.getAmount().equals(other.getAmount()) : other.getAmount() != null) return false;
        if (this.getProductType() != null ? !this.getProductType().equals(other.getProductType()) : other.getProductType() != null) return false;
        if (this.getRate() != null ? !this.getRate().equals(other.getRate()) : other.getRate() != null) return false;
        if (this.getTerm() != null ? !this.getTerm().equals(other.getTerm()) : other.getTerm() != null) return false;

        return true;
    }

    default int hash() {
        int result = 0;
        result = 31 * result + (this.getAmount() != null ? this.getAmount().hashCode() : 0);
        result = 31 * result + (this.getProductType() != null ? this.getProductType().hashCode() : 0);
        result = 31 * result + (this.getRate() != null ? this.getRate().hashCode() : 0);
        result = 31 * result + (this.getTerm() != null ? this.getTerm().hashCode() : 0);
        return result;
    }

    default String asString() {
        StringBuilder result_ = new StringBuilder("{");
        result_.append("Amount=" + getAmount());
        result_.append(", ProductType=" + getProductType());
        result_.append(", Rate=" + getRate());
        result_.append(", Term=" + getTerm());
        result_.append("}");
        return result_.toString();
    }
}
