package ju1;

/* loaded from: classes9.dex */
public final class b1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301698a;

    public b1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301698a = historyCardListUI;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        r45.tt ttVar;
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301698a;
        ju1.j jVar = historyCardListUI.f95426o;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null || (ttVar = x17.f301690c) == null) {
            return;
        }
        int i18 = ttVar.f386780v;
        int i19 = 2;
        if (i18 == 1) {
            lu1.d.j((com.tencent.mm.ui.MMActivity) historyCardListUI.getContext(), ttVar.f386781w, 0);
        } else if (i18 != 2) {
            android.content.Intent intent = new android.content.Intent(historyCardListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
            intent.putExtra("key_card_id", ttVar.f386765d);
            intent.addFlags(131072);
            intent.putExtra("key_from_scene", 3);
            androidx.appcompat.app.AppCompatActivity context = historyCardListUI.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            r45.iu iuVar = ttVar.f386782x;
            if (iuVar != null) {
                lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
            }
        }
        int i27 = historyCardListUI.f95427p;
        if (i27 != 2 && i27 == 3) {
            i19 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListUI", "go to card detail ui, cardIndex: " + i17 + ", cardID: " + ttVar.f386765d + ", pageScene: " + i19 + ", cardType: " + ttVar.f386780v);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21329, java.lang.Integer.valueOf(i19), 1, ttVar.f386765d, java.lang.Integer.valueOf(i17));
    }
}
