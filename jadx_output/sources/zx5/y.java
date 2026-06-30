package zx5;

/* loaded from: classes13.dex */
public class y implements zx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zx5.b0 f477281a;

    public y(zx5.b0 b0Var) {
        this.f477281a = b0Var;
    }

    @Override // zx5.b
    public void a(zx5.t tVar) {
        by5.c4.f("XWebRuntimeUpdateChecker", "fetchConfig onTaskFailed, get config fail, retCode:" + tVar.f477261c);
        zx5.i0.c(1);
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 21L, 1L);
        }
        xx5.q.a(tVar, this.f477281a.f477216f, "0");
    }

    @Override // zx5.b
    public void b(zx5.s sVar) {
    }

    @Override // zx5.b
    public void c() {
        by5.c4.f("XWebRuntimeUpdateChecker", "fetchConfig onTaskStarted");
        zx5.p.Z().O();
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 20L, 1L);
        }
    }

    @Override // zx5.b
    public void d(zx5.t tVar) {
        zx5.b0 b0Var = this.f477281a;
        b0Var.getClass();
        yu5.c.a(new zx5.z(b0Var, tVar));
    }
}
