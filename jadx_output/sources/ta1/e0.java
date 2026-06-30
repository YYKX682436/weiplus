package ta1;

/* loaded from: classes7.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416613e;

    public e0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f416613e = q0Var;
        this.f416612d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f416613e;
        boolean a17 = ta1.q0.a(q0Var);
        ta1.t0 t0Var = this.f416612d;
        if (!a17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: resume failed: not started");
            t0Var.a(2, 301, "not start yet!", null);
            return;
        }
        ta1.o0 o0Var = q0Var.f416668d;
        ta1.o0 o0Var2 = ta1.o0.Running;
        if (o0Var == o0Var2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: resume failed: already running!");
            t0Var.a(2, 302, "already running!", null);
            return;
        }
        q0Var.f416668d = o0Var2;
        ta1.f fVar = (ta1.f) q0Var.f416666b;
        if (fVar.f416614c == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = (com.tencent.magicbrush.ui.MagicBrushView) fVar.f416605b.get();
        if (magicBrushView == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        qa1.u uVar = (qa1.u) magicBrushView.getF48652e();
        if (uVar == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        if (!uVar.isAvailable()) {
            t0Var.a(0, 0, "ok", null);
        }
        ((ht0.s) fVar.f416614c).l(0, uVar.getSurfaceWidth(), uVar.getSurfaceHeight());
        t0Var.a(0, 0, "ok", null);
        ua1.f fVar2 = fVar.f416617f;
        if (fVar2 != null) {
            fVar2.d();
        }
    }
}
