package sj3;

/* loaded from: classes13.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408546d;

    public h0(sj3.a1 a1Var) {
        this.f408546d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "controlBottomLayout height update");
        sj3.a1 a1Var = this.f408546d;
        sj3.a1.a(a1Var, (int) a1Var.c().getY());
        int intValue = ((java.lang.Number) ((jz5.n) a1Var.f408408v).getValue()).intValue();
        android.view.View c17 = a1Var.c();
        kotlin.jvm.internal.o.f(c17, "access$getControlBottomLayout(...)");
        a1Var.f408403q.invoke(java.lang.Integer.valueOf(intValue - pm0.v.s(c17)[1]));
    }
}
