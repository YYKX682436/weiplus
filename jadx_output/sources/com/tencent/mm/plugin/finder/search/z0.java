package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class z0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f125990f;

    public z0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f125988d = baseFinderFeed;
        this.f125989e = finderFeedSearchUI;
        this.f125990f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125988d;
        if (!baseFinderFeed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(baseFinderFeed.getFeedObject().getFeedObject())) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125989e;
        androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o25.y1 y1Var = finderFeedSearchUI.f125552x0;
        if (y1Var == null) {
            kotlin.jvm.internal.o.o("quickMenuHelper");
            throw null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f125988d;
        kotlin.jvm.internal.o.d(g4Var);
        n7Var.d(context, y1Var, baseFinderFeed2, g4Var, this.f125990f);
    }
}
