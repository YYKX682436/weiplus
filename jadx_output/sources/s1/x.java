package s1;

/* loaded from: classes14.dex */
public final class x implements s1.x0, p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final p2.s f402091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.f f402092e;

    public x(p2.f density, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(density, "density");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        this.f402091d = layoutDirection;
        this.f402092e = density;
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f402092e.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f402092e.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f402092e.R(f17);
    }

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map map, yz5.l lVar) {
        return s1.v0.a(this, i17, i18, map, lVar);
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f402092e.e(j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f402092e.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f402092e.getFontScale();
    }

    @Override // s1.u
    public p2.s getLayoutDirection() {
        return this.f402091d;
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f402092e.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f402092e.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f402092e.t(j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f402092e.z(f17);
    }
}
