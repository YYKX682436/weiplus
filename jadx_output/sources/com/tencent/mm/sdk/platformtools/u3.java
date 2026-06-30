package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class u3 {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f193014d;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f193015a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f193016b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f193017c;

    public u3(android.os.HandlerThread handlerThread) {
        this.f193017c = null;
        this.f193015a = handlerThread;
        this.f193017c = handlerThread.getName();
    }

    public static com.tencent.mm.sdk.platformtools.n3 b() {
        if (f193014d == null) {
            f193014d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        return f193014d;
    }

    public static boolean e() {
        return java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId();
    }

    public static void h(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().post(runnable);
    }

    public static void i(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        b().postDelayed(runnable, j17);
    }

    public static void l(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().removeCallbacks(runnable);
    }

    public static void m(int i17) {
        try {
            android.os.Process.setThreadPriority(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d ok", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d fail, %s", java.lang.Integer.valueOf(i17), e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public android.os.Looper a() {
        return this.f193015a.getLooper();
    }

    public int c() {
        android.os.HandlerThread handlerThread = this.f193015a;
        if (handlerThread == null) {
            return -1;
        }
        return handlerThread.getThreadId();
    }

    public com.tencent.mm.sdk.platformtools.n3 d() {
        if (this.f193016b == null) {
            this.f193016b = new com.tencent.mm.sdk.platformtools.n3(this.f193015a.getLooper());
        }
        return this.f193016b;
    }

    public int f(java.lang.Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        d().postAtFrontOfQueue(runnable);
        return 0;
    }

    public int g(com.tencent.mm.sdk.platformtools.s3 s3Var) {
        if (s3Var == null) {
            return -1;
        }
        return new com.tencent.mm.sdk.platformtools.n3(a()).postAtFrontOfQueue(new com.tencent.mm.sdk.platformtools.r3(this, s3Var)) ? 0 : -2;
    }

    public int j(java.lang.Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        d().post(runnable);
        return 0;
    }

    public int k(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return -1;
        }
        d().postDelayed(runnable, j17);
        return 0;
    }

    public void n() {
        android.os.HandlerThread handlerThread = this.f193015a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHandlerThread", "setHighPriority failed thread is dead");
            return;
        }
        int threadId = this.f193015a.getThreadId();
        try {
            if (-8 == android.os.Process.getThreadPriority(threadId)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "setHighPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, -8);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "thread:%d setHighPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "thread:%d setHighPriority failed", java.lang.Integer.valueOf(threadId));
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public void o() {
        android.os.HandlerThread handlerThread = this.f193015a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHandlerThread", "setLowPriority failed thread is dead");
            return;
        }
        int threadId = this.f193015a.getThreadId();
        try {
            if (android.os.Process.getThreadPriority(threadId) == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "setLowPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "thread:%d setLowPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "thread:%d setLowPriority failed", java.lang.Integer.valueOf(threadId));
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public void p() {
        android.os.HandlerThread handlerThread = this.f193015a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHandlerThread", "setLowestPriority failed thread is dead");
            return;
        }
        int threadId = this.f193015a.getThreadId();
        try {
            if (19 == android.os.Process.getThreadPriority(threadId)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "setLowestPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, 19);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority failed", java.lang.Integer.valueOf(threadId));
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }
}
