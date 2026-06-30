package ym5;

/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final double f463266a;

    /* renamed from: b, reason: collision with root package name */
    public final double f463267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f463268c;

    public e6(double d17, double d18, int i17, int i18, kotlin.jvm.internal.i iVar) {
        d17 = (i18 & 1) != 0 ? 0.0d : d17;
        d18 = (i18 & 2) != 0 ? 0.0d : d18;
        i17 = (i18 & 4) != 0 ? 17 : i17;
        this.f463266a = d17;
        this.f463267b = d18;
        this.f463268c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.e6)) {
            return false;
        }
        ym5.e6 e6Var = (ym5.e6) obj;
        return java.lang.Double.compare(this.f463266a, e6Var.f463266a) == 0 && java.lang.Double.compare(this.f463267b, e6Var.f463267b) == 0 && this.f463268c == e6Var.f463268c;
    }

    public int hashCode() {
        return (((java.lang.Double.hashCode(this.f463266a) * 31) + java.lang.Double.hashCode(this.f463267b)) * 31) + java.lang.Integer.hashCode(this.f463268c);
    }

    public java.lang.String toString() {
        return "LayoutConfig(X_width=" + this.f463266a + ", X_height=" + this.f463267b + ", gravity=" + this.f463268c + ')';
    }
}
