package p05;

/* loaded from: classes5.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.p2 f350638d = new p05.p2();

    public p2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wevision_run_score, false);
        p05.v2 v2Var = p05.v2.f350704d;
        com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        boolean z17 = Bi.getBoolean("local_run_score", true);
        boolean z18 = v2Var.Bi().getBoolean("need_run_score", false);
        if (fj6 && z18 && z17) {
            v2Var.Bi().G("local_run_score", false);
            java.lang.String str = p05.v2.f350705e;
            com.tencent.mars.xlog.Log.i(str, "checkLocalRunScore: start");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean z19 = com.tencent.mm.sdk.platformtools.z.f193115k;
            double BenchDNNCPU = com.tencent.mm.xeffect.WeDeviceScore.BenchDNNCPU();
            double BenchDNNOCL = com.tencent.mm.xeffect.WeDeviceScore.BenchDNNOCL();
            v2Var.Bi().z("local_cpu_score", (float) BenchDNNCPU);
            v2Var.Bi().z("lcoal_gpu_score", (float) BenchDNNOCL);
            com.tencent.mm.autogen.mmdata.rpt.WeDeviceScoreReportInfoStruct weDeviceScoreReportInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.WeDeviceScoreReportInfoStruct();
            weDeviceScoreReportInfoStruct.f62905d = (int) (BenchDNNCPU * 100.0d);
            weDeviceScoreReportInfoStruct.f62906e = (int) (BenchDNNOCL * 100.0d);
            weDeviceScoreReportInfoStruct.f62909h = weDeviceScoreReportInfoStruct.b("NeedBenchScore", z18 ? "YES" : "NO", true);
            if (z19) {
                weDeviceScoreReportInfoStruct.f62907f = 64;
            } else {
                weDeviceScoreReportInfoStruct.f62907f = 32;
            }
            weDeviceScoreReportInfoStruct.f62910i = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.tencent.mars.xlog.Log.i(str, "checkLocalRunScore: " + weDeviceScoreReportInfoStruct.n());
            weDeviceScoreReportInfoStruct.k();
        }
        return jz5.f0.f302826a;
    }
}
