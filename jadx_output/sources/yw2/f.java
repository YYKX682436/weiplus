package yw2;

/* loaded from: classes2.dex */
public final class f implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.x20 f466632d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f466633e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f466634f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f466635g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderFavDrawer f466636h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f466637i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f466638m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f466639n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f466640o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f466641p;

    public f(com.tencent.mm.plugin.finder.feed.x20 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f466632d = presenter;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        ((com.tencent.mm.plugin.finder.feed.f8) this.f466632d).b();
        h().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        yw2.f fVar;
        com.tencent.mm.plugin.finder.feed.x20 x20Var = this.f466632d;
        if (z17 && z18) {
            com.tencent.mm.plugin.finder.storage.FinderItem feedObj = h().getFeedObj();
            kotlin.jvm.internal.o.d(feedObj);
            com.tencent.mm.plugin.finder.feed.f8 f8Var = (com.tencent.mm.plugin.finder.feed.f8) x20Var;
            f8Var.getClass();
            f8Var.f106717n = feedObj;
            fp0.t tVar = new fp0.t("FinderLikeExecutor");
            f8Var.f106718o = tVar;
            f8Var.f106720q = this;
            tVar.e();
            f8Var.g();
            f8Var.f106719p.clear();
            f8Var.f106726w.alive();
            try {
                androidx.recyclerview.widget.f2 adapter = n().getRecyclerView().getAdapter();
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(f8Var.f106727x);
                }
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FavListDrawerPresenter", e17, "", new java.lang.Object[0]);
            }
            g(false);
            yw2.f fVar2 = f8Var.f106720q;
            if (fVar2 != null) {
                fVar2.h().l(true);
            }
            n().getRecyclerView().setLayoutFrozen(false);
            n().setActionCallback(new com.tencent.mm.plugin.finder.feed.u7(f8Var));
            yw2.f fVar3 = f8Var.f106720q;
            if (fVar3 != null) {
                android.widget.FrameLayout frameLayout = fVar3.f466637i;
                if (frameLayout == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                fVar3.l().setOnClickListener(null);
            }
            yw2.f fVar4 = f8Var.f106720q;
            if (fVar4 != null) {
                fVar4.o();
            }
            com.tencent.mm.plugin.finder.feed.f8.d(f8Var, false, null, 3, null);
            if (!f8Var.f106725v && (fVar = f8Var.f106720q) != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(fVar.n(), null, 1, null);
            }
            f8Var.f106722s = true;
            android.content.Context context = f8Var.f106710d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).O6();
        } else if (!z17 && z18) {
            ((com.tencent.mm.plugin.finder.feed.f8) x20Var).b();
        }
        if (!z17) {
            ((com.tencent.mm.plugin.finder.feed.f8) x20Var).getClass();
            com.tencent.mm.plugin.finder.view.p9 p9Var = com.tencent.mm.plugin.finder.view.FinderFavDrawer.B;
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        android.content.Context context2 = this.f466641p;
        if (context2 != null) {
            finderMsgContract.a(context2, 4);
        } else {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
    }

    public final void g(boolean z17) {
        if (!z17) {
            n().setEnableRefresh(false);
            return;
        }
        n().setEnableRefresh(true);
        if (n().getRefreshHeader() == null) {
            com.tencent.mm.view.RefreshLoadMoreLayout n17 = n();
            android.content.Context context = this.f466641p;
            if (context == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cdl, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            n17.setRefreshHeaderView(inflate);
        }
    }

    public final com.tencent.mm.plugin.finder.view.FinderFavDrawer h() {
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = this.f466636h;
        if (finderFavDrawer != null) {
            return finderFavDrawer;
        }
        kotlin.jvm.internal.o.o("favDrawer");
        throw null;
    }

    public final android.widget.TextView k() {
        android.widget.TextView textView = this.f466639n;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final android.view.View l() {
        android.view.View view = this.f466640o;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout n() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f466635g;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void o() {
        android.widget.FrameLayout frameLayout = this.f466637i;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f466638m;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k().setVisibility(8);
        android.view.View l17 = l();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(l17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
