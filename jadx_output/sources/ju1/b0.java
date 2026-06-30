package ju1;

/* loaded from: classes9.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301697d;

    public b0(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301697d = couponAndGiftCardListV4UI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301697d;
        g4Var.d(1, couponAndGiftCardListV4UI.getResources().getColor(com.tencent.mm.R.color.f479482a31), couponAndGiftCardListV4UI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
