package ju1;

/* loaded from: classes9.dex */
public final class v implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301797a;

    public v(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301797a = couponAndGiftCardListV4UI;
    }

    @Override // vl1.j
    public final void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301797a;
        ju1.j0 j0Var = couponAndGiftCardListV4UI.f95418o;
        if (j0Var != null) {
            j0Var.Q6(couponAndGiftCardListV4UI);
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }
}
