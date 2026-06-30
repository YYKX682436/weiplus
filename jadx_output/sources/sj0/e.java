package sj0;

/* loaded from: classes13.dex */
public enum e implements android.view.Choreographer.FrameCallback {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f408350d;

    /* renamed from: e, reason: collision with root package name */
    public long f408351e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f408352f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f408353g = false;

    e() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        long j18 = this.f408351e;
        if (j18 <= 0) {
            this.f408351e = millis;
        } else if (millis - j18 > 500) {
            this.f408351e = millis;
        }
        if (this.f408353g) {
            h().postFrameCallback(this);
        }
    }

    public final android.view.Choreographer h() {
        if (this.f408350d == null) {
            synchronized (this) {
                if (this.f408350d == null) {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new sj0.d(this));
                        try {
                            synchronized (this.f408352f) {
                                this.f408352f.wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                        }
                    } else {
                        this.f408350d = android.view.Choreographer.getInstance();
                    }
                }
            }
        }
        return this.f408350d;
    }

    public void i() {
        this.f408351e = 0L;
        this.f408353g = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Metronome", "[stop] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
        h().removeFrameCallback(this);
    }
}
