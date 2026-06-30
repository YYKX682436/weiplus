package y80;

@j95.b
/* loaded from: classes10.dex */
public final class k0 extends i95.w implements z80.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f459872d = "MicroMsg.LocationCommonService";

    public void Ai(android.content.Context context, long j17, com.tencent.pigeon.mm_foundation.MMLocationGeoMode locationGeoMode, yz5.l callback) {
        kotlin.jvm.internal.o.g(locationGeoMode, "locationGeoMode");
        kotlin.jvm.internal.o.g(callback, "callback");
        y80.p1 p1Var = new y80.p1(callback);
        if (context == null) {
            com.tencent.mars.xlog.Log.e(this.f459872d, "getUserCurrentLocation: failed");
            p1Var.a(null);
            return;
        }
        y80.i0 i0Var = new y80.i0(this, j17, locationGeoMode, p1Var);
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.ACCESS_FINE_LOCATION", 155, "", "", new y80.h0(this, j17, i0Var))) {
            wi(j17, i0Var);
        }
    }

    public final void wi(long j17, yz5.l lVar) {
        y80.g0 g0Var = new y80.g0(this, lVar);
        d85.f0 wi6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).wi((int) j17);
        d85.g0 g0Var2 = d85.g0.LOCAION;
        if (wi6 == null ? ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(g0Var2, g0Var) : ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var2, wi6, g0Var)) {
            return;
        }
        lVar.invoke(java.lang.Boolean.TRUE);
    }
}
