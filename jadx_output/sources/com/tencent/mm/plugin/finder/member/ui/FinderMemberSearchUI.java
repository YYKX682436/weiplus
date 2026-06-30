package com.tencent.mm.plugin.finder.member.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "w", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "setLoadingView", "(Landroid/view/View;)V", "loadingView", "x", "getNothingView", "setNothingView", "nothingView", "y", "getRetryView", "setRetryView", "retryView", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderMemberSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n {
    public com.tencent.mm.ui.search.FTSSearchView B;
    public java.lang.String C;
    public volatile com.tencent.mm.protobuf.g F;
    public int G;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121409t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f121410u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f121411v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public android.view.View loadingView;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public android.view.View nothingView;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public android.view.View retryView;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f121415z;
    public final java.util.ArrayList A = new java.util.ArrayList();
    public java.lang.String D = "";
    public java.lang.String E = "";
    public final java.lang.Runnable H = new lo2.m0(this);

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c7(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof lo2.e0
            if (r0 == 0) goto L16
            r0 = r10
            lo2.e0 r0 = (lo2.e0) r0
            int r1 = r0.f320117f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f320117f = r1
            goto L1b
        L16:
            lo2.e0 r0 = new lo2.e0
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f320115d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f320117f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5b
            goto L54
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5b
            ho2.i r1 = new ho2.i     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = r8.C     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.o.d(r10)     // Catch: java.lang.Throwable -> L5b
            com.tencent.mm.protobuf.g r8 = r8.F     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r1.<init>(r3, r10, r9, r8)     // Catch: java.lang.Throwable -> L5b
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f320117f = r2     // Catch: java.lang.Throwable -> L5b
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5b
            if (r10 != r0) goto L54
            goto L67
        L54:
            r45.qu2 r10 = (r45.qu2) r10     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L5b
            goto L66
        L5b:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L66:
            r0 = r8
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI.c7(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.util.List d7(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI, r45.qu2 qu2Var) {
        finderMemberSearchUI.getClass();
        java.util.LinkedList<r45.kg2> search_results = qu2Var.f384262d;
        kotlin.jvm.internal.o.f(search_results, "search_results");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.kg2 kg2Var : search_results) {
            kotlin.jvm.internal.o.d(kg2Var);
            arrayList.add(new jo2.e(kg2Var));
        }
        return arrayList;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            g7();
            return;
        }
        android.view.View view = this.loadingView;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.nothingView;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f7().setVisibility(8);
    }

    @Override // tj5.n
    public boolean G0() {
        hideVKB();
        return g7();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView e7() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f121410u;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f7() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f121409t;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final boolean g7() {
        if (h7()) {
            return true;
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.B;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.Runnable runnable = this.H;
        fTSSearchView.removeCallbacks(runnable);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.B;
        if (fTSSearchView2 != null) {
            fTSSearchView2.postDelayed(runnable, 500L);
            return false;
        }
        kotlin.jvm.internal.o.o("searchView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dts;
    }

    public final boolean h7() {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.B;
        if (fTSSearchView != null) {
            java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            return com.tencent.mm.sdk.platformtools.t8.K0(totalQuery != null ? r26.n0.u0(totalQuery).toString() : null);
        }
        kotlin.jvm.internal.o.o("searchView");
        throw null;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.B;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.removeCallbacks(this.H);
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.B;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.removeCallbacks(this.H);
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.B;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.C = getIntent().getStringExtra("key_author_finder_name");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121409t = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f121410u = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        e7().setHasFixedSize(true);
        e7().setItemViewCacheSize(20);
        androidx.recyclerview.widget.n2 itemAnimator = e7().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView e76 = e7();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e76.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        com.tencent.mm.view.recyclerview.WxRecyclerView e77 = e7();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == jo2.e.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.member.convert.l();
                }
                hc2.l.a("Finder.FinderMemberSearchUI", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.A, false);
        this.f121415z = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new lo2.f0(this);
        e77.setAdapter(wxRecyclerAdapter);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.imf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f121411v = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setLoadingView(findViewById4);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setNothingView(findViewById5);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        setRetryView(findViewById6);
        android.widget.FrameLayout frameLayout = this.f121411v;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = this.retryView;
        if (view == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(null);
        f7().setOnSimpleAction(new lo2.g0(this));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.B = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.B;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.mqo));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.B;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.B;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.B;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.B;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView6.getFtsEditText().getClearBtn();
        final com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.B;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        android.view.View findViewById7 = fTSSearchView7.findViewById(com.tencent.mm.R.id.aa8);
        fTSSearchView7.f209836e = findViewById7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/ui/search/FTSSearchView", "initMemberSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/ui/search/FTSSearchView", "initMemberSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fTSSearchView7.f209836e.setPadding(fTSSearchView7.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), fTSSearchView7.f209836e.getPaddingTop(), fTSSearchView7.f209836e.getPaddingRight(), fTSSearchView7.f209836e.getPaddingBottom());
        fTSSearchView7.f209837f.getLayoutParams().height = fTSSearchView7.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
        fTSSearchView7.f209837f.setBackgroundResource(com.tencent.mm.R.drawable.cva);
        fTSSearchView7.f209836e.setOnClickListener(new android.view.View.OnClickListener() { // from class: tj5.p$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.tencent.mm.ui.search.FTSSearchView.f209834q;
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = com.tencent.mm.ui.search.FTSSearchView.this;
                fTSSearchView8.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/search/FTSSearchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fTSSearchView8, array);
                tj5.w wVar = fTSSearchView8.f209844p;
                if (wVar != null) {
                    wVar.onClickBackBtn(view2);
                }
                yj0.a.h(fTSSearchView8, "com/tencent/mm/ui/search/FTSSearchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.B;
        if (fTSSearchView8 != null) {
            supportActionBar.y(fTSSearchView8);
        } else {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
    }

    public final void setLoadingView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.loadingView = view;
    }

    public final void setNothingView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.nothingView = view;
    }

    public final void setRetryView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.retryView = view;
    }
}
