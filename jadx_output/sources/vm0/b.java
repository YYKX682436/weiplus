package vm0;

/* loaded from: classes13.dex */
public class b implements ft5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f437978a;

    public b(com.tencent.mm.lib.riskscanner.RiskScannerReqBufferService riskScannerReqBufferService, android.os.Bundle bundle) {
        this.f437978a = bundle;
    }

    public void a(int i17, byte[] bArr) {
        java.lang.ThreadLocal threadLocal = vm0.a.f437977a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RiskScannerReportService", "Report scan result, %d", java.lang.Integer.valueOf(i17));
        if (i17 == -10) {
            jx3.f.INSTANCE.idkeyStat(590L, 2L, 1L, true);
        } else if (i17 != 0) {
            jx3.f.INSTANCE.idkeyStat(590L, 3L, 1L, true);
        } else {
            java.lang.Long l17 = (java.lang.Long) vm0.a.f437977a.get();
            if (l17 != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - l17.longValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.RiskScannerReportService", "Scan cost: %d ms", java.lang.Long.valueOf(elapsedRealtime));
                jx3.f.INSTANCE.m(com.tencent.mm.plugin.appbrand.jsapi.p1.CTRL_INDEX, 5, 1, (int) elapsedRealtime, true);
            } else {
                jx3.f.INSTANCE.idkeyStat(590L, 1L, 1L, true);
            }
        }
        if (i17 != 0 || bArr == null) {
            return;
        }
        android.os.Bundle bundle = this.f437978a;
        bundle.putInt("errCode", i17);
        bundle.putByteArray("reqBufferBase64", bArr);
    }
}
