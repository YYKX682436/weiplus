package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileTingMusicFlutterUIC extends com.tencent.mm.plugin.finder.profile.uic.fk {

    /* renamed from: i, reason: collision with root package name */
    public pi0.l1 f123493i;

    /* renamed from: m, reason: collision with root package name */
    public pi0.n1 f123494m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f123495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileTingMusicFlutterUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123495n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingFinderProfileEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFlutterUIC$tingFinderProfileEvent$1
            {
                this.__eventId = 1837692789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingFinderProfileEvent tingFinderProfileEvent) {
                com.tencent.mm.autogen.events.TingFinderProfileEvent event = tingFinderProfileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tingFinderProfileEvent type ");
                am.az azVar = event.f54895g;
                sb6.append(azVar.f6197a);
                sb6.append(", listType = ");
                sb6.append(azVar.f6198b);
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTIngMusicFlutterUIC", sb6.toString());
                if (!kotlin.jvm.internal.o.b(azVar.f6197a, "refreshList") || !kotlin.jvm.internal.o.b(azVar.f6198b, "music")) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTIngMusicFlutterUIC", "tingFinderProfileEvent reloadPage!!");
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
                com.tencent.pigeon.ting.TingEmbedCallbackApi tingEmbedCallbackApi = dm4.b.f241755g;
                if (tingEmbedCallbackApi == null) {
                    return false;
                }
                tingEmbedCallbackApi.onReloadPage(com.tencent.pigeon.ting.TingEmbedPageType.FINDER_PROFILE_MUSIC.ordinal(), com.tencent.mm.plugin.finder.profile.uic.fi.f123721d);
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.df8;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFragment finderProfileTingMusicFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFragment ? (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFragment) fragment : null;
        if (finderProfileTingMusicFragment != null && finderProfileTingMusicFragment.f123496t != null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.j8p);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q5y);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingMusicFlutterUIC", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingMusicFlutterUIC", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.profile.uic.ei(this, viewGroup, null), 3, null);
        }
        if (isSelf() && isSelfFlag()) {
            this.f123495n.alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (isSelf() && isSelfFlag()) {
            this.f123495n.dead();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        pi0.n1 n1Var = this.f123494m;
        if (n1Var != null) {
            n1Var.a();
        }
    }
}
