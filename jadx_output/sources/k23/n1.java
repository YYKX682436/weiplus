package k23;

/* loaded from: classes12.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f303625a;

    /* renamed from: b, reason: collision with root package name */
    public final long f303626b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f303627c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f303628d;

    /* renamed from: e, reason: collision with root package name */
    public long f303629e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f303630f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f303631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303632h;

    public n1(k23.j2 j2Var, java.lang.String tag, long j17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f303632h = j2Var;
        this.f303625a = tag;
        this.f303626b = j17;
    }

    public final void a(float f17) {
        java.lang.Runnable runnable = this.f303631g;
        k23.j2 j2Var = this.f303632h;
        if (runnable != null) {
            j2Var.removeCallbacks(runnable);
        }
        this.f303631g = null;
        this.f303628d = false;
        this.f303627c = false;
        this.f303629e = 0L;
        k23.l1 l1Var = new k23.l1(this, j2Var);
        this.f303630f = l1Var;
        j2Var.postDelayed(l1Var, this.f303626b);
    }

    public final void b(float f17) {
        float cancelLimitY;
        float cancelLimitY2;
        if (this.f303628d) {
            k23.j2 j2Var = this.f303632h;
            cancelLimitY = j2Var.getCancelLimitY();
            if (f17 < cancelLimitY && !this.f303627c) {
                this.f303627c = true;
                k23.k1 k1Var = j2Var.f303596n;
                if (k1Var != null) {
                    k1Var.e();
                    return;
                }
                return;
            }
            cancelLimitY2 = j2Var.getCancelLimitY();
            if (f17 < cancelLimitY2 || !this.f303627c) {
                return;
            }
            this.f303627c = false;
            k23.k1 k1Var2 = j2Var.f303596n;
            if (k1Var2 != null) {
                k1Var2.b();
            }
        }
    }

    public final void c() {
        java.lang.Runnable runnable = this.f303630f;
        k23.j2 j2Var = this.f303632h;
        if (runnable != null) {
            j2Var.removeCallbacks(runnable);
        }
        this.f303630f = null;
        if (this.f303628d) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f303629e;
            java.lang.String str = this.f303625a;
            if (currentTimeMillis < 300) {
                long j17 = 300 - currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", str + ": 长按时间过短(" + currentTimeMillis + " ms)，延迟 " + j17 + "ms 后结束");
                k23.m1 m1Var = new k23.m1(this, this.f303627c, j2Var);
                this.f303631g = m1Var;
                j2Var.postDelayed(m1Var, j17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", str + ": 长按结束，isCanceling=" + this.f303627c);
                k23.k1 k1Var = j2Var.f303596n;
                if (k1Var != null) {
                    k1Var.g(this.f303627c);
                }
            }
        }
        this.f303628d = false;
        this.f303629e = 0L;
    }
}
