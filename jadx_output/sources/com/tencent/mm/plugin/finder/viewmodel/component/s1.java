package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f135850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var) {
        super(0);
        this.f135850d = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView R6 = this.f135850d.R6();
        if (R6 != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = R6.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
            com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "[smoothScrollToNextPosition] nextPosition=" + w17);
            R6.post(new com.tencent.mm.plugin.finder.viewmodel.component.e2(R6, w17));
        }
        return jz5.f0.f302826a;
    }
}
