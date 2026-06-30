package iu1;

/* loaded from: classes9.dex */
public final class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294842b;

    public b1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI, java.lang.String str) {
        this.f294841a = cardTicketListUI;
        this.f294842b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294841a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.hd0 hd0Var = (r45.hd0) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "retCode: %s", java.lang.Integer.valueOf(hd0Var.f376062d));
            if (hd0Var.f376062d == 0) {
                iu1.v0 v0Var = cardTicketListUI.f95218m;
                if (v0Var == null) {
                    kotlin.jvm.internal.o.o("mTicketAdapter");
                    throw null;
                }
                v0Var.z(this.f294842b);
            } else {
                lu1.a0.r(cardTicketListUI, hd0Var.f376063e);
            }
        } else {
            lu1.a0.q(cardTicketListUI, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.B;
        cardTicketListUI.Z6(bool);
        return jz5.f0.f302826a;
    }
}
