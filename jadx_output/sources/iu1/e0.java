package iu1;

/* loaded from: classes9.dex */
public final class e0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294862b;

    public e0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI, java.lang.String str) {
        this.f294861a = cardInvalidTicketListUI;
        this.f294862b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294861a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.fd0 fd0Var = (r45.fd0) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", java.lang.Integer.valueOf(fd0Var.f374220d));
            if (fd0Var.f374220d == 0) {
                cardInvalidTicketListUI.Y6().z(this.f294862b);
            } else {
                lu1.a0.r(cardInvalidTicketListUI, fd0Var.f374221e);
            }
        } else {
            lu1.a0.q(cardInvalidTicketListUI, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.f95198v;
        cardInvalidTicketListUI.a7(bool);
        return jz5.f0.f302826a;
    }
}
