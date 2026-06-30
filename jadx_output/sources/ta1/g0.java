package ta1;

/* loaded from: classes7.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416621e;

    public g0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f416621e = q0Var;
        this.f416620d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f416621e;
        if (!ta1.q0.a(q0Var)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: stop failed: not started");
            this.f416620d.a(0, 501, "not start yet!", null);
            return;
        }
        ta1.b bVar = q0Var.f416666b;
        ta1.f0 f0Var = new ta1.f0(this);
        ta1.f fVar = (ta1.f) bVar;
        ht0.b bVar2 = fVar.f416614c;
        if (bVar2 == null) {
            f0Var.a(1, -1, "no recorder", "");
            return;
        }
        ((ht0.s) bVar2).g(new ta1.e(fVar, f0Var));
        ua1.f fVar2 = fVar.f416617f;
        if (fVar2 != null) {
            fVar2.e();
        }
    }
}
