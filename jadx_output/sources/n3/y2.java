package n3;

/* loaded from: classes14.dex */
public class y2 extends n3.d3 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f334441h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f334442i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Class f334443j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.reflect.Field f334444k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f334445l;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f334446c;

    /* renamed from: d, reason: collision with root package name */
    public e3.d[] f334447d;

    /* renamed from: e, reason: collision with root package name */
    public e3.d f334448e;

    /* renamed from: f, reason: collision with root package name */
    public n3.g3 f334449f;

    /* renamed from: g, reason: collision with root package name */
    public e3.d f334450g;

    public y2(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var);
        this.f334448e = null;
        this.f334446c = windowInsets;
    }

    private e3.d u(int i17, boolean z17) {
        e3.d dVar = e3.d.f247043e;
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0) {
                dVar = e3.d.a(dVar, v(i18, z17));
            }
        }
        return dVar;
    }

    private e3.d w() {
        n3.g3 g3Var = this.f334449f;
        return g3Var != null ? g3Var.f334338a.j() : e3.d.f247043e;
    }

    private e3.d x(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f334441h) {
            z();
        }
        java.lang.reflect.Method method = f334442i;
        if (method != null && f334443j != null && f334444k != null) {
            try {
                java.lang.Object invoke = method.invoke(view, new java.lang.Object[0]);
                if (invoke == null) {
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) f334444k.get(f334445l.get(invoke));
                if (rect != null) {
                    return e3.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e17) {
                e17.getMessage();
            }
        }
        return null;
    }

    private static void z() {
        try {
            f334442i = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            f334443j = cls;
            f334444k = cls.getDeclaredField("mVisibleInsets");
            f334445l = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f334444k.setAccessible(true);
            f334445l.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e17) {
            e17.getMessage();
        }
        f334441h = true;
    }

    @Override // n3.d3
    public void d(android.view.View view) {
        e3.d x17 = x(view);
        if (x17 == null) {
            x17 = e3.d.f247043e;
        }
        r(x17);
    }

    @Override // n3.d3
    public void e(n3.g3 g3Var) {
        g3Var.f334338a.s(this.f334449f);
        g3Var.f334338a.r(this.f334450g);
    }

    @Override // n3.d3
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return java.util.Objects.equals(this.f334450g, ((n3.y2) obj).f334450g);
        }
        return false;
    }

    @Override // n3.d3
    public e3.d g(int i17) {
        return u(i17, false);
    }

    @Override // n3.d3
    public e3.d h(int i17) {
        return u(i17, true);
    }

    @Override // n3.d3
    public final e3.d l() {
        if (this.f334448e == null) {
            android.view.WindowInsets windowInsets = this.f334446c;
            this.f334448e = e3.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f334448e;
    }

    @Override // n3.d3
    public boolean o() {
        return this.f334446c.isRound();
    }

    @Override // n3.d3
    public boolean p(int i17) {
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0 && !y(i18)) {
                return false;
            }
        }
        return true;
    }

    @Override // n3.d3
    public void q(e3.d[] dVarArr) {
        this.f334447d = dVarArr;
    }

    @Override // n3.d3
    public void r(e3.d dVar) {
        this.f334450g = dVar;
    }

    @Override // n3.d3
    public void s(n3.g3 g3Var) {
        this.f334449f = g3Var;
    }

    public e3.d v(int i17, boolean z17) {
        e3.d j17;
        int i18;
        if (i17 == 1) {
            return z17 ? e3.d.b(0, java.lang.Math.max(w().f247045b, l().f247045b), 0, 0) : e3.d.b(0, l().f247045b, 0, 0);
        }
        if (i17 == 2) {
            if (z17) {
                e3.d w17 = w();
                e3.d j18 = j();
                return e3.d.b(java.lang.Math.max(w17.f247044a, j18.f247044a), 0, java.lang.Math.max(w17.f247046c, j18.f247046c), java.lang.Math.max(w17.f247047d, j18.f247047d));
            }
            e3.d l17 = l();
            n3.g3 g3Var = this.f334449f;
            j17 = g3Var != null ? g3Var.f334338a.j() : null;
            int i19 = l17.f247047d;
            if (j17 != null) {
                i19 = java.lang.Math.min(i19, j17.f247047d);
            }
            return e3.d.b(l17.f247044a, 0, l17.f247046c, i19);
        }
        e3.d dVar = e3.d.f247043e;
        if (i17 != 8) {
            if (i17 == 16) {
                return k();
            }
            if (i17 == 32) {
                return i();
            }
            if (i17 == 64) {
                return m();
            }
            if (i17 != 128) {
                return dVar;
            }
            n3.g3 g3Var2 = this.f334449f;
            n3.l f17 = g3Var2 != null ? g3Var2.f334338a.f() : f();
            return f17 != null ? e3.d.b(f17.b(), f17.d(), f17.c(), f17.a()) : dVar;
        }
        e3.d[] dVarArr = this.f334447d;
        j17 = dVarArr != null ? dVarArr[n3.e3.a(8)] : null;
        if (j17 != null) {
            return j17;
        }
        e3.d l18 = l();
        e3.d w18 = w();
        int i27 = l18.f247047d;
        if (i27 > w18.f247047d) {
            return e3.d.b(0, 0, 0, i27);
        }
        e3.d dVar2 = this.f334450g;
        return (dVar2 == null || dVar2.equals(dVar) || (i18 = this.f334450g.f247047d) <= w18.f247047d) ? dVar : e3.d.b(0, 0, 0, i18);
    }

    public boolean y(int i17) {
        if (i17 != 1 && i17 != 2) {
            if (i17 == 4) {
                return false;
            }
            if (i17 != 8 && i17 != 128) {
                return true;
            }
        }
        return !v(i17, false).equals(e3.d.f247043e);
    }

    public y2(n3.g3 g3Var, n3.y2 y2Var) {
        this(g3Var, new android.view.WindowInsets(y2Var.f334446c));
    }
}
