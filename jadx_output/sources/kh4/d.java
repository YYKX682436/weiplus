package kh4;

/* loaded from: classes15.dex */
public enum d implements android.view.Choreographer.FrameCallback {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f308051d;

    /* renamed from: e, reason: collision with root package name */
    public long f308052e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f308053f = 0;

    /* renamed from: g, reason: collision with root package name */
    public double f308054g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f308055h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f308056i = new java.lang.Object();

    d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        long j18 = this.f308052e;
        if (j18 > 0) {
            long j19 = millis - j18;
            this.f308053f = this.f308053f + 1;
            if (j19 > 500) {
                this.f308054g = (r2 * 1000) / j19;
                this.f308052e = millis;
                this.f308053f = 0;
            }
        } else {
            this.f308052e = millis;
        }
        if (this.f308055h) {
            h().postFrameCallback(this);
        }
    }

    public final android.view.Choreographer h() {
        if (this.f308051d == null) {
            synchronized (this) {
                if (this.f308051d == null) {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new kh4.c(this));
                        try {
                            synchronized (this.f308056i) {
                                this.f308056i.wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                        }
                    } else {
                        this.f308051d = android.view.Choreographer.getInstance();
                    }
                }
            }
        }
        return this.f308051d;
    }
}
