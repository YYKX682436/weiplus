package iu1;

/* loaded from: classes.dex */
public final class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294921d;

    public m0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294921d = cardInvalidTicketListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294921d;
        g4Var.d(1, cardInvalidTicketListUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), cardInvalidTicketListUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
