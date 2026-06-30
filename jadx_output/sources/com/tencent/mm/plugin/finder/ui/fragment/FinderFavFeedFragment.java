package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/l7;", "Lcom/tencent/mm/plugin/finder/feed/i7;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFavFeedFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.feed.l7, com.tencent.mm.plugin.finder.feed.i7> {
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.i7 f129255u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.l7 f129256v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader f129257w;

    /* renamed from: x, reason: collision with root package name */
    public final int f129258x = 2;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f129259y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashSet f129260z;

    public FinderFavFeedFragment() {
        this.f129265p = 100;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.feed.l7 l7Var = this.f129256v;
        if (l7Var != null) {
            return l7Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f129260z = new java.util.HashSet();
        F0(0);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.tencent.mm.ui.MMActivity activity = y0();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader(e17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false);
        finderFavFeedLoader.setInitDone(new wu2.g(this, finderFavFeedLoader));
        finderFavFeedLoader.f107410f = new wu2.h(this);
        this.f129257w = finderFavFeedLoader;
        com.tencent.mm.ui.MMActivity y07 = y0();
        int i17 = this.f129258x;
        com.tencent.mm.ui.MMActivity y08 = y0();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = y08 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) y08 : null;
        this.f129255u = new com.tencent.mm.plugin.finder.feed.i7(y07, this, i17, mMFinderUI != null ? mMFinderUI.getD() : 0, G0());
        com.tencent.mm.ui.MMActivity y09 = y0();
        int i18 = this.f129258x;
        com.tencent.mm.ui.MMActivity y010 = y0();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = y010 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) y010 : null;
        wu2.i iVar = new wu2.i(this, view, y09, i18, mMFinderUI2 != null ? mMFinderUI2.getD() : 0);
        this.f129256v = iVar;
        com.tencent.mm.plugin.finder.feed.i7 i7Var = this.f129255u;
        if (i7Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        iVar.T(i7Var);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$initOnCreate$3
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new wu2.j(event, com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment.this));
                return true;
            }
        };
        this.f129259y = iListener;
        iListener.alive();
        y0().addIconOptionMenu(0, com.tencent.mm.R.string.f491416d10, com.tencent.mm.R.raw.icons_outlined_search, new wu2.k(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void F0(int i17) {
        java.lang.String str;
        r45.rl2 a17 = cu2.f0.f222391a.a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
        if (a17 == null || (str = a17.getString(1)) == null) {
            str = "";
        }
        java.lang.String string = i17 > 0 ? y0().getString(com.tencent.mm.R.string.cuq, java.lang.Integer.valueOf(i17)) : y0().getString(com.tencent.mm.R.string.cuo);
        kotlin.jvm.internal.o.d(string);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            int dimension = (int) y0().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            y0().setMMTitle(hc2.x0.k(string, y0(), '#', com.tencent.mm.R.raw.icons_outlined_star_new_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.A));
            wu2.m mVar = new wu2.m(this, string);
            b17.getClass();
            b17.f447873d = mVar;
            b17.a();
        }
        android.widget.TextView mMTitleView = y0().getMMTitleView();
        if (mMTitleView != null) {
            mMTitleView.setContentDescription(y0().getString(com.tencent.mm.R.string.cur));
        }
        super.F0(i17);
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader G0() {
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f129257w;
        if (finderFavFeedLoader != null) {
            return finderFavFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.agx;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ut.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.mm.sdk.event.IListener iListener = this.f129259y;
        if (iListener != null) {
            iListener.dead();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.util.HashSet hashSet = this.f129260z;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                G0().remove(longValue, true);
                bu2.e0.f24498a.e(longValue, 10);
                if (G0().getSize() == 0) {
                    com.tencent.mm.plugin.finder.feed.l7 l7Var = this.f129256v;
                    if (l7Var == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    l7Var.U();
                    com.tencent.mm.plugin.finder.feed.l7 l7Var2 = this.f129256v;
                    if (l7Var2 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    android.view.View f213435x = l7Var2.f106180m.getF213435x();
                    if (f213435x != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        java.util.HashSet hashSet2 = this.f129260z;
        if ((hashSet2 != null ? hashSet2.size() : 0) > 0) {
            com.tencent.mm.plugin.finder.feed.l7 l7Var3 = this.f129256v;
            if (l7Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            l7Var3.W();
        }
        F0(G0().f107411g);
        if (this.A) {
            com.tencent.mm.plugin.finder.feed.l7 l7Var4 = this.f129256v;
            if (l7Var4 != null) {
                l7Var4.W();
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127895q8).getValue()).r()).booleanValue() ? 163 : 24;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void w0() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.i7 i7Var = this.f129255u;
        if (i7Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = i7Var.f107156e;
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader : null;
        if (finderFavFeedLoader == null || (arrayList = finderFavFeedLoader.f107415n) == null) {
            arrayList = new java.util.ArrayList();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, y0(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Wj(y0(), intent, 7, arrayList);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.feed.i7 i7Var = this.f129255u;
        if (i7Var != null) {
            return i7Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
