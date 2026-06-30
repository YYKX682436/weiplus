package ju1;

/* loaded from: classes9.dex */
public final class x implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301801a;

    public x(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301801a = couponAndGiftCardListV4UI;
    }

    @Override // vl1.o
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f301801a;
        ju1.j jVar = couponAndGiftCardListV4UI.f95419p;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mCardsCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null) {
            return false;
        }
        int i18 = x17.f301688a;
        if (i18 != 1 && i18 != 2) {
            return false;
        }
        rl5.r rVar = new rl5.r(couponAndGiftCardListV4UI.getContext(), view);
        rVar.f397351u = new ju1.z(couponAndGiftCardListV4UI);
        rVar.f397354x = new ju1.a0(couponAndGiftCardListV4UI, x17);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 3, 3);
        return false;
    }
}
