package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class th extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f136025d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f136026e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f136027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136029h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136030i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f136031m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f136032n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136027f = new com.tencent.mm.plugin.finder.viewmodel.component.rh(this);
        this.f136029h = true;
        this.f136032n = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public final void O6(boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN;
        boolean z18 = !c17.o(u3Var, false);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f136025d;
        boolean c18 = recyclerView != null ? vd2.m3.f435809a.c(recyclerView) : false;
        pf5.u uVar = pf5.u.f353936a;
        boolean z19 = ((ey2.n0) uVar.e(c61.l7.class).a(ey2.n0.class)).N6(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f257430a != 0;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0);
        if (!this.f136028g) {
            this.f136028g = z17;
        }
        if (this.f136028g && (baseFinderFeed = this.f136031m) != null) {
            baseFinderFeed.U1(-1);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCheckShowGuide] isUseNewGuide=");
        sb6.append(z19);
        sb6.append(" isShowGuideTips:");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f136031m;
        sb6.append(baseFinderFeed2 != null ? java.lang.Integer.valueOf(baseFinderFeed2.getIsShowGuideTips()) : null);
        sb6.append(" isFirst=");
        sb6.append(z18);
        sb6.append(", liveListIsVisible:");
        sb6.append(c18);
        sb6.append(",recyclerView is null:");
        sb6.append(this.f136025d == null);
        com.tencent.mars.xlog.Log.i("Finder.FullFeedGuideUIC", sb6.toString());
        if (!z18 || c18 || z19 || this.f136028g || !this.f136029h) {
            return;
        }
        this.f136032n.postUIDelayed(this.f136027f, 2000L);
        if (r17 >= 3) {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        }
    }

    public final void P6(so2.j5 j5Var) {
        pf5.u uVar = pf5.u.f353936a;
        if (((ey2.n0) uVar.e(c61.l7.class).a(ey2.n0.class)).N6(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f257430a != 0) {
            com.tencent.mars.xlog.Log.w("Finder.FullFeedGuideUIC", "isUseNewGuide");
            return;
        }
        if (this.f136028g) {
            com.tencent.mars.xlog.Log.w("Finder.FullFeedGuideUIC", "first video media type placeholder no show guide");
            return;
        }
        if (!this.f136029h) {
            com.tencent.mars.xlog.Log.w("Finder.FullFeedGuideUIC", "no show guide by share tips");
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, false);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT;
        int r17 = c17.r(u3Var, 0);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f136025d;
        boolean c18 = recyclerView != null ? vd2.m3.f435809a.c(recyclerView) : false;
        com.tencent.mars.xlog.Log.i("Finder.FullFeedGuideUIC", "setShowGuideFeed isFirst:" + z17 + ",liveListIsVisible:" + c18);
        if (!z17 || c18 || !(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) || r17 >= 3) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        baseFinderFeed.U1(1);
        this.f136031m = baseFinderFeed;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f136025d;
        androidx.recyclerview.widget.f2 adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.c0(baseFinderFeed.getItemId());
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f136031m != null) {
            android.view.View view = this.f136026e;
            if ((view != null && view.getVisibility() == 0) && (recyclerView = this.f136025d) != null) {
                recyclerView.scrollBy(0, -((int) recyclerView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479662c0)));
            }
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136029h = !((com.tencent.mm.plugin.finder.viewmodel.component.h50) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.h50.class)).P6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f136031m;
        if (baseFinderFeed != null) {
            baseFinderFeed.U1(-1);
        }
        this.f136032n.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136027f = new com.tencent.mm.plugin.finder.viewmodel.component.rh(this);
        this.f136029h = true;
        this.f136032n = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }
}
