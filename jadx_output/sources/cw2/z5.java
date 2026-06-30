package cw2;

/* loaded from: classes15.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f224133a;

    /* renamed from: b, reason: collision with root package name */
    public cw2.c6 f224134b;

    /* renamed from: c, reason: collision with root package name */
    public cw2.b6 f224135c;

    /* renamed from: d, reason: collision with root package name */
    public long f224136d;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f224138f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224139g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f224140h;

    /* renamed from: i, reason: collision with root package name */
    public cw2.q5 f224141i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f224137e = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final yz5.a f224142j = new cw2.t5(this);

    public static final void a(cw2.z5 z5Var) {
        cw2.q5 q5Var = z5Var.f224141i;
        if (q5Var == null) {
            return;
        }
        z5Var.f224141i = null;
        cw2.d6 d6Var = cw2.d6.f223645g;
        if (d6Var == null) {
            return;
        }
        if (z5Var.f224136d == 0) {
            com.tencent.mars.xlog.Log.w("FinderThumbPlayerPostProcessor", "Execute pending swap chain op skipped. swapChain is null. op=" + q5Var + ", holder=" + z5Var);
            return;
        }
        if (q5Var instanceof cw2.p5) {
            cw2.p5 p5Var = (cw2.p5) q5Var;
            android.view.Surface surface = z5Var.f224138f;
            android.view.Surface surface2 = p5Var.f223927a;
            if (!kotlin.jvm.internal.o.b(surface2, surface)) {
                cw2.p5 p5Var2 = (cw2.p5) q5Var;
                if (d6Var.f223649c.recreateSwapChain(z5Var.f224136d, p5Var.f223927a, p5Var2.f223928b, p5Var2.f223929c)) {
                    z5Var.f224138f = surface2;
                    java.util.Objects.toString(surface2);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Recreate swap chain failed. holder=" + z5Var);
                    return;
                }
            }
            long j17 = z5Var.f224136d;
            cw2.p5 p5Var3 = (cw2.p5) q5Var;
            com.tencent.mm.mmpostprocessing.MMPostProcessing mMPostProcessing = d6Var.f223649c;
            int i17 = p5Var3.f223928b;
            int i18 = p5Var3.f223929c;
            if (mMPostProcessing.resizeSwapChain(j17, i17, i18)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Resize swap chain failed. width=" + i17 + ", height=" + i18 + ", holder=" + z5Var);
        }
    }

    public final void b(int i17, int i18) {
        android.os.Handler handler;
        com.tencent.mars.xlog.Log.i("FinderThumbPlayerPostProcessor", "On input surface size changed. width=" + i17 + ", height=" + i18 + ", " + this);
        synchronized (cw2.d6.f223644f) {
            cw2.d6 d6Var = cw2.d6.f223645g;
            if (d6Var != null && (handler = d6Var.f223648b) != null) {
                handler.post(new cw2.u5(this, i17, i18));
            }
        }
    }

    public final void c(android.view.Surface surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        surface.toString();
        synchronized (cw2.d6.f223644f) {
            cw2.d6 d6Var = cw2.d6.f223645g;
            if (d6Var == null) {
                return;
            }
            d6Var.f223648b.post(new cw2.v5(this, surface, i17, i18));
        }
    }

    public final void d() {
        synchronized (cw2.d6.f223644f) {
            cw2.d6 d6Var = cw2.d6.f223645g;
            if (d6Var == null) {
                return;
            }
            int i17 = cw2.d6.f223646h - 1;
            cw2.d6.f223646h = i17;
            boolean z17 = i17 == 0;
            if (z17) {
                cw2.d6.f223645g = null;
            }
            d6Var.f223648b.post(new cw2.w5(this, d6Var, z17));
        }
    }
}
