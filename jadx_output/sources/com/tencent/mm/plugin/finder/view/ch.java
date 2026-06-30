package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class ch implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostOriginView f131777a;

    public ch(com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView) {
        this.f131777a = finderPostOriginView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        int i17 = com.tencent.mm.plugin.finder.view.FinderPostOriginView.C;
        com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView = this.f131777a;
        finderPostOriginView.h(z17);
        com.tencent.mm.ui.widget.MMSwitchBtn view = finderPostOriginView.f131377e;
        java.util.Map c17 = finderPostOriginView.c(java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        kotlin.jvm.internal.o.g(view, "view");
        hc2.v0.b(view, "original_statement", "view_clk", 0, c17, null, 20, null);
    }
}
