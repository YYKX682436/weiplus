package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f192530a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f192531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f192532c;

    /* renamed from: d, reason: collision with root package name */
    public long f192533d;

    /* renamed from: e, reason: collision with root package name */
    public long f192534e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f192535f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f192536g;

    public d8() {
        this(0L, null);
    }

    public java.lang.Object a(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        if (n3Var == null) {
            return b();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task exec...");
        if (n3Var.getLooper() != null ? java.lang.Thread.currentThread().getId() == n3Var.getLooper().getThread().getId() : n3Var.getSerialTag().equals(xu5.b.e())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return b();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f192533d = android.os.SystemClock.elapsedRealtime();
        try {
            synchronized (this.f192531b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
                n3Var.post(this.f192536g);
                this.f192531b.wait(this.f192532c);
            }
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.SyncTask", e17, "", new java.lang.Object[0]);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f192533d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.f192530a, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(this.f192534e), java.lang.Long.valueOf(elapsedRealtime - this.f192534e));
        return this.f192530a;
    }

    public abstract java.lang.Object b();

    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
        this.f192530a = obj;
        synchronized (this.f192531b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
            this.f192531b.notify();
        }
    }

    public d8(long j17, java.lang.Object obj, boolean z17) {
        this.f192531b = new java.lang.Object();
        this.f192535f = false;
        this.f192536g = new com.tencent.mm.sdk.platformtools.c8(this);
        this.f192532c = j17;
        this.f192530a = obj;
        this.f192535f = z17;
    }

    public d8(long j17, java.lang.Object obj) {
        this.f192531b = new java.lang.Object();
        this.f192535f = false;
        this.f192536g = new com.tencent.mm.sdk.platformtools.c8(this);
        this.f192532c = j17;
        this.f192530a = obj;
    }
}
