package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class nc0 extends com.tencent.mm.ui.component.UIComponent implements tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f135309d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135310e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135311f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135312g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f135313h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f135314i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.u5 f135315m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.m5 f135316n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f135317o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxLinearLayoutManager f135318p;

    /* renamed from: q, reason: collision with root package name */
    public final cy3.a0 f135319q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f135320r;

    /* renamed from: s, reason: collision with root package name */
    public int f135321s;

    /* renamed from: t, reason: collision with root package name */
    public final int f135322t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.kc0 f135323u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135309d = "MicroMsg.RingtoneSearchMainUIC";
        this.f135310e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ic0(this));
        this.f135311f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.mc0(this));
        this.f135312g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.dc0(this));
        this.f135313h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.cc0(this));
        this.f135314i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.lc0(activity));
        this.f135318p = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(activity, 1, false);
        this.f135319q = new cy3.a0(0);
        this.f135321s = -1;
        this.f135322t = i65.a.h(activity, com.tencent.mm.R.dimen.f479738dv);
        this.f135323u = new com.tencent.mm.plugin.finder.viewmodel.component.kc0(this, activity);
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        java.util.List data;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View O6 = O6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P6 = P6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(P6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(P6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.tencent.mm.plugin.ringtone.uic.d2) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Bi(getActivity())).O6();
        ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((dd0.m0) a1Var).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.ringtone.uic.z1) ((ed0.x0) a17)).O6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f135317o;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            data.clear();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f135317o;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.search.m5 m5Var = this.f135316n;
        if (m5Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        android.widget.ListView listView = m5Var.f125780e;
        if (K0) {
            listView.setVisibility(0);
        } else {
            listView.setVisibility(8);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        java.lang.String totalQuery = R6().getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        ed0.z0.Z1(((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(getActivity()), 1L, 0, 2, null);
        T6(str);
        com.tencent.mm.plugin.finder.search.m5 m5Var = this.f135316n;
        if (m5Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        m5Var.a(str);
        com.tencent.mm.plugin.finder.search.u5 u5Var = this.f135315m;
        if (u5Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u5Var.b();
        jx3.f.INSTANCE.idkeyStat(1265L, 6L, 1L, false);
        return false;
    }

    public final android.view.View O6() {
        java.lang.Object value = ((jz5.n) this.f135313h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View P6() {
        java.lang.Object value = ((jz5.n) this.f135312g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout Q6() {
        java.lang.Object value = ((jz5.n) this.f135310e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.refreshLayout.WxRefreshLayout) value;
    }

    public final com.tencent.mm.ui.search.FTSSearchView R6() {
        return (com.tencent.mm.ui.search.FTSSearchView) ((jz5.n) this.f135314i).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView S6() {
        java.lang.Object value = ((jz5.n) this.f135311f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final void T6(java.lang.String key) {
        com.tencent.mars.xlog.Log.i(this.f135309d, "search biz, key word : %s", key);
        if (key == null || key.length() == 0) {
            return;
        }
        if (key == null || r26.n0.N(key)) {
            return;
        }
        ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(getActivity());
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.ringtone.uic.d2 d2Var = (com.tencent.mm.plugin.ringtone.uic.d2) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Bi(getActivity());
        kotlinx.coroutines.r2 r2Var = d2Var.f158386d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        androidx.appcompat.app.AppCompatActivity activity = d2Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ox3.l lVar = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(null, 1));
        d2Var.P6().e(key);
        d2Var.Q6(true);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.kvStat(19184, str);
        }
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        getActivity().finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        java.util.List data;
        com.tencent.mars.xlog.Log.i(this.f135309d, "onClickClearText");
        ((com.tencent.mm.plugin.ringtone.uic.d2) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Bi(getActivity())).O6();
        ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((dd0.m0) a1Var).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.ringtone.uic.z1) ((ed0.x0) a17)).O6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f135317o;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            data.clear();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f135317o;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        R6().getFtsEditText().m();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity2).showVKB();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((com.tencent.mm.plugin.ringtone.uic.c3) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(getActivity())).f158374f = 2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f135316n = new com.tencent.mm.plugin.finder.search.m5((com.tencent.mm.ui.MMActivity) activity, false, new com.tencent.mm.plugin.finder.viewmodel.component.wb0(this), new com.tencent.mm.plugin.finder.viewmodel.component.xb0(this), new com.tencent.mm.plugin.finder.viewmodel.component.yb0(this), 2, null);
        R6().setSearchViewListener(this);
        R6().getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        R6().getFtsEditText().setFtsEditTextListener(this);
        R6().getFtsEditText().setCanDeleteTag(false);
        R6().getFtsEditText().g();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) R6().findViewById(com.tencent.mm.R.id.aa8);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.zb0(this));
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = R6().getFtsEditText();
        kotlin.jvm.internal.o.f(ftsEditText, "getFtsEditText(...)");
        com.tencent.mm.plugin.finder.search.u5 u5Var = new com.tencent.mm.plugin.finder.search.u5((com.tencent.mm.ui.MMActivity) activity2, ftsEditText, new com.tencent.mm.plugin.finder.viewmodel.component.ac0(this));
        this.f135315m = u5Var;
        u5Var.f125902o = new com.tencent.mm.plugin.finder.viewmodel.component.bc0(this);
        Q6().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.ec0(this));
        S6().i(new com.tencent.mm.plugin.finder.viewmodel.component.fc0(this));
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = this.f135318p;
        wxLinearLayoutManager.f11877q = true;
        S6().setLayoutManager(wxLinearLayoutManager);
        S6().setItemViewCacheSize(0);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter n66 = ed0.r0.n6(((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Ai(getActivity()), false, 1, null);
        this.f135317o = n66;
        n66.F = this.f135323u;
        S6().setAdapter(this.f135317o);
        if (((com.tencent.mm.plugin.ringtone.uic.v) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Ai(getActivity())).Q6()) {
            com.tencent.mm.plugin.finder.viewmodel.component.gc0 gc0Var = new com.tencent.mm.plugin.finder.viewmodel.component.gc0(this);
            cy3.a0 a0Var = this.f135319q;
            a0Var.f224751h = gc0Var;
            a0Var.b(S6());
            S6().i(new com.tencent.mm.plugin.finder.viewmodel.component.hc0(this));
        } else {
            S6().N(new cy3.t(getActivity()));
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.vb0(this, null), 3, null);
        R6().getFtsEditText().requestFocus();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.plugin.finder.search.l4.f125764d.clear();
        com.tencent.mm.plugin.finder.search.m5 m5Var = this.f135316n;
        if (m5Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        com.tencent.mm.plugin.finder.search.k5.f125749c.remove(java.lang.Integer.valueOf(m5Var.hashCode()));
        bu2.n.f24550a.c();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        S6().setAdapter(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.finder.search.u5 u5Var = this.f135315m;
        if (u5Var != null) {
            gm0.j1.d().q(8968, u5Var);
        } else {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.search.u5 u5Var = this.f135315m;
        if (u5Var != null) {
            gm0.j1.d().a(8968, u5Var);
        } else {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
    }
}
