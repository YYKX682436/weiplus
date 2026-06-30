package fc4;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f261177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f261178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f261179c;

    public k(int i17, java.lang.String session, long j17) {
        kotlin.jvm.internal.o.g(session, "session");
        this.f261177a = i17;
        this.f261178b = session;
        this.f261179c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return true;
        }
        if (!(obj instanceof fc4.k)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        fc4.k kVar = (fc4.k) obj;
        if (this.f261177a != kVar.f261177a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f261178b, kVar.f261178b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        long j17 = this.f261179c;
        long j18 = kVar.f261179c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        int hashCode = (((java.lang.Integer.hashCode(this.f261177a) * 31) + this.f261178b.hashCode()) * 31) + java.lang.Long.hashCode(this.f261179c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        java.lang.String str = "FlexibleReportData(scene=" + this.f261177a + ", session=" + this.f261178b + ", sessionTimestamp=" + this.f261179c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return str;
    }
}
