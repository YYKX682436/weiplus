package iu1;

/* loaded from: classes9.dex */
public final class e1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294863a;

    public e1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294863a = cardTicketListUI;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        r45.iu iuVar;
        r45.nj4 nj4Var;
        r45.iu iuVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "click item");
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294863a;
        iu1.v0 v0Var = cardTicketListUI.f95218m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 x17 = v0Var.x(i17);
        if (x17 != null) {
            int i18 = x17.f294971a;
            if (i18 == 1) {
                r45.h45 h45Var = x17.f294973c;
                if (h45Var != null) {
                    int i19 = h45Var.f375828g;
                    if (i19 == 1) {
                        lu1.d.j(cardTicketListUI, h45Var.f375829h, 0);
                    } else if (i19 == 2 && (iuVar = h45Var.f375830i) != null) {
                        lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 7);
                return;
            }
            if (i18 != 2) {
                if (i18 == 3 && (nj4Var = x17.f294975e) != null) {
                    int i27 = nj4Var.f381446g;
                    if (i27 == 1) {
                        lu1.d.j(cardTicketListUI, nj4Var.f381447h, 0);
                        cardTicketListUI.f95229x = true;
                        return;
                    }
                    if (i27 == 2 && (iuVar2 = nj4Var.f381448i) != null) {
                        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
                        l81.b1 b1Var = new l81.b1();
                        b1Var.f317012a = iuVar2.f377328d;
                        b1Var.f317022f = iuVar2.f377329e;
                        b1Var.f317018d = iuVar2.f377330f;
                        b1Var.f317032k = 1028;
                        b1Var.L = cardTicketListUI.f95231z;
                        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(cardTicketListUI, b1Var);
                        return;
                    }
                    return;
                }
                return;
            }
            r45.g45 g45Var = x17.f294974d;
            if (g45Var != null) {
                java.lang.String user_card_id = g45Var.f374871d;
                kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
                cardTicketListUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "go to card detail: %s", user_card_id);
                android.content.Intent intent = new android.content.Intent(cardTicketListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
                intent.putExtra("key_card_id", user_card_id);
                intent.addFlags(131072);
                intent.putExtra("key_from_scene", 3);
                cardTicketListUI.startActivityForResult(intent, 256);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(16322, 10);
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(g45Var.f374875h);
                java.lang.String user_card_id2 = g45Var.f374871d;
                objArr[1] = user_card_id2;
                iu1.v0 v0Var2 = cardTicketListUI.f95218m;
                if (v0Var2 == null) {
                    kotlin.jvm.internal.o.o("mTicketAdapter");
                    throw null;
                }
                kotlin.jvm.internal.o.f(user_card_id2, "user_card_id");
                objArr[2] = java.lang.Integer.valueOf(v0Var2.y(user_card_id2, g45Var.f374875h));
                objArr[3] = 1;
                objArr[4] = java.lang.Integer.valueOf(cardTicketListUI.f95224s);
                g0Var.d(16326, objArr);
            }
        }
    }
}
