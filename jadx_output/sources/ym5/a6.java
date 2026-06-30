package ym5;

/* loaded from: classes8.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final double f463198a;

    /* renamed from: b, reason: collision with root package name */
    public final double f463199b;

    /* renamed from: c, reason: collision with root package name */
    public final double f463200c;

    /* renamed from: d, reason: collision with root package name */
    public final double f463201d;

    /* renamed from: e, reason: collision with root package name */
    public final int f463202e;

    public a6(double d17, double d18, double d19, double d27, int i17) {
        this.f463198a = d17;
        this.f463199b = d18;
        this.f463200c = d19;
        this.f463201d = d27;
        this.f463202e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.a6)) {
            return false;
        }
        ym5.a6 a6Var = (ym5.a6) obj;
        return java.lang.Double.compare(this.f463198a, a6Var.f463198a) == 0 && java.lang.Double.compare(this.f463199b, a6Var.f463199b) == 0 && java.lang.Double.compare(this.f463200c, a6Var.f463200c) == 0 && java.lang.Double.compare(this.f463201d, a6Var.f463201d) == 0 && this.f463202e == a6Var.f463202e;
    }

    public int hashCode() {
        return (((((((java.lang.Double.hashCode(this.f463198a) * 31) + java.lang.Double.hashCode(this.f463199b)) * 31) + java.lang.Double.hashCode(this.f463200c)) * 31) + java.lang.Double.hashCode(this.f463201d)) * 31) + java.lang.Integer.hashCode(this.f463202e);
    }

    public java.lang.String toString() {
        return "LayoutConfig(X_width=" + this.f463198a + ", X_height=" + this.f463199b + ", X_WideScreenWidth=" + this.f463200c + ", X_WideScreenHeight=" + this.f463201d + ", gravity=" + this.f463202e + ')';
    }

    public /* synthetic */ a6(double d17, double d18, double d19, double d27, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0.0d : d17, (i18 & 2) != 0 ? 0.0d : d18, (i18 & 4) != 0 ? 0.0d : d19, (i18 & 8) == 0 ? d27 : 0.0d, (i18 & 16) != 0 ? 17 : i17);
    }
}
