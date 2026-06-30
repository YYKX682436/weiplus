package ju1;

/* loaded from: classes9.dex */
public final class v0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301798d;

    public v0(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301798d = historyCardListUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.f95422r;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301798d;
        historyCardListUI.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        historyCardListUI.removeAllOptionMenu();
        historyCardListUI.addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new ju1.k1(historyCardListUI, list));
    }
}
