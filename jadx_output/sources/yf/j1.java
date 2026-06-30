package yf;

/* loaded from: classes11.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final double f461403a;

    /* renamed from: b, reason: collision with root package name */
    public final double f461404b;

    /* renamed from: c, reason: collision with root package name */
    public final double f461405c;

    /* renamed from: d, reason: collision with root package name */
    public final double f461406d;

    public j1(double d17, double d18, double d19, double d27) {
        this.f461403a = d17;
        this.f461404b = d18;
        this.f461405c = d19;
        this.f461406d = d27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.j1)) {
            return false;
        }
        yf.j1 j1Var = (yf.j1) obj;
        return java.lang.Double.compare(this.f461403a, j1Var.f461403a) == 0 && java.lang.Double.compare(this.f461404b, j1Var.f461404b) == 0 && java.lang.Double.compare(this.f461405c, j1Var.f461405c) == 0 && java.lang.Double.compare(this.f461406d, j1Var.f461406d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Double.hashCode(this.f461403a) * 31) + java.lang.Double.hashCode(this.f461404b)) * 31) + java.lang.Double.hashCode(this.f461405c)) * 31) + java.lang.Double.hashCode(this.f461406d);
    }

    public java.lang.String toString() {
        return "Position(x1=" + this.f461403a + ", y1=" + this.f461404b + ", x2=" + this.f461405c + ", y2=" + this.f461406d + ')';
    }
}
