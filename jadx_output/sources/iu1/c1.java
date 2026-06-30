package iu1;

/* loaded from: classes9.dex */
public final class c1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f294846b;

    public c1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI, boolean z17) {
        this.f294845a = cardTicketListUI;
        this.f294846b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294845a;
        cardTicketListUI.f95222q = false;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            if (cardTicketListUI.f95223r) {
                cardTicketListUI.f95223r = false;
            }
            lu1.a0.q(cardTicketListUI, "");
            return jz5.f0.f302826a;
        }
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        r45.xi3 xi3Var = (r45.xi3) fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "retCode: %s", java.lang.Integer.valueOf(xi3Var.f390137d));
        if (xi3Var.f390137d != 0) {
            lu1.a0.r(cardTicketListUI, xi3Var.f390138e);
            if (!cardTicketListUI.f95223r) {
                return fVar2;
            }
            cardTicketListUI.f95223r = false;
            return fVar2;
        }
        cardTicketListUI.f95219n = xi3Var.f390139f;
        boolean z17 = xi3Var.f390140g == 1;
        cardTicketListUI.f95221p = z17;
        if (z17) {
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = cardTicketListUI.f95217i;
            if (loadMoreRecyclerView == null) {
                kotlin.jvm.internal.o.o("mTicketRv");
                throw null;
            }
            loadMoreRecyclerView.m1(false);
        } else {
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = cardTicketListUI.f95217i;
            if (loadMoreRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("mTicketRv");
                throw null;
            }
            loadMoreRecyclerView2.m1(true);
        }
        if (cardTicketListUI.f95223r || this.f294846b) {
            cardTicketListUI.f95227v.clear();
            cardTicketListUI.f95225t.clear();
            cardTicketListUI.f95226u.clear();
            cardTicketListUI.f95228w = null;
            cardTicketListUI.f95223r = false;
        }
        cardTicketListUI.a7(xi3Var.f390141h, xi3Var.f390142i, xi3Var.f390143m, xi3Var.f390144n);
        return fVar2;
    }
}
