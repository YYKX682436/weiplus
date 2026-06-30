package fa1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa1.a f260687d;

    public g(fa1.a aVar) {
        this.f260687d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fa1.a aVar = this.f260687d;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(aVar.N(), true);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandGameServiceLogicImpWC", "get session failed for appid: %s", aVar.N());
            return;
        }
        java.lang.String str = b17.f88134d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "provide instanceId: %s", str);
        aVar.O().f47398a.notifySetInstanceId(str);
    }
}
