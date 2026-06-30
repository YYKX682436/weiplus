package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.LinkedBlockingQueue f149030a;

    /* renamed from: c, reason: collision with root package name */
    public final int f149032c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Callable f149033d;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f149031b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f149034e = new java.util.concurrent.locks.ReentrantLock();

    public i(int i17, java.util.concurrent.Callable callable) {
        this.f149032c = i17;
        this.f149030a = new java.util.concurrent.LinkedBlockingQueue(i17);
        this.f149033d = callable;
    }

    public com.tencent.mm.plugin.mmsight.segment.j a() {
        com.tencent.mm.plugin.mmsight.segment.j jVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f149030a == null) {
            return null;
        }
        ((java.util.concurrent.locks.ReentrantLock) this.f149034e).lock();
        this.f149030a.size();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f149030a;
        if (linkedBlockingQueue == null) {
            ((java.util.concurrent.locks.ReentrantLock) this.f149034e).unlock();
            return null;
        }
        if (!linkedBlockingQueue.isEmpty() || this.f149031b >= this.f149032c) {
            ((java.util.concurrent.locks.ReentrantLock) this.f149034e).unlock();
            jVar = (com.tencent.mm.plugin.mmsight.segment.j) this.f149030a.poll(5L, java.util.concurrent.TimeUnit.SECONDS);
        } else {
            this.f149031b++;
            ((java.util.concurrent.locks.ReentrantLock) this.f149034e).unlock();
            java.util.concurrent.Callable callable = this.f149033d;
            if (callable == null) {
                throw new java.lang.IllegalStateException("fetcher generator can not be null.");
            }
            android.os.SystemClock.elapsedRealtime();
            try {
                jVar = (com.tencent.mm.plugin.mmsight.segment.j) callable.call();
                android.os.SystemClock.elapsedRealtime();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FetcherPool", e17, " fetcher generater call error %s", e17.getMessage());
                throw e17;
            }
        }
        android.os.SystemClock.elapsedRealtime();
        return jVar;
    }

    public void b() {
        if (this.f149030a == null) {
            return;
        }
        java.util.concurrent.locks.Lock lock = this.f149034e;
        ((java.util.concurrent.locks.ReentrantLock) lock).lock();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f149030a;
        if (linkedBlockingQueue == null) {
            ((java.util.concurrent.locks.ReentrantLock) lock).unlock();
            return;
        }
        try {
            try {
                java.util.Iterator it = linkedBlockingQueue.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.mmsight.segment.j) it.next()).release();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FetcherPool", e17, "destroy fetcher %s", e17.getMessage());
            }
        } finally {
            this.f149030a = null;
            ((java.util.concurrent.locks.ReentrantLock) lock).unlock();
        }
    }

    public void c(com.tencent.mm.plugin.mmsight.segment.j jVar) {
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("FetcherPool", "Null object can not be reused.");
            return;
        }
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f149030a;
        if (linkedBlockingQueue == null) {
            jVar.release();
        } else {
            if (linkedBlockingQueue.contains(jVar)) {
                throw new java.lang.IllegalStateException("fetcher already in pool");
            }
            this.f149030a.offer(jVar);
        }
    }
}
