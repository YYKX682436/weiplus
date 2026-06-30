package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f125691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f125692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f125689d = baseFinderFeed;
        this.f125690e = finderFeedSearchUI;
        this.f125691f = menuItem;
        this.f125692g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125689d;
        boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
        android.view.MenuItem menuItem = this.f125691f;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125690e;
        if (isLiveFeed) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar).Nj(context, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.search.e1(baseFinderFeed));
        } else {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            androidx.appcompat.app.AppCompatActivity context2 = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar2).Mj(context2, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), null);
        }
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        finderFeedSearchUI.getClass();
        x3Var.e(finderFeedSearchUI, userName, baseFinderFeed.getItemId(), this.f125692g);
        return jz5.f0.f302826a;
    }
}
