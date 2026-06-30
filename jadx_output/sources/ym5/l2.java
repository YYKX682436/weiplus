package ym5;

/* loaded from: classes15.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym5.l2 f463424a = new ym5.l2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f463425b = jz5.h.b(ym5.k2.f463414d);

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(android.view.View view, double d17, int i17) {
        if (view == null) {
            return;
        }
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) f463425b).getValue();
        i2Var.getClass();
        if (i2Var.f463382a == 0) {
            return;
        }
        if (view instanceof org.libpag.PAGView) {
            ym5.h2 h2Var = i2Var.f463383b;
            h2Var.f463368f++;
            h2Var.f463369g += i17;
            h2Var.f463371i += d17;
            double d18 = d17 / i17;
            if (d18 > h2Var.f463370h) {
                h2Var.f463370h = d18;
                return;
            }
            return;
        }
        if (view instanceof com.tencent.mm.rfx.RfxPagView) {
            ym5.h2 h2Var2 = i2Var.f463383b;
            h2Var2.f463364b++;
            h2Var2.f463365c += i17;
            h2Var2.f463367e += d17;
            double d19 = d17 / i17;
            if (d19 > h2Var2.f463366d) {
                h2Var2.f463366d = d19;
            }
        }
    }
}
