package g05;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final double f267495a;

    /* renamed from: b, reason: collision with root package name */
    public final double f267496b;

    public t(double d17, double d18) {
        this.f267495a = d17;
        this.f267496b = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g05.t)) {
            return false;
        }
        g05.t tVar = (g05.t) obj;
        return java.lang.Double.compare(this.f267495a, tVar.f267495a) == 0 && java.lang.Double.compare(this.f267496b, tVar.f267496b) == 0;
    }

    public int hashCode() {
        return (java.lang.Double.hashCode(this.f267495a) * 31) + java.lang.Double.hashCode(this.f267496b);
    }

    public java.lang.String toString() {
        return "WxGameCardViewInfo(offsetHeight=" + this.f267495a + ", offsetTop=" + this.f267496b + ')';
    }
}
