package ta4;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f416731a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f416732b;

    public c1(int i17, java.util.List pathList) {
        kotlin.jvm.internal.o.g(pathList, "pathList");
        this.f416731a = i17;
        this.f416732b = pathList;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return true;
        }
        if (!(obj instanceof ta4.c1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return false;
        }
        ta4.c1 c1Var = (ta4.c1) obj;
        if (this.f416731a != c1Var.f416731a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f416732b, c1Var.f416732b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        int hashCode = (java.lang.Integer.hashCode(this.f416731a) * 31) + this.f416732b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        java.lang.String str = "SnsPostMediaMetaDataSource(type=" + this.f416731a + ", pathList=" + this.f416732b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return str;
    }
}
