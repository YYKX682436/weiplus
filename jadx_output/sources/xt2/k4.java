package xt2;

/* loaded from: classes3.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(xt2.b5 b5Var) {
        super(0);
        this.f456851d = b5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.b5 b5Var = this.f456851d;
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView = b5Var.D;
        if (finderLiveProductListOptionView == null) {
            kotlin.jvm.internal.o.o("addToBottomOptionBtn");
            throw null;
        }
        finderLiveProductListOptionView.a(true);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView2 = b5Var.C;
        if (finderLiveProductListOptionView2 != null) {
            finderLiveProductListOptionView2.a(false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("addToTopOptionBtn");
        throw null;
    }
}
