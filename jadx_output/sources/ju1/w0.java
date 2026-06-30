package ju1;

/* loaded from: classes9.dex */
public final class w0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301800d;

    public w0(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301800d = historyCardListUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.iu iuVar;
        r45.xt xtVar = (r45.xt) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.f95422r;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301800d;
        historyCardListUI.getClass();
        if (xtVar != null) {
            int i18 = xtVar.f390385e;
            if (i18 != 1) {
                if (i18 == 2 && (iuVar = xtVar.f390387g) != null) {
                    lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                    return;
                }
                return;
            }
            java.lang.String str = xtVar.f390386f;
            if (str != null) {
                lu1.d.j(historyCardListUI, str, 0);
            }
        }
    }
}
