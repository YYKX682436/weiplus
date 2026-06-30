package wd0;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public int f444752a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f444753b;

    /* renamed from: c, reason: collision with root package name */
    public zt5.s f444754c;

    public m2(int i17, java.lang.String errMsg, zt5.s sVar, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        errMsg = (i18 & 2) != 0 ? "" : errMsg;
        sVar = (i18 & 4) != 0 ? null : sVar;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f444752a = i17;
        this.f444753b = errMsg;
        this.f444754c = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.m2)) {
            return false;
        }
        wd0.m2 m2Var = (wd0.m2) obj;
        return this.f444752a == m2Var.f444752a && kotlin.jvm.internal.o.b(this.f444753b, m2Var.f444753b) && kotlin.jvm.internal.o.b(this.f444754c, m2Var.f444754c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f444752a) * 31) + this.f444753b.hashCode()) * 31;
        zt5.s sVar = this.f444754c;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "SoterSignatureResultParam(errCode=" + this.f444752a + ", errMsg=" + this.f444753b + ", resultInfo=" + this.f444754c + ')';
    }
}
