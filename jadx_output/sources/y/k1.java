package y;

/* loaded from: classes14.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f458382a;

    /* renamed from: b, reason: collision with root package name */
    public final float f458383b;

    public k1(float f17, p2.f density) {
        kotlin.jvm.internal.o.g(density, "density");
        this.f458382a = f17;
        float density2 = density.getDensity();
        float f18 = y.l1.f458394a;
        this.f458383b = density2 * 386.0878f * 160.0f * 0.84f;
    }

    public final y.j1 a(float f17) {
        double b17 = b(f17);
        float f18 = y.l1.f458394a;
        double d17 = f18 - 1.0d;
        return new y.j1(f17, (float) (this.f458382a * this.f458383b * java.lang.Math.exp((f18 / d17) * b17)), (long) (java.lang.Math.exp(b17 / d17) * 1000.0d));
    }

    public final double b(float f17) {
        y.b bVar = y.b.f458309a;
        return java.lang.Math.log((java.lang.Math.abs(f17) * 0.35f) / (this.f458382a * this.f458383b));
    }
}
