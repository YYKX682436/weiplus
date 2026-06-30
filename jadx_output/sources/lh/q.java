package lh;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final lh.t f318624d;

    /* renamed from: e, reason: collision with root package name */
    public final int f318625e;

    /* renamed from: f, reason: collision with root package name */
    public final float f318626f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318627g;

    public q(lh.t inspector, int i17, float f17) {
        kotlin.jvm.internal.o.g(inspector, "inspector");
        this.f318624d = inspector;
        this.f318625e = i17;
        this.f318626f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.c1 c1Var;
        if (this.f318627g || (c1Var = this.f318624d.f318636c) == null || !(c1Var instanceof gi.w0)) {
            return;
        }
        gi.w0 w0Var = (gi.w0) c1Var;
        if (w0Var.E()) {
            gi.w0 m17 = w0Var.m();
            m17.l();
            m17.q(new lh.p(m17, this));
        }
    }
}
