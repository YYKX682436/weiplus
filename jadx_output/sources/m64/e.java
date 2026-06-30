package m64;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m64.e f324393a = new m64.e();

    /* renamed from: b, reason: collision with root package name */
    public static final n64.a f324394b;

    static {
        n64.a aVar = new n64.a();
        aVar.e(m64.c.f324390d);
        f324394b = aVar;
    }

    public final boolean a(android.content.Context context, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            n64.f fVar = (n64.f) it.next();
            java.util.Objects.toString(fVar);
            if (fVar instanceof n64.c) {
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo c17 = ((n64.c) fVar).c();
                if (c17 != null && c17.f162571b == 23) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    q80.e0 e0Var = new q80.e0();
                    e0Var.f360675a = "wxalite0c45e912005759856ea55eb382e8c509";
                    e0Var.f360676b = "";
                    e0Var.f360678d = true;
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    if (g0Var != null) {
                        ((com.tencent.mm.feature.lite.i) g0Var).Rj(context, e0Var);
                    }
                    com.tencent.mars.xlog.Log.i("AdVangoghCanvasPreloader", "preloadLiteApp, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 114);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                    return true;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        return false;
    }
}
