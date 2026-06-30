package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class j implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer f123390d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f123391e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f123392f;

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        g().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
    }

    public final com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer g() {
        com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer finderProfilePoiDrawer = this.f123390d;
        if (finderProfilePoiDrawer != null) {
            return finderProfilePoiDrawer;
        }
        kotlin.jvm.internal.o.o("drawer");
        throw null;
    }
}
