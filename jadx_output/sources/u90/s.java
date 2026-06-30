package u90;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {
    public s(u90.t tVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetStatFeatureService", "[!] account not ready, skip calling logic@L30.");
            return;
        }
        boolean[] zArr = com.tencent.mm.modelstat.b0.f71493a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        com.tencent.mm.modelstat.a0 Ai = com.tencent.mm.modelstat.t0.Ai();
                        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.modelstat.b0.f71494b).iterator();
                        while (it.hasNext()) {
                            try {
                                Ai.m0((com.tencent.mm.modelstat.s) it.next());
                            } catch (java.lang.Throwable th6) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetStatStorageLogic", th6, "[-] Error.", new java.lang.Object[0]);
                            }
                        }
                    } finally {
                        com.tencent.mm.modelstat.b0.f71493a[0] = true;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatFeatureService", "[+] logic@L30 called.");
    }
}
