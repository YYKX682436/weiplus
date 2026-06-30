package sj3;

/* loaded from: classes14.dex */
public final class d0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408470e;

    public d0(sj3.a1 a1Var, com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f408469d = a1Var;
        this.f408470e = multiTalkControlIconLayout;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        cv.w0 w0Var = (cv.w0) i95.n0.c(cv.w0.class);
        kotlin.jvm.internal.o.d(list);
        boolean Di = ((gl.i) w0Var).Di(list);
        sj3.a1 a1Var = this.f408469d;
        a1Var.G = Di;
        com.tencent.mm.plugin.multitalk.model.e3.Di().f473174o.getClass();
        cv.v0 Bi = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "speaker audio list changed: " + a1Var.G + ", " + Bi);
        a1Var.H.a();
        int i17 = Bi.f222516a;
        if (i17 == 2 && Bi.f222518c == 3) {
            return;
        }
        this.f408470e.c(i17 == 1, a1Var.G, Bi.f222517b);
    }
}
