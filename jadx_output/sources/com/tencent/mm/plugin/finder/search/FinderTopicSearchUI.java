package com.tencent.mm.plugin.finder.search;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderTopicSearchUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/v4", "com/tencent/mm/plugin/finder/search/w4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicSearchUI extends com.tencent.mm.ui.MMActivity implements tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125590d;

    /* renamed from: f, reason: collision with root package name */
    public int f125592f;

    /* renamed from: g, reason: collision with root package name */
    public int f125593g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125594h;

    /* renamed from: n, reason: collision with root package name */
    public int f125597n;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f125600q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.coordinatorlayout.widget.CoordinatorLayout f125601r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f125602s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f125603t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f125604u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f125605v;

    /* renamed from: w, reason: collision with root package name */
    public bq.o1 f125606w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.k4 f125607x;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f125591e = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f125595i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f125596m = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f125598o = true;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f125599p = new java.util.HashMap();

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.f125605v;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f125604u;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125602s;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        } else {
            U6();
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125607x;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        hideVKB();
        if (U6()) {
            return true;
        }
        jx3.f.INSTANCE.idkeyStat(1265L, 9L, 1L, false);
        return false;
    }

    public final int T6() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125603t;
        if (recyclerView != null) {
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            return adapter != null ? adapter.getItemCount() : this.f125595i.size();
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.kvStat(19184, str);
        }
    }

    public final boolean U6() {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125590d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        X6(str);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125607x;
        if (k4Var == null) {
            return false;
        }
        k4Var.c(str);
        return false;
    }

    public final void V6(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList;
        int T6 = T6();
        int T62 = T6();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.idkeyStat(1265L, 10L, 1L, false);
            java.util.LinkedList list = tu2Var.getList(7);
            kotlin.jvm.internal.o.f(list, "getTopicInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f125595i;
                if (!hasNext) {
                    break;
                } else {
                    arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.t03) it.next())));
                }
            }
            this.f125592f = tu2Var.getInteger(2);
            this.f125593g = tu2Var.getInteger(9);
            this.f125594h = tu2Var.getByteString(5);
            int T63 = T6();
            com.tencent.mars.xlog.Log.i("Finder.FinderTopicSearchUI", "onSceneEnd " + tu2Var.getInteger(2) + ' ' + tu2Var.getInteger(3) + ' ' + arrayList.size());
            T62 = T63;
        } else {
            jx3.f.INSTANCE.idkeyStat(1265L, 11L, 1L, false);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125602s;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.N(0);
        if (T62 == 0) {
            android.view.View view = this.f125605v;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f125604u;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f125602s;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            android.view.View view2 = this.f125605v;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f125604u;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f125602s;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setVisibility(0);
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f125601r;
            if (coordinatorLayout == null) {
                kotlin.jvm.internal.o.o("mainContainer");
                throw null;
            }
            coordinatorLayout.setVisibility(0);
            android.view.View view3 = this.f125600q;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            view3.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.color.f478489a));
        }
        if (T6 == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f125603t;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (T6 < T62) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f125603t;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(T6, T62 - T6);
            }
        }
    }

    public final void W6(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f125596m)) {
            return;
        }
        java.util.HashMap hashMap = this.f125599p;
        if (!hashMap.isEmpty()) {
            com.tencent.mm.plugin.finder.report.t3.f125364a.a(this.f125596m, this.f125591e, 0, hashMap, 2);
            if (z17) {
                hashMap.clear();
            }
        }
    }

    public final void X6(java.lang.String str) {
        W6(true);
        this.f125591e = str;
        this.f125592f = 0;
        this.f125593g = 0;
        this.f125594h = null;
        this.f125595i.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f125596m = uuid;
        bq.o1 o1Var = this.f125606w;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f125592f, this.f125596m, this.f125594h, this.f125597n, null, null, null, null, null, false, 0, 4064, null);
        this.f125606w = o1Var2;
        pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.b5(this));
        android.view.View view = this.f125605v;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f125604u;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125602s;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setVisibility(8);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125603t;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_q;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125590d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f125590d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125590d;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125590d;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125590d;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125590d;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125590d;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        this.f125597n = getIntent().getIntExtra("request_type", 4);
        this.f125598o = getIntent().getBooleanExtra("need_history", false);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f125596m = uuid;
        this.f125591e = "";
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125590d;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125590d;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().t();
        if (this.f125598o) {
            android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.h0r);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f125607x = new com.tencent.mm.plugin.finder.search.k4(this, new com.tencent.mm.plugin.finder.search.a5(this));
        } else {
            android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicSearchUI", "initData");
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.m7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f125600q = findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.j8y);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f125601r = (androidx.coordinatorlayout.widget.CoordinatorLayout) findViewById4;
        android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById5;
        this.f125602s = refreshLoadMoreLayout;
        this.f125603t = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById6 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f125604u = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f125605v = findViewById7;
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125603t;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f125603t;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.plugin.finder.search.w4(this, 0, 1, null));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f125603t;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f125603t;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f125603t;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setOnTouchListener(new com.tencent.mm.plugin.finder.search.x4(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f125602s;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f125602s;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f125602s;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.search.z4(this));
        java.lang.String str = this.f125591e;
        if (str != null) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125590d;
            if (fTSSearchView9 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView9.getFtsEditText().n(str, null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f125603t;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView6.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.f125603t;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerView7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView7.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerView7, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125607x;
        if (k4Var != null) {
            k4Var.a();
        }
        W6(true);
        super.onDestroy();
    }
}
