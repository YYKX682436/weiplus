package ka4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ka4.b f306113a;

    /* renamed from: b, reason: collision with root package name */
    public final long f306114b;

    /* renamed from: c, reason: collision with root package name */
    public long f306115c;

    public a(ka4.b predictType, long j17, long j18) {
        kotlin.jvm.internal.o.g(predictType, "predictType");
        this.f306113a = predictType;
        this.f306114b = j17;
        this.f306115c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return true;
        }
        if (!(obj instanceof ka4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        ka4.a aVar = (ka4.a) obj;
        if (this.f306113a != aVar.f306113a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        if (this.f306114b != aVar.f306114b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        long j17 = this.f306115c;
        long j18 = aVar.f306115c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        int hashCode = (((this.f306113a.hashCode() * 31) + java.lang.Long.hashCode(this.f306114b)) * 31) + java.lang.Long.hashCode(this.f306115c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        java.lang.String str = "KaraPredictItem(predictType=" + this.f306113a + ", predictStartTime=" + this.f306114b + ", predictCost=" + this.f306115c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return str;
    }
}
