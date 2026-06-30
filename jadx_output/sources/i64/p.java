package i64;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289270a;

    public p(java.lang.String str) {
        this.f289270a = str;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberTitle", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberTitle", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        return this.f289270a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
            return true;
        }
        if (!(obj instanceof i64.p)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f289270a, ((i64.p) obj).f289270a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        java.lang.String str = this.f289270a;
        int hashCode = str == null ? 0 : str.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        java.lang.String str = "AdContinuousCountWording(numberTitle=" + this.f289270a + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountWording");
        return str;
    }
}
