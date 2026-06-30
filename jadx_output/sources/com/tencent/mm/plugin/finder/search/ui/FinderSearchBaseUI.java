package com.tencent.mm.plugin.finder.search.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "setLoadingView", "(Landroid/view/View;)V", "loadingView", "B", "getUiContainer", "setUiContainer", "uiContainer", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class FinderSearchBaseUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n {

    /* renamed from: A, reason: from kotlin metadata */
    public android.view.View loadingView;

    /* renamed from: B, reason: from kotlin metadata */
    public android.view.View uiContainer;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f125911u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f125913w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f125914x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f125915y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f125916z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f125910t = "Finder.FinderSearchBaseUI";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f125912v = "";

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.loadingView;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d7().setVisibility(8);
            e7().setVisibility(8);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        java.util.AbstractCollection dataList;
        hideVKB();
        java.lang.String totalQuery = f7().getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(this.f125910t, "startSearch query:".concat(str));
        this.f125912v = str;
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = (com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader) c7();
        finderActivitySearchLoader.getClass();
        finderActivitySearchLoader.f125676d = str;
        if (finderActivitySearchLoader.getLastBuffer() != null) {
            finderActivitySearchLoader.setLastBuffer(null);
        }
        if (!finderActivitySearchLoader.getDataList().isEmpty() && (dataList = finderActivitySearchLoader.getDataList()) != null) {
            dataList.clear();
        }
        finderActivitySearchLoader.requestRefresh();
        android.view.View view = this.loadingView;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d7().setVisibility(8);
        e7().setVisibility(8);
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public abstract pt2.o c7();

    public final android.widget.TextView d7() {
        android.widget.TextView textView = this.f125916z;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("noResultView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout e7() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125914x;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final com.tencent.mm.ui.search.FTSSearchView f7() {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f125911u;
        if (fTSSearchView != null) {
            return fTSSearchView;
        }
        kotlin.jvm.internal.o.o("searchView");
        throw null;
    }

    public abstract pt2.p g7();

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125915y;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
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
        f7().getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f125911u = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        f7().setSearchViewListener(this);
        f7().getFtsEditText().setHint(getString(com.tencent.mm.R.string.cjk));
        f7().getFtsEditText().setFtsEditTextListener(this);
        f7().getFtsEditText().setCanDeleteTag(false);
        f7().getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y(f7());
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) f7().findViewById(com.tencent.mm.R.id.aa8);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new pt2.m(this));
        }
        this.f125912v = "";
        f7().getFtsEditText().m();
        f7().getFtsEditText().t();
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125914x = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        androidx.recyclerview.widget.RecyclerView recyclerView = e7().getRecyclerView();
        kotlin.jvm.internal.o.g(recyclerView, "<set-?>");
        this.f125915y = recyclerView;
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f125916z = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setLoadingView(findViewById3);
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.orv);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setUiContainer(findViewById4);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = getRecyclerView();
        ((ot2.f) g7()).getClass();
        recyclerView2.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(this));
        g7().getClass();
        ((ot2.f) g7()).getClass();
        this.f125913w = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchViewConfig$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new com.tencent.mm.plugin.finder.convert.zu();
                }
                hc2.l.a("FinderActivitySearchViewConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, ((com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader) c7()).getDataList(), true);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = getRecyclerView();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f125913w;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView3.setAdapter(wxRecyclerAdapter);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        com.tencent.mm.view.RefreshLoadMoreLayout e76 = e7();
        kotlin.jvm.internal.o.d(inflate);
        e76.setLoadMoreFooter(inflate);
        d7().setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        getRecyclerView().setOnTouchListener(new pt2.k(this));
        e7().setEnablePullDownHeader(false);
        e7().setActionCallback(new pt2.l(this));
        f7().getFtsEditText().n(this.f125912v, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        hideVKB();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    public final void setLoadingView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.loadingView = view;
    }

    public final void setUiContainer(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.uiContainer = view;
    }
}
