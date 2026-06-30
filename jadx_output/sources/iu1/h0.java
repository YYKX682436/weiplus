package iu1;

/* loaded from: classes9.dex */
public final class h0 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294875a;

    public h0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294875a = cardInvalidTicketListUI;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        r45.g45 g45Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "click item");
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294875a;
        iu1.w0 x17 = cardInvalidTicketListUI.Y6().x(i17);
        if (x17 == null || x17.f294971a != 2 || (g45Var = x17.f294974d) == null) {
            return;
        }
        java.lang.String user_card_id = g45Var.f374871d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        cardInvalidTicketListUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "go to card detail: %s", user_card_id);
        android.content.Intent intent = new android.content.Intent(cardInvalidTicketListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", user_card_id);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        cardInvalidTicketListUI.getContext().startActivityForResult(intent, 256);
    }
}
