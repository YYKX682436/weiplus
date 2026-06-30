package ni3;

/* loaded from: classes12.dex */
public class u1 implements java.lang.Runnable {
    public u1(ni3.g2 g2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "reportECDHAuth USE_ECDH[%s] USE_ML[%b]", java.lang.Boolean.valueOf(o45.ag.f342892a), java.lang.Boolean.valueOf(o45.ag.f342893b));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(148L, o45.ag.f342892a ? 100L : 101L, 1L, true);
        g0Var.idkeyStat(148L, o45.ag.f342893b ? 102L : 103L, 1L, true);
    }
}
