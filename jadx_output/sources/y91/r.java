package y91;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.t f460310d;

    public r(y91.t tVar) {
        this.f460310d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(4);
        while (true) {
            y91.t tVar = this.f460310d;
            if (!tVar.f460312a) {
                return;
            } else {
                try {
                    newScheduledThreadPool.submit(new y91.q(tVar, tVar.f460315d.accept()));
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
