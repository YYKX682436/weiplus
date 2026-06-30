package u1;

/* loaded from: classes14.dex */
public final class o0 implements g1.i, g1.f {

    /* renamed from: d, reason: collision with root package name */
    public final g1.c f423652d;

    /* renamed from: e, reason: collision with root package name */
    public u1.o f423653e;

    public o0(g1.c canvasDrawScope, int i17, kotlin.jvm.internal.i iVar) {
        canvasDrawScope = (i17 & 1) != 0 ? new g1.c() : canvasDrawScope;
        kotlin.jvm.internal.o.g(canvasDrawScope, "canvasDrawScope");
        this.f423652d = canvasDrawScope;
    }

    @Override // g1.i
    public void A(long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.A(j17, j18, j19, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void F(long j17, long j18, long j19, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        this.f423652d.F(j17, j18, j19, f17, i17, q0Var, f18, zVar, i18);
    }

    @Override // p2.f
    public int G(float f17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.a(cVar, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.d(cVar, j17);
    }

    @Override // g1.i
    public void L(e1.r brush, long j17, long j18, long j19, float f17, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(brush, "brush");
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.L(brush, j17, j18, j19, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void M(long j17, long j18, long j19, long j27, g1.j style, float f17, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.M(j17, j18, j19, j27, style, f17, zVar, i17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * this.f423652d.getDensity();
    }

    @Override // g1.i
    public void T(e1.p0 path, e1.r brush, float f17, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(brush, "brush");
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.T(path, brush, f17, style, zVar, i17);
    }

    @Override // g1.i
    public void U(long j17, float f17, long j18, float f18, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.U(j17, f17, j18, f18, style, zVar, i17);
    }

    @Override // g1.i
    public long a() {
        return this.f423652d.a();
    }

    public void b() {
        e1.u a17 = ((g1.b) p()).a();
        u1.o oVar = this.f423653e;
        kotlin.jvm.internal.o.d(oVar);
        u1.o oVar2 = (u1.o) oVar.f423656f;
        if (oVar2 != null) {
            oVar2.c(a17);
        } else {
            oVar.f423654d.y0(a17);
        }
    }

    @Override // g1.i
    public void d(e1.r brush, long j17, long j18, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18) {
        kotlin.jvm.internal.o.g(brush, "brush");
        this.f423652d.d(brush, j17, j18, f17, i17, q0Var, f18, zVar, i18);
    }

    @Override // p2.f
    public long e(long j17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.c(cVar, j17);
    }

    @Override // g1.i
    public void f(e1.g0 image, long j17, float f17, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.f(image, j17, f17, style, zVar, i17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f423652d.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f423652d.getFontScale();
    }

    @Override // g1.i
    public p2.s getLayoutDirection() {
        return this.f423652d.f267506d.f267501b;
    }

    @Override // g1.i
    public void h(long j17, float f17, float f18, boolean z17, long j18, long j19, float f19, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.h(j17, f17, f18, z17, j18, j19, f19, style, zVar, i17);
    }

    @Override // p2.f
    public float n(int i17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.b(cVar, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / this.f423652d.getDensity();
    }

    @Override // g1.i
    public g1.g p() {
        return this.f423652d.f267507e;
    }

    @Override // g1.i
    public void q(e1.r brush, long j17, long j18, float f17, g1.j style, e1.z zVar, int i17) {
        kotlin.jvm.internal.o.g(brush, "brush");
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.q(brush, j17, j18, f17, style, zVar, i17);
    }

    @Override // g1.i
    public long r() {
        return this.f423652d.r();
    }

    @Override // p2.f
    public long t(long j17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.e(cVar, j17);
    }

    @Override // g1.i
    public void w(e1.g0 image, long j17, long j18, long j19, long j27, float f17, g1.j style, e1.z zVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(style, "style");
        this.f423652d.w(image, j17, j18, j19, j27, f17, style, zVar, i17, i18);
    }

    @Override // p2.f
    public long z(float f17) {
        g1.c cVar = this.f423652d;
        cVar.getClass();
        return p2.e.f(cVar, f17);
    }
}
