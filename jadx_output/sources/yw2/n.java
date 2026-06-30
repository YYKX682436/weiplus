package yw2;

/* loaded from: classes2.dex */
public final class n implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.w20 f466651d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f466652e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f466653f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f466654g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f466655h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f466656i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f466657m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f466658n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f466659o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f466660p;

    public n(com.tencent.mm.plugin.finder.feed.w20 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f466651d = presenter;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f466651d.onDetach();
        k().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.feed.w20 w20Var = this.f466651d;
        if (z17 && z18) {
            w20Var.h(this, k().getFeedObj(), k().getLikeBuffer(), k().getCommentFriendInfoList());
        } else if (!z17 && z18) {
            w20Var.onDetach();
        }
        if (z17) {
            this.f466660p = false;
        } else {
            int scene = w20Var.getScene();
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            if (scene == 1 && !this.f466660p) {
                this.f466660p = true;
                androidx.recyclerview.widget.f2 adapter = o().getRecyclerView().getAdapter();
                if (adapter != null && (adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter)) {
                    java.lang.String nk6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
                    int f17 = w20Var.f();
                    android.util.LongSparseArray longSparseArray = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).C;
                    int size = longSparseArray.size();
                    java.lang.String exposeItems = "";
                    for (int i18 = 0; i18 < size; i18++) {
                        in5.x0 x0Var = (in5.x0) longSparseArray.valueAt(i18);
                        in5.c cVar = x0Var.f293158a;
                        if (cVar instanceof so2.f1) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(exposeItems);
                            so2.f1 f1Var = (so2.f1) cVar;
                            sb6.append(f1Var.f410336d.getString(5));
                            sb6.append(';');
                            sb6.append(x0Var.f293160c);
                            sb6.append(';');
                            sb6.append(f1Var.f410336d.getInteger(3));
                            sb6.append('#');
                            exposeItems = sb6.toString();
                        }
                    }
                    android.content.Context context = this.f466659o;
                    if (context == null) {
                        kotlin.jvm.internal.o.o("context");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObj = k().getFeedObj();
                    if (V6 != null && feedObj != null) {
                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        long id6 = feedObj.getId();
                        o3Var.getClass();
                        kotlin.jvm.internal.o.g(exposeItems, "exposeItems");
                        if (o3Var.dk(id6) != null) {
                            com.tencent.mm.autogen.mmdata.rpt.FinderRealLikeExposeStruct finderRealLikeExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRealLikeExposeStruct();
                            finderRealLikeExposeStruct.f57670j = V6.getInteger(5);
                            finderRealLikeExposeStruct.f57665e = finderRealLikeExposeStruct.b("ContextId", V6.getString(1), true);
                            finderRealLikeExposeStruct.f57666f = finderRealLikeExposeStruct.b("ClickTabContextId", V6.getString(2), true);
                            finderRealLikeExposeStruct.f57672l = finderRealLikeExposeStruct.b("EnterContextId", nk6, true);
                            finderRealLikeExposeStruct.f57664d = finderRealLikeExposeStruct.b("SessionId", V6.getString(0), true);
                            finderRealLikeExposeStruct.f57669i = finderRealLikeExposeStruct.b("FeedId", pm0.v.u(id6), true);
                            finderRealLikeExposeStruct.f57668h = f17 > 0 ? 1L : 0L;
                            finderRealLikeExposeStruct.f57667g = finderRealLikeExposeStruct.b("ExposeItems", exposeItems, true);
                            finderRealLikeExposeStruct.f57671k = f17;
                            finderRealLikeExposeStruct.k();
                            o3Var.Zk(finderRealLikeExposeStruct);
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        android.content.Context context2 = this.f466659o;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        finderMsgContract.a(context2, 5);
    }

    public final void g(boolean z17) {
        if (!z17) {
            o().setEnableRefresh(false);
            return;
        }
        o().setEnableRefresh(true);
        if (o().getRefreshHeader() == null) {
            com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
            android.content.Context context = this.f466659o;
            if (context == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cdl, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            o17.setRefreshHeaderView(inflate);
        }
    }

    public final android.widget.TextView h() {
        android.widget.TextView textView = this.f466652e;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("headerTitleTv");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderLikeDrawer k() {
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f466654g;
        if (finderLikeDrawer != null) {
            return finderLikeDrawer;
        }
        kotlin.jvm.internal.o.o("likeDrawer");
        throw null;
    }

    public final android.widget.TextView l() {
        android.widget.TextView textView = this.f466657m;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final android.view.View n() {
        android.view.View view = this.f466658n;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout o() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f466653f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void p() {
        android.widget.FrameLayout frameLayout = this.f466655h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f466656i;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l().setVisibility(8);
        android.view.View n17 = n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(n17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void q() {
        android.widget.FrameLayout frameLayout = this.f466655h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f466656i;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l().setVisibility(0);
        android.view.View n17 = n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(n17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
