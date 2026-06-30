package ju1;

/* loaded from: classes9.dex */
public final class u implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301796d;

    public u(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301796d = couponAndGiftCardListV4UI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.f95414s;
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301796d;
        couponAndGiftCardListV4UI.getClass();
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(couponAndGiftCardListV4UI.getContext(), couponAndGiftCardListV4UI.getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = couponAndGiftCardListV4UI.f95421r;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        couponAndGiftCardListV4UI.f95421r = u3Var;
    }
}
