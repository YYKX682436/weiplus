package s34;

/* loaded from: classes4.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402821b;

    public w1(java.lang.String aidString, java.lang.String tidString) {
        kotlin.jvm.internal.o.g(aidString, "aidString");
        kotlin.jvm.internal.o.g(tidString, "tidString");
        this.f402820a = aidString;
        this.f402821b = tidString;
    }

    public final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("aid", this.f402820a);
        jSONObject.put("tid", this.f402821b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return true;
        }
        if (!(obj instanceof s34.w1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return false;
        }
        s34.w1 w1Var = (s34.w1) obj;
        if (!kotlin.jvm.internal.o.b(this.f402820a, w1Var.f402820a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f402821b, w1Var.f402821b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        int hashCode = (this.f402820a.hashCode() * 31) + this.f402821b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        java.lang.String str = "SubAdRecord(aidString=" + this.f402820a + ", tidString=" + this.f402821b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return str;
    }
}
