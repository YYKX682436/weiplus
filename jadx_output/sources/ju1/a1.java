package ju1;

/* loaded from: classes9.dex */
public final class a1 implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301693a;

    public a1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301693a = historyCardListUI;
    }

    @Override // vl1.j
    public final void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301693a;
        ju1.k kVar = historyCardListUI.f95425n;
        if (kVar != null) {
            kVar.Q6(historyCardListUI);
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }
}
