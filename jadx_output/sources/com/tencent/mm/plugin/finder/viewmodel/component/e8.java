package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class e8 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f134205d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f134206e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f134207f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f134208g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f134209h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f134210i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f134211m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f134212n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f134213o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f134214p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f134215q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134212n = new java.util.ArrayList();
        this.f134213o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
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
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.e8 r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.tencent.mm.plugin.finder.viewmodel.component.t7
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.viewmodel.component.t7 r0 = (com.tencent.mm.plugin.finder.viewmodel.component.t7) r0
            int r1 = r0.f135989f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f135989f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.t7 r0 = new com.tencent.mm.plugin.finder.viewmodel.component.t7
            r0.<init>(r8, r9)
        L1b:
            r5 = r0
            java.lang.Object r9 = r5.f135987d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f135989f
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
            db2.r0 r1 = new db2.r0     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.protobuf.g r9 = r8.f134214p     // Catch: java.lang.Throwable -> L7b
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
            r5.f135989f = r2     // Catch: java.lang.Throwable -> L7b
            r2 = r8
            java.lang.Object r9 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r0) goto L74
            goto L87
        L74:
            r45.n51 r9 = (r45.n51) r9     // Catch: java.lang.Throwable -> L7b
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.e8.O6(com.tencent.mm.plugin.finder.viewmodel.component.e8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.util.List P6(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var, r45.n51 n51Var) {
        nr2.m d17;
        e8Var.getClass();
        java.util.LinkedList<r45.uz0> list = n51Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getCourse_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.uz0 uz0Var : list) {
            if (uz0Var.getInteger(13) == 1) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "skip course invalid ".concat(pm0.v.u(uz0Var.getLong(0))));
                d17 = null;
            } else {
                d17 = cu2.g0.f222404a.d(uz0Var);
            }
            if (d17 != null) {
                arrayList.add(d17);
            }
        }
        return arrayList;
    }

    public final android.widget.FrameLayout Q6() {
        android.widget.FrameLayout frameLayout = this.f134207f;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View R6() {
        android.view.View view = this.f134210i;
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
        android.view.View view = this.f134208g;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f134209h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View R6 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f134206e;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f134205d;
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
        this.f134205d = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getContext(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f134206e = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        getRecyclerView().setHasFixedSize(true);
        getRecyclerView().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = getRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        getRecyclerView().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderCoursePurchaseListUIC$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == nr2.m.class.hashCode()) {
                    return new nr2.m1();
                }
                hc2.l.a(pf5.o.TAG, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.f134212n, false);
        this.f134211m = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.viewmodel.component.u7(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.kxr);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f134207f = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f134208g = findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f134209h = findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f134210i = findViewById6;
        S6();
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.v7(this));
        T6();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "requestInit CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(this.f134213o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.z7(this, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134212n = new java.util.ArrayList();
        this.f134213o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }
}
