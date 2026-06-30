package n34;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334551a;

    /* renamed from: b, reason: collision with root package name */
    public final long f334552b;

    /* renamed from: c, reason: collision with root package name */
    public final long f334553c;

    public b(java.lang.String path, long j17, long j18) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f334551a = path;
        this.f334552b = j17;
        this.f334553c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return true;
        }
        if (!(obj instanceof n34.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        n34.b bVar = (n34.b) obj;
        if (!kotlin.jvm.internal.o.b(this.f334551a, bVar.f334551a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        if (this.f334552b != bVar.f334552b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        long j17 = this.f334553c;
        long j18 = bVar.f334553c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        int hashCode = (((this.f334551a.hashCode() * 31) + java.lang.Long.hashCode(this.f334552b)) * 31) + java.lang.Long.hashCode(this.f334553c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        java.lang.String str = "ABAVideoInfo(path=" + this.f334551a + ", videoStart=" + this.f334552b + ", videoEnd=" + this.f334553c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return str;
    }
}
