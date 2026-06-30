package pq2;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f357578d = "Finder.Nearby.Preload." + getClass().getSimpleName() + "_@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final int f357579e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357580f;

    /* renamed from: g, reason: collision with root package name */
    public az2.w f357581g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f357582h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f357583i;

    /* renamed from: m, reason: collision with root package name */
    public final kz2.c f357584m;

    /* renamed from: n, reason: collision with root package name */
    public volatile pq2.a f357585n;

    public c() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O).getValue()).r()).intValue();
        this.f357579e = intValue;
        int intValue2 = ((java.lang.Number) t70Var.P1().r()).intValue();
        this.f357580f = intValue2;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f357582h = reentrantLock;
        this.f357583i = reentrantLock.newCondition();
        this.f357584m = new kz2.c(this.f357578d);
        this.f357585n = pq2.a.f357570d;
        com.tencent.mars.xlog.Log.i(this.f357578d, "init WAITING_PRELOAD_TIMEOUT_MS:" + intValue + " PRELOAD_RESPONSE_EXPIRED_MS:" + intValue2 + ' ');
    }

    public abstract void b();

    public void c(az2.w wVar, yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kz2.c cVar = this.f357584m;
        cVar.c("handleFetchDoneInternal begin");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f357582h;
        reentrantLock.lock();
        try {
            callback.invoke();
            if (wVar != null && wVar.f16157a == 0 && wVar.f16158b == 0) {
                g(pq2.a.f357574h);
            } else {
                g(pq2.a.f357573g);
            }
            this.f357583i.signalAll();
            reentrantLock.unlock();
            cVar.b("handleFetchDoneInternal end");
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public final boolean d(az2.w response) {
        kotlin.jvm.internal.o.g(response, "response");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - response.f16161e;
        if (elapsedRealtime <= this.f357580f) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f357578d, "isExpiredResponse expiredMs:" + elapsedRealtime);
        return true;
    }

    public az2.w e() {
        com.tencent.mars.xlog.Log.i(this.f357578d, "requestCache state:" + this.f357585n);
        this.f357582h.lock();
        this.f357584m.c("requestCache");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (this.f357585n == pq2.a.f357571e) {
                com.tencent.mars.xlog.Log.i(this.f357578d, "requestCache waiting.");
                this.f357583i.await(this.f357579e, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.f357582h.unlock();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (this.f357581g == null) {
                com.tencent.mars.xlog.Log.i(this.f357578d, "requestCache hit null, state:" + this.f357585n + " time:" + elapsedRealtime2);
            } else {
                com.tencent.mars.xlog.Log.i(this.f357578d, "requestCache hit cache state:" + this.f357585n + " response:" + this.f357581g + " time:" + elapsedRealtime2);
                az2.w wVar = this.f357581g;
                kotlin.jvm.internal.o.d(wVar);
                if (d(wVar)) {
                    g(pq2.a.f357572f);
                    return null;
                }
            }
            return this.f357581g;
        } catch (java.lang.Throwable th6) {
            this.f357582h.unlock();
            throw th6;
        }
    }

    public final void f(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f357578d, "requestCacheAsync state:" + this.f357585n);
        pm0.v.K(null, new pq2.b(callback, this));
    }

    public final void g(pq2.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f357578d, "setLoadingState from " + this.f357585n + " to " + aVar);
        this.f357585n = aVar;
    }

    public void h() {
        if (this.f357585n != pq2.a.f357570d) {
            com.tencent.mars.xlog.Log.i(this.f357578d, "startPreload return for state:" + this.f357585n);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f357578d, "startPreload");
        this.f357584m.a("startPreload begin");
        this.f357582h.lock();
        try {
            g(pq2.a.f357571e);
            b();
            this.f357582h.unlock();
            this.f357584m.c("startPreload end");
        } catch (java.lang.Throwable th6) {
            this.f357582h.unlock();
            throw th6;
        }
    }

    public void i() {
        com.tencent.mars.xlog.Log.i(this.f357578d, "stopPreload state:" + this.f357585n);
        this.f357582h.lock();
        try {
            this.f357583i.signalAll();
            this.f357582h.unlock();
            this.f357581g = null;
            g(pq2.a.f357570d);
        } catch (java.lang.Throwable th6) {
            this.f357582h.unlock();
            throw th6;
        }
    }
}
