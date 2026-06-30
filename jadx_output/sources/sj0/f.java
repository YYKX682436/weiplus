package sj0;

/* loaded from: classes13.dex */
public class f extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj0.g f408354e;

    public f(sj0.g gVar) {
        this.f408354e = gVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "Handle_Monitor_mem_cpu";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context;
        synchronized (this.f408354e.f408361h) {
            sj0.g gVar = this.f408354e;
            if (gVar.f408359f) {
                java.util.Iterator it = gVar.f408358e.values().iterator();
                while (it.hasNext()) {
                    sj0.c cVar = (sj0.c) ((sj0.b) it.next());
                    java.util.List list = cVar.f408340b;
                    if (list != null && ((java.util.ArrayList) list).size() <= 10000 && (context = cVar.f408339a) != null) {
                        ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
                        double d17 = ((r5.totalMem - r5.availMem) / 1024.0d) / 1024.0d;
                        cVar.f408342d = java.lang.Math.min(d17, cVar.f408342d);
                        ((java.util.ArrayList) list).add(java.lang.Double.valueOf(d17));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                b();
            }
        }
    }
}
