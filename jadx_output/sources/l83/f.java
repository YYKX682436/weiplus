package l83;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l83.h f317102d;

    public f(l83.h hVar) {
        this.f317102d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l83.h.a(this.f317102d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallRecorder", "start record error: %s", e17.getMessage());
            m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
            if (Zi.F == 0) {
                Zi.F = 1;
            }
        }
    }
}
