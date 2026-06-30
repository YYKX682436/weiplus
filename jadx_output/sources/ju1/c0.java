package ju1;

/* loaded from: classes9.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301702e;

    public c0(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI, ju1.a aVar) {
        this.f301701d = couponAndGiftCardListV4UI;
        this.f301702e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ju1.j0 j0Var = this.f301701d.f95418o;
            if (j0Var != null) {
                j0Var.P6(this.f301702e);
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
    }
}
