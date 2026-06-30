package com.tencent.mm.plugin.finder.search;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderFansSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Lzy2/gc;", "Lr45/kh2;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/f0", "com/tencent/mm/plugin/finder/search/i0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderFansSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n, zy2.gc {
    public androidx.coordinatorlayout.widget.CoordinatorLayout A;
    public com.tencent.mm.view.RefreshLoadMoreLayout B;
    public androidx.recyclerview.widget.RecyclerView C;
    public android.widget.TextView D;
    public android.view.View E;
    public com.tencent.mm.plugin.finder.view.e3 F;
    public bq.u I;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125536t;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125538v;

    /* renamed from: w, reason: collision with root package name */
    public int f125539w;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.i0 f125541y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f125542z;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f125537u = "";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f125540x = new java.util.ArrayList();
    public java.lang.String G = "";
    public java.lang.String H = "";

    public static final void c7(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI, r45.fu2 fu2Var) {
        java.util.ArrayList arrayList;
        finderFansSearchUI.getClass();
        java.util.LinkedList list = fu2Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getFansContactList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = finderFansSearchUI.f125540x;
            if (!hasNext) {
                break;
            } else {
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.q21) it.next())));
            }
        }
        finderFansSearchUI.f125539w = fu2Var.getInteger(1);
        finderFansSearchUI.f125538v = fu2Var.getByteString(2);
        com.tencent.mars.xlog.Log.i("Finder.FinderFansSearchUI", "onSceneEnd " + fu2Var.getInteger(1) + ' ' + arrayList.size());
        java.lang.String str = finderFansSearchUI.f125537u;
        int i17 = fu2Var.getList(3).isEmpty() ? 1 : 2;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        java.lang.String str2 = finderFansSearchUI.H;
        java.lang.String str3 = finderFansSearchUI.G;
        androidx.appcompat.app.AppCompatActivity context = finderFansSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.Gj(1, str2, str3, str, 2, 1, 2, i17, 0, nyVar != null ? nyVar.V6() : null);
    }

    public static final void d7(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI) {
        androidx.recyclerview.widget.RecyclerView recyclerView = finderFansSearchUI.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : finderFansSearchUI.f125540x.size();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderFansSearchUI.B;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.N(0);
        if (itemCount == 0) {
            android.view.View view = finderFansSearchUI.E;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "refreshUIStateOnCgiBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "refreshUIStateOnCgiBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = finderFansSearchUI.D;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderFansSearchUI.B;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            android.view.View view2 = finderFansSearchUI.E;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "refreshUIStateOnCgiBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "refreshUIStateOnCgiBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = finderFansSearchUI.D;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderFansSearchUI.B;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setVisibility(0);
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = finderFansSearchUI.A;
            if (coordinatorLayout == null) {
                kotlin.jvm.internal.o.o("mainContainer");
                throw null;
            }
            coordinatorLayout.setVisibility(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderFansSearchUI.C;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            e7();
            return;
        }
        android.view.View view = this.E;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.D;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.B;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }

    @Override // tj5.n
    public boolean G0() {
        hideVKB();
        return e7();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 75;
    }

    public final boolean e7() {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125536t;
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
        this.f125537u = str;
        this.f125539w = 0;
        this.f125538v = null;
        this.f125540x.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.G = uuid;
        bq.u uVar = this.I;
        if (uVar != null) {
            uVar.j();
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.protobuf.g gVar = this.f125538v;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.qt2 d17 = xy2.c.d(context);
        com.tencent.mm.plugin.finder.search.r0 r0Var = new com.tencent.mm.plugin.finder.search.r0(this);
        com.tencent.mm.plugin.finder.search.t0 t0Var = new com.tencent.mm.plugin.finder.search.t0(this);
        bq.u uVar2 = new bq.u(str, gVar, d17);
        uVar2.l().q(new cq.a0(r0Var, t0Var));
        this.I = uVar2;
        android.view.View view = this.E;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.D;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.B;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setVisibility(8);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        android.view.View view2 = this.f125542z;
        if (view2 != null) {
            view2.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.color.f478489a));
            return false;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.agv;
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
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125536t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f125536t = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125536t;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.y_));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125536t;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125536t;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125536t;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125536t;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        this.f125537u = "";
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125536t;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125536t;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().t();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.H = uuid;
        this.f125541y = new com.tencent.mm.plugin.finder.search.i0(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125542z = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j8y);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.A = (androidx.coordinatorlayout.widget.CoordinatorLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById3;
        this.B = refreshLoadMoreLayout;
        this.C = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.E = findViewById5;
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.C;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.search.i0 i0Var = this.f125541y;
        if (i0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(i0Var);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.C;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.C;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.C;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setOnTouchListener(new com.tencent.mm.plugin.finder.search.j0(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.B;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.B;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.B;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.search.o0(this));
        java.lang.String str = this.f125537u;
        if (str != null) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125536t;
            if (fTSSearchView9 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView9.getFtsEditText().n(str, null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.C;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView6.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.C;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView7, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView7.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView7, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setTheme(com.tencent.mm.R.style.f494395lx);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        bq.u uVar = this.I;
        if (uVar != null) {
            uVar.j();
        }
        super.onDestroy();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        pm0.v.X(new com.tencent.mm.plugin.finder.search.p0(ret, this, req));
    }
}
