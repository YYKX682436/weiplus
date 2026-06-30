package iu1;

/* loaded from: classes9.dex */
public final class i0 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294878a;

    public i0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294878a = cardInvalidTicketListUI;
    }

    @Override // vl1.o
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "long click item");
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294878a;
        iu1.w0 x17 = cardInvalidTicketListUI.Y6().x(i17);
        if (x17 == null || x17.f294971a != 2) {
            return false;
        }
        r45.g45 g45Var = x17.f294974d;
        kotlin.jvm.internal.o.d(view);
        if (g45Var == null) {
            cardInvalidTicketListUI.getClass();
            return false;
        }
        rl5.r rVar = new rl5.r(cardInvalidTicketListUI.getContext(), view);
        rVar.f397351u = new iu1.k0(cardInvalidTicketListUI);
        rVar.f397354x = new iu1.l0(cardInvalidTicketListUI, g45Var);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        return false;
    }
}
