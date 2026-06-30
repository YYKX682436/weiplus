package n34;

/* loaded from: classes4.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final n34.x3 f334767a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f334768b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f334769c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ed4 f334770d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334771e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f334772f;

    public w3(n34.x3 type, byte[] bArr, java.lang.String str, r45.ed4 ed4Var, int i17, java.util.ArrayList arrayList, int i18, kotlin.jvm.internal.i iVar) {
        bArr = (i18 & 2) != 0 ? null : bArr;
        str = (i18 & 4) != 0 ? null : str;
        ed4Var = (i18 & 8) != 0 ? null : ed4Var;
        i17 = (i18 & 16) != 0 ? -1 : i17;
        arrayList = (i18 & 32) != 0 ? null : arrayList;
        kotlin.jvm.internal.o.g(type, "type");
        this.f334767a = type;
        this.f334768b = bArr;
        this.f334769c = str;
        this.f334770d = ed4Var;
        this.f334771e = i17;
        this.f334772f = arrayList;
    }

    public final r45.ed4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return this.f334770d;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return true;
        }
        if (!(obj instanceof n34.w3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        n34.w3 w3Var = (n34.w3) obj;
        if (this.f334767a != w3Var.f334767a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f334768b, w3Var.f334768b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f334769c, w3Var.f334769c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f334770d, w3Var.f334770d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (this.f334771e != w3Var.f334771e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f334772f, w3Var.f334772f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        int hashCode = this.f334767a.hashCode() * 31;
        byte[] bArr = this.f334768b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f334769c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r45.ed4 ed4Var = this.f334770d;
        int hashCode4 = (((hashCode3 + (ed4Var == null ? 0 : ed4Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f334771e)) * 31;
        java.util.ArrayList arrayList = this.f334772f;
        int hashCode5 = hashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return hashCode5;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        java.lang.String str = "SnsPostFinderData(type=" + this.f334767a + ", compositionInfo=" + java.util.Arrays.toString(this.f334768b) + ", videoPath=" + this.f334769c + ", location=" + this.f334770d + ", videoSourceScene=" + this.f334771e + ", photos=" + this.f334772f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return str;
    }
}
