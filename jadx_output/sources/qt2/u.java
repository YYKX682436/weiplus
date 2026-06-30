package qt2;

/* loaded from: classes2.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f366611d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f366612e;

    /* renamed from: f, reason: collision with root package name */
    public long f366613f;

    /* renamed from: g, reason: collision with root package name */
    public int f366614g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f366615h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f366616i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f366617m;

    /* renamed from: n, reason: collision with root package name */
    public qt2.j f366618n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f366619o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f366620p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f366621q;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f366622r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f366623s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f366624t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f366625u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366615h = true;
        this.f366617m = new java.util.ArrayList();
        this.f366619o = jz5.h.b(new qt2.q(this));
        this.f366623s = jz5.h.b(new qt2.t(this));
        this.f366625u = jz5.h.b(new qt2.s(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T6(qt2.u r6, r45.jt2 r7, java.lang.String r8, long r9, int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt2.u.T6(qt2.u, r45.jt2, java.lang.String, long, int, java.lang.Object):void");
    }

    public final in5.s0 O6() {
        if (this.f366611d == null) {
            return null;
        }
        boolean z17 = false;
        if (this.f366613f == 0) {
            androidx.recyclerview.widget.k3 q07 = P6().q0(0, false);
            if (q07 instanceof in5.s0) {
                return (in5.s0) q07;
            }
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = P6().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            androidx.recyclerview.widget.k3 q08 = P6().q0(w17, false);
            in5.s0 s0Var = q08 instanceof in5.s0 ? (in5.s0) q08 : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
            if (!(baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                baseFinderFeed = null;
            }
            if (baseFinderFeed != null && baseFinderFeed.getItemId() == this.f366613f) {
                z17 = true;
            }
            if (z17) {
                this.f366614g = w17;
                return s0Var;
            }
        }
        return null;
    }

    public final androidx.recyclerview.widget.RecyclerView P6() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366611d;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final pf5.b0 Q6(java.lang.Class cls) {
        pf5.b0 e17;
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null && (e17 = pf5.z.f353948a.b(fragment).e(cls)) != null) {
            return e17;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return pf5.z.f353948a.a(activity).e(cls);
    }

    public final void R6(java.lang.String source) {
        boolean z17;
        kotlin.jvm.internal.o.g(source, "source");
        if (this.f366620p) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f366612e;
            if (baseFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            if (baseFeedLoader.getDataListJustForAdapter().size() >= 2 && this.f366615h) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                if (((com.tencent.mm.plugin.finder.viewmodel.component.a4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).f133729y) {
                    return;
                }
                java.util.ArrayList arrayList = this.f366617m;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qt2.j jVar = (qt2.j) it.next();
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = this.f366612e;
                    if (baseFeedLoader2 == null) {
                        kotlin.jvm.internal.o.o("feedLoader");
                        throw null;
                    }
                    jVar.R6(baseFeedLoader2.getDataListJustForAdapter());
                }
                in5.s0 O6 = O6();
                if (O6 != null) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            if (((qt2.j) it6.next()).f366589f) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("FinderShareGuideManageUIC", "handlePopupViews: return for source=" + source + ", uicTag=" + O6.f293124h);
                        return;
                    }
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        qt2.j jVar2 = (qt2.j) it7.next();
                        if (jVar2.X6() && !((java.lang.Boolean) ((jz5.n) this.f366619o).getValue()).booleanValue()) {
                            com.tencent.mars.xlog.Log.i("FinderShareGuideManageUIC", "handlePopupViews: source=" + source + ", uicTag=" + jVar2.getTag());
                            jVar2.S6(P6());
                            jVar2.Y6();
                            this.f366618n = jVar2;
                            if (this.f366624t) {
                                boolean z18 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
                                jz5.g gVar = this.f366625u;
                                if (!z18) {
                                    android.app.Activity context = getContext();
                                    kotlin.jvm.internal.o.g(context, "context");
                                    pf5.z zVar = pf5.z.f353948a;
                                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                                        throw new java.lang.IllegalStateException("Check failed.".toString());
                                    }
                                    java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                    kotlin.jvm.internal.o.f(a17, "get(...)");
                                    fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
                                    if (n17 != null) {
                                        n17.d((qt2.r) ((jz5.n) gVar).getValue());
                                        return;
                                    }
                                    return;
                                }
                                android.app.Activity context2 = getContext();
                                kotlin.jvm.internal.o.g(context2, "context");
                                pf5.z zVar2 = pf5.z.f353948a;
                                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                androidx.fragment.app.Fragment fragment = getFragment();
                                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
                                fc2.c Y6 = nyVar.Y6(finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : -1);
                                if (Y6 != null) {
                                    Y6.d((qt2.r) ((jz5.n) gVar).getValue());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void S6(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader) {
        qt2.h0 h0Var;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f366611d = recyclerView;
        this.f366612e = feedLoader;
        P6().i(new qt2.p(this));
        qt2.e eVar = (qt2.e) Q6(qt2.e.class);
        java.util.ArrayList arrayList = this.f366617m;
        if (eVar != null) {
            arrayList.add(eVar);
        }
        qt2.f0 f0Var = (qt2.f0) Q6(qt2.f0.class);
        if (f0Var != null) {
            arrayList.add(f0Var);
        }
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue() || (h0Var = (qt2.h0) Q6(qt2.h0.class)) == null) {
            return;
        }
        arrayList.add(h0Var);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        getIntent().getBooleanExtra("is_from_ad", false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = false;
        if (!((com.tencent.mm.plugin.finder.viewmodel.component.h50) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.h50.class)).P6()) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.th) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.th.class)).getClass();
            if (!((gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, false) ^ true) && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0) < 3)) {
                z17 = true;
            }
        }
        this.f366615h = z17;
        ((com.tencent.mm.plugin.finder.share.FinderShareGuideManageUIC$videoFinishListener$2$1) ((jz5.n) this.f366623s).getValue()).alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        wu5.c cVar = this.f366622r;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366615h = true;
        this.f366617m = new java.util.ArrayList();
        this.f366619o = jz5.h.b(new qt2.q(this));
        this.f366623s = jz5.h.b(new qt2.t(this));
        this.f366625u = jz5.h.b(new qt2.s(this));
    }
}
