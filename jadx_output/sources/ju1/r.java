package ju1;

/* loaded from: classes9.dex */
public final class r implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301790d;

    public r(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301790d = couponAndGiftCardListV4UI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        r45.xt xtVar = (r45.xt) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.f95414s;
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301790d;
        couponAndGiftCardListV4UI.getClass();
        if (xtVar != null) {
            int i18 = xtVar.f390385e;
            if (i18 == 1) {
                java.lang.String str2 = xtVar.f390386f;
                if (str2 != null) {
                    lu1.d.j(couponAndGiftCardListV4UI, str2, 0);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                r45.iu iuVar = xtVar.f390387g;
                if (iuVar != null) {
                    lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                    return;
                }
                return;
            }
            if (i18 == 3 && (str = xtVar.f390388h) != null && kotlin.jvm.internal.o.b(str, "weixin://mktcard/couponv2history")) {
                java.lang.String str3 = xtVar.f390384d;
                com.tencent.mars.xlog.Log.i(couponAndGiftCardListV4UI.f95415i, "go to coupon history card list: title " + str3);
                android.content.Intent intent = new android.content.Intent(couponAndGiftCardListV4UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.class);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
                intent.putExtra("card_type", 2);
                androidx.appcompat.app.AppCompatActivity context = couponAndGiftCardListV4UI.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCouponHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCouponHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 3, 2);
            }
        }
    }
}
