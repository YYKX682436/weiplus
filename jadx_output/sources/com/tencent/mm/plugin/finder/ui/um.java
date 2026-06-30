package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class um extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ViewBindUIC f129932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(com.tencent.mm.plugin.finder.ui.ViewBindUIC viewBindUIC) {
        super(0);
        this.f129932d = viewBindUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewIdRootView = this.f129932d.getFindViewIdRootView();
        kotlin.jvm.internal.o.d(findViewIdRootView);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewIdRootView;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewIdRootView, com.tencent.mm.R.id.lq8);
        if (wxRecyclerView != null) {
            return new vb2.i(frameLayout, frameLayout, wxRecyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewIdRootView.getResources().getResourceName(com.tencent.mm.R.id.lq8)));
    }
}
