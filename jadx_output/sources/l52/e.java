package l52;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.f f316579d;

    public e(l52.f fVar) {
        this.f316579d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.f fVar = this.f316579d;
        java.util.Map map = fVar.f316585e;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        ((java.util.concurrent.ConcurrentHashMap) fVar.f316590j).clear();
        fVar.L = null;
        java.lang.ref.WeakReference weakReference = fVar.f316604x;
        if (weakReference != null) {
            weakReference.clear();
            fVar.f316604x = null;
        }
        fVar.f316603w = false;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "freeOnDestroy: cost=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
