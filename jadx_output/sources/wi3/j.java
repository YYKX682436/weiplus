package wi3;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final wi3.j f446224d = new wi3.j();

    @Override // java.lang.Runnable
    public final void run() {
        wi3.l lVar = wi3.l.f446226a;
        if (wi3.l.f446227b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f446227b + ", but no need to release");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f446227b + ", synchronized start waiting");
        synchronized (lVar) {
            if (wi3.l.f446229d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f446227b + ", but isProcessing, so skip");
                lVar.c();
                return;
            }
            if (wi3.l.f446227b != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f446227b);
                long j17 = wi3.l.f446227b;
                wi3.l.f446227b = 0L;
                com.tencent.mm.mmfg.MMFG.nRelease(j17);
            }
        }
    }
}
