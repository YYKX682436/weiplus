package com.tencent.mm.plugin.finder.search;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "onContactItemLongClick", "<init>", "()V", "com/tencent/mm/plugin/finder/search/q", "com/tencent/mm/plugin/finder/search/r", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderContactSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n {
    public int A;
    public int C;
    public boolean E;
    public boolean F;
    public com.tencent.mm.view.RefreshLoadMoreLayout H;
    public androidx.recyclerview.widget.RecyclerView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f125527J;
    public android.view.View K;
    public com.tencent.mm.plugin.finder.search.k4 M;
    public com.tencent.mm.plugin.finder.search.u4 N;
    public bq.o1 Q;
    public final com.tencent.mm.plugin.finder.search.FinderContactSearchUI$contactChangelistener$1 R;
    public final com.tencent.mm.plugin.finder.search.z S;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125529u;

    /* renamed from: w, reason: collision with root package name */
    public int f125531w;

    /* renamed from: x, reason: collision with root package name */
    public int f125532x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125533y;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f125528t = "Finder.FinderContactSearchUI";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f125530v = "";

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f125534z = new java.util.ArrayList();
    public java.lang.String B = "";
    public boolean D = true;
    public final java.util.HashMap G = new java.util.HashMap();
    public int L = 1;
    public final fc2.c P = new fc2.c("EventDispatcher");

    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.search.FinderContactSearchUI$contactChangelistener$1] */
    public FinderContactSearchUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedContactChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$contactChangelistener$1
            {
                this.__eventId = 797560056;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
                com.tencent.mm.autogen.events.FeedContactChangeEvent event = feedContactChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.search.s(event, com.tencent.mm.plugin.finder.search.FinderContactSearchUI.this));
                return false;
            }
        };
        this.S = new com.tencent.mm.plugin.finder.search.z();
    }

    public static void c7(com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI, java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        int i27 = (i19 & 4) != 0 ? 1 : i18;
        int i28 = finderContactSearchUI.L;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String str2 = finderContactSearchUI.B;
        java.lang.String str3 = finderContactSearchUI.f125530v;
        java.lang.String str4 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderContactSearchUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        int i29 = i27;
        com.tencent.mm.plugin.finder.report.o3.Ij(o3Var, str2, str3, 1, 1, str, i17, 2, 1, str4, 1, i28, nyVar != null ? nyVar.V6() : null, null, 0, 12288, null);
        if (str != null) {
            java.util.HashMap hashMap = finderContactSearchUI.G;
            if (hashMap.containsKey(str)) {
                return;
            }
            com.tencent.mm.plugin.finder.search.e0 e0Var = new com.tencent.mm.plugin.finder.search.e0();
            e0Var.f125666b = str;
            e0Var.f125665a = i17;
            e0Var.f125667c = i29;
            e0Var.f125668d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(finderContactSearchUI.B) && (!hashMap.isEmpty())) {
                com.tencent.mm.plugin.finder.report.t3.f125364a.a(finderContactSearchUI.B, finderContactSearchUI.f125530v, 0, hashMap, 2);
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.K;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f125527J;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.H;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125529u;
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
        this.L = 1;
        e7(str);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.c(str);
        }
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.N;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.b();
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

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 6;
    }

    public final void d7(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList = this.f125534z;
        int size = arrayList.size();
        int size2 = arrayList.size();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.idkeyStat(1265L, 10L, 1L, false);
            java.util.LinkedList list = tu2Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.mu2) it.next())));
            }
            this.f125531w = tu2Var.getInteger(2);
            this.f125532x = tu2Var.getInteger(3);
            this.f125533y = tu2Var.getByteString(5);
            int size3 = arrayList.size();
            com.tencent.mars.xlog.Log.i(this.f125528t, "onSceneEnd " + tu2Var.getInteger(2) + ' ' + tu2Var.getInteger(3) + ' ' + arrayList.size());
            java.lang.String str = this.f125530v;
            boolean isEmpty = tu2Var.getList(1).isEmpty();
            int i19 = this.L;
            int i27 = isEmpty ? 1 : 2;
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String str2 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
            java.lang.String str3 = this.B;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            o3Var.Gj(1, str2, str3, str, 2, i19, 2, i27, 1, nyVar != null ? nyVar.V6() : null);
            size2 = size3;
        } else {
            jx3.f.INSTANCE.idkeyStat(1265L, 11L, 1L, false);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.H;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.N(0);
        if (size2 == 0) {
            android.view.View view = this.K;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f125527J;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.H;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            android.view.View view2 = this.K;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f125527J;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.H;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setVisibility(0);
        }
        if (size == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
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
        if (size < size2) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.I;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(size, size2 - size);
            }
        }
    }

    public final void e7(java.lang.String str) {
        this.f125530v = str;
        this.f125531w = 0;
        this.f125532x = 0;
        this.f125533y = null;
        this.f125534z.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.B = uuid;
        bq.o1 o1Var = this.Q;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f125531w, this.B, this.f125533y, this.C, null, null, null, null, null, false, 0, 4064, null);
        this.Q = o1Var2;
        pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.d0(this)).f(this);
        android.view.View view = this.K;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f125527J;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.H;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setVisibility(8);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return this.F ? com.tencent.mm.R.layout.afl : com.tencent.mm.R.layout.afk;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.h80.class);
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
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125529u;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    public final void onContactItemLongClick(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (this.C == 8) {
            rl5.r rVar = new rl5.r(getContext());
            androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            int u07 = recyclerView.u0(view);
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = 1;
            com.tencent.mm.plugin.finder.search.a0 a0Var = new com.tencent.mm.plugin.finder.search.a0(f0Var);
            com.tencent.mm.plugin.finder.search.c0 c0Var = new com.tencent.mm.plugin.finder.search.c0(u07, this);
            int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
            rVar.g(view, u07, 0L, a0Var, c0Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            rVar.m();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("is_force_night_mode", false);
        this.F = booleanExtra;
        if (booleanExtra) {
            getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false, this.F);
        this.f125529u = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125529u;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125529u;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125529u;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125529u;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125529u;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        this.C = getIntent().getIntExtra("request_type", 2);
        this.E = getIntent().getBooleanExtra("from_at_contact", false);
        this.D = getIntent().getBooleanExtra("need_history", true);
        r45.b31 b31Var = com.tencent.mm.plugin.finder.search.l4.f125763c;
        if (b31Var != null) {
            com.tencent.mm.plugin.finder.search.l4.f125763c = null;
            java.lang.String string = b31Var.getString(6);
            if (string == null) {
                string = "";
            }
            this.B = string;
            java.lang.String string2 = b31Var.getString(0);
            this.f125530v = string2 != null ? string2 : "";
            this.f125531w = b31Var.getInteger(1);
            this.f125532x = b31Var.getInteger(2);
            this.f125533y = b31Var.getByteString(4);
            this.A = b31Var.getInteger(5);
            java.util.LinkedList list = b31Var.getList(7);
            kotlin.jvm.internal.o.f(list, "getContactList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Boolean.valueOf(this.f125534z.add((r45.mu2) it.next())));
            }
        } else {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            this.B = uuid;
            this.f125530v = "";
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125529u;
            if (fTSSearchView7 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView7.getFtsEditText().m();
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125529u;
            if (fTSSearchView8 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView8.getFtsEditText().t();
        }
        if (this.D) {
            this.M = new com.tencent.mm.plugin.finder.search.k4(this, false, this.F, new com.tencent.mm.plugin.finder.search.w(this), new com.tencent.mm.plugin.finder.search.x());
        } else {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.E) {
            setResult(0, getIntent());
        }
        com.tencent.mars.xlog.Log.i(this.f125528t, "fromAtContact:%s", java.lang.Boolean.valueOf(this.E));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125529u;
        if (fTSSearchView9 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = fTSSearchView9.getFtsEditText();
        kotlin.jvm.internal.o.f(ftsEditText, "getFtsEditText(...)");
        this.N = new com.tencent.mm.plugin.finder.search.u4(this, ftsEditText, 0, 2, false, this.F, new com.tencent.mm.plugin.finder.search.y(this));
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        this.H = refreshLoadMoreLayout;
        this.I = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f125527J = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.K = findViewById4;
        if (this.F) {
            android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.j8y);
            kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.view.View");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.H;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            findViewById5.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
        }
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.I;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.plugin.finder.search.q(this, this.F));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.I;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.I;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setItemViewCacheSize(5);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.I;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setOnTouchListener(new com.tencent.mm.plugin.finder.search.t(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.H;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout3.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.H;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(this.F ? com.tencent.mm.R.layout.bsc : com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout4.setLoadMoreFooter(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.H;
        if (refreshLoadMoreLayout5 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout5.setActionCallback(new com.tencent.mm.plugin.finder.search.v(this));
        java.lang.String str = this.f125530v;
        if (str != null) {
            com.tencent.mm.plugin.finder.search.u4 u4Var = this.N;
            if (u4Var == null) {
                kotlin.jvm.internal.o.o("searchSuggestionManager");
                throw null;
            }
            u4Var.f125891l = str;
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView10 = this.f125529u;
            if (fTSSearchView10 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView10.getFtsEditText().n(str, null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.I;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView6.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.I;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int i17 = this.A;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerView7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView7.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerView7, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.P.a(new com.tencent.mm.plugin.finder.search.r(this));
        alive();
        androidx.recyclerview.widget.RecyclerView recyclerView8 = this.I;
        if (recyclerView8 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView8.i(this.S);
        if (this.F) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderContactSearchUI_Live)).Rj(this, iy1.a.FinderLive);
        } else {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderContactSearchUI_Finder)).Rj(this, iy1.a.Finder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        dead();
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.a();
        }
        this.P.c();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.V0(this.S);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_3", ml2.y.f328241f, 0, 0L, 0, 112, null);
        if (this.N != null) {
            return;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_3", ml2.y.f328240e, 0, 0L, 0, 112, null);
        if (this.N != null) {
            return;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }
}
