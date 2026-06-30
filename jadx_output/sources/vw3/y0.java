package vw3;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f441188d = repairerFileListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ix3.a2 a2Var;
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441188d;
        j75.f stateCenter = repairerFileListUI.getStateCenter();
        if (stateCenter != null && (a2Var = (ix3.a2) stateCenter.getState()) != null) {
            com.tencent.mm.vfs.w6.f(a2Var.f295361f);
        }
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        com.tencent.mm.view.recyclerview.WxRecyclerView a17 = repairerFileListUI.V6().a();
        kotlin.jvm.internal.o.f(a17, "getRecyclerView(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a18 = xm3.u0.a(a17);
        if (a18 != null) {
            a18.v(kz5.p0.f313996d, true);
        }
        pm0.v.X(new vw3.x0(repairerFileListUI));
        return jz5.f0.f302826a;
    }
}
