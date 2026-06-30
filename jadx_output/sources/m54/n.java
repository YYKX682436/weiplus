package m54;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f324292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f324293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f324294c;

    /* renamed from: d, reason: collision with root package name */
    public final long f324295d;

    public n(java.lang.String url, int i17, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f324292a = url;
        this.f324293b = i17;
        this.f324294c = str;
        this.f324295d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return true;
        }
        if (!(obj instanceof m54.n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        m54.n nVar = (m54.n) obj;
        if (!kotlin.jvm.internal.o.b(this.f324292a, nVar.f324292a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        if (this.f324293b != nVar.f324293b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f324294c, nVar.f324294c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        long j17 = this.f324295d;
        long j18 = nVar.f324295d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        int hashCode = ((this.f324292a.hashCode() * 31) + java.lang.Integer.hashCode(this.f324293b)) * 31;
        java.lang.String str = this.f324294c;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f324295d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        java.lang.String str = "PreloadResNode(url=" + this.f324292a + ", type=" + this.f324293b + ", md5=" + this.f324294c + ", size=" + this.f324295d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return str;
    }
}
