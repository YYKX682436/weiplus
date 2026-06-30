package y80;

/* loaded from: classes10.dex */
public final class j0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f459867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.p1 f459868e;

    public j0(y80.k0 k0Var, y80.p1 p1Var) {
        this.f459867d = k0Var;
        this.f459868e = p1Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        com.tencent.mars.xlog.Log.i(this.f459867d.f459872d, "getUserCurrentLocation: isOk=" + z17 + ", [" + f18 + ',' + f17 + "], accuracy=" + d18);
        y80.p1 p1Var = this.f459868e;
        if (z17) {
            p1Var.a(new com.tencent.pigeon.mm_foundation.MMUserLocationInfo(f17, f18, d18, d18));
            return true;
        }
        p1Var.a(null);
        return true;
    }
}
