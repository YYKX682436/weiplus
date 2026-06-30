package y80;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f459861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mm_foundation.MMLocationGeoMode f459862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y80.p1 f459863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(y80.k0 k0Var, long j17, com.tencent.pigeon.mm_foundation.MMLocationGeoMode mMLocationGeoMode, y80.p1 p1Var) {
        super(1);
        this.f459861d = k0Var;
        this.f459862e = mMLocationGeoMode;
        this.f459863f = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        y80.p1 p1Var = this.f459863f;
        y80.k0 k0Var = this.f459861d;
        if (booleanValue) {
            k0Var.getClass();
            y80.j0 j0Var = new y80.j0(k0Var, p1Var);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUserCurrentLocationWithPermissionGranted: start ");
            com.tencent.pigeon.mm_foundation.MMLocationGeoMode mMLocationGeoMode = this.f459862e;
            sb6.append(mMLocationGeoMode);
            com.tencent.mars.xlog.Log.i(k0Var.f459872d, sb6.toString());
            if (mMLocationGeoMode == com.tencent.pigeon.mm_foundation.MMLocationGeoMode.GCJ02) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().j(j0Var, false);
            } else {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().k(j0Var, false);
            }
        } else {
            com.tencent.mars.xlog.Log.i(k0Var.f459872d, "getUserCurrentLocationWithPermissionNotGranted: ");
            p1Var.a(null);
        }
        return jz5.f0.f302826a;
    }
}
