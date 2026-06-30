package ku3;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f312332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f312333b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f312334c;

    public n0(int i17, int i18, java.lang.String str) {
        this.f312332a = i17;
        this.f312333b = i18;
        this.f312334c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku3.n0)) {
            return false;
        }
        ku3.n0 n0Var = (ku3.n0) obj;
        return this.f312332a == n0Var.f312332a && this.f312333b == n0Var.f312333b && kotlin.jvm.internal.o.b(this.f312334c, n0Var.f312334c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f312332a) * 31) + java.lang.Integer.hashCode(this.f312333b)) * 31;
        java.lang.String str = this.f312334c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "HintData(hintType=" + this.f312332a + ", ctrType=" + this.f312333b + ", value=" + this.f312334c + ')';
    }

    public /* synthetic */ n0(int i17, int i18, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, i18, (i19 & 4) != 0 ? null : str);
    }
}
