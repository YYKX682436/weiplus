package xm1;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final cv.u0 f455183a;

    public o(m3.a audioRouteConsumer) {
        kotlin.jvm.internal.o.g(audioRouteConsumer, "audioRouteConsumer");
        cv.u0 u0Var = new cv.u0(audioRouteConsumer, 1);
        this.f455183a = u0Var;
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(u0Var);
    }

    public final java.util.List a() {
        return ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).rj();
    }

    public final void b() {
        i95.m c17 = i95.n0.c(cv.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cv.w0.f9((cv.w0) c17, 0, null, 2, null);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).oj(this.f455183a);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).release();
    }

    public final boolean c(int i17, boolean z17) {
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).qj(i17, z17);
        return true;
    }
}
