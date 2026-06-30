package iu1;

/* loaded from: classes9.dex */
public final class k1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f294893e;

    public k1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI, r45.g45 g45Var) {
        this.f294892d = cardTicketListUI;
        this.f294893e = g45Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            r45.g45 g45Var = this.f294893e;
            kotlin.jvm.internal.o.d(g45Var);
            java.lang.String user_card_id = g45Var.f374871d;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            int i18 = com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.B;
            com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294892d;
            cardTicketListUI.X6(user_card_id);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            kotlin.jvm.internal.o.d(g45Var);
            objArr[0] = java.lang.Integer.valueOf(g45Var.f374875h);
            kotlin.jvm.internal.o.d(g45Var);
            objArr[1] = g45Var.f374871d;
            iu1.v0 v0Var = cardTicketListUI.f95218m;
            if (v0Var == null) {
                kotlin.jvm.internal.o.o("mTicketAdapter");
                throw null;
            }
            kotlin.jvm.internal.o.d(g45Var);
            java.lang.String user_card_id2 = g45Var.f374871d;
            kotlin.jvm.internal.o.f(user_card_id2, "user_card_id");
            kotlin.jvm.internal.o.d(g45Var);
            objArr[2] = java.lang.Integer.valueOf(v0Var.y(user_card_id2, g45Var.f374875h));
            objArr[3] = 4;
            objArr[4] = java.lang.Integer.valueOf(cardTicketListUI.f95224s);
            g0Var.d(16326, objArr);
        }
    }
}
