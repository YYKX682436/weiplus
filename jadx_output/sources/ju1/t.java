package ju1;

/* loaded from: classes9.dex */
public final class t implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301794d;

    public t(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301794d = couponAndGiftCardListV4UI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ju1.o0 o0Var = (ju1.o0) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.f95414s;
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301794d;
        couponAndGiftCardListV4UI.getClass();
        if (o0Var != null) {
            int ordinal = o0Var.ordinal();
            boolean z17 = true;
            if (ordinal == 3) {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = couponAndGiftCardListV4UI.f95416m;
                if (loadMoreRecyclerView != null) {
                    loadMoreRecyclerView.m1(true);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mCouponCardListRv");
                    throw null;
                }
            }
            if (ordinal == 4) {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = couponAndGiftCardListV4UI.f95416m;
                if (loadMoreRecyclerView2 != null) {
                    loadMoreRecyclerView2.m1(false);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mCouponCardListRv");
                    throw null;
                }
            }
            if (ordinal != 5) {
                return;
            }
            java.lang.String str = o0Var.f301782d;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                lu1.a0.q(couponAndGiftCardListV4UI.getContext(), "");
            } else {
                lu1.a0.r(couponAndGiftCardListV4UI.getContext(), o0Var.f301782d);
            }
        }
    }
}
