package ju1;

/* loaded from: classes9.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f301715e;

    public f0(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI, java.util.List list) {
        this.f301714d = couponAndGiftCardListV4UI;
        this.f301715e = list;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301714d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) couponAndGiftCardListV4UI.getContext(), 1, false);
        k0Var.f211872n = new ju1.d0(this.f301715e);
        k0Var.f211881s = new ju1.e0(couponAndGiftCardListV4UI);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 3, 1);
        return false;
    }
}
