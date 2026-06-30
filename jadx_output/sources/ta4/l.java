package ta4;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f416796a;

    /* renamed from: b, reason: collision with root package name */
    public int f416797b;

    /* renamed from: c, reason: collision with root package name */
    public int f416798c;

    public l(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f416796a = i17;
        this.f416797b = i18;
        this.f416798c = i19;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        int i17 = this.f416798c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i17;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("pendingQueueSize", this.f416796a);
        jSONObject.put("downloadingQueueSize", this.f416797b);
        java.lang.String a17 = ta4.v0.a(jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        return a17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return true;
        }
        if (!(obj instanceof ta4.l)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        ta4.l lVar = (ta4.l) obj;
        if (this.f416796a != lVar.f416796a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        if (this.f416797b != lVar.f416797b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        int i17 = this.f416798c;
        int i18 = lVar.f416798c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        int hashCode = (((java.lang.Integer.hashCode(this.f416796a) * 31) + java.lang.Integer.hashCode(this.f416797b)) * 31) + java.lang.Integer.hashCode(this.f416798c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        java.lang.String str = "[pending:" + this.f416796a + ", downloading:" + this.f416797b + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        return str;
    }
}
