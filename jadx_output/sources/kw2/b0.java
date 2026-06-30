package kw2;

/* loaded from: classes13.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f312890a;

    /* renamed from: b, reason: collision with root package name */
    public final long f312891b;

    /* renamed from: c, reason: collision with root package name */
    public final float f312892c;

    /* renamed from: d, reason: collision with root package name */
    public final float f312893d;

    public b0(long j17, long j18, float f17, float f18) {
        this.f312890a = j17;
        this.f312891b = j18;
        this.f312892c = f17;
        this.f312893d = f18;
    }

    public final float a() {
        return this.f312892c;
    }

    public final long b() {
        return this.f312891b;
    }

    public final long c() {
        return this.f312890a;
    }

    public final float d() {
        return this.f312893d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.b0)) {
            return false;
        }
        kw2.b0 b0Var = (kw2.b0) obj;
        return this.f312890a == b0Var.f312890a && this.f312891b == b0Var.f312891b && java.lang.Float.compare(this.f312892c, b0Var.f312892c) == 0 && java.lang.Float.compare(this.f312893d, b0Var.f312893d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f312890a) * 31) + java.lang.Long.hashCode(this.f312891b)) * 31) + java.lang.Float.hashCode(this.f312892c)) * 31) + java.lang.Float.hashCode(this.f312893d);
    }

    public java.lang.String toString() {
        return "BufferDurationStats(min=" + this.f312890a + ", max=" + this.f312891b + ", avg=" + this.f312892c + ", variance=" + this.f312893d + ')';
    }
}
