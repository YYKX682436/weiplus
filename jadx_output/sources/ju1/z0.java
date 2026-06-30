package ju1;

/* loaded from: classes9.dex */
public final class z0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301806d;

    public z0(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301806d = historyCardListUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.f95422r;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301806d;
        historyCardListUI.getClass();
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(historyCardListUI.getContext(), historyCardListUI.getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = historyCardListUI.f95428q;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        historyCardListUI.f95428q = u3Var;
    }
}
