package l42;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l42.n f315986d;

    public e(l42.n nVar) {
        this.f315986d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l42.n nVar = this.f315986d;
        for (s42.b bVar : ((java.util.HashMap) nVar.f315999d).values()) {
            if (u46.l.e(bVar.f402941k) && !u46.l.e(bVar.f402942l)) {
                java.lang.String c17 = g42.i.c(bVar.f402942l);
                if (u46.l.e(c17)) {
                    t42.a.g(false);
                } else {
                    try {
                        bVar.f402941k = new java.lang.String(android.util.Base64.decode(c17, 0), com.tencent.mapsdk.internal.rv.f51270c);
                        l42.n.wi(nVar);
                        t42.a.g(true);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e17.getMessage());
                        t42.a.g(false);
                    }
                }
            }
        }
        for (s42.c cVar : ((java.util.HashMap) nVar.f316000e).values()) {
            if (u46.l.e(cVar.f402947c) && !u46.l.e(cVar.f402948d)) {
                java.lang.String c18 = g42.i.c(cVar.f402948d);
                if (u46.l.e(c18)) {
                    t42.a.g(false);
                } else {
                    try {
                        cVar.f402947c = new java.lang.String(android.util.Base64.decode(c18, 0), com.tencent.mapsdk.internal.rv.f51270c);
                        nVar.Ri();
                        t42.a.g(true);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e18.getMessage());
                        t42.a.g(false);
                    }
                }
            }
        }
    }
}
