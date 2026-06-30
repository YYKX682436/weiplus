package vw3;

/* loaded from: classes.dex */
public final class u3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f441142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f441143e;

    public u3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI, com.tencent.mm.storage.f9 f9Var) {
        this.f441142d = repairerMsgResendUI;
        this.f441143e = f9Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI = this.f441142d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) repairerMsgResendUI.getContext(), 0, false);
        com.tencent.mm.storage.f9 f9Var = this.f441143e;
        k0Var.f211872n = new vw3.o3(repairerMsgResendUI, f9Var);
        k0Var.f211881s = new vw3.t3(repairerMsgResendUI, f9Var);
        k0Var.v();
        return true;
    }
}
