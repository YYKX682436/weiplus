package vw3;

/* loaded from: classes.dex */
public final class u5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI f441145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441146e;

    public u5(com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI, java.lang.String str) {
        this.f441145d = repairerShowMsgXmlUI;
        this.f441146e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI = this.f441145d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) repairerShowMsgXmlUI.getContext(), 0, false);
        k0Var.f211872n = new vw3.s5(repairerShowMsgXmlUI);
        k0Var.f211881s = new vw3.t5(repairerShowMsgXmlUI, this.f441146e);
        k0Var.v();
        return true;
    }
}
