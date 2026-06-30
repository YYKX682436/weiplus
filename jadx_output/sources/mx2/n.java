package mx2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f332507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f332510d;

    public n(int i17, int i18, int i19, int i27) {
        this.f332507a = i17;
        this.f332508b = i18;
        this.f332509c = i19;
        this.f332510d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx2.n)) {
            return false;
        }
        mx2.n nVar = (mx2.n) obj;
        return this.f332507a == nVar.f332507a && this.f332508b == nVar.f332508b && this.f332509c == nVar.f332509c && this.f332510d == nVar.f332510d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f332507a) * 31) + java.lang.Integer.hashCode(this.f332508b)) * 31) + java.lang.Integer.hashCode(this.f332509c)) * 31) + java.lang.Integer.hashCode(this.f332510d);
    }

    public java.lang.String toString() {
        return "CalcContext(itemViewTopInWindow=" + this.f332507a + ", footerChildTopInItem=" + this.f332508b + ", defaultMargin=" + this.f332509c + ", safeSpacing=" + this.f332510d + ')';
    }
}
