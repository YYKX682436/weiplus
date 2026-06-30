package k83;

/* loaded from: classes14.dex */
public abstract class f extends k83.b implements k83.a {

    /* renamed from: f, reason: collision with root package name */
    public boolean f304894f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f304895g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public k83.e f304896h = null;

    @Override // k83.a
    public void a(int i17, java.lang.Object obj, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseIPCallTimerService", "timer request failed, type: %d, isLoop: %b, interval: %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f304894f), java.lang.Integer.valueOf(k()));
        com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) obj;
        m(m1Var);
        k83.e eVar = this.f304896h;
        if (eVar != null) {
            com.tencent.mm.plugin.ipcall.model.p pVar = (com.tencent.mm.plugin.ipcall.model.p) eVar;
            if (pVar.i(i17, m1Var, i18, i19)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
            } else if (i17 == 2) {
                pVar.j(false);
            } else if (i17 == 5) {
                pVar.e(false);
            }
        }
        if (l()) {
            p();
        } else if (this.f304894f) {
            this.f304895g.postDelayed(new k83.d(this), k());
        }
    }

    @Override // k83.a
    public void b(int i17, java.lang.Object obj, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseIPCallTimerService", "timer request success!, type: %d, isLoop: %b, interval: %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f304894f), java.lang.Integer.valueOf(k()));
        com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) obj;
        n(m1Var);
        k83.e eVar = this.f304896h;
        if (eVar != null) {
            com.tencent.mm.plugin.ipcall.model.p pVar = (com.tencent.mm.plugin.ipcall.model.p) eVar;
            if (pVar.i(i17, m1Var, i18, i19)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
            } else if (i17 == 2) {
                pVar.j(true);
            } else if (i17 == 5) {
                pVar.e(true);
            }
        }
        if (this.f304894f) {
            this.f304895g.postDelayed(new k83.c(this), k());
        }
    }

    @Override // k83.b
    public void c() {
        super.c();
    }

    @Override // k83.b
    public void f() {
        this.f304890d = this;
        super.f();
    }

    @Override // k83.b
    public void j(k83.g gVar) {
        super.j(gVar);
        this.f304894f = true;
        e();
    }

    public abstract int k();

    public abstract boolean l();

    public abstract void m(com.tencent.mm.modelbase.m1 m1Var);

    public abstract void n(com.tencent.mm.modelbase.m1 m1Var);

    public abstract void o();

    public void p() {
        this.f304894f = false;
        o();
        e();
    }
}
