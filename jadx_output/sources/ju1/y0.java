package ju1;

/* loaded from: classes9.dex */
public final class y0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301804d;

    public y0(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301804d = historyCardListUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ju1.o0 o0Var = (ju1.o0) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.f95422r;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301804d;
        historyCardListUI.getClass();
        if (o0Var != null) {
            int ordinal = o0Var.ordinal();
            boolean z17 = true;
            if (ordinal == 3) {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = historyCardListUI.f95423i;
                if (loadMoreRecyclerView != null) {
                    loadMoreRecyclerView.m1(true);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mHistoryCardListRv");
                    throw null;
                }
            }
            if (ordinal == 4) {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = historyCardListUI.f95423i;
                if (loadMoreRecyclerView2 != null) {
                    loadMoreRecyclerView2.m1(false);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mHistoryCardListRv");
                    throw null;
                }
            }
            if (ordinal != 5) {
                return;
            }
            java.lang.String str = o0Var.f301782d;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                lu1.a0.q(historyCardListUI.getContext(), "");
            } else {
                lu1.a0.r(historyCardListUI.getContext(), o0Var.f301782d);
            }
        }
    }
}
