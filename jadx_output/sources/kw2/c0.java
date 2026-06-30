package kw2;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f312897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f312898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f312899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f312900d;

    public c0(int i17, int i18, int i19, int i27) {
        this.f312897a = i17;
        this.f312898b = i18;
        this.f312899c = i19;
        this.f312900d = i27;
    }

    public final int a() {
        return this.f312900d;
    }

    public final int b() {
        return this.f312898b;
    }

    public final int c() {
        return this.f312899c;
    }

    public final int d() {
        return this.f312897a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.c0)) {
            return false;
        }
        kw2.c0 c0Var = (kw2.c0) obj;
        return this.f312897a == c0Var.f312897a && this.f312898b == c0Var.f312898b && this.f312899c == c0Var.f312899c && this.f312900d == c0Var.f312900d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f312897a) * 31) + java.lang.Integer.hashCode(this.f312898b)) * 31) + java.lang.Integer.hashCode(this.f312899c)) * 31) + java.lang.Integer.hashCode(this.f312900d);
    }

    public java.lang.String toString() {
        return "RangeCounts(zeroToX=" + this.f312897a + ", xToY=" + this.f312898b + ", yToZ=" + this.f312899c + ", greaterOrEqualToZ=" + this.f312900d + ')';
    }
}
