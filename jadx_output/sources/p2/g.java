package p2;

/* loaded from: classes14.dex */
public final class g implements p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final float f351378d;

    /* renamed from: e, reason: collision with root package name */
    public final float f351379e;

    public g(float f17, float f18) {
        this.f351378d = f17;
        this.f351379e = f18;
    }

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * getDensity();
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2.g)) {
            return false;
        }
        p2.g gVar = (p2.g) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f351378d), java.lang.Float.valueOf(gVar.f351378d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f351379e), java.lang.Float.valueOf(gVar.f351379e));
    }

    @Override // p2.f
    public float getDensity() {
        return this.f351378d;
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f351379e;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f351378d) * 31) + java.lang.Float.hashCode(this.f351379e);
    }

    @Override // p2.f
    public float n(int i17) {
        return i17 / getDensity();
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    public java.lang.String toString() {
        return "DensityImpl(density=" + this.f351378d + ", fontScale=" + this.f351379e + ')';
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}
