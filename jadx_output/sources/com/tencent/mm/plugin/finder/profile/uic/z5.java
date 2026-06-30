package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class z5 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f124414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124415e;

    public z5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f124415e = finderProfileFeedUIC;
        if (!com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.OnOpenDrawerListener");
        }
        this.f124414d = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) newProxyInstance;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        this.f124414d.a(f17);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f124414d.b();
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        if (z17) {
            feedLoader = this.f124415e.getFeedLoader();
            feedLoader.getProgressUpdateOperator().b("DrawerOpen");
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void d() {
        this.f124414d.d();
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void f() {
        this.f124414d.f();
    }
}
