package f1;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f258462a;

    /* renamed from: b, reason: collision with root package name */
    public final float f258463b;

    public a0(float f17, float f18) {
        this.f258462a = f17;
        this.f258463b = f18;
    }

    public final float[] a() {
        float f17 = this.f258462a;
        float f18 = this.f258463b;
        return new float[]{f17 / f18, 1.0f, ((1.0f - f17) - f18) / f18};
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1.a0)) {
            return false;
        }
        f1.a0 a0Var = (f1.a0) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f258462a), java.lang.Float.valueOf(a0Var.f258462a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f258463b), java.lang.Float.valueOf(a0Var.f258463b));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f258462a) * 31) + java.lang.Float.hashCode(this.f258463b);
    }

    public java.lang.String toString() {
        return "WhitePoint(x=" + this.f258462a + ", y=" + this.f258463b + ')';
    }
}
