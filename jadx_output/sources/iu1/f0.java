package iu1;

/* loaded from: classes9.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294869a;

    public f0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294869a = cardInvalidTicketListUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294869a;
        cardInvalidTicketListUI.f95205r = false;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            if (cardInvalidTicketListUI.f95207t) {
                cardInvalidTicketListUI.f95207t = false;
            }
            lu1.a0.q(cardInvalidTicketListUI, "");
            return jz5.f0.f302826a;
        }
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        r45.vi3 vi3Var = (r45.vi3) fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", java.lang.Integer.valueOf(vi3Var.f388284d));
        if (vi3Var.f388284d != 0) {
            if (cardInvalidTicketListUI.f95207t) {
                cardInvalidTicketListUI.f95207t = false;
            }
            lu1.a0.r(cardInvalidTicketListUI, vi3Var.f388285e);
            return fVar2;
        }
        cardInvalidTicketListUI.f95202o = vi3Var.f388286f;
        cardInvalidTicketListUI.f95204q = vi3Var.f388287g == 1;
        boolean z17 = vi3Var.f388289i == 1;
        cardInvalidTicketListUI.f95206s = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "update clear btn: %s", java.lang.Boolean.valueOf(z17));
        boolean z18 = cardInvalidTicketListUI.f95206s;
        java.util.ArrayList arrayList = cardInvalidTicketListUI.f95201n;
        if (z18) {
            cardInvalidTicketListUI.addTextOptionMenu(0, cardInvalidTicketListUI.getString(com.tencent.mm.R.string.arp), new iu1.q0(cardInvalidTicketListUI));
            if (arrayList.isEmpty()) {
                cardInvalidTicketListUI.enableOptionMenu(0, false);
            } else {
                cardInvalidTicketListUI.enableOptionMenu(0, true);
            }
        } else {
            cardInvalidTicketListUI.removeOptionMenu(0);
        }
        if (cardInvalidTicketListUI.f95204q) {
            cardInvalidTicketListUI.Z6().m1(false);
        } else {
            cardInvalidTicketListUI.Z6().m1(true);
        }
        if (cardInvalidTicketListUI.f95207t) {
            arrayList.clear();
            cardInvalidTicketListUI.f95207t = false;
        }
        cardInvalidTicketListUI.b7(vi3Var.f388288h);
        return fVar2;
    }
}
