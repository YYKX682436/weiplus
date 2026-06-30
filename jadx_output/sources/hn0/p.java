package hn0;

/* loaded from: classes14.dex */
public final class p implements hn0.f {

    /* renamed from: a, reason: collision with root package name */
    public final hn0.h f282399a;

    /* renamed from: b, reason: collision with root package name */
    public final go0.f0 f282400b;

    /* renamed from: c, reason: collision with root package name */
    public final p05.v0 f282401c;

    /* renamed from: d, reason: collision with root package name */
    public final p05.t0 f282402d;

    /* renamed from: e, reason: collision with root package name */
    public final p05.u0 f282403e;

    /* renamed from: f, reason: collision with root package name */
    public double f282404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f282405g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f282406h;

    public p(hn0.h liveCore, go0.f0 renderManager) {
        kotlin.jvm.internal.o.g(liveCore, "liveCore");
        kotlin.jvm.internal.o.g(renderManager, "renderManager");
        this.f282399a = liveCore;
        this.f282400b = renderManager;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f282401c = new p05.h1();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f282402d = new p05.e1();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.f282403e = new p05.f1();
        this.f282406h = kotlinx.coroutines.z0.b();
        b();
    }

    public final void b() {
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        p05.v0 effect = this.f282401c;
        kotlin.jvm.internal.o.g(effect, "effect");
        f0Var.l(new go0.j(f0Var, effect));
    }

    public kn0.p c() {
        return ((tn0.w0) this.f282399a).D;
    }

    public void d(java.util.List res) {
        kotlin.jvm.internal.o.g(res, "res");
        p05.t0 effect = this.f282402d;
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        kotlin.jvm.internal.o.g(effect, "effect");
        f0Var.l(new go0.e(f0Var, effect));
        f0Var.l(new hn0.k(this, res));
    }

    public void e(double d17, boolean z17, boolean z18) {
        if (this.f282405g != z17 && z18) {
            if (z17) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.d7c));
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context2, context2.getResources().getString(com.tencent.mm.R.string.d7d));
            }
        }
        this.f282405g = z17;
        this.f282404f = d17;
        b();
        this.f282400b.l(new hn0.l(this, d17));
    }

    public void f(int i17, double d17) {
        b();
        this.f282400b.l(new hn0.m(this, i17, d17));
    }

    public void g(java.util.List res) {
        kotlin.jvm.internal.o.g(res, "res");
        p05.u0 effect = this.f282403e;
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        kotlin.jvm.internal.o.g(effect, "effect");
        f0Var.l(new go0.l(f0Var, effect));
        f0Var.l(new hn0.o(this, res));
    }

    public void h(lo0.k kVar, double d17) {
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        f0Var.l(new go0.y(f0Var, kVar, d17));
    }

    public void i(int i17) {
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        f0Var.l(new go0.d0(f0Var, i17));
    }

    public void j(boolean z17) {
        go0.f0 f0Var = this.f282400b;
        f0Var.getClass();
        f0Var.l(new go0.c0(f0Var, z17));
    }
}
