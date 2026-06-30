package n3;

/* loaded from: classes14.dex */
public class g3 {

    /* renamed from: b, reason: collision with root package name */
    public static final n3.g3 f334337b;

    /* renamed from: a, reason: collision with root package name */
    public final n3.d3 f334338a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            f334337b = n3.c3.f334327q;
        } else {
            f334337b = n3.d3.f334328b;
        }
    }

    public g3(android.view.WindowInsets windowInsets) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            this.f334338a = new n3.c3(this, windowInsets);
            return;
        }
        if (i17 >= 29) {
            this.f334338a = new n3.b3(this, windowInsets);
        } else if (i17 >= 28) {
            this.f334338a = new n3.a3(this, windowInsets);
        } else {
            this.f334338a = new n3.z2(this, windowInsets);
        }
    }

    public static n3.g3 i(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        n3.g3 g3Var = new n3.g3(windowInsets);
        if (view != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(view)) {
                n3.g3 a17 = n3.b1.a(view);
                n3.d3 d3Var = g3Var.f334338a;
                d3Var.s(a17);
                d3Var.d(view.getRootView());
            }
        }
        return g3Var;
    }

    public e3.d a(int i17) {
        return this.f334338a.g(i17);
    }

    public int b() {
        return this.f334338a.l().f247047d;
    }

    public int c() {
        return this.f334338a.l().f247044a;
    }

    public int d() {
        return this.f334338a.l().f247046c;
    }

    public int e() {
        return this.f334338a.l().f247045b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3.g3)) {
            return false;
        }
        return m3.c.a(this.f334338a, ((n3.g3) obj).f334338a);
    }

    public boolean f(int i17) {
        return this.f334338a.p(i17);
    }

    public n3.g3 g(int i17, int i18, int i19, int i27) {
        int i28 = android.os.Build.VERSION.SDK_INT;
        n3.x2 w2Var = i28 >= 30 ? new n3.w2(this) : i28 >= 29 ? new n3.v2(this) : new n3.u2(this);
        w2Var.g(e3.d.b(i17, i18, i19, i27));
        return w2Var.b();
    }

    public android.view.WindowInsets h() {
        n3.d3 d3Var = this.f334338a;
        if (d3Var instanceof n3.y2) {
            return ((n3.y2) d3Var).f334446c;
        }
        return null;
    }

    public int hashCode() {
        n3.d3 d3Var = this.f334338a;
        if (d3Var == null) {
            return 0;
        }
        return d3Var.hashCode();
    }

    public g3(n3.g3 g3Var) {
        if (g3Var != null) {
            n3.d3 d3Var = g3Var.f334338a;
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 30 && (d3Var instanceof n3.c3)) {
                this.f334338a = new n3.c3(this, (n3.c3) d3Var);
            } else if (i17 >= 29 && (d3Var instanceof n3.b3)) {
                this.f334338a = new n3.b3(this, (n3.b3) d3Var);
            } else if (i17 >= 28 && (d3Var instanceof n3.a3)) {
                this.f334338a = new n3.a3(this, (n3.a3) d3Var);
            } else if (d3Var instanceof n3.z2) {
                this.f334338a = new n3.z2(this, (n3.z2) d3Var);
            } else if (d3Var instanceof n3.y2) {
                this.f334338a = new n3.y2(this, (n3.y2) d3Var);
            } else {
                this.f334338a = new n3.d3(this);
            }
            d3Var.e(this);
            return;
        }
        this.f334338a = new n3.d3(this);
    }
}
