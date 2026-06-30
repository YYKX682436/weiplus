package iu1;

/* loaded from: classes.dex */
public final class l1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294900d;

    public l1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294900d = cardTicketListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.add(0, 0, 1, this.f294900d.getString(com.tencent.mm.R.string.jxt));
    }
}
