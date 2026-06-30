package iu1;

/* loaded from: classes9.dex */
public final class f1 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294870a;

    public f1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294870a = cardTicketListUI;
    }

    @Override // vl1.o
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "long click item");
        com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294870a;
        iu1.v0 v0Var = cardTicketListUI.f95218m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 x17 = v0Var.x(i17);
        if (x17 != null) {
            r45.g45 g45Var = x17.f294974d;
            if (x17.f294971a == 2) {
                kotlin.jvm.internal.o.d(view);
                if (g45Var != null) {
                    rl5.r rVar = new rl5.r(cardTicketListUI.getContext(), view);
                    rVar.f397351u = new iu1.h1(cardTicketListUI);
                    rVar.f397354x = new iu1.i1(cardTicketListUI, g45Var);
                    android.graphics.Point a17 = lu1.b0.a(view);
                    rVar.n(a17.x, a17.y);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = java.lang.Integer.valueOf(g45Var.f374875h);
                    java.lang.String user_card_id = g45Var.f374871d;
                    objArr[1] = user_card_id;
                    iu1.v0 v0Var2 = cardTicketListUI.f95218m;
                    if (v0Var2 == null) {
                        kotlin.jvm.internal.o.o("mTicketAdapter");
                        throw null;
                    }
                    kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
                    objArr[2] = java.lang.Integer.valueOf(v0Var2.y(user_card_id, g45Var.f374875h));
                    objArr[3] = 2;
                    objArr[4] = java.lang.Integer.valueOf(cardTicketListUI.f95224s);
                    g0Var.d(16326, objArr);
                } else {
                    cardTicketListUI.getClass();
                }
            }
        }
        return false;
    }
}
