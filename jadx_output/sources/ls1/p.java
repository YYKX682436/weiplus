package ls1;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321006d;

    public p(ls1.e0 e0Var) {
        this.f321006d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls1.e0 e0Var = this.f321006d;
        e0Var.B1();
        boolean z17 = e0Var.f320980f2;
        boolean z18 = e0Var.f320981g2;
        if (z17 || z18) {
            return;
        }
        ax4.a.a(92);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = e0Var.P1;
        i0Var.f94291l0 = true;
        i0Var.f94293m0 = true;
        e0Var.J1();
        e0Var.I(-124);
        com.tencent.mars.xlog.Log.e(e0Var.B1(), "check notifyPage timeout");
    }
}
