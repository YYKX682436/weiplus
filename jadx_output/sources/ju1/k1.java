package ju1;

/* loaded from: classes9.dex */
public final class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f301756e;

    public k1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI, java.util.List list) {
        this.f301755d = historyCardListUI;
        this.f301756e = list;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301755d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) historyCardListUI.getContext(), 1, false);
        k0Var.f211872n = new ju1.i1(this.f301756e);
        k0Var.f211881s = new ju1.j1(historyCardListUI);
        k0Var.v();
        return false;
    }
}
