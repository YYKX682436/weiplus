package com.tencent.mm.plugin.finder.member.area.uic;

/* loaded from: classes2.dex */
public final class FinderMemberVideoTabContentUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f121117d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f121118e;

    /* renamed from: f, reason: collision with root package name */
    public int f121119f;

    /* renamed from: g, reason: collision with root package name */
    public int f121120g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121121h;

    /* renamed from: i, reason: collision with root package name */
    public r45.gk4 f121122i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f121123m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC$feedProgressListener$1 f121124n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f121125o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f121126p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC$feedProgressListener$1] */
    public FinderMemberVideoTabContentUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f121117d = "";
        this.f121118e = "";
        this.f121121h = "";
        this.f121123m = jz5.h.b(new go2.f1(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121124n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
                ((com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) ((jz5.n) com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC.this.f121126p).getValue()).updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.f121125o = jz5.h.b(new go2.g1(this, fragment));
        this.f121126p = jz5.h.b(new go2.e1(this));
    }

    public final com.tencent.mm.plugin.finder.feed.vl O6() {
        return (com.tencent.mm.plugin.finder.feed.vl) ((jz5.n) this.f121123m).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ado;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        alive();
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment = fragment instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment : null;
        java.lang.String str4 = "";
        if (finderMemberAreaTabFragment == null || (str = finderMemberAreaTabFragment.f121384t) == null) {
            str = "";
        }
        this.f121117d = str;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment2 : null;
        if (finderMemberAreaTabFragment2 == null || (str2 = finderMemberAreaTabFragment2.f121386v) == null) {
            str2 = "";
        }
        this.f121118e = str2;
        androidx.fragment.app.Fragment fragment3 = getFragment();
        if (fragment3 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) {
        }
        androidx.fragment.app.Fragment fragment4 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment3 = fragment4 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment4 : null;
        this.f121119f = finderMemberAreaTabFragment3 != null ? finderMemberAreaTabFragment3.f121385u : 0;
        androidx.fragment.app.Fragment fragment5 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment4 = fragment5 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment5 : null;
        this.f121120g = finderMemberAreaTabFragment4 != null ? finderMemberAreaTabFragment4.f121387w : 0;
        androidx.fragment.app.Fragment fragment6 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment5 = fragment6 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment6 : null;
        if (finderMemberAreaTabFragment5 != null && (str3 = finderMemberAreaTabFragment5.f121388x) != null) {
            str4 = str3;
        }
        this.f121121h = str4;
        androidx.fragment.app.Fragment fragment7 = getFragment();
        if (fragment7 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) {
        }
        androidx.fragment.app.Fragment fragment8 = getFragment();
        if (fragment8 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) {
        }
        androidx.fragment.app.Fragment fragment9 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment finderMemberAreaTabFragment6 = fragment9 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAreaTabFragment) fragment9 : null;
        this.f121122i = finderMemberAreaTabFragment6 != null ? finderMemberAreaTabFragment6.f121389y : null;
        ((com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) ((jz5.n) this.f121126p).getValue()).setLastBuffer(null);
        jz5.g gVar = this.f121125o;
        ((com.tencent.mm.plugin.finder.feed.wl) ((jz5.n) gVar).getValue()).T(O6());
        O6().m((com.tencent.mm.plugin.finder.feed.wl) ((jz5.n) gVar).getValue());
        androidx.fragment.app.Fragment fragment10 = getFragment();
        if (fragment10 != null) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment10).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
            if (Z6 != null) {
                Z6.d(((com.tencent.mm.plugin.finder.feed.wl) ((jz5.n) gVar).getValue()).f106180m.getRecyclerView());
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().onDetach();
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        O6().getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        O6().getClass();
    }
}
