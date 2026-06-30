package jh;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f299717d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Thread f299718e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f299719f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f299720g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f299721h = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    /* renamed from: i, reason: collision with root package name */
    public final long[] f299722i = {0};

    public k(java.lang.String str) {
        this.f299717d = str;
    }

    public void a(java.lang.Runnable runnable, java.lang.String str) {
        synchronized (this.f299720g) {
            if (((java.util.LinkedList) this.f299720g).contains(str)) {
                return;
            }
            ((java.util.LinkedList) this.f299720g).add(str);
            this.f299719f.put(str, runnable);
            synchronized (this) {
                java.lang.Thread thread = this.f299718e;
                if (thread == null || !thread.isAlive()) {
                    java.lang.Thread thread2 = new java.lang.Thread(this, this.f299717d);
                    this.f299718e = thread2;
                    thread2.start();
                    this.f299721h.removeMessages(1);
                    this.f299721h.sendEmptyMessageDelayed(1, 300000L);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            synchronized (this.f299722i) {
                if (this.f299722i[0] == 0) {
                    return false;
                }
                jh.p pVar = jh.m.f299724h;
                if (pVar != null) {
                    ((com.tencent.mm.plugin.performance.diagnostic.c) pVar).a(jh.o.WarmUpThreadBlocked, new java.lang.Object[0]);
                }
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f299722i) {
            this.f299722i[0] = java.lang.System.currentTimeMillis();
        }
        java.lang.Runnable runnable = null;
        java.lang.String str = null;
        while (true) {
            if (runnable != null) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    oj.j.c("Matrix.WarmUpDelegate", "Before '%s' task execution..", str);
                    runnable.run();
                    oj.j.c("Matrix.WarmUpDelegate", "After '%s' task execution..", str);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    jh.p pVar = jh.m.f299724h;
                    if (pVar != null) {
                        if ("warm-up".equalsIgnoreCase(str)) {
                            ((com.tencent.mm.plugin.performance.diagnostic.c) pVar).a(jh.o.WarmUpDuration, java.lang.Long.valueOf(currentTimeMillis2));
                        } else if ("consuming-up".equalsIgnoreCase(str)) {
                            ((com.tencent.mm.plugin.performance.diagnostic.c) pVar).a(jh.o.ConsumeRequestDuration, java.lang.Long.valueOf(currentTimeMillis2));
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    synchronized (this.f299722i) {
                        this.f299722i[0] = 0;
                        this.f299721h.removeMessages(1);
                        throw th6;
                    }
                }
            }
            synchronized (this.f299720g) {
                str = (java.lang.String) ((java.util.LinkedList) this.f299720g).poll();
                if (str == null) {
                    synchronized (this.f299722i) {
                        this.f299722i[0] = 0;
                    }
                    this.f299721h.removeMessages(1);
                    return;
                }
                java.lang.Runnable runnable2 = (java.lang.Runnable) this.f299719f.remove(str);
                if (runnable2 == null) {
                    synchronized (this.f299722i) {
                        this.f299722i[0] = 0;
                    }
                    this.f299721h.removeMessages(1);
                    return;
                }
                runnable = runnable2;
            }
        }
    }
}
