package iu1;

/* loaded from: classes.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f294926e;

    public n0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI, r45.g45 g45Var) {
        this.f294925d = cardInvalidTicketListUI;
        this.f294926e = g45Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            r45.g45 g45Var = this.f294926e;
            kotlin.jvm.internal.o.d(g45Var);
            java.lang.String user_card_id = g45Var.f374871d;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            int i18 = com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.f95198v;
            com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294925d;
            cardInvalidTicketListUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "do delete ticket: %s", user_card_id);
            cardInvalidTicketListUI.a7(java.lang.Boolean.TRUE);
            new au1.i(user_card_id).l().h(new iu1.e0(cardInvalidTicketListUI, user_card_id));
        }
    }
}
