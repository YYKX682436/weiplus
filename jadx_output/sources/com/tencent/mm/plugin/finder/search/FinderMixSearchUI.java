package com.tencent.mm.plugin.finder.search;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderMixSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Ltj5/l;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "presenter", "Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderMixSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n, tj5.l {
    private com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter presenter;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125583t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.t3 f125584u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.k4 f125585v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.u4 f125586w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f125587x;

    /* renamed from: y, reason: collision with root package name */
    public int f125588y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.j3 f125589z = new com.tencent.mm.plugin.finder.search.j3();

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125585v;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.b(str3);
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125584u;
        if (t3Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            t3Var.f125863m.setVisibility(8);
            android.view.View view = t3Var.f125864n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = t3Var.f125867q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // tj5.n
    public boolean G0() {
        d7();
        return true;
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
        return 23;
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        d7();
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    public final boolean d7() {
        java.lang.String str;
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125583t;
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
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = this.presenter;
        if (finderMixSearchPresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        finderMixSearchPresenter.s(str, 1, false, null, this.f125588y);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125585v;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(str);
        com.tencent.mm.plugin.finder.search.k4 k4Var2 = this.f125585v;
        if (k4Var2 == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var2.f125743b.getCount();
        com.tencent.mm.plugin.finder.search.k4 k4Var3 = this.f125585v;
        if (k4Var3 == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        if (k4Var3.f125743b.getCount() > 1) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125583t;
            if (fTSSearchView2 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView2.setCancelBtnVisible(0);
        } else {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125583t;
            if (fTSSearchView3 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView3.setCancelBtnVisible(8);
        }
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.f125586w;
        if (u4Var != null) {
            u4Var.b();
            return true;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
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
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125583t;
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
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f125587x = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127652d4).getValue()).r()).intValue() == 1;
        this.f125588y = getIntent().getIntExtra("request_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_click_sub_tab_context_id");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s = stringExtra;
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125588y == 13 ? new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false, true) : new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f125583t = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f125583t;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f125583t;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f125583t;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f125583t;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().setActionSearchDoneListener(this);
        if (this.f125587x) {
            int i17 = this.f125588y == 13 ? com.tencent.mm.R.color.f478512u : com.tencent.mm.R.color.BW_93;
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f125583t;
            if (fTSSearchView6 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            android.view.View findViewById = fTSSearchView6.findViewById(com.tencent.mm.R.id.aa8);
            fTSSearchView6.f209836e = findViewById;
            findViewById.setOnClickListener(new tj5.t(fTSSearchView6));
            android.view.View view = fTSSearchView6.f209836e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/search/FTSSearchView", "initHotSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/search/FTSSearchView", "initHotSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSSearchView6.f209835d.setVisibility(8);
            fTSSearchView6.f209837f.setBackgroundColor(fTSSearchView6.getResources().getColor(i17));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) fTSSearchView6.f209839h.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.setMarginEnd((int) fTSSearchView6.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
            fTSSearchView6.f209839h.setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f125583t;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f125583t;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().t();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f125583t;
        if (fTSSearchView9 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView9.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView10 = this.f125583t;
        if (fTSSearchView10 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView10);
        this.f125585v = new com.tencent.mm.plugin.finder.search.k4(this, false, this.f125588y == 13, new com.tencent.mm.plugin.finder.search.f3(this), new com.tencent.mm.plugin.finder.search.g3());
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter(this, this.f125588y);
        this.presenter = finderMixSearchPresenter;
        com.tencent.mm.plugin.finder.search.t3 t3Var = new com.tencent.mm.plugin.finder.search.t3(this, finderMixSearchPresenter, this.f125588y);
        this.f125584u = t3Var;
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter2 = this.presenter;
        if (finderMixSearchPresenter2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        finderMixSearchPresenter2.f125580v = t3Var;
        finderMixSearchPresenter2.f125581w.alive();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        mt2.h hVar = (mt2.h) zVar.a(context).e(mt2.h.class);
        if (hVar != null) {
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter3 = this.presenter;
            if (finderMixSearchPresenter3 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            hVar.f331288z = finderMixSearchPresenter3;
            if (this.f125584u == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.search.t3 t3Var2 = this.f125584u;
        if (t3Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        t3Var2.f125867q.setOnTouchListener(new com.tencent.mm.plugin.finder.search.h3(this));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView11 = this.f125583t;
        if (fTSSearchView11 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = fTSSearchView11.getFtsEditText();
        kotlin.jvm.internal.o.f(ftsEditText, "getFtsEditText(...)");
        int i18 = this.f125588y;
        this.f125586w = new com.tencent.mm.plugin.finder.search.u4(this, ftsEditText, i18, 1, false, i18 == 13, new com.tencent.mm.plugin.finder.search.i3(this));
        if (this.f125588y == 13) {
            getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
            ul5.k bounceView = getBounceView();
            if (bounceView != null) {
                bounceView.setStart2EndBgColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
            ul5.k bounceView2 = getBounceView();
            if (bounceView2 != null) {
                bounceView2.setEnd2StartBgColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125585v;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.f125742a.setVisibility(0);
        com.tencent.mm.plugin.finder.search.t3 t3Var3 = this.f125584u;
        if (t3Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.search.j3 j3Var = this.f125589z;
        androidx.recyclerview.widget.RecyclerView recyclerView = t3Var3.f125868r;
        if (recyclerView != null) {
            recyclerView.i(j3Var);
        }
        com.tencent.mm.plugin.finder.search.t3 t3Var4 = this.f125584u;
        if (t3Var4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = t3Var4.f125869s;
        if (recyclerView2 != null) {
            recyclerView2.i(j3Var);
        }
        if (!this.f125587x) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d = java.lang.String.valueOf(c01.id.c());
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String str = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            o3Var.Gj(1, str, uuid, "", 1, 1, 1, 0, 0, nyVar != null ? nyVar.V6() : null);
        }
        if (getIntent().getIntExtra("request_type", 0) == 13) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.dk(this, "FinderMixSearchUI_Live");
            ((cy1.a) aVar.ak(this, iy1.c.FinderMixSearchUI_Live)).Rj(this, iy1.a.FinderLive);
        } else {
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.dk(this, "FinderMixSearchUI_Finder");
            ((cy1.a) aVar2.ak(this, iy1.c.FinderMixSearchUI_Finder)).Rj(this, iy1.a.Finder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125585v;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.a();
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = this.presenter;
        if (finderMixSearchPresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        finderMixSearchPresenter.onDetach();
        hideVKB();
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125584u;
        if (t3Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.search.j3 j3Var = this.f125589z;
        androidx.recyclerview.widget.RecyclerView recyclerView = t3Var.f125868r;
        if (recyclerView != null) {
            recyclerView.V0(j3Var);
        }
        com.tencent.mm.plugin.finder.search.t3 t3Var2 = this.f125584u;
        if (t3Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = t3Var2.f125869s;
        if (recyclerView2 != null) {
            recyclerView2.V0(j3Var);
        }
        if (!this.f125587x) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d = "";
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.x1 x1Var = ml2.x1.f328202f;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, null, x1Var, "temp_4", ml2.y.f328241f, 0, 0L, 0, 112, null);
        if (this.f125586w != null) {
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
        ml2.x1 x1Var = ml2.x1.f328202f;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, null, x1Var, "temp_4", ml2.y.f328240e, 0, 0L, 0, 112, null);
        if (this.f125586w != null) {
            return;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(d92.u1.class);
        set.add(mt2.h.class);
    }
}
