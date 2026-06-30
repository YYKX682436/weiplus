package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q5 implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124144b;

    public q5(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f124143a = f4Var;
        this.f124144b = finderProfileFeedUIC;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        if (java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / appBarLayout.getTotalScrollRange()) < 1.0d) {
            recyclerView = this.f124144b.getRecyclerView();
            kotlin.jvm.internal.o.f(recyclerView, "access$getRecyclerView(...)");
            this.f124143a.T6(recyclerView, false, 11);
        }
    }
}
