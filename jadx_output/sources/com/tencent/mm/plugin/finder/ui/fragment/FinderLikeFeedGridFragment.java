package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/kd;", "Lcom/tencent/mm/plugin/finder/feed/jd;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikeFeedGridFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.feed.kd, com.tencent.mm.plugin.finder.feed.jd> {

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.jd f129272u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.kd f129273v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader f129274w;

    /* renamed from: x, reason: collision with root package name */
    public final int f129275x = 2;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f129276y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashSet f129277z;

    public FinderLikeFeedGridFragment() {
        this.f129265p = 102;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.feed.kd kdVar = this.f129273v;
        if (kdVar != null) {
            return kdVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f129277z = new java.util.HashSet();
        F0(0);
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108026s;
        com.tencent.mm.ui.MMActivity activity = y0();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader(false, m0Var, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderLikedFeedLoader.setInitDone(new wu2.t(this));
        finderLikedFeedLoader.f107475g = new wu2.u(this, finderLikedFeedLoader);
        finderLikedFeedLoader.f107476h = new wu2.v(this, finderLikedFeedLoader);
        this.f129274w = finderLikedFeedLoader;
        com.tencent.mm.ui.MMActivity y07 = y0();
        int i17 = this.f129275x;
        com.tencent.mm.ui.MMActivity y08 = y0();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = y08 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) y08 : null;
        this.f129272u = new com.tencent.mm.plugin.finder.feed.jd(y07, this, i17, mMFinderUI != null ? mMFinderUI.getD() : 0, G0());
        com.tencent.mm.ui.MMActivity y09 = y0();
        int i18 = this.f129275x;
        com.tencent.mm.ui.MMActivity y010 = y0();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = y010 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) y010 : null;
        wu2.w wVar = new wu2.w(this, view, y09, i18, mMFinderUI2 != null ? mMFinderUI2.getD() : 0);
        this.f129273v = wVar;
        com.tencent.mm.plugin.finder.feed.jd jdVar = this.f129272u;
        if (jdVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        wVar.T(jdVar);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dft);
        if (textView != null) {
            textView.setText(y0().getString(com.tencent.mm.R.string.mhy));
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment$initOnCreate$3
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new wu2.x(event, com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment.this));
                return true;
            }
        };
        this.f129276y = iListener;
        iListener.alive();
        y0().addIconOptionMenu(0, com.tencent.mm.R.string.f491416d10, com.tencent.mm.R.raw.icons_outlined_search, new wu2.y(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void F0(int i17) {
        if (i17 > 0) {
            int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            java.lang.String string = y0().getResources().getString(com.tencent.mm.R.string.d1k, java.lang.String.valueOf(i17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            y0().setMMTitle(hc2.x0.k(string, y0(), '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        } else {
            int dimension2 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            java.lang.String string2 = y0().getResources().getString(com.tencent.mm.R.string.d1l);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            y0().setMMTitle(hc2.x0.k(string2, y0(), '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension2, dimension2, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        }
        android.widget.TextView mMTitleView = y0().getMMTitleView();
        if (mMTitleView != null) {
            mMTitleView.setContentDescription(y0().getString(com.tencent.mm.R.string.eqr));
        }
        super.F0(i17);
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader G0() {
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f129274w;
        if (finderLikedFeedLoader != null) {
            return finderLikedFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aky;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ut.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.mm.sdk.event.IListener iListener = this.f129276y;
        if (iListener != null) {
            iListener.dead();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.util.HashSet hashSet = this.f129277z;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                G0().remove(longValue, true);
                bu2.e0.f24498a.e(longValue, 2);
                if (G0().getSize() == 0) {
                    com.tencent.mm.plugin.finder.feed.kd kdVar = this.f129273v;
                    if (kdVar == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    kdVar.U();
                }
            }
        }
        F0(G0().f107473e);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF() {
        return 35;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void w0() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.jd jdVar = this.f129272u;
        if (jdVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = jdVar.f107156e;
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
        com.tencent.mm.plugin.finder.feed.jd jdVar = this.f129272u;
        if (jdVar != null) {
            return jdVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
