package re2;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f394388a;

    /* renamed from: b, reason: collision with root package name */
    public re2.a0 f394389b;

    /* renamed from: c, reason: collision with root package name */
    public long f394390c;

    /* renamed from: d, reason: collision with root package name */
    public r45.f50 f394391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f394392e;

    /* renamed from: f, reason: collision with root package name */
    public long f394393f;

    /* renamed from: g, reason: collision with root package name */
    public long f394394g;

    /* renamed from: h, reason: collision with root package name */
    public long f394395h;

    /* renamed from: i, reason: collision with root package name */
    public long f394396i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f394397j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f394398k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f394399l;

    /* renamed from: m, reason: collision with root package name */
    public long f394400m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f394401n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f394402o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f394403p;

    /* renamed from: q, reason: collision with root package name */
    public final re2.d0 f394404q;

    public e0(java.lang.String initiatorFinderUsername) {
        kotlin.jvm.internal.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f394388a = initiatorFinderUsername;
        this.f394389b = re2.a0.f394355d;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 4, null, 4, null);
        this.f394397j = b17;
        this.f394398k = kotlinx.coroutines.flow.l.a(b17);
        this.f394399l = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f394400m = 3000L;
        this.f394404q = new re2.d0(this);
    }

    public void a() {
        int i17;
        kotlinx.coroutines.flow.f3 f3Var;
        re2.a0 a0Var = this.f394389b;
        re2.a0 a0Var2 = re2.a0.f394357f;
        if (a0Var == a0Var2) {
            return;
        }
        com.tencent.mars.xlog.Log.i(c(), "destroy: phase=" + this.f394389b + " → DEAD");
        this.f394389b = a0Var2;
        this.f394399l.removeCallbacks(this.f394404q);
        this.f394402o = false;
        this.f394403p = false;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        r45.f50 f50Var = null;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        if (n0Var != null && (f3Var = n0Var.f329265g) != null) {
            f50Var = (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        }
        if (n0Var == null || f50Var == null || f50Var.f374013d != this.f394390c || (i17 = f50Var.f374014e) == 1 || i17 == 4) {
            return;
        }
        f50Var.f374014e = 1;
        n0Var.T6(f50Var, this.f394392e);
    }

    public final void b() {
        re2.a0 a0Var = this.f394389b;
        re2.a0 a0Var2 = re2.a0.f394356e;
        if (a0Var == a0Var2 || a0Var == re2.a0.f394357f || this.f394390c == 0) {
            return;
        }
        this.f394389b = a0Var2;
        com.tencent.mars.xlog.Log.i(c(), "enterPolling: invitationId=" + this.f394390c + ", interval=" + this.f394400m + "ms");
        this.f394399l.postDelayed(this.f394404q, this.f394400m);
    }

    public abstract java.lang.String c();

    public final boolean d() {
        return this.f394389b != re2.a0.f394357f;
    }

    public final boolean e() {
        if (this.f394393f <= 0) {
            return false;
        }
        boolean z17 = java.lang.System.currentTimeMillis() >= this.f394393f;
        com.tencent.mars.xlog.Log.i(c(), "[isExpiredByLocalTime] _expireTime=" + this.f394393f + ", expired=" + z17);
        return z17;
    }

    public final void f(int i17) {
        re2.a0 a0Var = this.f394389b;
        re2.a0 a0Var2 = re2.a0.f394357f;
        if (a0Var == a0Var2) {
            return;
        }
        com.tencent.mars.xlog.Log.i(c(), "markDead: phase=" + this.f394389b + " → DEAD, terminalStatus=" + i17);
        this.f394389b = a0Var2;
        this.f394399l.removeCallbacks(this.f394404q);
        this.f394402o = false;
        this.f394403p = false;
        r45.f50 f50Var = this.f394391d;
        if (f50Var == null) {
            f50Var = new r45.f50();
            f50Var.f374013d = this.f394390c;
        }
        f50Var.f374014e = i17;
        this.f394391d = f50Var;
        j();
    }

    public boolean g(int i17) {
        return false;
    }

    public void h() {
        if (this.f394389b != re2.a0.f394356e) {
            com.tencent.mars.xlog.Log.i(c(), "onScreenshotDetected ignored: phase=" + this.f394389b);
            return;
        }
        if (this.f394390c == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i(c(), "onScreenshotDetected: invitationId=" + this.f394390c + ", pollInFlight=" + this.f394401n);
        if (this.f394401n) {
            this.f394402o = true;
        } else {
            i();
        }
    }

    public final void i() {
        if (this.f394389b != re2.a0.f394356e) {
            return;
        }
        this.f394399l.removeCallbacks(this.f394404q);
        this.f394403p = true;
        this.f394399l.post(this.f394404q);
    }

    public final void j() {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
            r45.f50 f50Var = this.f394391d;
            if (f50Var != null) {
                try {
                    r45.f50 f50Var2 = new r45.f50();
                    f50Var2.parseFrom(f50Var.toByteArray());
                    f50Var = f50Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(c(), "syncToSlice: deep copy failed, fallback to origin ref", e17);
                }
            } else {
                f50Var = null;
            }
            n0Var.T6(f50Var, this.f394392e);
        }
    }
}
