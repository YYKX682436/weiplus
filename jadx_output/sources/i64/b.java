package i64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289077a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f289078b;

    /* renamed from: c, reason: collision with root package name */
    public final a44.a f289079c;

    public b(java.lang.String str, boolean z17, a44.a aVar) {
        this.f289077a = str;
        this.f289078b = z17;
        this.f289079c = aVar;
    }

    public final a44.a a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return this.f289079c;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return true;
        }
        if (!(obj instanceof i64.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        i64.b bVar = (i64.b) obj;
        if (!kotlin.jvm.internal.o.b(this.f289077a, bVar.f289077a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        if (this.f289078b != bVar.f289078b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f289079c, bVar.f289079c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        java.lang.String str = this.f289077a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f289078b)) * 31;
        a44.a aVar = this.f289079c;
        int hashCode2 = hashCode + (aVar != null ? aVar.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        java.lang.String str = "AdComplianceData(snsId=" + this.f289077a + ", shouldShow=" + this.f289078b + ", data=" + this.f289079c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return str;
    }

    public /* synthetic */ b(java.lang.String str, boolean z17, a44.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, z17, (i17 & 4) != 0 ? null : aVar);
    }
}
