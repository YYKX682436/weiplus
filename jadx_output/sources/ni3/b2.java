package ni3;

/* loaded from: classes12.dex */
public class b2 implements ni3.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.d2 f337541a;

    public b2(ni3.d2 d2Var) {
        this.f337541a = d2Var;
    }

    public void a(int i17, ni3.c1 c1Var) {
        ni3.d2 d2Var = this.f337541a;
        d2Var.f337563a.f337596u = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv callback errType[%d] lastScanTime[%d], result[%s][%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(d2Var.f337563a.f337596u), d2Var.f337563a.f337598w, c1Var);
        d2Var.f337563a.f337598w = null;
        if (i17 != 0 || c1Var.f337553j) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WECHAT_FILE_SCAN_LAST_TIME_LONG, java.lang.Long.valueOf(d2Var.f337563a.f337596u));
        gm0.j1.i();
        gm0.j1.u().c().i(false);
        try {
            ni3.g2.wi(d2Var.f337563a, c1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", e17, "doReportSDInfo err!", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(418L, 6L, 1L, true);
        }
    }
}
