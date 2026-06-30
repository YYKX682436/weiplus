package x51;

/* loaded from: classes11.dex */
public abstract class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f452006d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f452007e;

    public g(android.app.Activity activity) {
        this.f452007e = activity;
    }

    public abstract boolean a(x51.r1 r1Var);

    public abstract boolean b(x51.r1 r1Var);

    public abstract boolean c(x51.r1 r1Var);

    public abstract boolean d(x51.r1 r1Var);

    public abstract boolean e(x51.r1 r1Var);

    public boolean f(x51.r1 r1Var) {
        int i17 = r1Var.f452078b;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return e(r1Var);
        }
        if (i17 == 2) {
            return d(r1Var);
        }
        if (i17 == 4) {
            return c(r1Var);
        }
        if (i17 == 5) {
            return b(r1Var);
        }
        if (i17 != 6) {
            return false;
        }
        return a(r1Var);
    }
}
