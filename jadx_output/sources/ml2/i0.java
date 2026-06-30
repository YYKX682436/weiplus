package ml2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f327544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327545b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f327546c;

    public i0(int i17, int i18, java.lang.String str) {
        this.f327544a = i17;
        this.f327545b = i18;
        this.f327546c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.i0)) {
            return false;
        }
        ml2.i0 i0Var = (ml2.i0) obj;
        return this.f327544a == i0Var.f327544a && this.f327545b == i0Var.f327545b && kotlin.jvm.internal.o.b(this.f327546c, i0Var.f327546c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f327544a) * 31) + java.lang.Integer.hashCode(this.f327545b)) * 31;
        java.lang.String str = this.f327546c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "CgiErrorInfo(errType=" + this.f327544a + ", errCode=" + this.f327545b + ", errMsg=" + this.f327546c + ')';
    }
}
