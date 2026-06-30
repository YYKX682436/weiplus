package fh1;

/* loaded from: classes7.dex */
public final class z implements fh1.i, fj1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f262627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f262628b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f262629c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f262630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262632f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f262633g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f262634h;

    /* renamed from: i, reason: collision with root package name */
    public volatile fh1.x0 f262635i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f262636j;

    public z(com.tencent.mm.plugin.appbrand.o6 miniProgramRuntime, int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader wxaCommLib) {
        kotlin.jvm.internal.o.g(miniProgramRuntime, "miniProgramRuntime");
        kotlin.jvm.internal.o.g(wxaCommLib, "wxaCommLib");
        this.f262627a = miniProgramRuntime;
        this.f262628b = i17;
        this.f262629c = str;
        this.f262630d = wxaCommLib;
        i95.n0.c(fh1.f0.class);
        this.f262631e = "MicroMsg.MBFrameBizHostImpl(" + hashCode() + ')';
        this.f262633g = kotlinx.coroutines.z0.b();
        this.f262634h = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final fh1.x0 a() {
        java.lang.String str;
        fh1.x0 x0Var = this.f262635i;
        if (x0Var != null) {
            return x0Var;
        }
        synchronized (this) {
            fh1.x0 x0Var2 = this.f262635i;
            if (x0Var2 != null) {
                return x0Var2;
            }
            fh1.x0 x0Var3 = new fh1.x0(this, this.f262629c, this.f262630d);
            x0Var3.F = new fh1.l(this);
            this.f262635i = x0Var3;
            fh1.x0 x0Var4 = this.f262635i;
            kotlin.jvm.internal.o.d(x0Var4);
            jc3.j0 j0Var = x0Var4.f282995g;
            if (j0Var == null || (str = ((rc3.w0) j0Var).f394087e) == null) {
                str = "";
            }
            this.f262632f = str;
            com.tencent.mars.xlog.Log.i(this.f262631e, "bind bizInstance:" + c() + ", with runtime:" + this.f262627a + ", biz:" + this.f262628b + ", fsPath:" + this.f262629c);
            fh1.x0 x0Var5 = this.f262635i;
            kotlin.jvm.internal.o.d(x0Var5);
            return x0Var5;
        }
    }

    public final java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (this.f262634h.get()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            fh1.o oVar = new fh1.o(this, rVar);
            if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
                oVar.invoke();
            } else {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new fh1.m(this, rVar, oVar));
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f262632f;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("bizInstanceName");
        throw null;
    }

    public fj1.y d(java.lang.String appId) {
        java.lang.Object obj = null;
        if (appId == null || appId.length() == 0) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0 k0Var = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84302a;
        java.lang.String c17 = c();
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84303b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            fj1.y yVar = (fj1.y) next;
            if (kotlin.jvm.internal.o.b(yVar.f263143c.f84254i, c17) && kotlin.jvm.internal.o.b(yVar.c(), appId)) {
                obj = next;
                break;
            }
        }
        return (fj1.y) obj;
    }

    public final void e(yz5.a aVar) {
        if (this.f262634h.get()) {
            return;
        }
        if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            aVar.invoke();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new fh1.y(this, aVar));
        }
    }
}
