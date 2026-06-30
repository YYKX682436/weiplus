package uh1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.f f427771e;

    public c(uh1.f fVar, java.lang.String str) {
        this.f427771e = fVar;
        this.f427770d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Runnable runnable;
        synchronized (this.f427771e.f427792i) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f427771e.f427792i).get(this.f427770d);
            concurrentLinkedQueue.size();
            runnable = (java.lang.Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkDownload", "hy: need execute more");
                uh1.f fVar = this.f427771e;
                java.lang.String str = this.f427770d;
                fVar.getClass();
                s75.d.b(new uh1.c(fVar, str), "appbrand_download_thread");
            }
        }
    }
}
