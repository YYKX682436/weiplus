package uh1;

/* loaded from: classes15.dex */
public enum o1 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f427849d = new java.util.concurrent.ConcurrentHashMap();

    o1() {
    }

    public void a(uh1.m1 m1Var) {
        synchronized (this.f427849d) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f427849d).containsKey(m1Var)) {
                try {
                    ((android.net.nsd.NsdManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("servicediscovery")).stopServiceDiscovery((android.net.nsd.NsdManager.DiscoveryListener) ((java.util.concurrent.ConcurrentHashMap) this.f427849d).get(m1Var));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LocalServiceMgr", th6, "Throwable: stopScanServices", new java.lang.Object[0]);
                }
                ((java.util.concurrent.ConcurrentHashMap) this.f427849d).remove(m1Var);
            }
        }
    }
}
