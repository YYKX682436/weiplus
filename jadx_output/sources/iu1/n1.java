package iu1;

/* loaded from: classes.dex */
public final class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294927d;

    public n1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294927d = cardTicketListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294927d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardTicketListUI.getContext(), 1, false);
        k0Var.f211872n = new iu1.l1(cardTicketListUI);
        k0Var.f211881s = new iu1.m1(cardTicketListUI);
        k0Var.v();
        return false;
    }
}
