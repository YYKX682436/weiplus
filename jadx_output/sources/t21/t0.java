package t21;

/* loaded from: classes12.dex */
public class t0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f414956d;

    public t0(t21.v0 v0Var) {
        this.f414956d = v0Var;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        boolean z17 = false;
        t21.v0 v0Var = this.f414956d;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", java.lang.Integer.valueOf(v0Var.hashCode()));
            t21.u0 u0Var = v0Var.f414994r;
            if (u0Var != null) {
                u0Var.a(v0Var, false, 0, 0);
                return;
            }
            return;
        }
        int i17 = (int) hVar.field_recvedBytes;
        int i18 = (int) hVar.field_fileLength;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", java.lang.Integer.valueOf(v0Var.hashCode()), str, v0Var.f414982f, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hVar.field_videoFormat));
        if (i17 > 0 && i18 > 0) {
            v0Var.f414987k = v0Var.g(v0Var.f414982f, i17, true);
        }
        t21.u0 u0Var2 = v0Var.f414994r;
        if (u0Var2 != null) {
            if (i17 > 0 && i18 > 0) {
                z17 = true;
            }
            u0Var2.a(v0Var, z17, i17, i18);
        }
        v0Var.f414986j = com.tencent.mm.sdk.platformtools.t8.i1();
        v0Var.d(hVar.a(), hVar);
        if (!v0Var.f414977a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 143L, 1L, false);
            return;
        }
        f65.s preloadData = v0Var.f414992p;
        if (preloadData != null) {
            kotlin.jvm.internal.o.g(preloadData, "preloadData");
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(3L, preloadData.f259963a, preloadData.f259964b, 0L, preloadData.f259966d, preloadData.f259967e, preloadData.f259971i);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(354L, 142L, 1L, false);
        if (v0Var.f414988l == 1) {
            g0Var.idkeyStat(354L, 123L, 1L, false);
        } else {
            g0Var.idkeyStat(354L, 124L, 1L, false);
        }
        g0Var.idkeyStat(354L, hVar.field_videoFormat + 240, 1L, false);
    }
}
