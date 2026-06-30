package ee3;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.p f251642e;

    public n(ee3.p pVar, java.lang.String str) {
        this.f251642e = pVar;
        this.f251641d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Runnable runnable;
        synchronized (this.f251642e.f251651f) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251642e.f251651f).get(this.f251641d);
            concurrentLinkedQueue.size();
            runnable = (java.lang.Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "lm: need execute more");
                ee3.p pVar = this.f251642e;
                java.lang.String str = this.f251641d;
                pVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new ee3.n(pVar, str), "magicbrush_download_thread");
            }
        }
    }
}
