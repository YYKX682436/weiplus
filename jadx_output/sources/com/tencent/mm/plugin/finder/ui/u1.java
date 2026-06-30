package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI) {
        super(0);
        this.f129895d = finderBlockListSearchUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f129895d.findViewById(com.tencent.mm.R.id.bkb);
        com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) findViewById;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.e_p);
        if (wxRecyclerView != null) {
            return new vb2.d(touchableLayout, touchableLayout, wxRecyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(com.tencent.mm.R.id.e_p)));
    }
}
