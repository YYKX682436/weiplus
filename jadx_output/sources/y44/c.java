package y44;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f459360a;

    /* renamed from: b, reason: collision with root package name */
    public final long f459361b;

    /* renamed from: c, reason: collision with root package name */
    public final long f459362c;

    /* renamed from: d, reason: collision with root package name */
    public final y44.b f459363d;

    public c(java.lang.String pkg, long j17, long j18, y44.b bVar) {
        kotlin.jvm.internal.o.g(pkg, "pkg");
        this.f459360a = pkg;
        this.f459361b = j17;
        this.f459362c = j18;
        this.f459363d = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return true;
        }
        if (!(obj instanceof y44.c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        y44.c cVar = (y44.c) obj;
        if (!kotlin.jvm.internal.o.b(this.f459360a, cVar.f459360a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        if (this.f459361b != cVar.f459361b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        if (this.f459362c != cVar.f459362c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f459363d, cVar.f459363d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        int hashCode = ((((this.f459360a.hashCode() * 31) + java.lang.Long.hashCode(this.f459361b)) * 31) + java.lang.Long.hashCode(this.f459362c)) * 31;
        y44.b bVar = this.f459363d;
        int hashCode2 = hashCode + (bVar == null ? 0 : bVar.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        java.lang.String str = "InstallPkgData(pkg=" + this.f459360a + ", startTime=" + this.f459361b + ", delayDuration=" + this.f459362c + ", action=" + this.f459363d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return str;
    }
}
