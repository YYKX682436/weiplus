package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class p6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f135518d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f135519e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f135520f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f135521g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f135522h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f135523i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f135524m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f135525n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f135526o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f135527p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f135528q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f135529r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135525n = new java.util.ArrayList();
        this.f135526o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f135527p = "Finder.FinderCollectionPurchaseListUIC";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.p6 r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.tencent.mm.plugin.finder.viewmodel.component.e6
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.viewmodel.component.e6 r0 = (com.tencent.mm.plugin.finder.viewmodel.component.e6) r0
            int r1 = r0.f134196f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f134196f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.e6 r0 = new com.tencent.mm.plugin.finder.viewmodel.component.e6
            r0.<init>(r8, r9)
        L1b:
            r5 = r0
            java.lang.Object r9 = r5.f134194d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f134196f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L7b
            goto L74
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L7b
            db2.k1 r1 = new db2.k1     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.protobuf.g r9 = r8.f135528q     // Catch: java.lang.Throwable -> L7b
            android.app.Activity r8 = r8.getContext()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r8, r3)     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r8 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L7b
            r4 = 0
            if (r3 == 0) goto L5b
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch: java.lang.Throwable -> L7b
            pf5.z r3 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L7b
            pf5.v r8 = r3.a(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r3 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r3)     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r8     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L5b:
            r8 = r4
        L5c:
            if (r8 == 0) goto L62
            r45.qt2 r4 = r8.V6()     // Catch: java.lang.Throwable -> L7b
        L62:
            r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> L7b
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f134196f = r2     // Catch: java.lang.Throwable -> L7b
            r2 = r8
            java.lang.Object r9 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r0) goto L74
            goto L87
        L74:
            r45.f91 r9 = (r45.f91) r9     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r9)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L86:
            r0 = r8
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.p6.O6(com.tencent.mm.plugin.finder.viewmodel.component.p6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if ((r2 != null ? r2.getInteger(13) : 1) == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if ((r2 != null ? r2.getInteger(13) : 1) == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List P6(com.tencent.mm.plugin.finder.viewmodel.component.p6 r7, r45.f91 r8) {
        /*
            r7.getClass()
            r0 = 1
            java.util.LinkedList r8 = r8.getList(r0)
            java.lang.String r1 = "getCollection_info(...)"
            kotlin.jvm.internal.o.f(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L16:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r8.next()
            r45.do2 r2 = (r45.do2) r2
            nr2.m r3 = new nr2.m
            kotlin.jvm.internal.o.d(r2)
            r3.<init>(r2)
            boolean r2 = r3.p()
            r4 = 13
            r45.do2 r5 = r3.f339268d
            r6 = 0
            if (r2 == 0) goto L46
            com.tencent.mm.protobuf.f r2 = r5.getCustom(r6)
            r45.uz0 r2 = (r45.uz0) r2
            if (r2 == 0) goto L42
            int r2 = r2.getInteger(r4)
            goto L43
        L42:
            r2 = r0
        L43:
            if (r2 != r0) goto L5d
            goto L5c
        L46:
            boolean r2 = r3.q()
            if (r2 == 0) goto L5c
            com.tencent.mm.protobuf.f r2 = r5.getCustom(r0)
            r45.n11 r2 = (r45.n11) r2
            if (r2 == 0) goto L59
            int r2 = r2.getInteger(r4)
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r2 != r0) goto L5d
        L5c:
            r6 = r0
        L5d:
            if (r6 == 0) goto L74
            long r2 = r3.l()
            java.lang.String r2 = pm0.v.u(r2)
            java.lang.String r3 = "skip course invalid "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = r7.f135527p
            com.tencent.mars.xlog.Log.i(r3, r2)
            r3 = 0
        L74:
            if (r3 == 0) goto L16
            r1.add(r3)
            goto L16
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.p6.P6(com.tencent.mm.plugin.finder.viewmodel.component.p6, r45.f91):java.util.List");
    }

    public final android.widget.FrameLayout Q6() {
        android.widget.FrameLayout frameLayout = this.f135520f;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View R6() {
        android.view.View view = this.f135523i;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final void S6() {
        Q6().setVisibility(8);
        R6().setOnClickListener(null);
    }

    public final void T6() {
        Q6().setVisibility(0);
        android.view.View view = this.f135521g;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f135522h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View R6 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f135519e;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f135518d;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f135518d = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getContext(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f135519e = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        getRecyclerView().setHasFixedSize(true);
        getRecyclerView().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = getRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        getRecyclerView().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderCollectionPurchaseListUIC$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == nr2.m.class.hashCode()) {
                    return new nr2.m1();
                }
                hc2.l.a(com.tencent.mm.plugin.finder.viewmodel.component.p6.this.f135527p, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.f135525n, false);
        this.f135524m = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.viewmodel.component.f6(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.kxr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f135520f = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f135521g = findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f135522h = findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f135523i = findViewById6;
        S6();
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.g6(this));
        T6();
        com.tencent.mars.xlog.Log.i(this.f135527p, "requestInit CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(this.f135526o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.k6(this, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135525n = new java.util.ArrayList();
        this.f135526o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f135527p = "Finder.FinderCollectionPurchaseListUIC";
    }
}
