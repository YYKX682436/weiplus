package ju1;

/* loaded from: classes9.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f301728f;

    public h1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI, ju1.a aVar, int i17) {
        this.f301726d = historyCardListUI;
        this.f301727e = aVar;
        this.f301728f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.f95422r;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301726d;
        historyCardListUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) historyCardListUI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(historyCardListUI.getContext());
        textView.setText(historyCardListUI.getString(com.tencent.mm.R.string.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(historyCardListUI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = historyCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = historyCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new ju1.d1(historyCardListUI);
        k0Var.f211881s = new ju1.e1(historyCardListUI, this.f301727e, this.f301728f);
        k0Var.v();
    }
}
