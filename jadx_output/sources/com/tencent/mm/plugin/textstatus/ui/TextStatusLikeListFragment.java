package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "Ll75/q0;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/sc", "com/tencent/mm/plugin/textstatus/ui/tc", "com/tencent/mm/plugin/textstatus/ui/uc", "com/tencent/mm/plugin/textstatus/ui/xc", "com/tencent/mm/plugin/textstatus/ui/zc", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusLikeListFragment extends com.tencent.mm.ui.component.UIComponentFragment implements l75.q0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f173642y = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f173643n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173644o;

    /* renamed from: p, reason: collision with root package name */
    public int f173645p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.textstatus.ui.uc f173647r;

    /* renamed from: t, reason: collision with root package name */
    public ui4.e f173649t;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f173646q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final int[] f173648s = new int[2];

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f173650u = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ad(this));

    /* renamed from: v, reason: collision with root package name */
    public int f173651v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.q f173652w = new com.tencent.mm.plugin.textstatus.ui.gd(this);

    /* renamed from: x, reason: collision with root package name */
    public final db5.t4 f173653x = new com.tencent.mm.plugin.textstatus.ui.hd(this);

    static {
        new com.tencent.mm.plugin.textstatus.ui.tc(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czp;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        super.onCreateContextMenu(menu, v17, contextMenuInfo);
        menu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490367t0));
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.textstatus.ui.uc ucVar = this.f173647r;
        if (ucVar != null) {
            ucVar.c();
        } else {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.Objects.toString(w0Var);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f487284o50);
        int i17 = com.tencent.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.dft);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.lqa;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.lqa);
            if (wxRecyclerView != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                if (refreshLoadMoreLayout != null) {
                    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) findViewById;
                    this.f173649t = new ui4.e(coordinatorLayout, textView, wxRecyclerView, refreshLoadMoreLayout, coordinatorLayout);
                    super.onViewCreated(view, bundle);
                    android.os.Bundle arguments = getArguments();
                    this.f173645p = arguments != null ? arguments.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) : 0;
                    android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m6e);
                    kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
                    this.f173643n = refreshLoadMoreLayout2;
                    refreshLoadMoreLayout2.setActionCallback(new com.tencent.mm.plugin.textstatus.ui.jd(this));
                    android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.lqa);
                    kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById3;
                    this.f173644o = wxRecyclerView2;
                    wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
                    java.util.ArrayList arrayList = this.f173646q;
                    arrayList.clear();
                    final long j17 = this.f173645p == 0 ? 4L : 3L;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$buildItemConverts$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            return type != 0 ? type != 2 ? type != 4 ? new oi4.l(j17, com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.this.f173652w) : new oi4.c(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.this.f173652w) : new oi4.j(j17, com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.this.f173652w) : new oi4.g();
                        }
                    }, arrayList, false);
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f173644o;
                    if (wxRecyclerView3 == null) {
                        kotlin.jvm.internal.o.o("rvLikeList");
                        throw null;
                    }
                    wxRecyclerView3.setAdapter(wxRecyclerAdapter);
                    wxRecyclerAdapter.registerAdapterDataObserver(new com.tencent.mm.plugin.textstatus.ui.ed(this));
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "initData: scene=" + this.f173645p);
                    int i18 = this.f173645p;
                    if (i18 == 0) {
                        android.os.Bundle arguments2 = getArguments();
                        if (arguments2 == null || (str = arguments2.getString("status_id")) == null) {
                            str = "";
                        }
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f173643n;
                        if (refreshLoadMoreLayout3 == null) {
                            kotlin.jvm.internal.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.tencent.mm.plugin.textstatus.ui.xc xcVar = new com.tencent.mm.plugin.textstatus.ui.xc(str, wxRecyclerAdapter, refreshLoadMoreLayout3);
                        this.f173647r = xcVar;
                        xcVar.b();
                    } else if (i18 == 1) {
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f173643n;
                        if (refreshLoadMoreLayout4 == null) {
                            kotlin.jvm.internal.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.tencent.mm.plugin.textstatus.ui.zc zcVar = new com.tencent.mm.plugin.textstatus.ui.zc(wxRecyclerAdapter, refreshLoadMoreLayout4);
                        this.f173647r = zcVar;
                        zcVar.b();
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f173643n;
                        if (refreshLoadMoreLayout5 == null) {
                            kotlin.jvm.internal.o.o("mRefreshLayout");
                            throw null;
                        }
                        refreshLoadMoreLayout5.setEnableRefresh(false);
                    } else if (i18 == 2 || i18 == 3) {
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f173643n;
                        if (refreshLoadMoreLayout6 == null) {
                            kotlin.jvm.internal.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.tencent.mm.plugin.textstatus.ui.sc scVar = new com.tencent.mm.plugin.textstatus.ui.sc(wxRecyclerAdapter, refreshLoadMoreLayout6);
                        this.f173647r = scVar;
                        scVar.b();
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout7 = this.f173643n;
                        if (refreshLoadMoreLayout7 == null) {
                            kotlin.jvm.internal.o.o("mRefreshLayout");
                            throw null;
                        }
                        refreshLoadMoreLayout7.setEnableRefresh(false);
                    }
                    ai4.m0.f5173a.r();
                    int i19 = this.f173645p;
                    if (i19 == 1 || i19 == 2 || i19 == 3) {
                        if (arrayList.size() > 0) {
                            android.content.Context context = getContext();
                            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                            if (mMActivity != null) {
                                mMActivity.addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.textstatus.ui.cd(this));
                            }
                        }
                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f173644o;
                        if (wxRecyclerView4 != null) {
                            wxRecyclerView4.P(new com.tencent.mm.plugin.textstatus.ui.dd(this));
                            return;
                        } else {
                            kotlin.jvm.internal.o.o("rvLikeList");
                            throw null;
                        }
                    }
                    return;
                }
                i17 = com.tencent.mm.R.id.m6e;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }
}
