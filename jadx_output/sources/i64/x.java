package i64;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289352a;

    /* renamed from: b, reason: collision with root package name */
    public final long f289353b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONArray f289354c;

    public x(java.lang.String respString, long j17, org.json.JSONArray attrArray) {
        kotlin.jvm.internal.o.g(respString, "respString");
        kotlin.jvm.internal.o.g(attrArray, "attrArray");
        this.f289352a = respString;
        this.f289353b = j17;
        this.f289354c = attrArray;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return true;
        }
        if (!(obj instanceof i64.x)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        i64.x xVar = (i64.x) obj;
        if (!kotlin.jvm.internal.o.b(this.f289352a, xVar.f289352a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        if (this.f289353b != xVar.f289353b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f289354c, xVar.f289354c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        int hashCode = (((this.f289352a.hashCode() * 31) + java.lang.Long.hashCode(this.f289353b)) * 31) + this.f289354c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        java.lang.String str = "LivingProductResp(respString=" + this.f289352a + ", productId=" + this.f289353b + ", attrArray=" + this.f289354c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return str;
    }
}
