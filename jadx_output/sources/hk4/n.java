package hk4;

/* loaded from: classes10.dex */
public final class n extends hk4.a {
    public volatile boolean A;
    public volatile boolean B;
    public final kotlinx.coroutines.y0 C;
    public kotlinx.coroutines.r2 D;
    public final java.lang.Runnable E;
    public long F;

    /* renamed from: l, reason: collision with root package name */
    public long f281957l;

    /* renamed from: m, reason: collision with root package name */
    public dk4.a f281958m;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f281963r;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f281965t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.HandlerThread f281966u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f281967v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f281968w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f281969x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f281970y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f281971z;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f281956k = "MicroMsg.MultiMediaImagePlayer@" + hashCode();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f281959n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f281960o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f281961p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f281962q = "";

    /* renamed from: s, reason: collision with root package name */
    public final um5.b0 f281964s = new um5.b0(new com.tencent.mm.xeffect.LayoutInfo(), new com.tencent.mm.xeffect.LayoutInfo(), new com.tencent.mm.xeffect.InputAnimation());

    public n() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.C = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
        this.E = new hk4.m(this);
    }

    public static final void p(hk4.n nVar) {
        if (nVar.f281966u == null) {
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("MvMediaImagePlayer_FakePlayThread", -4);
            nVar.f281966u = a17;
            a17.start();
            android.os.HandlerThread handlerThread = nVar.f281966u;
            nVar.f281965t = new com.tencent.mm.sdk.platformtools.n3(handlerThread != null ? handlerThread.getLooper() : null);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        nVar.F = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.sdk.platformtools.n3 n3Var = nVar.f281965t;
        java.lang.Runnable runnable = nVar.E;
        if (n3Var != null) {
            n3Var.removeCallbacks(runnable);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = nVar.f281965t;
        if (n3Var2 != null) {
            n3Var2.postDelayed(runnable, 33L);
        }
    }

    @Override // hk4.a
    public boolean a() {
        return this.f281969x;
    }

    @Override // hk4.a
    public boolean b() {
        return this.f281963r != null;
    }

    @Override // hk4.a
    public boolean c() {
        return this.f281970y;
    }

    @Override // hk4.a
    public hk4.b d() {
        return hk4.b.f281933e;
    }

    @Override // hk4.a
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "pause");
        this.F = 0L;
        this.f281969x = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f281965t;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        this.f281970y = false;
    }

    @Override // hk4.a
    public void f() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "preloadMedia");
        q(null);
    }

    @Override // hk4.a
    public void g() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "release");
        o();
        this.f281963r = null;
        this.f281971z = true;
    }

    @Override // hk4.a
    public void h() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "resume, isPlaying:" + this.f281969x + ", isStarted:" + this.f281970y);
        if (this.f281969x) {
            return;
        }
        hk4.d dVar = new hk4.d(this, new hk4.j(this));
        if (this.f281963r == null) {
            q(new hk4.c(dVar));
        } else {
            dVar.invoke();
        }
    }

    @Override // hk4.a
    public void i(long j17, yz5.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f281956k, "seek:" + j17);
        e();
        this.f281967v = j17;
        n();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // hk4.a
    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f281956k, "setLoop:" + z17);
        this.f281968w = z17;
    }

    @Override // hk4.a
    public void l(long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f281956k, "setPlayRange:[" + j17 + ',' + j18 + ']');
        this.f281957l = j18 - j17;
    }

    @Override // hk4.a
    public void m(int i17, int i18) {
        this.f281922a = i17;
        this.f281923b = i18;
        r();
    }

    @Override // hk4.a
    public void n() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "start, isPlaying:" + this.f281969x + ", isStarted:" + this.f281970y);
        if (this.f281970y || this.f281969x) {
            return;
        }
        hk4.d dVar = new hk4.d(this, new hk4.k(this));
        if (this.f281963r == null) {
            q(new hk4.c(dVar));
        } else {
            dVar.invoke();
        }
        this.f281970y = true;
        this.A = false;
        this.B = false;
    }

    @Override // hk4.a
    public void o() {
        com.tencent.mars.xlog.Log.i(this.f281956k, "stop");
        this.f281969x = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f281965t;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        android.os.HandlerThread handlerThread = this.f281966u;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f281966u = null;
        this.f281965t = null;
        this.f281970y = false;
        this.f281967v = 0L;
    }

    public final void q(yz5.a aVar) {
        kotlinx.coroutines.r2 r2Var = this.D;
        kotlinx.coroutines.y0 y0Var = this.C;
        if (r2Var == null || !r2Var.a()) {
            this.D = kotlinx.coroutines.l.d(y0Var, null, null, new hk4.i(this, aVar, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f281956k, "bitmap is loading, ignore this request");
        if (aVar != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new hk4.g(r2Var, this, aVar, null), 3, null);
        }
    }

    public final void r() {
        um5.b0 animation = this.f281964s;
        com.tencent.mm.xeffect.LayoutInfo layoutInfo = animation.f429135a;
        com.tencent.mm.xeffect.InputAnimation inputAnimation = animation.f429137c;
        layoutInfo.f214793b = this.f281922a / 2;
        layoutInfo.f214794c = this.f281923b / 2;
        layoutInfo.f214796e = 1;
        layoutInfo.f214795d = 1.0f;
        android.graphics.Bitmap bitmap = this.f281963r;
        dk4.a aVar = this.f281958m;
        jk4.f fVar = aVar instanceof jk4.f ? (jk4.f) aVar : null;
        if (bitmap == null || fVar == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = fVar.B;
        gk4.c animationType = i17 < gk4.c.values().length + (-1) ? gk4.c.values()[i17] : gk4.c.f272537d;
        inputAnimation.f214790b = this.f281924c;
        inputAnimation.f214791c = this.f281925d;
        int i18 = this.f281922a;
        int i19 = this.f281923b;
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        int i27 = i18 / 2;
        com.tencent.mm.xeffect.LayoutInfo layoutInfo2 = animation.f429135a;
        layoutInfo2.f214793b = i27;
        int i28 = i19 / 2;
        layoutInfo2.f214794c = i28;
        layoutInfo2.f214796e = 1;
        layoutInfo2.f214795d = 1.0f;
        com.tencent.mm.xeffect.LayoutInfo layoutInfo3 = animation.f429136b;
        layoutInfo3.f214793b = i27;
        layoutInfo3.f214794c = i28;
        layoutInfo3.f214795d = 1.0f;
        float f17 = (i19 * 1.0f) / height;
        int i29 = width / 10;
        switch (animationType.ordinal()) {
            case 1:
                layoutInfo2.f214796e = 0;
                layoutInfo2.f214795d = f17;
                int i37 = width / 2;
                int i38 = i29 / 2;
                layoutInfo2.f214793b = i37 + i38;
                layoutInfo3.f214795d = f17;
                layoutInfo3.f214793b = i37 - i38;
                return;
            case 2:
                layoutInfo2.f214796e = 0;
                layoutInfo2.f214795d = f17;
                int i39 = width / 2;
                int i47 = i29 / 2;
                layoutInfo2.f214793b = i39 - i47;
                layoutInfo3.f214795d = f17;
                layoutInfo3.f214793b = i39 + i47;
                return;
            case 3:
                layoutInfo2.f214796e = 4;
                layoutInfo2.f214795d = 1.05f;
                layoutInfo3.f214795d = 1.0f;
                return;
            case 4:
                layoutInfo2.f214796e = 4;
                layoutInfo2.f214795d = 1.0f;
                layoutInfo3.f214795d = 1.05f;
                return;
            case 5:
                layoutInfo2.f214796e = 3;
                layoutInfo2.f214795d = 1.05f;
                layoutInfo3.f214795d = 1.0f;
                return;
            case 6:
                layoutInfo2.f214796e = 3;
                layoutInfo2.f214795d = 1.0f;
                layoutInfo3.f214795d = 1.05f;
                return;
            default:
                return;
        }
    }
}
