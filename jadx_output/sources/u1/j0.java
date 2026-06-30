package u1;

/* loaded from: classes14.dex */
public final class j0 implements s1.x0, p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f423607d;

    public j0(u1.w wVar) {
        this.f423607d = wVar;
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

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map map, yz5.l lVar) {
        return s1.v0.a(this, i17, i18, map, lVar);
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f423607d.f423698v.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f423607d.f423698v.getFontScale();
    }

    @Override // s1.u
    public p2.s getLayoutDirection() {
        return this.f423607d.f423700x;
    }

    @Override // p2.f
    public float n(int i17) {
        return p2.e.b(this, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}
