package l94;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final l94.m f317374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f317375b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f317376c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.x30 f317377d;

    public l(l94.m eventType, int i17, java.lang.String traceId, r45.x30 x30Var) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        this.f317374a = eventType;
        this.f317375b = i17;
        this.f317376c = traceId;
        this.f317377d = x30Var;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            return true;
        }
        if (!(obj instanceof l94.l)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            return false;
        }
        l94.l lVar = (l94.l) obj;
        if (this.f317374a != lVar.f317374a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            return false;
        }
        if (this.f317375b != lVar.f317375b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f317376c, lVar.f317376c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f317377d, lVar.f317377d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        int hashCode = ((((this.f317374a.hashCode() * 31) + java.lang.Integer.hashCode(this.f317375b)) * 31) + this.f317376c.hashCode()) * 31;
        r45.x30 x30Var = this.f317377d;
        int hashCode2 = hashCode + (x30Var == null ? 0 : x30Var.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        java.lang.String str = "WsFoldAdCompEventData(eventType=" + this.f317374a + ", clickPos=" + this.f317375b + ", traceId=" + this.f317376c + ", clickInfo=" + this.f317377d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        return str;
    }
}
