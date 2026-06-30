package ee3;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.m f251632e;

    public k(ee3.m mVar, java.lang.String str) {
        this.f251632e = mVar;
        this.f251631d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        ee3.d dVar;
        synchronized (this.f251632e.f251639d) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251632e.f251639d).get(this.f251631d);
            concurrentLinkedQueue.size();
            dVar = (ee3.d) concurrentLinkedQueue.peek();
        }
        if (dVar != null) {
            dVar.execute(new java.lang.Void[0]);
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "lm: need execute more");
                ee3.m mVar = this.f251632e;
                java.lang.String str = this.f251631d;
                mVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new ee3.k(mVar, str), "magicbrush_cdndownload_thread");
            }
        }
    }
}
