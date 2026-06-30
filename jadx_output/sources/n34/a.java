package n34;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f334535a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334537c;

    /* renamed from: d, reason: collision with root package name */
    public final int f334538d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.ABAPrams f334539e;

    public a(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams) {
        this.f334535a = i17;
        this.f334536b = i18;
        this.f334537c = i19;
        this.f334538d = i27;
        this.f334539e = aBAPrams;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        return this.f334538d;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return true;
        }
        if (!(obj instanceof n34.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        n34.a aVar = (n34.a) obj;
        if (this.f334535a != aVar.f334535a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f334536b != aVar.f334536b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f334537c != aVar.f334537c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f334538d != aVar.f334538d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f334539e, aVar.f334539e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ABAResult");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f334535a) * 31) + java.lang.Integer.hashCode(this.f334536b)) * 31) + java.lang.Integer.hashCode(this.f334537c)) * 31) + java.lang.Integer.hashCode(this.f334538d)) * 31;
        com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = this.f334539e;
        int hashCode2 = hashCode + (aBAPrams == null ? 0 : aBAPrams.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ABAResult");
        java.lang.String str = "ABAResult(errCode=" + this.f334535a + ", width=" + this.f334536b + ", height=" + this.f334537c + ", bitrate=" + this.f334538d + ", abaParams=" + this.f334539e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ABAResult");
        return str;
    }
}
