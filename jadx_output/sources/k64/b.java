package k64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f304583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304584b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f304585c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f304586d;

    public b(int i17, int i18, java.lang.String errMsg, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f304583a = i17;
        this.f304584b = i18;
        this.f304585c = errMsg;
        this.f304586d = obj;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f304584b;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f304583a;
    }

    public final java.lang.Object c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f304586d;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return true;
        }
        if (!(obj instanceof k64.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        k64.b bVar = (k64.b) obj;
        if (this.f304583a != bVar.f304583a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        if (this.f304584b != bVar.f304584b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f304585c, bVar.f304585c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f304586d, bVar.f304586d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        int hashCode = ((((java.lang.Integer.hashCode(this.f304583a) * 31) + java.lang.Integer.hashCode(this.f304584b)) * 31) + this.f304585c.hashCode()) * 31;
        java.lang.Object obj = this.f304586d;
        int hashCode2 = hashCode + (obj == null ? 0 : obj.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        java.lang.String str = "CgiResult(errType=" + this.f304583a + ", errCode=" + this.f304584b + ", errMsg=" + this.f304585c + ", resp=" + this.f304586d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return str;
    }
}
