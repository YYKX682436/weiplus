package iu1;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f294899e;

    public l0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI, r45.g45 g45Var) {
        this.f294898d = cardInvalidTicketListUI;
        this.f294899e = g45Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.f95198v;
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294898d;
        cardInvalidTicketListUI.getClass();
        r45.g45 g45Var = this.f294899e;
        if (g45Var == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardInvalidTicketListUI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(cardInvalidTicketListUI.getContext());
        textView.setText(cardInvalidTicketListUI.getString(com.tencent.mm.R.string.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(cardInvalidTicketListUI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = cardInvalidTicketListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = cardInvalidTicketListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new iu1.m0(cardInvalidTicketListUI);
        k0Var.f211881s = new iu1.n0(cardInvalidTicketListUI, g45Var);
        k0Var.v();
    }
}
