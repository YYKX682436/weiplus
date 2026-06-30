package mi1;

/* loaded from: classes7.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.j0 f326610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.m0 f326611e;

    public l0(mi1.j0 j0Var, mi1.m0 m0Var) {
        this.f326610d = j0Var;
        this.f326611e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        mi1.j0 j0Var = this.f326610d;
        j0Var.f326590f = uptimeMillis;
        mi1.m0 m0Var = this.f326611e;
        boolean d17 = m0Var.d(m0Var.f326618d, j0Var);
        if (d17) {
            j0Var.f326592h = 0;
        }
        if (j0Var.f326585a == 1) {
            m0Var.d(m0Var.f326620f, j0Var);
        }
        if (d17) {
            m0Var.b();
        }
    }
}
