package ju1;

/* loaded from: classes9.dex */
public final class q implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301788d;

    public q(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301788d = couponAndGiftCardListV4UI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.f95414s;
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301788d;
        couponAndGiftCardListV4UI.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        couponAndGiftCardListV4UI.removeAllOptionMenu();
        couponAndGiftCardListV4UI.addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new ju1.f0(couponAndGiftCardListV4UI, list));
    }
}
