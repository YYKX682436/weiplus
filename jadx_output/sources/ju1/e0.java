package ju1;

/* loaded from: classes9.dex */
public final class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301708d;

    public e0(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301708d = couponAndGiftCardListV4UI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ju1.j0 j0Var = this.f301708d.f95418o;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        androidx.lifecycle.j0 j0Var2 = j0Var.f301750e;
        java.util.List list = (java.util.List) j0Var.f301749d.getValue();
        j0Var2.postValue(list != null ? (r45.xt) list.get(i17) : null);
    }
}
