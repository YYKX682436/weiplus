package u81;

/* loaded from: classes7.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f425447a;

    /* renamed from: c, reason: collision with root package name */
    public final long f425449c;

    /* renamed from: d, reason: collision with root package name */
    public long f425450d;

    /* renamed from: e, reason: collision with root package name */
    public long f425451e;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.sdk.platformtools.n3 f425453g;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f425448b = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f425452f = new u81.m0(this);

    public n0(long j17, java.lang.Object obj) {
        this.f425449c = j17;
        this.f425447a = obj;
    }

    public java.lang.Object a(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        if (n3Var == null) {
            return b();
        }
        this.f425453g = n3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task exec...");
        if (java.lang.Thread.currentThread().getId() == n3Var.getLooper().getThread().getId()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return b();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f425450d = android.os.SystemClock.elapsedRealtime();
        try {
            synchronized (this.f425448b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
                n3Var.post(this.f425452f);
                this.f425448b.wait(this.f425449c);
            }
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f425450d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.f425447a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(this.f425451e), java.lang.Long.valueOf(elapsedRealtime - this.f425451e));
        return this.f425447a;
    }

    public abstract java.lang.Object b();

    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
        this.f425447a = obj;
        synchronized (this.f425448b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
            this.f425448b.notify();
        }
    }
}
