package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileAllLayoutUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.profile.uic.p0 f123413t = new com.tencent.mm.plugin.finder.profile.uic.p0(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123414d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123415e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.s f123416f;

    /* renamed from: g, reason: collision with root package name */
    public int f123417g;

    /* renamed from: h, reason: collision with root package name */
    public int f123418h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$feedProgressListener$1 f123419i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f123420m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123421n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123422o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123423p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f123424q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f123425r;

    /* renamed from: s, reason: collision with root package name */
    public r45.nb1 f123426s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$feedProgressListener$1] */
    public FinderProfileAllLayoutUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f123414d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.x0(activity));
        this.f123415e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.l1(activity));
        this.f123416f = new com.tencent.wechat.aff.emoticon.s();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123419i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateProgress] localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i("Finder.ProfileAllLayoutUIC", sb6.toString());
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.this.f123425r.updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.f123421n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.a1(this));
        this.f123422o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.n1(this));
        this.f123423p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.y0(this));
        this.f123424q = jz5.h.b(com.tencent.mm.plugin.finder.profile.uic.m1.f123967d);
        this.f123425r = new com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1

            /* renamed from: d, reason: collision with root package name */
            public java.lang.String f123427d;

            {
                super(null, 1, null);
                this.f123427d = "FinderProfileAllLayoutUIC.BaseFeedLoader";
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
            public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
                return new com.tencent.mm.plugin.finder.profile.uic.s0();
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.internal.DataStore
            /* renamed from: getTAG, reason: from getter */
            public java.lang.String getF123427d() {
                return this.f123427d;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public boolean isObservePostEvent() {
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.this;
                android.app.Activity context = finderProfileAllLayoutUIC.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf()) {
                    android.app.Activity context2 = finderProfileAllLayoutUIC.getContext();
                    kotlin.jvm.internal.o.g(context2, "context");
                    pf5.z zVar2 = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, mv2.w0
            public void onPostOk(long j17, long j18) {
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
                super.onPostOk(j17, j18);
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
                if (h17 == null) {
                    return;
                }
                h17.setLocalId(j17);
                h17.setProfileTabScene(3);
                com.tencent.mars.xlog.Log.i(this.f123427d, "[onPostOk] svrID:" + pm0.v.u(j18) + " localId:" + j17);
                if (h17.isMemberFeed() && (supportMemberFeedType() & h17.getLocalMemberFeedType()) == 0) {
                    return;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed transformFinderObj = transformFinderObj(h17);
                com.tencent.mm.plugin.finder.profile.uic.dk V6 = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.this.V6();
                if (V6 == null || (feedLoader = V6.getFeedLoader()) == null) {
                    return;
                }
                feedLoader.updateByLocalId(transformFinderObj, false);
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public com.tencent.mm.plugin.finder.model.BaseFinderFeed onPostStart(long j17, boolean z17) {
                com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
                if (f17 == null) {
                    return null;
                }
                if (f17.isMemberFeed() && (supportMemberFeedType() & f17.getLocalMemberFeedType()) == 0) {
                    return null;
                }
                if (f17.isMvFeed() && interceptMvPostStart()) {
                    return null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed transformFinderObj = transformFinderObj(f17);
                transformFinderObj.V1(!hc2.s.b());
                transformFinderObj.X1(z17);
                transformFinderObj.getFeedObject().setProfileTabScene(3);
                java.lang.String str = this.f123427d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPostStart localId");
                sb6.append(j17);
                sb6.append(" videoSectionItemSize:");
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.this;
                sb6.append(finderProfileAllLayoutUIC.f123418h);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                int i17 = finderProfileAllLayoutUIC.f123418h;
                if (i17 > 0) {
                    if (i17 == finderProfileAllLayoutUIC.f123417g + 1) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.t0(finderProfileAllLayoutUIC, this));
                    }
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.u0(this, transformFinderObj, finderProfileAllLayoutUIC));
                }
                return transformFinderObj;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.internal.DataStore
            public void setTAG(java.lang.String str) {
                kotlin.jvm.internal.o.g(str, "<set-?>");
                this.f123427d = str;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, int i17) {
        android.app.Activity context = finderProfileAllLayoutUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        if (finderProfileTabUIC != null) {
            int i18 = 0;
            for (java.lang.Object obj : finderProfileTabUIC.Y6()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj).f129265p == i17) {
                    com.tencent.mm.plugin.finder.profile.uic.a2 P6 = finderProfileAllLayoutUIC.P6();
                    if (P6 != null) {
                        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = P6.getRecyclerView();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileAllUIC", "scrollToTop", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileAllUIC", "scrollToTop", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(finderProfileTabUIC, i18, false, 2, null);
                }
                i18 = i19;
            }
        }
    }

    public final com.tencent.mm.plugin.finder.profile.uic.a2 P6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a17).D7(com.tencent.mm.plugin.finder.profile.FinderProfileAllFragment.class);
        if (D7 == null) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.profile.uic.a2) pf5.z.f353948a.b(D7).e(com.tencent.mm.plugin.finder.profile.uic.a2.class);
    }

    public final void Q6(js2.b bVar, r45.qb1 qb1Var, java.util.List list, java.util.List list2) {
        boolean z17;
        if (qb1Var == null || !(z17 = qb1Var.f383797d)) {
            list.addAll(list2);
            return;
        }
        bVar.f301514n = z17;
        bVar.f301516p = qb1Var.f383798e;
        bVar.f301517q = qb1Var.f383799f;
        bVar.f301515o = false;
        bVar.f301518r = new com.tencent.mm.plugin.finder.profile.uic.v0(this, list2);
    }

    public final boolean R6(r45.ob1 ob1Var, int i17) {
        return ob1Var.f382126w == 1 && i17 < ob1Var.f382115i;
    }

    public final int S6(java.lang.Class itemClazz) {
        kotlin.jvm.internal.o.g(itemClazz, "itemClazz");
        if (kotlin.jvm.internal.o.b(itemClazz, js2.b.class) ? true : kotlin.jvm.internal.o.b(itemClazz, js2.a.class) ? true : kotlin.jvm.internal.o.b(itemClazz, com.tencent.mm.plugin.finder.playlist.e.class) ? true : kotlin.jvm.internal.o.b(itemClazz, ms2.c.class) ? true : kotlin.jvm.internal.o.b(itemClazz, so2.o0.class) ? true : kotlin.jvm.internal.o.b(itemClazz, so2.m0.class)) {
            return 1;
        }
        if (!kotlin.jvm.internal.o.b(itemClazz, zb2.a.class)) {
            if (kotlin.jvm.internal.o.b(itemClazz, nr2.m.class)) {
                return 1;
            }
            if (!kotlin.jvm.internal.o.b(itemClazz, js2.c.class)) {
                return 3;
            }
        }
        return 2;
    }

    public final java.util.ArrayList T6() {
        return this.f123425r.getDataList();
    }

    public final long U6() {
        r45.so2 so2Var = (r45.so2) ((jz5.n) this.f123415e).getValue();
        return so2Var != null ? so2Var.getLong(1) : ((java.lang.Number) ((jz5.n) this.f123421n).getValue()).longValue();
    }

    public final com.tencent.mm.plugin.finder.profile.uic.dk V6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a17).D7(com.tencent.mm.plugin.finder.profile.FinderProfileAllFragment.class);
        if (D7 != null) {
            return (com.tencent.mm.plugin.finder.profile.uic.dk) pf5.z.f353948a.b(D7).a(com.tencent.mm.plugin.finder.profile.uic.dk.class);
        }
        return null;
    }

    public final void W6(int i17, java.util.List list) {
        T6().addAll(list);
    }

    public final void X6(boolean z17) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).A;
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        java.util.List f76 = finderProfileTabUIC.f7();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f76, 10));
        java.util.Iterator it = f76.iterator();
        while (true) {
            java.lang.CharSequence charSequence = null;
            if (!it.hasNext()) {
                break;
            }
            zx2.i iVar = (zx2.i) it.next();
            zx2.k kVar = iVar instanceof zx2.k ? (zx2.k) iVar : null;
            if (kVar != null) {
                charSequence = kVar.i(finderProfileTabUIC.getContext());
            }
            arrayList.add(charSequence);
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "#", null, null, 0, null, com.tencent.mm.plugin.finder.profile.uic.g1.f123725d, 30, null);
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar3.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("tab_location", str);
        android.app.Activity context4 = getContext();
        kotlin.jvm.internal.o.g(context4, "context");
        pf5.z zVar4 = pf5.z.f353948a;
        if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar4.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("tab_list", g07);
        if (z17) {
            com.tencent.mm.plugin.finder.profile.uic.a2 P6 = P6();
            if (P6 != null) {
                com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(P6, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADING, null, 2, null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.a2 P62 = P6();
        if (P62 != null) {
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(P62, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED, null, 2, null);
        }
    }

    public final void Y6(r45.nb1 nb1Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        if (nb1Var == null) {
            return;
        }
        this.f123426s = nb1Var;
        X6(false);
        T6().clear();
        Z6(nb1Var);
        com.tencent.mm.plugin.finder.profile.uic.a2 P6 = P6();
        if (P6 != null && (recyclerView = P6.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.w0(this));
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Za;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 0) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).getClass();
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ey7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        finderProfileTabUIC.getClass();
        finderProfileTabUIC.A = string;
        com.tencent.mm.plugin.finder.profile.uic.a2 P62 = P6();
        if (P62 != null) {
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(P62, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED, null, 2, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x010e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC, com.tencent.mm.ui.component.UIComponent, pf5.e] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.util.List] */
    public final void Z6(r45.nb1 nb1Var) {
        jz5.f0 f0Var;
        java.util.LinkedList<r45.ob1> linkedList;
        java.lang.Throwable th6;
        java.lang.Object next;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        java.util.LinkedList list;
        int i17;
        java.util.LinkedList list2;
        r45.pb1 pb1Var = nb1Var.f381227d;
        int i18 = 0;
        java.lang.Throwable th7 = null;
        if (pb1Var == null || (linkedList = pb1Var.f382920d) == null) {
            f0Var = null;
        } else {
            for (r45.ob1 ob1Var : linkedList) {
                com.tencent.mars.xlog.Log.i("Finder.ProfileAllLayoutUIC", "homePage section: " + ob1Var.f382111e + ", sectionCount: " + ob1Var.f382115i + ", canShowMore: " + ob1Var.f382126w);
                r45.vj6 vj6Var = ob1Var.f382125v;
                int i19 = 10;
                int i27 = 1;
                if (vj6Var != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("logTabInfo username=");
                    sb6.append(getUsername());
                    sb6.append(", tabInfo=");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[LayoutConfig]\n");
                    sb7.append("\tscene=".concat(f123413t.a(getContext(), vj6Var.getInteger(i18))));
                    sb7.append('\n');
                    java.util.LinkedList list3 = vj6Var.getList(1);
                    kotlin.jvm.internal.o.f(list3, "getLayout(...)");
                    int i28 = i18;
                    for (java.lang.Object obj : list3) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw th7;
                        }
                        r45.wj6 wj6Var = (r45.wj6) obj;
                        sb7.append("\t\t[TabLayout#" + i29 + "] type=" + wj6Var.getInteger(i18) + " rowCount=" + wj6Var.getInteger(1));
                        sb7.append('\n');
                        i28 = i29;
                    }
                    java.lang.String sb8 = sb7.toString();
                    kotlin.jvm.internal.o.f(sb8, "toString(...)");
                    sb6.append(sb8);
                    com.tencent.mars.xlog.Log.i("Finder.ProfileAllLayoutUIC", sb6.toString());
                    ((r45.zc1) ((jz5.n) this.f123424q).getValue()).getList(i18).add(vj6Var);
                }
                int i37 = ob1Var.f382110d;
                int i38 = 2;
                if (i37 == 2) {
                    r45.o23 o23Var = ob1Var.f382113g;
                    if (o23Var != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.Companion companion = com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.INSTANCE;
                        java.lang.String username = getUsername();
                        if (username == null) {
                            username = "";
                        }
                        arrayList.addAll(companion.getPostingItems(username, 0, Integer.MAX_VALUE, this.f123425r.supportMemberFeedType()));
                        java.util.LinkedList object_items = o23Var.f381842d;
                        kotlin.jvm.internal.o.f(object_items, "object_items");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : object_items) {
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
                            kotlin.jvm.internal.o.d(finderObject);
                            if (hc2.o0.C(finderObject)) {
                                arrayList2.add(obj2);
                            }
                        }
                        cu2.t tVar = cu2.u.f222441a;
                        arrayList.addAll(tVar.j(arrayList2, 2, (r45.qt2) ((jz5.n) this.f123414d).getValue()));
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
                            }
                            java.lang.String username2 = getUsername();
                            int i39 = 1;
                            tVar.m(arrayList3, 2, username2 != null ? username2 : "", true);
                            r45.vj6 vj6Var2 = ob1Var.f382125v;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            arrayList6.addAll(arrayList);
                            if (vj6Var2 != null && (list = vj6Var2.getList(1)) != null) {
                                java.util.Iterator it6 = list.iterator();
                                java.util.ArrayList arrayList7 = arrayList6;
                                while (it6.hasNext()) {
                                    int integer = ((r45.wj6) it6.next()).getInteger(i39) * S6(so2.u1.class);
                                    this.f123417g = integer;
                                    int size = arrayList7.size();
                                    if (size <= integer) {
                                        integer = size;
                                    }
                                    java.util.List subList = arrayList7.subList(0, integer);
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(subList, 10));
                                    int i47 = 0;
                                    for (java.lang.Object obj3 : subList) {
                                        int i48 = i47 + 1;
                                        if (i47 < 0) {
                                            kz5.c0.p();
                                            throw null;
                                        }
                                        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) obj3);
                                        p17.getFeedObject().setProfileTabScene(3);
                                        p17.getFeedObject().setProfileTabIndex(i47);
                                        arrayList8.add(p17);
                                        i47 = i48;
                                    }
                                    ?? subList2 = arrayList7.subList(integer, arrayList7.size());
                                    arrayList5.addAll(arrayList8);
                                    i39 = 1;
                                    arrayList7 = subList2;
                                }
                            }
                            th6 = null;
                            java.util.Iterator it7 = arrayList5.iterator();
                            while (it7.hasNext()) {
                                so2.j5 j5Var = (so2.j5) it7.next();
                                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                                    baseFinderFeed.getFeedObject().setProfileTabSize(arrayList5.size());
                                    if (U6() != 0 && j5Var.getItemId() == U6()) {
                                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                                        if (!baseFinderFeed2.getFeedObject().isLiveFeed()) {
                                            baseFinderFeed2.v1(true);
                                            baseFinderFeed2.F1((r45.so2) ((jz5.n) this.f123415e).getValue());
                                        }
                                    }
                                    baseFinderFeed.getFeedObject().setProfileTabScene(3);
                                }
                            }
                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                            java.util.Iterator it8 = arrayList5.iterator();
                            while (it8.hasNext()) {
                                java.lang.Object next2 = it8.next();
                                so2.j5 j5Var2 = (so2.j5) next2;
                                if ((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).K0()) {
                                    arrayList9.add(next2);
                                }
                            }
                            java.util.Iterator it9 = arrayList9.iterator();
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (it9.hasNext()) {
                                    so2.j5 j5Var3 = (so2.j5) next;
                                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3 : null;
                                    int createTime = (baseFinderFeed3 == null || (feedObject2 = baseFinderFeed3.getFeedObject()) == null) ? 0 : feedObject2.getCreateTime();
                                    do {
                                        java.lang.Object next3 = it9.next();
                                        so2.j5 j5Var4 = (so2.j5) next3;
                                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = j5Var4 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var4 : null;
                                        int createTime2 = (baseFinderFeed4 == null || (feedObject = baseFinderFeed4.getFeedObject()) == null) ? 0 : feedObject.getCreateTime();
                                        if (createTime < createTime2) {
                                            next = next3;
                                            createTime = createTime2;
                                        }
                                    } while (it9.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            so2.j5 j5Var5 = (so2.j5) next;
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = j5Var5 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var5 : null;
                            if (baseFinderFeed5 != null) {
                                baseFinderFeed5.O1(true);
                            }
                            int i49 = ob1Var.f382115i;
                            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ckt);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            arrayList4.add(new js2.b(3, string, false, i49, false, false, new com.tencent.mm.plugin.finder.profile.uic.k1(this), false, false, null, null, null, 4000, null));
                            arrayList4.addAll(arrayList5);
                            this.f123418h = arrayList4.size();
                            W6(3, arrayList4);
                            th7 = th6;
                            i18 = 0;
                        }
                    }
                } else if (i37 == 3) {
                    r45.yx0 yx0Var = ob1Var.f382114h;
                    if (yx0Var != null) {
                        r45.wx0 wx0Var = yx0Var.f391456d;
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(wx0Var != null ? wx0Var.getList(0) : null)) {
                            r45.vj6 vj6Var3 = ob1Var.f382125v;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            r45.wx0 wx0Var2 = yx0Var.f391456d;
                            int integer2 = wx0Var2 != null ? wx0Var2.getInteger(1) : 0;
                            java.util.LinkedList list4 = wx0Var2 != null ? wx0Var2.getList(0) : null;
                            if (list4 == null) {
                                list4 = new java.util.LinkedList();
                            }
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            arrayList12.addAll(list4);
                            if (vj6Var3 != null) {
                                int i57 = 1;
                                java.util.LinkedList list5 = vj6Var3.getList(1);
                                if (list5 != null) {
                                    java.util.Iterator it10 = list5.iterator();
                                    java.util.ArrayList arrayList13 = arrayList12;
                                    while (it10.hasNext()) {
                                        int integer3 = ((r45.wj6) it10.next()).getInteger(i57) * S6(com.tencent.mm.plugin.finder.playlist.e.class);
                                        int size2 = arrayList13.size();
                                        if (size2 <= integer3) {
                                            integer3 = size2;
                                        }
                                        java.util.List subList3 = arrayList13.subList(0, integer3);
                                        java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(subList3, 10));
                                        int i58 = 0;
                                        for (java.lang.Object obj4 : subList3) {
                                            int i59 = i58 + 1;
                                            if (i58 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            java.util.Iterator it11 = it10;
                                            com.tencent.mm.plugin.finder.playlist.e eVar = new com.tencent.mm.plugin.finder.playlist.e((r45.vx0) obj4);
                                            eVar.f122292e = i58;
                                            arrayList14.add(eVar);
                                            i58 = i59;
                                            it10 = it11;
                                        }
                                        arrayList11.addAll(arrayList14);
                                        it10 = it10;
                                        i57 = 1;
                                        arrayList13 = arrayList13.subList(integer3, arrayList13.size());
                                    }
                                }
                            }
                            java.util.Iterator it12 = arrayList11.iterator();
                            while (it12.hasNext()) {
                                so2.j5 j5Var6 = (so2.j5) it12.next();
                                com.tencent.mm.plugin.finder.playlist.e eVar2 = j5Var6 instanceof com.tencent.mm.plugin.finder.playlist.e ? (com.tencent.mm.plugin.finder.playlist.e) j5Var6 : null;
                                if (eVar2 != null) {
                                    eVar2.f122293f = arrayList11.size();
                                }
                            }
                            boolean R6 = R6(ob1Var, arrayList11.size());
                            java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.cko);
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            js2.b bVar = new js2.b(4, string2, false, integer2, false, true, null, false, false, null, null, null, 4032, null);
                            arrayList10.add(bVar);
                            if (R6) {
                                java.lang.String string3 = getContext().getResources().getString(com.tencent.mm.R.string.ckn);
                                kotlin.jvm.internal.o.f(string3, "getString(...)");
                                com.tencent.mm.plugin.finder.profile.uic.c1 c1Var = new com.tencent.mm.plugin.finder.profile.uic.c1(this, wx0Var2);
                                i17 = 4;
                                arrayList11.add(new js2.a(4, string3, c1Var));
                            } else {
                                i17 = 4;
                            }
                            Q6(bVar, yx0Var.f391457e, arrayList10, arrayList11);
                            W6(i17, arrayList10);
                        }
                    }
                } else if (i37 == 6) {
                    r45.h72 h72Var = ob1Var.f382120q;
                    if (h72Var != null) {
                        java.util.LinkedList live_replay_items = h72Var.f375913d;
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(live_replay_items)) {
                            r45.vj6 vj6Var4 = ob1Var.f382125v;
                            java.util.ArrayList arrayList15 = new java.util.ArrayList();
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            kotlin.jvm.internal.o.f(live_replay_items, "live_replay_items");
                            java.util.ArrayList arrayList17 = new java.util.ArrayList();
                            for (java.lang.Object obj5 : live_replay_items) {
                                r45.nw1 liveInfo = ((com.tencent.mm.protocal.protobuf.FinderObject) obj5).getLiveInfo();
                                if (!(liveInfo != null && liveInfo.getInteger(31) == 6)) {
                                    arrayList17.add(obj5);
                                }
                            }
                            java.util.ArrayList arrayList18 = new java.util.ArrayList(kz5.d0.q(arrayList17, 10));
                            java.util.Iterator it13 = arrayList17.iterator();
                            int i66 = 0;
                            while (it13.hasNext()) {
                                java.lang.Object next4 = it13.next();
                                int i67 = i66 + 1;
                                if (i66 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) next4;
                                kotlin.jvm.internal.o.d(finderObject2);
                                so2.r2 r2Var = new so2.r2(finderObject2, i38);
                                r2Var.a1(ya2.h.f460484a.b(getUsername()));
                                r2Var.getFeedObject().setProfileTabScene(5);
                                r2Var.getFeedObject().setProfileTabIndex(i66);
                                arrayList18.add(r2Var);
                                i66 = i67;
                                i38 = 2;
                            }
                            java.util.ArrayList arrayList19 = new java.util.ArrayList();
                            arrayList19.addAll(arrayList18);
                            if (vj6Var4 != null) {
                                int i68 = 1;
                                java.util.LinkedList list6 = vj6Var4.getList(1);
                                if (list6 != null) {
                                    java.util.Iterator it14 = list6.iterator();
                                    java.util.ArrayList arrayList20 = arrayList19;
                                    while (it14.hasNext()) {
                                        int integer4 = ((r45.wj6) it14.next()).getInteger(i68) * S6(so2.q2.class);
                                        int size3 = arrayList20.size();
                                        if (size3 <= integer4) {
                                            integer4 = size3;
                                        }
                                        arrayList16.addAll(arrayList20.subList(0, integer4));
                                        i68 = 1;
                                        arrayList20 = arrayList20.subList(integer4, arrayList20.size());
                                    }
                                }
                            }
                            int i69 = ob1Var.f382115i;
                            java.util.Iterator it15 = arrayList18.iterator();
                            while (it15.hasNext()) {
                                ((so2.r2) it15.next()).getFeedObject().setProfileTabSize(arrayList16.size());
                            }
                            java.lang.String string4 = getContext().getResources().getString(com.tencent.mm.R.string.ckv);
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            js2.b bVar2 = new js2.b(5, string4, arrayList16.size() < i69, i69, ob1Var.f382126w == 1, false, new com.tencent.mm.plugin.finder.profile.uic.f1(this), false, false, null, null, null, 4000, null);
                            arrayList15.add(bVar2);
                            Q6(bVar2, h72Var.f375914e, arrayList15, arrayList16);
                            W6(5, arrayList15);
                        }
                    }
                } else if (i37 == 8) {
                    r45.tu0 tu0Var = ob1Var.f382123t;
                    if (tu0Var != null) {
                        java.util.LinkedList linkedList2 = tu0Var.f386809e;
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                            r45.vj6 vj6Var5 = ob1Var.f382125v;
                            java.util.ArrayList arrayList21 = new java.util.ArrayList();
                            java.util.ArrayList arrayList22 = new java.util.ArrayList();
                            java.util.ArrayList arrayList23 = new java.util.ArrayList();
                            java.util.LinkedList linkedList3 = new java.util.LinkedList();
                            if (linkedList2 != null) {
                                int i76 = 0;
                                for (java.lang.Object obj6 : linkedList2) {
                                    int i77 = i76 + 1;
                                    if (i76 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    r45.ig4 ig4Var = (r45.ig4) obj6;
                                    kotlin.jvm.internal.o.d(ig4Var);
                                    linkedList3.add(new ms2.c(ig4Var, null));
                                    i76 = i77;
                                }
                            }
                            arrayList23.addAll(linkedList3);
                            if (vj6Var5 != null) {
                                int i78 = 1;
                                java.util.LinkedList list7 = vj6Var5.getList(1);
                                if (list7 != null) {
                                    java.util.Iterator it16 = list7.iterator();
                                    java.util.ArrayList arrayList24 = arrayList23;
                                    while (it16.hasNext()) {
                                        int integer5 = ((r45.wj6) it16.next()).getInteger(i78) * S6(ms2.c.class);
                                        int size4 = arrayList24.size();
                                        if (size4 <= integer5) {
                                            integer5 = size4;
                                        }
                                        arrayList22.addAll(arrayList24.subList(0, integer5));
                                        i78 = 1;
                                        arrayList24 = arrayList24.subList(integer5, arrayList24.size());
                                    }
                                }
                            }
                            int i79 = ob1Var.f382115i;
                            boolean R62 = R6(ob1Var, arrayList22.size());
                            java.lang.String string5 = getContext().getResources().getString(com.tencent.mm.R.string.f0d);
                            kotlin.jvm.internal.o.f(string5, "getString(...)");
                            js2.b bVar3 = new js2.b(10, string5, false, i79, false, true, null, false, false, null, null, null, 4032, null);
                            arrayList21.add(bVar3);
                            if (R62) {
                                java.lang.String string6 = getContext().getResources().getString(com.tencent.mm.R.string.ckz);
                                kotlin.jvm.internal.o.f(string6, "getString(...)");
                                arrayList22.add(new js2.a(10, string6, new com.tencent.mm.plugin.finder.profile.uic.b1(this)));
                            }
                            Q6(bVar3, tu0Var.f386811g, arrayList21, arrayList22);
                            java.util.Iterator it17 = arrayList22.iterator();
                            int i86 = 0;
                            while (it17.hasNext()) {
                                java.lang.Object next5 = it17.next();
                                int i87 = i86 + 1;
                                if (i86 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                so2.j5 j5Var7 = (so2.j5) next5;
                                ms2.c cVar = j5Var7 instanceof ms2.c ? (ms2.c) j5Var7 : null;
                                if (cVar != null) {
                                    cVar.f330971f = i86;
                                    cVar.f330972g = arrayList22.size();
                                }
                                i86 = i87;
                            }
                            W6(10, arrayList21);
                        }
                    }
                } else if (i37 != 9) {
                    switch (i37) {
                        case 13:
                            r45.eo2 eo2Var = ob1Var.f382127x;
                            if (eo2Var != null) {
                                java.util.LinkedList paid_collections = eo2Var.f373618d;
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(paid_collections)) {
                                    r45.vj6 vj6Var6 = ob1Var.f382125v;
                                    java.util.ArrayList arrayList25 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList26 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                                    kotlin.jvm.internal.o.f(paid_collections, "paid_collections");
                                    arrayList27.addAll(paid_collections);
                                    if (vj6Var6 != null) {
                                        int i88 = 1;
                                        java.util.LinkedList list8 = vj6Var6.getList(1);
                                        if (list8 != null) {
                                            java.util.Iterator it18 = list8.iterator();
                                            arrayList27 = arrayList27;
                                            while (it18.hasNext()) {
                                                int integer6 = ((r45.wj6) it18.next()).getInteger(i88) * S6(nr2.m.class);
                                                int size5 = arrayList27.size();
                                                if (size5 <= integer6) {
                                                    integer6 = size5;
                                                }
                                                java.util.List subList4 = arrayList27.subList(0, integer6);
                                                java.util.ArrayList arrayList28 = new java.util.ArrayList(kz5.d0.q(subList4, 10));
                                                int i89 = 0;
                                                for (java.lang.Object obj7 : subList4) {
                                                    int i96 = i89 + 1;
                                                    if (i89 < 0) {
                                                        kz5.c0.p();
                                                        throw null;
                                                    }
                                                    arrayList28.add(new nr2.m((r45.do2) obj7));
                                                    i89 = i96;
                                                }
                                                arrayList26.addAll(arrayList28);
                                                i88 = 1;
                                                arrayList27 = arrayList27.subList(integer6, arrayList27.size());
                                            }
                                        }
                                    }
                                    java.util.Iterator it19 = arrayList26.iterator();
                                    while (it19.hasNext()) {
                                        so2.j5 j5Var8 = (so2.j5) it19.next();
                                        com.tencent.mm.plugin.finder.playlist.e eVar3 = j5Var8 instanceof com.tencent.mm.plugin.finder.playlist.e ? (com.tencent.mm.plugin.finder.playlist.e) j5Var8 : null;
                                        if (eVar3 != null) {
                                            eVar3.f122293f = arrayList26.size();
                                        }
                                    }
                                    boolean R63 = R6(ob1Var, arrayList27.size());
                                    java.lang.String string7 = getContext().getResources().getString(com.tencent.mm.R.string.f491976mr5);
                                    kotlin.jvm.internal.o.f(string7, "getString(...)");
                                    js2.b bVar4 = new js2.b(13, string7, false, ob1Var.f382115i, false, true, null, false, false, null, null, null, 4032, null);
                                    arrayList25.add(bVar4);
                                    if (R63) {
                                        java.lang.String string8 = getContext().getResources().getString(com.tencent.mm.R.string.ckz);
                                        kotlin.jvm.internal.o.f(string8, "getString(...)");
                                        arrayList26.add(new js2.a(13, string8, new com.tencent.mm.plugin.finder.profile.uic.i1(this)));
                                    }
                                    Q6(bVar4, eo2Var.f373619e, arrayList25, arrayList26);
                                    W6(13, arrayList25);
                                    break;
                                }
                            }
                            break;
                        case 14:
                            r45.sv2 sv2Var = ob1Var.f382128y;
                            if (sv2Var != null) {
                                java.util.LinkedList product_byte_list = sv2Var.f385979d;
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(product_byte_list)) {
                                    r45.vj6 vj6Var7 = ob1Var.f382125v;
                                    java.util.ArrayList arrayList29 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList30 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList31 = new java.util.ArrayList();
                                    kotlin.jvm.internal.o.f(product_byte_list, "product_byte_list");
                                    arrayList31.addAll(product_byte_list);
                                    if (vj6Var7 != null) {
                                        int i97 = 1;
                                        java.util.LinkedList list9 = vj6Var7.getList(1);
                                        if (list9 != null) {
                                            java.util.Iterator it20 = list9.iterator();
                                            arrayList31 = arrayList31;
                                            while (it20.hasNext()) {
                                                int integer7 = ((r45.wj6) it20.next()).getInteger(i97) * S6(js2.c.class);
                                                int size6 = arrayList31.size();
                                                if (size6 <= integer7) {
                                                    integer7 = size6;
                                                }
                                                java.util.List subList5 = arrayList31.subList(0, integer7);
                                                java.util.ArrayList arrayList32 = new java.util.ArrayList(kz5.d0.q(subList5, 10));
                                                int i98 = 0;
                                                for (java.lang.Object obj8 : subList5) {
                                                    int i99 = i98 + 1;
                                                    if (i98 < 0) {
                                                        kz5.c0.p();
                                                        throw null;
                                                    }
                                                    arrayList32.add(new js2.c((com.tencent.mm.protobuf.g) obj8, i98));
                                                    i98 = i99;
                                                }
                                                arrayList30.addAll(arrayList32);
                                                i97 = 1;
                                                arrayList31 = arrayList31.subList(integer7, arrayList31.size());
                                            }
                                        }
                                    }
                                    boolean z17 = ob1Var.f382126w == 1 && arrayList31.size() < ob1Var.f382115i;
                                    java.lang.String string9 = getContext().getResources().getString(com.tencent.mm.R.string.eeq);
                                    kotlin.jvm.internal.o.f(string9, "getString(...)");
                                    arrayList29.add(new js2.b(14, string9, z17, arrayList31.size(), true, false, new com.tencent.mm.plugin.finder.profile.uic.j1(this), false, false, null, null, null, 3968, null));
                                    arrayList29.addAll(arrayList30);
                                    W6(14, arrayList29);
                                    break;
                                }
                            }
                            break;
                        case 15:
                            r45.sj2 sj2Var = ob1Var.f382129z;
                            if (sj2Var != null) {
                                java.util.Collection collection = sj2Var.f385776e;
                                if (((collection == null || collection.isEmpty()) ? 1 : i18) == 0) {
                                    r45.vj6 vj6Var8 = ob1Var.f382125v;
                                    java.util.ArrayList arrayList33 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList34 = new java.util.ArrayList();
                                    int i100 = ob1Var.f382115i;
                                    if (collection == null) {
                                        collection = kz5.p0.f313996d;
                                    }
                                    java.util.List V0 = kz5.n0.V0(collection);
                                    if (vj6Var8 != null && (list2 = vj6Var8.getList(1)) != null) {
                                        java.util.Iterator it21 = list2.iterator();
                                        while (it21.hasNext()) {
                                            int integer8 = ((r45.wj6) it21.next()).getInteger(i27) * S6(zb2.a.class);
                                            int size7 = V0.size();
                                            if (size7 <= integer8) {
                                                integer8 = size7;
                                            }
                                            java.util.List subList6 = V0.subList(i18, integer8);
                                            java.util.ArrayList arrayList35 = new java.util.ArrayList(kz5.d0.q(subList6, i19));
                                            int i101 = 0;
                                            for (java.lang.Object obj9 : subList6) {
                                                int i102 = i101 + 1;
                                                if (i101 < 0) {
                                                    kz5.c0.p();
                                                    throw null;
                                                }
                                                r45.qj2 qj2Var = (r45.qj2) obj9;
                                                kotlin.jvm.internal.o.d(qj2Var);
                                                zb2.a aVar = new zb2.a(qj2Var);
                                                aVar.f471256e = i101;
                                                arrayList35.add(aVar);
                                                i101 = i102;
                                            }
                                            arrayList34.addAll(arrayList35);
                                            V0 = kz5.n0.V0(V0.subList(integer8, V0.size()));
                                            i19 = 10;
                                            i27 = 1;
                                            i18 = 0;
                                        }
                                    }
                                    java.util.Iterator it22 = arrayList34.iterator();
                                    while (it22.hasNext()) {
                                        so2.j5 j5Var9 = (so2.j5) it22.next();
                                        if (j5Var9 instanceof zb2.a) {
                                            ((zb2.a) j5Var9).f471257f = arrayList34.size();
                                        }
                                    }
                                    boolean R64 = R6(ob1Var, arrayList34.size());
                                    java.lang.String string10 = getContext().getResources().getString(com.tencent.mm.R.string.mgv);
                                    kotlin.jvm.internal.o.f(string10, "getString(...)");
                                    js2.b bVar5 = new js2.b(15, string10, R64, i100, R64, false, new com.tencent.mm.plugin.finder.profile.uic.h1(this), false, false, null, null, null, 3968, null);
                                    arrayList33.add(bVar5);
                                    Q6(bVar5, sj2Var.f385775d, arrayList33, arrayList34);
                                    W6(4, arrayList33);
                                    break;
                                }
                            }
                            break;
                    }
                } else {
                    pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.profile.uic.e1(this, ob1Var, null), 3, null);
                }
                th6 = null;
                th7 = th6;
                i18 = 0;
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            X6(false);
        }
    }

    public final java.lang.String getUsername() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f123416f.b();
        dead();
    }
}
