package rc3;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f393961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f393963f;

    public c1(rc3.f1 f1Var, int i17, boolean z17) {
        this.f393961d = f1Var;
        this.f393962e = i17;
        this.f393963f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var;
        rc3.f1 f1Var = this.f393961d;
        java.util.HashMap hashMap = f1Var.f393993n;
        int i17 = this.f393962e;
        java.lang.String str = (java.lang.String) hashMap.get(java.lang.Integer.valueOf(i17));
        if (str == null || (k1Var = (sc3.k1) f1Var.f393988f.invoke(str)) == null) {
            return;
        }
        k1Var.H0().c(i17, this.f393963f);
    }
}
