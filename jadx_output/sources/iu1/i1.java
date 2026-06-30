package iu1;

/* loaded from: classes9.dex */
public final class i1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f294880e;

    public i1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI, r45.g45 g45Var) {
        this.f294879d = cardTicketListUI;
        this.f294880e = g45Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.B;
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294879d;
        cardTicketListUI.getClass();
        r45.g45 g45Var = this.f294880e;
        if (g45Var == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardTicketListUI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(cardTicketListUI.getContext());
        textView.setText(cardTicketListUI.getString(com.tencent.mm.R.string.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(cardTicketListUI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = cardTicketListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = cardTicketListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new iu1.j1(cardTicketListUI);
        k0Var.f211881s = new iu1.k1(cardTicketListUI, g45Var);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(g45Var.f374875h);
        java.lang.String user_card_id = g45Var.f374871d;
        objArr[1] = user_card_id;
        iu1.v0 v0Var = cardTicketListUI.f95218m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("mTicketAdapter");
            throw null;
        }
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        objArr[2] = java.lang.Integer.valueOf(v0Var.y(user_card_id, g45Var.f374875h));
        objArr[3] = 3;
        objArr[4] = java.lang.Integer.valueOf(cardTicketListUI.f95224s);
        g0Var.d(16326, objArr);
        k0Var.v();
    }
}
