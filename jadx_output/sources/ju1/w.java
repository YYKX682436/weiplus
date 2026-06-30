package ju1;

/* loaded from: classes9.dex */
public final class w implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301799a;

    public w(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301799a = couponAndGiftCardListV4UI;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301799a;
        ju1.j jVar = couponAndGiftCardListV4UI.f95419p;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mCardsCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 != null) {
            int i18 = x17.f301688a;
            int i19 = i18 != 1 ? i18 != 2 ? -1 : i17 - 1 : i17 - 2;
            r45.tt ttVar = x17.f301690c;
            if (ttVar != null) {
                com.tencent.mars.xlog.Log.i(couponAndGiftCardListV4UI.f95415i, "go to card detail ui, cardIndex: " + i19 + ", cardID: " + ttVar.f386765d + ", cardType: " + ttVar.f386780v);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19748, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), ttVar.f386765d, java.lang.Integer.valueOf(i19), 0, 1);
                int i27 = ttVar.f386780v;
                if (i27 == 1) {
                    lu1.d.j((com.tencent.mm.ui.MMActivity) couponAndGiftCardListV4UI.getContext(), ttVar.f386781w, 0);
                } else if (i27 != 2) {
                    android.content.Intent intent = new android.content.Intent(couponAndGiftCardListV4UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
                    intent.putExtra("key_card_id", ttVar.f386765d);
                    intent.addFlags(131072);
                    intent.putExtra("key_from_scene", 3);
                    androidx.appcompat.app.AppCompatActivity context = couponAndGiftCardListV4UI.getContext();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    r45.iu iuVar = ttVar.f386782x;
                    if (iuVar != null) {
                        lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                    }
                }
                couponAndGiftCardListV4UI.f95420q = true;
            }
        }
    }
}
