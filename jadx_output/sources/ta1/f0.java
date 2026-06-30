package ta1;

/* loaded from: classes7.dex */
public class f0 implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.g0 f416618a;

    public f0(ta1.g0 g0Var) {
        this.f416618a = g0Var;
    }

    @Override // ta1.t0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(int i17, int i18, java.lang.String str, java.lang.String str2) {
        ta1.g0 g0Var = this.f416618a;
        if (((com.tencent.magicbrush.ui.MagicBrushView) g0Var.f416621e.f416666b.f416605b.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: stop failed: view lost");
            g0Var.f416620d.a(1, -2, "view lost", null);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            g0Var.f416620d.a(i17, i18, str, null);
            return;
        }
        ta1.q0 q0Var = g0Var.f416621e;
        ta1.p0 p0Var = new ta1.p0(q0Var);
        p0Var.f416660a = q0Var.f416669e;
        p0Var.f416661b = q0Var.f416670f;
        q0Var.f416666b.getClass();
        q0Var.f416668d = ta1.o0.Inited;
        q0Var.f416669e = null;
        ta1.f fVar = (ta1.f) q0Var.f416666b;
        synchronized (fVar) {
            fVar.f416615d = null;
        }
        g0Var.f416620d.a(0, 0, "ok", p0Var);
    }
}
