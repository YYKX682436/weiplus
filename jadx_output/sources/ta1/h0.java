package ta1;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416626e;

    public h0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f416626e = q0Var;
        this.f416625d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f416626e;
        if (!ta1.q0.a(q0Var)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: abort failed: not started");
            this.f416625d.a(2, 401, "not start yet!", null);
            return;
        }
        ta1.f fVar = (ta1.f) q0Var.f416666b;
        ht0.b bVar = fVar.f416614c;
        if (bVar != null) {
            ((ht0.s) bVar).cancel();
            ((ht0.s) fVar.f416614c).clear();
        }
        q0Var.f416666b.getClass();
        q0Var.f416668d = ta1.o0.Inited;
        q0Var.f416669e = null;
        ta1.f fVar2 = (ta1.f) q0Var.f416666b;
        synchronized (fVar2) {
            fVar2.f416615d = null;
        }
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = (com.tencent.magicbrush.ui.MagicBrushView) this.f416626e.f416666b.f416605b.get();
        ta1.t0 t0Var = this.f416625d;
        if (magicBrushView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: abort failed: view lost");
            t0Var.a(0, 0, "ok", null);
        } else {
            t0Var.a(0, 0, "ok", null);
        }
        ua1.f fVar3 = fVar.f416617f;
        if (fVar3 != null) {
            fVar3.e();
        }
    }
}
