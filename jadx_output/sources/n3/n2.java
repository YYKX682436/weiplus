package n3;

/* loaded from: classes14.dex */
public class n2 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final n3.j2 f334376d;

    /* renamed from: e, reason: collision with root package name */
    public n3.g3 f334377e;

    public n2(android.view.View view, n3.j2 j2Var) {
        n3.g3 g3Var;
        this.f334376d = j2Var;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(view);
        if (a17 != null) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            g3Var = (i17 >= 30 ? new n3.w2(a17) : i17 >= 29 ? new n3.v2(a17) : new n3.u2(a17)).b();
        } else {
            g3Var = null;
        }
        this.f334377e = g3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f334377e = n3.g3.i(windowInsets, view);
            return n3.o2.i(view, windowInsets);
        }
        n3.g3 i17 = n3.g3.i(windowInsets, view);
        if (this.f334377e == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            this.f334377e = n3.b1.a(view);
        }
        if (this.f334377e == null) {
            this.f334377e = i17;
            return n3.o2.i(view, windowInsets);
        }
        n3.j2 j17 = n3.o2.j(view);
        if (j17 != null && java.util.Objects.equals(j17.f334347a, windowInsets)) {
            return n3.o2.i(view, windowInsets);
        }
        n3.g3 g3Var = this.f334377e;
        int i18 = 0;
        for (int i19 = 1; i19 <= 256; i19 <<= 1) {
            if (!i17.a(i19).equals(g3Var.a(i19))) {
                i18 |= i19;
            }
        }
        if (i18 == 0) {
            return n3.o2.i(view, windowInsets);
        }
        n3.g3 g3Var2 = this.f334377e;
        n3.s2 s2Var = new n3.s2(i18, (i18 & 8) != 0 ? i17.a(8).f247047d > g3Var2.a(8).f247047d ? n3.o2.f334379e : n3.o2.f334380f : n3.o2.f334381g, 160L);
        n3.r2 r2Var = s2Var.f334406a;
        r2Var.d(0.0f);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(r2Var.a());
        e3.d a17 = i17.a(i18);
        e3.d a18 = g3Var2.a(i18);
        int min = java.lang.Math.min(a17.f247044a, a18.f247044a);
        int i27 = a17.f247045b;
        int i28 = a18.f247045b;
        int min2 = java.lang.Math.min(i27, i28);
        int i29 = a17.f247046c;
        int i37 = a18.f247046c;
        int min3 = java.lang.Math.min(i29, i37);
        int i38 = a17.f247047d;
        int i39 = i18;
        int i47 = a18.f247047d;
        n3.i2 i2Var = new n3.i2(e3.d.b(min, min2, min3, java.lang.Math.min(i38, i47)), e3.d.b(java.lang.Math.max(a17.f247044a, a18.f247044a), java.lang.Math.max(i27, i28), java.lang.Math.max(i29, i37), java.lang.Math.max(i38, i47)));
        n3.o2.f(view, s2Var, windowInsets, false);
        duration.addUpdateListener(new n3.k2(this, s2Var, i17, g3Var2, i39, view));
        duration.addListener(new n3.l2(this, s2Var, view));
        n3.m0.a(view, new n3.m2(this, view, s2Var, i2Var, duration));
        this.f334377e = i17;
        return n3.o2.i(view, windowInsets);
    }
}
