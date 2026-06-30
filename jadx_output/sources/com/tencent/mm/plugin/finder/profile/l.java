package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f123395e;

    public l(com.tencent.mm.plugin.finder.profile.w wVar, boolean z17, java.util.List list) {
        this.f123394d = wVar;
        this.f123395e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.w wVar = this.f123394d;
        com.tencent.mm.plugin.finder.profile.b0 b0Var = wVar.f124449f;
        final android.app.Activity activity = wVar.f124444a;
        if (b0Var == null) {
            java.lang.String str2 = wVar.f124453j;
            com.tencent.mm.plugin.finder.profile.b0 b0Var2 = new com.tencent.mm.plugin.finder.profile.b0(activity);
            b0Var2.f123323q = str2;
            b0Var2.f123324r = wVar;
            b0Var2.f123320n = new com.tencent.mm.plugin.finder.profile.k(wVar);
            wVar.f124449f = b0Var2;
        }
        if (wVar.f124450g == null) {
            int i17 = com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer.f123290z;
            android.view.Window window = activity.getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            com.tencent.mm.plugin.finder.profile.b0 b0Var3 = wVar.f124449f;
            com.tencent.mars.xlog.Log.i("Finder.FinderProfilePoiDrawer", "createDrawerToAttachWindow ");
            final com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer finderProfilePoiDrawer = new com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer(activity);
            finderProfilePoiDrawer.setPoiListView(b0Var3);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            com.tencent.mm.plugin.finder.profile.j jVar = new com.tencent.mm.plugin.finder.profile.j();
            kotlin.jvm.internal.o.f(finderProfilePoiDrawer.getContext(), "getContext(...)");
            jVar.f123390d = finderProfilePoiDrawer;
            finderProfilePoiDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
            finderProfilePoiDrawer.setEnableClickBackgroundToCloseDrawer(true);
            finderProfilePoiDrawer.h(jVar);
            int g17 = com.tencent.mm.ui.bl.g(activity);
            layoutParams.bottomMargin = g17;
            com.tencent.mars.xlog.Log.i("Finder.FinderProfilePoiDrawer", "[initView] bottomMargin= " + g17);
            android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((android.widget.FrameLayout) decorView).addView(finderProfilePoiDrawer, layoutParams);
            android.widget.FrameLayout headerLayout = finderProfilePoiDrawer.getHeaderLayout();
            kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
            android.view.View inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.f489076b73, headerLayout);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            jVar.f123391e = inflate;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.byz);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.profile.i(jVar));
            }
            if (findViewById != null) {
                jVar.g().k(findViewById);
            }
            android.view.View view2 = jVar.f123391e;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("header");
                throw null;
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f484135d50);
            com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer g18 = jVar.g();
            kotlin.jvm.internal.o.d(linearLayout);
            g18.k(linearLayout);
            android.view.View view3 = jVar.f123391e;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("header");
                throw null;
            }
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = (com.tencent.mm.ui.search.FTSSearchView) view3.findViewById(com.tencent.mm.R.id.d4t);
            com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer g19 = jVar.g();
            kotlin.jvm.internal.o.d(fTSSearchView);
            g19.k(fTSSearchView);
            com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = finderProfilePoiDrawer.getCenterLayout();
            kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
            jVar.f123392f = rlLayout;
            kotlin.jvm.internal.o.g(rlLayout.getRecyclerView(), "<set-?>");
            if (b0Var3 != null) {
                android.view.View view4 = jVar.f123391e;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("header");
                    throw null;
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = jVar.f123392f;
                if (refreshLoadMoreLayout == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                b0Var3.f123321o = view4;
                refreshLoadMoreLayout.setEnableRefresh(false);
                refreshLoadMoreLayout.setEnableLoadMore(false);
                android.content.Context context = b0Var3.f123313d;
                android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489175bk1, (android.view.ViewGroup) null);
                b0Var3.f123316g = (com.tencent.mm.ui.widget.MMProcessBar) inflate2.findViewById(com.tencent.mm.R.id.m6l);
                refreshLoadMoreLayout.setLoadMoreFooter(inflate2);
                refreshLoadMoreLayout.setActionCallback(b0Var3.f123324r);
                b0Var3.f123314e = refreshLoadMoreLayout;
                androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
                kotlin.jvm.internal.o.g(recyclerView, "<set-?>");
                b0Var3.f123315f = recyclerView;
                com.tencent.mm.plugin.finder.profile.z zVar = new com.tencent.mm.plugin.finder.profile.z(b0Var3);
                b0Var3.f123319m = zVar;
                androidx.recyclerview.widget.RecyclerView recyclerView2 = b0Var3.f123315f;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                recyclerView2.setAdapter(zVar);
                androidx.recyclerview.widget.RecyclerView recyclerView3 = b0Var3.f123315f;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
                b0Var3.c(0);
            }
            android.widget.FrameLayout loadingLayout = finderProfilePoiDrawer.getLoadingLayout();
            kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
            if (activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) {
                ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) activity).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1
                    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                    public final void onDestroy() {
                        com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer.this.b();
                        ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) activity).mo133getLifecycle().c(this);
                    }
                });
            }
            wVar.f124450g = finderProfilePoiDrawer;
        }
        com.tencent.mm.plugin.finder.profile.b0 b0Var4 = wVar.f124449f;
        java.util.List list = this.f123395e;
        if (b0Var4 != null) {
            kotlin.jvm.internal.o.g(list, "list");
            com.tencent.mars.xlog.Log.i("Finder.FinderProfilePoiListView", "[initPoiList] list size=" + list.size());
            if (list.size() >= 20) {
                android.view.View view5 = b0Var4.f123321o;
                android.widget.LinearLayout linearLayout2 = view5 != null ? (android.widget.LinearLayout) view5.findViewById(com.tencent.mm.R.id.f484135d50) : null;
                android.view.View view6 = b0Var4.f123321o;
                if ((view6 != null ? view6.getLayoutParams() : null) instanceof android.widget.LinearLayout.LayoutParams) {
                    android.view.View view7 = b0Var4.f123321o;
                    android.view.ViewGroup.LayoutParams layoutParams2 = view7 != null ? view7.getLayoutParams() : null;
                    kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).bottomMargin = b0Var4.f123313d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
                }
                android.view.View view8 = b0Var4.f123321o;
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = view8 != null ? (com.tencent.mm.ui.search.FTSSearchView) view8.findViewById(com.tencent.mm.R.id.d4t) : null;
                b0Var4.f123322p = fTSSearchView2;
                if (fTSSearchView2 != null) {
                    fTSSearchView2.f209835d.setVisibility(8);
                    fTSSearchView2.f209837f.setBackgroundResource(com.tencent.mm.R.drawable.abq);
                    fTSSearchView2.f209837f.getLayoutParams().height = fTSSearchView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
                    fTSSearchView2.f209839h.g();
                    android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) fTSSearchView2.f209839h.getLayoutParams();
                    layoutParams3.width = -2;
                    layoutParams3.setMarginEnd((int) fTSSearchView2.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
                    fTSSearchView2.f209839h.setLayoutParams(layoutParams3);
                }
                com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = b0Var4.f123322p;
                if (fTSSearchView3 != null && (ftsEditText = fTSSearchView3.getFtsEditText()) != null) {
                    ftsEditText.setFtsEditTextListener(b0Var4);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.a0(linearLayout2, b0Var4));
                }
            }
            java.util.LinkedList linkedList = b0Var4.f123317h;
            linkedList.clear();
            linkedList.addAll(list);
            b0Var4.c(linkedList.size());
            com.tencent.mm.plugin.finder.profile.z zVar2 = b0Var4.f123319m;
            if (zVar2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            zVar2.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer finderProfilePoiDrawer2 = wVar.f124450g;
        if (finderProfilePoiDrawer2 != null) {
            finderProfilePoiDrawer2.setTopPadding(list.size());
        }
        com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer finderProfilePoiDrawer3 = wVar.f124450g;
        if (finderProfilePoiDrawer3 != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.s(finderProfilePoiDrawer3, false, false, 0, 7, null);
        }
        java.lang.CharSequence text = wVar.g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        wVar.k(1, str, wVar.f124453j);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
