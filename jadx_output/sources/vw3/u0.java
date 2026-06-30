package vw3;

/* loaded from: classes.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441129d;

    public u0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f441129d = repairerFileListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441129d;
        repairerFileListUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) repairerFileListUI.getContext(), 0, false);
        k0Var.f211872n = new vw3.v0(repairerFileListUI);
        k0Var.f211874o = new vw3.w0(repairerFileListUI);
        k0Var.f211881s = new vw3.a1(repairerFileListUI);
        k0Var.f211884v = new vw3.h1(repairerFileListUI);
        k0Var.v();
        return false;
    }
}
