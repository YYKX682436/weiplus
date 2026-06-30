package ut2;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.view.View view) {
        super(0);
        this.f430875d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f430875d;
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView finderLiveShoppingPriceView = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView) view.findViewById(com.tencent.mm.R.id.l58);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView finderLiveShoppingPriceView2 = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView) view.findViewById(com.tencent.mm.R.id.bhj);
        boolean z17 = true;
        if (!zl2.r4.f473950a.w1()) {
            gk2.e eVar = gk2.e.f272471n;
            if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T)) {
                z17 = false;
            }
        }
        if (z17) {
            finderLiveShoppingPriceView.setVisibility(8);
            return finderLiveShoppingPriceView2;
        }
        finderLiveShoppingPriceView2.setVisibility(8);
        return finderLiveShoppingPriceView;
    }
}
