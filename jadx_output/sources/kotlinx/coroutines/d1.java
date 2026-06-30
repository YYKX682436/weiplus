package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class d1 extends kotlinx.coroutines.b2 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final kotlinx.coroutines.d1 f310157n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f310158o;

    static {
        java.lang.Long l17;
        kotlinx.coroutines.d1 d1Var = new kotlinx.coroutines.d1();
        f310157n = d1Var;
        d1Var.N(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l17 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l17 = 1000L;
        }
        f310158o = timeUnit.toNanos(l17.longValue());
    }

    @Override // kotlinx.coroutines.c2
    public java.lang.Thread R() {
        java.lang.Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.c2
    public void S(long j17, kotlinx.coroutines.z1 z1Var) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.b2
    public void V(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.V(runnable);
    }

    public final synchronized void b0() {
        int i17 = debugStatus;
        if (i17 == 2 || i17 == 3) {
            debugStatus = 3;
            Z();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        kotlinx.coroutines.v3.f310685b.set(this);
        try {
            synchronized (this) {
                int i17 = debugStatus;
                if (i17 == 2 || i17 == 3) {
                    z17 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z17 = true;
                }
            }
            if (!z17) {
                _thread = null;
                b0();
                if (X()) {
                    return;
                }
                R();
                return;
            }
            long j17 = Long.MAX_VALUE;
            while (true) {
                java.lang.Thread.interrupted();
                long P = P();
                if (P == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    long nanoTime = java.lang.System.nanoTime();
                    if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                        j17 = f310158o + nanoTime;
                    }
                    long j18 = j17 - nanoTime;
                    if (j18 <= 0) {
                        _thread = null;
                        b0();
                        if (X()) {
                            return;
                        }
                        R();
                        return;
                    }
                    if (P > j18) {
                        P = j18;
                    }
                } else {
                    j17 = Long.MAX_VALUE;
                }
                if (P > 0) {
                    int i18 = debugStatus;
                    if (i18 == 2 || i18 == 3) {
                        _thread = null;
                        b0();
                        if (X()) {
                            return;
                        }
                        R();
                        return;
                    }
                    java.util.concurrent.locks.LockSupport.parkNanos(this, P);
                }
            }
        } catch (java.lang.Throwable th6) {
            _thread = null;
            b0();
            if (!X()) {
                R();
            }
            throw th6;
        }
    }

    @Override // kotlinx.coroutines.b2, kotlinx.coroutines.w1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.b2, kotlinx.coroutines.i1
    public kotlinx.coroutines.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        long j18 = j17 > 0 ? j17 >= 9223372036854L ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : 1000000 * j17 : 0L;
        if (j18 >= 4611686018427387903L) {
            return kotlinx.coroutines.j3.f310548d;
        }
        long nanoTime = java.lang.System.nanoTime();
        kotlinx.coroutines.y1 y1Var = new kotlinx.coroutines.y1(j18 + nanoTime, runnable);
        a0(nanoTime, y1Var);
        return y1Var;
    }
}
