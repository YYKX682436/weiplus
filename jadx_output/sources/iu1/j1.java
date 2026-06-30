package iu1;

/* loaded from: classes.dex */
public final class j1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294886d;

    public j1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294886d = cardTicketListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294886d;
        g4Var.d(1, cardTicketListUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), cardTicketListUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
