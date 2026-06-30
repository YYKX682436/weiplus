package ju1;

/* loaded from: classes9.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301692e;

    public a0(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI, ju1.a aVar) {
        this.f301691d = couponAndGiftCardListV4UI;
        this.f301692e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.f95414s;
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301691d;
        couponAndGiftCardListV4UI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) couponAndGiftCardListV4UI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(couponAndGiftCardListV4UI.getContext());
        textView.setText(couponAndGiftCardListV4UI.getString(com.tencent.mm.R.string.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(couponAndGiftCardListV4UI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = couponAndGiftCardListV4UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = couponAndGiftCardListV4UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new ju1.b0(couponAndGiftCardListV4UI);
        k0Var.f211881s = new ju1.c0(couponAndGiftCardListV4UI, this.f301692e);
        k0Var.v();
    }
}
