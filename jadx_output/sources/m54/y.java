package m54;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f324315a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f324316b;

    /* renamed from: c, reason: collision with root package name */
    public final long f324317c;

    public y(java.lang.String dynamicCanvas, java.lang.String onetimeCanvas, long j17) {
        kotlin.jvm.internal.o.g(dynamicCanvas, "dynamicCanvas");
        kotlin.jvm.internal.o.g(onetimeCanvas, "onetimeCanvas");
        this.f324315a = dynamicCanvas;
        this.f324316b = onetimeCanvas;
        this.f324317c = j17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return this.f324315a;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return this.f324316b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return true;
        }
        if (!(obj instanceof m54.y)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        m54.y yVar = (m54.y) obj;
        if (!kotlin.jvm.internal.o.b(this.f324315a, yVar.f324315a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f324316b, yVar.f324316b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        long j17 = this.f324317c;
        long j18 = yVar.f324317c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        int hashCode = (((this.f324315a.hashCode() * 31) + this.f324316b.hashCode()) * 31) + java.lang.Long.hashCode(this.f324317c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        java.lang.String str = "PageElement(dynamicCanvas=" + this.f324315a + ", onetimeCanvas=" + this.f324316b + ", localCacheTime=" + this.f324317c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return str;
    }
}
