package kh4;

/* loaded from: classes15.dex */
public class e extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh4.f f308057d;

    public e(kh4.f fVar) {
        this.f308057d = fVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        synchronized (this.f308057d.f308063g) {
            kh4.f fVar = this.f308057d;
            if (fVar.f308061e) {
                java.util.Iterator it = fVar.f308060d.values().iterator();
                while (it.hasNext()) {
                    kh4.a aVar = (kh4.a) ((kh4.b) it.next());
                    aVar.getClass();
                    double d17 = kh4.d.INSTANCE.f308054g;
                    if (d17 > 60.0d) {
                        d17 = 60.0d;
                    }
                    if (d17 < 0.0d) {
                        d17 = 0.0d;
                    }
                    ((java.util.ArrayList) aVar.f308044a).add(java.lang.Double.valueOf(d17));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                cancel();
            }
        }
    }
}
