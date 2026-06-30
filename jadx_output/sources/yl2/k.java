package yl2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f463034a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f463035b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.j01 f463036c;

    public k(int i17, java.lang.String str, r45.j01 j01Var) {
        this.f463034a = i17;
        this.f463035b = str;
        this.f463036c = j01Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.k)) {
            return false;
        }
        yl2.k kVar = (yl2.k) obj;
        return this.f463034a == kVar.f463034a && kotlin.jvm.internal.o.b(this.f463035b, kVar.f463035b) && kotlin.jvm.internal.o.b(this.f463036c, kVar.f463036c);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f463034a) * 31;
        java.lang.String str = this.f463035b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r45.j01 j01Var = this.f463036c;
        return hashCode2 + (j01Var != null ? j01Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LivePrepareInfo(errCode=" + this.f463034a + ", errMsg=" + this.f463035b + ", resp=" + this.f463036c + ')';
    }
}
