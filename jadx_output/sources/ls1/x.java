package ls1;

/* loaded from: classes8.dex */
public final class x implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.e f321017e;

    public x(ls1.e0 e0Var, i11.e eVar) {
        this.f321016d = e0Var;
        this.f321017e = eVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ls1.e0 e0Var = this.f321016d;
        java.lang.String B1 = e0Var.B1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOK: ");
        sb6.append(z17);
        sb6.append(", fLatitude: ");
        sb6.append(f18);
        sb6.append(", fLongitude: ");
        sb6.append(f17);
        sb6.append(", timeStamp: ");
        i11.e eVar = this.f321017e;
        long j17 = 1000;
        sb6.append(((i11.h) eVar).d() / j17);
        com.tencent.mars.xlog.Log.i(B1, sb6.toString());
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context Y = e0Var.Y();
        ((sb0.f) jVar).getClass();
        boolean d27 = j35.u.d(Y, "android.permission.ACCESS_FINE_LOCATION", true);
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r);
        if (!z17 || !d27 || !Ri) {
            return false;
        }
        e0Var.f181938l.f358725n = java.lang.Float.valueOf(f18);
        e0Var.f181938l.f358726o = java.lang.Float.valueOf(f17);
        e0Var.f181938l.f358727p = java.lang.Long.valueOf(((i11.h) eVar).d() / j17);
        return false;
    }
}
