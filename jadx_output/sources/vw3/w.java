package vw3;

/* loaded from: classes3.dex */
public final class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441163d;

    public w(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f441163d = repairerBlockDetectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI.e;
        com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = this.f441163d;
        repairerBlockDetectUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) repairerBlockDetectUI.getContext(), 0, false);
        k0Var.f211872n = new vw3.x(repairerBlockDetectUI);
        k0Var.f211881s = new vw3.z(repairerBlockDetectUI);
        k0Var.v();
        return false;
    }
}
