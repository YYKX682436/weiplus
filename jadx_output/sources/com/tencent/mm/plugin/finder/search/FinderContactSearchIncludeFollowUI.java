package com.tencent.mm.plugin.finder.search;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/b", "com/tencent/mm/plugin/finder/search/c", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderContactSearchIncludeFollowUI extends com.tencent.mm.ui.vas.VASActivity implements tj5.w, tj5.n {
    public static final /* synthetic */ int E = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public com.tencent.mm.plugin.finder.search.k4 C;
    public bq.o1 D;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125507d;

    /* renamed from: f, reason: collision with root package name */
    public int f125509f;

    /* renamed from: g, reason: collision with root package name */
    public int f125510g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125511h;

    /* renamed from: n, reason: collision with root package name */
    public int f125514n;

    /* renamed from: p, reason: collision with root package name */
    public int f125516p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f125518r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f125519s;

    /* renamed from: t, reason: collision with root package name */
    public long f125520t;

    /* renamed from: u, reason: collision with root package name */
    public int f125521u;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f125523w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.coordinatorlayout.widget.CoordinatorLayout f125524x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f125525y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f125526z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f125508e = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f125512i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f125513m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f125515o = "";

    /* renamed from: q, reason: collision with root package name */
    public boolean f125517q = true;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f125522v = new java.util.HashMap();

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.B;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.A;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125525y;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        } else {
            V6();
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.C;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        hideVKB();
        if (V6()) {
            return true;
        }
        jx3.f.INSTANCE.idkeyStat(1265L, 9L, 1L, false);
        return false;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.kvStat(19184, str);
        }
    }

    public final int U6() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125526z;
        if (recyclerView != null) {
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            return adapter != null ? adapter.getItemCount() : this.f125512i.size();
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final boolean V6() {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125507d;
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
        Z6(str);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.C;
        if (k4Var == null) {
            return false;
        }
        k4Var.c(str);
        return false;
    }

    public final void W6(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList;
        int U6 = U6();
        int U62 = U6();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.idkeyStat(1265L, 10L, 1L, false);
            java.util.LinkedList list = tu2Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f125512i;
                if (!hasNext) {
                    break;
                } else {
                    arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.mu2) it.next())));
                }
            }
            this.f125509f = tu2Var.getInteger(2);
            this.f125510g = tu2Var.getInteger(3);
            this.f125511h = tu2Var.getByteString(5);
            int U63 = U6();
            com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onSceneEnd " + tu2Var.getInteger(2) + ' ' + tu2Var.getInteger(3) + ' ' + arrayList.size());
            U62 = U63;
        } else {
            jx3.f.INSTANCE.idkeyStat(1265L, 11L, 1L, false);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125525y;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.N(0);
        if (U62 == 0) {
            android.view.View view = this.B;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.A;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f125525y;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            android.view.View view2 = this.B;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.A;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f125525y;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setVisibility(0);
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f125524x;
            if (coordinatorLayout == null) {
                kotlin.jvm.internal.o.o("mainContainer");
                throw null;
            }
            coordinatorLayout.setVisibility(0);
        }
        if (U6 == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f125526z;
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
        if (U6 < U62) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f125526z;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(U6, U62 - U6);
            }
        }
    }

    public final void X6(r45.mu2 mu2Var, int i17) {
        if (this.f125518r) {
            com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onContactItemClick select atContact");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            if (finderContact == null) {
                finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            }
            r45.gb4 i18 = hc2.s.i(finderContact);
            getIntent().putExtra("at_select_contact", i18 != null ? i18.toByteArray() : null);
            android.content.Intent intent = getIntent();
            ya2.g gVar = ya2.h.f460484a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            intent.putExtra("is_follow", ya2.g.h(gVar, finderContact2 != null ? finderContact2.getUsername() : null, null, false, false, 14, null));
            setResult(-1, getIntent());
            finish();
            return;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract finderFollowListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.f122599a;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        finderFollowListContract.a(this, finderContact3 != null ? ya2.d.h(finderContact3, null, false, 3, null) : null, false);
        java.lang.String requestId = this.f125515o;
        java.lang.String str = this.f125508e;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        java.lang.String username = finderContact4 != null ? finderContact4.getUsername() : null;
        kotlin.jvm.internal.o.g(requestId, "requestId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", " ", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(requestId);
        sb6.append(',');
        sb6.append(t17);
        sb6.append(",0,1,");
        if (username == null) {
            username = "";
        }
        sb6.append(username);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(",2");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report18690 %s", sb7);
        jx3.f.INSTANCE.kvStat(18690, sb7);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            r45.qt2 V6 = nyVar.V6();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            o3Var.Zi(6, 0L, V6, 1, finderContact5 != null ? finderContact5.getUsername() : null);
        }
    }

    public final void Y6(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f125515o)) {
            return;
        }
        java.util.HashMap hashMap = this.f125522v;
        if (!hashMap.isEmpty()) {
            com.tencent.mm.plugin.finder.report.t3.f125364a.a(this.f125515o, this.f125508e, 0, hashMap, 2);
            if (z17) {
                hashMap.clear();
            }
        }
    }

    public final void Z6(java.lang.String str) {
        Y6(true);
        this.f125508e = str;
        this.f125509f = 0;
        this.f125510g = 0;
        this.f125511h = null;
        if (this.f125516p == 4) {
            this.f125513m.clear();
        } else {
            this.f125512i.clear();
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f125515o = uuid;
        bq.o1 o1Var = this.D;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f125509f, this.f125515o, this.f125511h, this.f125516p, null, null, null, null, null, false, 0, 4064, null);
        this.D = o1Var2;
        pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.m(this)).f(this);
        android.view.View view = this.B;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.A;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125525y;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setVisibility(8);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125526z;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        android.view.View view2 = this.f125523w;
        if (view2 != null) {
            view2.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.color.f478489a));
        } else {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afh;
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
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125507d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f125507d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125507d;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125507d;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125507d;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125507d;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125507d;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        this.f125516p = getIntent().getIntExtra("request_type", 3);
        this.f125518r = getIntent().getBooleanExtra("from_at_contact", false);
        this.f125517q = getIntent().getBooleanExtra("need_history", false);
        this.f125519s = getIntent().getBooleanExtra("key_need_hide_top_padding", false);
        this.f125520t = getIntent().getLongExtra("key_finder_object_id", 0L);
        this.f125521u = getIntent().getIntExtra("key_remind_finder_half_screen_source", 0);
        r45.b31 b31Var = com.tencent.mm.plugin.finder.search.l4.f125763c;
        if (b31Var != null) {
            com.tencent.mm.plugin.finder.search.l4.f125763c = null;
            java.lang.String string = b31Var.getString(6);
            if (string == null) {
                string = "";
            }
            this.f125515o = string;
            java.lang.String string2 = b31Var.getString(0);
            this.f125508e = string2 != null ? string2 : "";
            this.f125509f = b31Var.getInteger(1);
            this.f125510g = b31Var.getInteger(2);
            this.f125511h = b31Var.getByteString(4);
            this.f125514n = b31Var.getInteger(5);
            java.util.LinkedList list = b31Var.getList(7);
            kotlin.jvm.internal.o.f(list, "getContactList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Boolean.valueOf(this.f125512i.add((r45.mu2) it.next())));
            }
        } else {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            this.f125515o = uuid;
            this.f125508e = "";
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125507d;
            if (fTSSearchView7 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView7.getFtsEditText().m();
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125507d;
            if (fTSSearchView8 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView8.getFtsEditText().t();
        }
        if (this.f125517q) {
            android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C = new com.tencent.mm.plugin.finder.search.k4(this, new com.tencent.mm.plugin.finder.search.g(this));
        } else {
            android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.h0r);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f125518r) {
            setResult(0, getIntent());
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", "fromAtContact:%s", java.lang.Boolean.valueOf(this.f125518r));
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.m7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f125523w = findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.j8y);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f125524x = (androidx.coordinatorlayout.widget.CoordinatorLayout) findViewById4;
        android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById5;
        this.f125525y = refreshLoadMoreLayout;
        this.f125526z = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById6 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.B = findViewById7;
        if (this.f125519s) {
            android.view.View view = this.f125523w;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            view.setPadding(0, 0, 0, 0);
        }
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125526z;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f125526z;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.plugin.finder.search.b(this, 0, 1, null));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f125526z;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f125526z;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f125526z;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setOnTouchListener(new com.tencent.mm.plugin.finder.search.d(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f125525y;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f125525y;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f125525y;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.search.f(this));
        java.lang.String str = this.f125508e;
        if (str != null) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125507d;
            if (fTSSearchView9 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView9.getFtsEditText().n(str, null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f125526z;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView6.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.f125526z;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int i17 = this.f125514n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(recyclerView7, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView7.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(recyclerView7, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.C;
        if (k4Var != null) {
            k4Var.a();
        }
        Y6(true);
        super.onDestroy();
    }
}
