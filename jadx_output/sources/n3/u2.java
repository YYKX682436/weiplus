package n3;

/* loaded from: classes14.dex */
public class u2 extends n3.x2 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f334417e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f334418f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Constructor f334419g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f334420h;

    /* renamed from: c, reason: collision with root package name */
    public android.view.WindowInsets f334421c;

    /* renamed from: d, reason: collision with root package name */
    public e3.d f334422d;

    public u2() {
        this.f334421c = i();
    }

    private static android.view.WindowInsets i() {
        if (!f334418f) {
            try {
                f334417e = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException unused) {
            }
            f334418f = true;
        }
        java.lang.reflect.Field field = f334417e;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException unused2) {
            }
        }
        if (!f334420h) {
            try {
                f334419g = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException unused3) {
            }
            f334420h = true;
        }
        java.lang.reflect.Constructor constructor = f334419g;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // n3.x2
    public n3.g3 b() {
        a();
        n3.g3 i17 = n3.g3.i(this.f334421c, null);
        e3.d[] dVarArr = this.f334439b;
        n3.d3 d3Var = i17.f334338a;
        d3Var.q(dVarArr);
        d3Var.t(this.f334422d);
        return i17;
    }

    @Override // n3.x2
    public void e(e3.d dVar) {
        this.f334422d = dVar;
    }

    @Override // n3.x2
    public void g(e3.d dVar) {
        android.view.WindowInsets windowInsets = this.f334421c;
        if (windowInsets != null) {
            this.f334421c = windowInsets.replaceSystemWindowInsets(dVar.f247044a, dVar.f247045b, dVar.f247046c, dVar.f247047d);
        }
    }

    public u2(n3.g3 g3Var) {
        super(g3Var);
        this.f334421c = g3Var.h();
    }
}
