package q1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f359484a;

    /* renamed from: b, reason: collision with root package name */
    public final float f359485b;

    public c(java.util.List coefficients, float f17) {
        kotlin.jvm.internal.o.g(coefficients, "coefficients");
        this.f359484a = coefficients;
        this.f359485b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.c)) {
            return false;
        }
        q1.c cVar = (q1.c) obj;
        return kotlin.jvm.internal.o.b(this.f359484a, cVar.f359484a) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f359485b), java.lang.Float.valueOf(cVar.f359485b));
    }

    public int hashCode() {
        return (this.f359484a.hashCode() * 31) + java.lang.Float.hashCode(this.f359485b);
    }

    public java.lang.String toString() {
        return "PolynomialFit(coefficients=" + this.f359484a + ", confidence=" + this.f359485b + ')';
    }
}
