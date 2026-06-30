package rp1;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f398536f = jz5.h.b(rp1.o0.f398506d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f398537a;

    /* renamed from: b, reason: collision with root package name */
    public volatile rp1.n0 f398538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f398539c;

    /* renamed from: d, reason: collision with root package name */
    public rp1.p0 f398540d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f398541e;

    public v0(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f398537a = "MicroMsg.FloatBallIdleHelper-".concat(type);
    }

    public final void a() {
        rp1.n0 n0Var = this.f398538b;
        wu5.c cVar = n0Var != null ? n0Var.f398486b : null;
        if (cVar == null) {
            return;
        }
        java.lang.String str = this.f398537a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelIdleTimer taskId: ");
        rp1.n0 n0Var2 = this.f398538b;
        sb6.append(n0Var2 != null ? java.lang.Long.valueOf(n0Var2.f398485a) : null);
        sb6.append(", isDone: ");
        sb6.append(cVar.isDone());
        sb6.append(", isCancelled: ");
        sb6.append(cVar.isCancelled());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!cVar.isDone() && !cVar.isCancelled()) {
            cVar.cancel(false);
        }
        this.f398538b = null;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(this.f398537a, "resetIdleState isChecking: " + this.f398541e + ", isIdle: " + this.f398539c);
        this.f398541e = false;
        d(false);
        if (this.f398538b != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new rp1.s0(this), this.f398537a);
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i(this.f398537a, "startCheckIdle isChecking: " + this.f398541e + ", isIdle: " + this.f398539c);
        if (this.f398541e) {
            return;
        }
        if (this.f398539c) {
            com.tencent.mars.xlog.Log.w(this.f398537a, "startCheckIdle is already idle, not need check");
            return;
        }
        this.f398541e = true;
        ((ku5.t0) ku5.t0.f312615d).h(new rp1.t0(this), this.f398537a);
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f398537a, "updateIdleState idle: " + z17 + ", current: " + this.f398539c);
        if (this.f398539c != z17) {
            d75.b.g(new rp1.u0(this, z17));
        }
    }
}
