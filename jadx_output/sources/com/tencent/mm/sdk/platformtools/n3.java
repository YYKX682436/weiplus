package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class n3 implements qu5.a {
    private static final long SLOW_DURATION = 5000;
    private static final long SLOW_UI_DURATION = 300;
    private static final android.os.Handler UIHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.lang.Object lock;
    private com.tencent.mm.sdk.platformtools.l3 mTaskWatch;
    private final qu5.a realHandler;
    private volatile android.os.Message runningMsg;

    public n3() {
        this.lock = new java.lang.Object();
        this.realHandler = a(android.os.Looper.myLooper(), xu5.b.d(), null);
    }

    public static android.os.Handler createFreeHandler(android.os.Looper looper) {
        return new android.os.Handler(looper);
    }

    public final qu5.a a(android.os.Looper looper, xu5.b bVar, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        if (looper == android.os.Looper.getMainLooper() || bVar == xu5.b.b()) {
            return new qu5.b(new com.tencent.mm.sdk.platformtools.i3(this, android.os.Looper.getMainLooper(), k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var));
        }
        if (bVar != null) {
            return new com.tencent.mm.sdk.platformtools.j3(this, bVar, k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var);
        }
        if (looper != null) {
            return new qu5.b(new com.tencent.mm.sdk.platformtools.i3(this, looper, k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var));
        }
        throw new java.lang.RuntimeException("looper and serial is null!");
    }

    public void afterDispatchMessage(android.os.Message message) {
    }

    public void beforeDispatchMessage(android.os.Message message) {
    }

    public void beforeSendMessage(android.os.Message message, long j17) {
    }

    @Override // qu5.a
    public final void dispatchMessage(android.os.Message message) {
        this.realHandler.dispatchMessage(message);
    }

    @Override // qu5.a
    public void dump(android.util.Printer printer, java.lang.String str) {
        this.realHandler.dump(printer, str);
    }

    @Override // qu5.a
    public boolean executeOrSendMessage(android.os.Message message) {
        return this.realHandler.executeOrSendMessage(message);
    }

    @Override // qu5.a
    public android.os.Looper getLooper() {
        return this.realHandler.getLooper();
    }

    @Override // qu5.a
    public java.lang.String getMessageName(android.os.Message message) {
        return this.realHandler.getMessageName(message);
    }

    public android.os.Message getRunningMessage() {
        return this.runningMsg;
    }

    @Override // qu5.a
    public final android.os.Handler getSelf() {
        return this.realHandler.getSelf();
    }

    @Override // qu5.a
    public xu5.b getSerial() {
        return this.realHandler.getSerial();
    }

    @Override // qu5.a
    public java.lang.String getSerialTag() {
        return this.realHandler.getSerialTag();
    }

    public void handleMessage(android.os.Message message) {
    }

    @Override // qu5.a
    public boolean hasMessages(int i17) {
        return this.realHandler.hasMessages(i17);
    }

    @Override // qu5.a
    public boolean isQuit() {
        return this.realHandler.isQuit();
    }

    public void join() {
        join(0L);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage() {
        return this.realHandler.obtainMessage();
    }

    @Override // qu5.a
    public boolean post(java.lang.Runnable runnable) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        return l3Var != null ? this.realHandler.post(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var)) : this.realHandler.post(runnable);
    }

    @Override // qu5.a
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        return l3Var != null ? this.realHandler.postAtFrontOfQueue(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var)) : this.realHandler.postAtFrontOfQueue(runnable);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, long j17) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        if (l3Var != null) {
            return this.realHandler.postAtTime(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var), j17);
        }
        return this.realHandler.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        if (l3Var != null) {
            return this.realHandler.postDelayed(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var), j17);
        }
        return this.realHandler.postDelayed(runnable, j17);
    }

    @java.lang.Deprecated
    public final boolean postToWorker(java.lang.Runnable runnable) {
        return this.realHandler.post(runnable);
    }

    public void postUI(java.lang.Runnable runnable) {
        UIHandler.post(runnable);
    }

    public void postUIDelayed(java.lang.Runnable runnable, long j17) {
        UIHandler.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    public boolean quit() {
        boolean quit;
        synchronized (this.lock) {
            quit = this.realHandler.quit();
            this.lock.notifyAll();
        }
        return quit;
    }

    public boolean quitSafely() {
        this.realHandler.post(new com.tencent.mm.sdk.platformtools.h3(this));
        return true;
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable) {
        if (this.mTaskWatch != null) {
            this.realHandler.removeCallbacks((com.tencent.mm.sdk.platformtools.m3) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.sdk.platformtools.m3.f192849f).remove(runnable));
        } else {
            this.realHandler.removeCallbacks(runnable);
        }
    }

    @Override // qu5.a
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.realHandler.removeCallbacksAndMessages(obj);
    }

    @Override // qu5.a
    public void removeMessages(int i17) {
        this.realHandler.removeMessages(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessage(int i17) {
        return this.realHandler.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageAtTime(int i17, long j17) {
        return this.realHandler.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageDelayed(int i17, long j17) {
        return this.realHandler.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    public boolean sendMessage(android.os.Message message) {
        return this.realHandler.sendMessage(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtFrontOfQueue(android.os.Message message) {
        return this.realHandler.sendMessageAtFrontOfQueue(message);
    }

    @Override // qu5.a
    public final boolean sendMessageAtTime(android.os.Message message, long j17) {
        return this.realHandler.sendMessageAtTime(message, j17);
    }

    @Override // qu5.a
    public boolean sendMessageDelayed(android.os.Message message, long j17) {
        return this.realHandler.sendMessageDelayed(message, j17);
    }

    public void setHasDefaultLooper(boolean z17) {
        qu5.a aVar = this.realHandler;
        if (aVar instanceof xu5.o) {
            ((xu5.o) aVar).getClass();
        }
    }

    public void setLogging(boolean z17) {
        qu5.a aVar = this.realHandler;
        if (aVar instanceof xu5.o) {
            ((xu5.o) aVar).f457328b = z17;
        }
    }

    public void setTaskWatch(com.tencent.mm.sdk.platformtools.l3 l3Var) {
        this.mTaskWatch = l3Var;
    }

    public java.lang.String toString() {
        return this.realHandler.toString();
    }

    @Override // qu5.a
    public boolean hasMessages(int i17, java.lang.Object obj) {
        return this.realHandler.hasMessages(i17, obj);
    }

    public void join(long j17) {
        synchronized (this.lock) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (j17 < 0) {
                throw new java.lang.IllegalArgumentException("timeout value is negative");
            }
            if (j17 == 0) {
                while (!isQuit()) {
                    this.lock.wait(j17);
                }
            } else {
                long j18 = 0;
                while (!isQuit()) {
                    long j19 = j17 - j18;
                    if (j19 <= 0) {
                        break;
                    }
                    this.lock.wait(j19);
                    j18 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                }
            }
        }
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17) {
        return this.realHandler.obtainMessage(i17);
    }

    @Override // qu5.a
    public void removeMessages(int i17, java.lang.Object obj) {
        this.realHandler.removeMessages(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, java.lang.Object obj) {
        return this.realHandler.obtainMessage(i17, obj);
    }

    public n3(com.tencent.mm.sdk.platformtools.k3 k3Var) {
        this.lock = new java.lang.Object();
        this.realHandler = a(android.os.Looper.myLooper(), xu5.b.d(), k3Var);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19) {
        return this.realHandler.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        if (l3Var != null) {
            return this.realHandler.postAtTime(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var), obj, j17);
        }
        return this.realHandler.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        com.tencent.mm.sdk.platformtools.l3 l3Var = this.mTaskWatch;
        if (l3Var != null) {
            return this.realHandler.postDelayed(com.tencent.mm.sdk.platformtools.m3.a(runnable, l3Var), obj, j17);
        }
        return this.realHandler.postDelayed(runnable, obj, j17);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19, java.lang.Object obj) {
        return this.realHandler.obtainMessage(i17, i18, i19, obj);
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable, java.lang.Object obj) {
        if (this.mTaskWatch != null) {
            this.realHandler.removeCallbacks((com.tencent.mm.sdk.platformtools.m3) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.sdk.platformtools.m3.f192849f).remove(runnable), obj);
        } else {
            this.realHandler.removeCallbacks(runnable, obj);
        }
    }

    public n3(android.os.Looper looper) {
        this.lock = new java.lang.Object();
        java.util.Objects.requireNonNull(looper);
        this.realHandler = a(looper, null, null);
    }

    public n3(android.os.Looper looper, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        this.lock = new java.lang.Object();
        java.util.Objects.requireNonNull(looper);
        this.realHandler = a(looper, null, k3Var);
    }

    public n3(java.lang.String str, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        this.lock = new java.lang.Object();
        java.util.Objects.requireNonNull(str);
        this.realHandler = a(null, xu5.b.a(str), k3Var);
    }

    public n3(java.lang.String str) {
        this.lock = new java.lang.Object();
        this.realHandler = a(null, xu5.b.a(str), null);
    }

    public n3(xu5.b bVar) {
        this.lock = new java.lang.Object();
        java.util.Objects.requireNonNull(bVar);
        this.realHandler = a(null, bVar, null);
    }

    public n3(xu5.b bVar, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        this.lock = new java.lang.Object();
        java.util.Objects.requireNonNull(bVar);
        this.realHandler = a(null, bVar, k3Var);
    }
}
