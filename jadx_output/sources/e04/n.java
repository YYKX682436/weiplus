package e04;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.n f246027d = new e04.n();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "OfflineScan onNetworkChange netWorkStatus: %d, current: %d", java.lang.Integer.valueOf(gm0.j1.d().n()), java.lang.Integer.valueOf(e04.o.f246035b));
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            e04.o.f246035b = gm0.j1.d().n();
            return;
        }
        if (e04.o.f246035b == gm0.j1.d().n()) {
            return;
        }
        e04.o.f246035b = gm0.j1.d().n();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "notifyMessage");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "notifyMessage account not ready and ignore");
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, null);
        if (m17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "notifyOfflineScanMessage no message, ignore");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new e04.m(m17));
    }
}
