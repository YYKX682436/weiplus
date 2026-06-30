package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLikedFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikedFeedUI extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI {
    public static final /* synthetic */ int E = 0;
    public com.tencent.mm.view.RefreshLoadMoreLayout A;
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer B;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f128593u;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter f128597y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback f128598z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f128592t = "Finder.FinderLikedFeedUI";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f128594v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f128595w = "";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f128596x = new java.util.LinkedList();
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.ui.d8(this));
    public final com.tencent.mm.plugin.finder.ui.b8 D = new com.tencent.mm.plugin.finder.ui.b8();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    public final vb2.m c7() {
        return (vb2.m) ((jz5.n) this.C).getValue();
    }

    public final void d7() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f128597y;
        if (likedTimelinePresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.f5 j27 = likedTimelinePresenter.j2();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) zVar.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        if (v6Var != null && v6Var.O6()) {
            return;
        }
        if (j27 != null && j27.b()) {
            j27.a();
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.B;
        if (finderLikeDrawer == null) {
            kotlin.jvm.internal.o.o("friendLikeDrawer");
            throw null;
        }
        if (finderLikeDrawer.q()) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.B;
            if (finderLikeDrawer2 != null) {
                finderLikeDrawer2.u();
                return;
            } else {
                kotlin.jvm.internal.o.o("friendLikeDrawer");
                throw null;
            }
        }
        androidx.lifecycle.c1 a17 = zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17).P6(false)) {
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Z5).getValue()).r()).booleanValue()) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    public final void e7() {
        if (!com.tencent.mm.ui.bk.y()) {
            c7().f434678n.setVisibility(8);
            c7().f434676l.setVisibility(8);
            c7().f434672h.setVisibility(8);
            return;
        }
        c7().f434678n.setVisibility(0);
        c7().f434676l.setVisibility(0);
        c7().f434672h.setVisibility(4);
        if (com.tencent.mm.ui.bk.w0()) {
            if (com.tencent.mm.ui.fj.b(this)) {
                c7().f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_merge);
            } else {
                c7().f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_sperated);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.akz;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.h80.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, hy2.f.class, com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.gg.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class});
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.eqs);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        setMMTitle(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        setBackBtn(new com.tencent.mm.plugin.finder.ui.a8(this));
        getIntent().getLongExtra("KEY_CACHE_ID", 0L);
        getIntent().getIntExtra("KEY_CLICK_FEED_POSITION", 0);
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.view.Window window = getContext().getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        this.B = com.tencent.mm.plugin.finder.view.vc.a(vcVar, context2, window, 1, false, false, 24, null);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.A;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout.setLoadMoreFooter(inflate);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter(this, this.f128594v, this.f128595w, this.f128596x);
        this.f128597y = likedTimelinePresenter;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback(this, likedTimelinePresenter);
        this.f128598z = likedTimelineViewCallback;
        likedTimelineViewCallback.b();
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f128598z;
        if (likedTimelineViewCallback2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(likedTimelineViewCallback2.f122703e.f122646g, likedTimelineViewCallback2.a(), false, 2, null);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f128597y;
        if (likedTimelinePresenter2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback3 = this.f128598z;
        if (likedTimelineViewCallback3 != null) {
            likedTimelinePresenter2.c(likedTimelineViewCallback3);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        d7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        e7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.FinderLikedFeedUI;
        ((cy1.a) rVar).ak(this, cVar);
        this.f128593u = c01.z1.r();
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FAV_QUERY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f128594v = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_REQUEST_ID");
        this.f128595w = stringExtra2 != null ? stringExtra2 : "";
        java.util.LinkedList linkedList = this.f128596x;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_TAGS");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        linkedList.addAll(stringArrayListExtra);
        com.tencent.mars.xlog.Log.i(this.f128592t, "username %s", this.f128593u);
        initView();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(getContext());
        android.view.View bodyView = getBodyView();
        kotlin.jvm.internal.o.e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
        b17.inflate(com.tencent.mm.R.layout.aj9, (android.view.ViewGroup) bodyView, true);
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.widget.FrameLayout frameLayout = c7().f434671g;
        frameLayout.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(frameLayout, true);
        c7().f434666b.setOnClickListener(new com.tencent.mm.plugin.finder.ui.w7(this));
        e7();
        c7().f434678n.setOnClickListener(new com.tencent.mm.plugin.finder.ui.z7(this));
        c7().f434669e.setVisibility(8);
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        c7().f434671g.setVisibility(0);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.A;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f128598z;
        if (likedTimelineViewCallback == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        likedTimelineViewCallback.getRecyclerView().i(this.D);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4);
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        }
        android.widget.FrameLayout frameLayout2 = c7().f434668d;
        frameLayout2.setVisibility(0);
        frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.c8(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484229dg3)).setText(getString(com.tencent.mm.R.string.ezk));
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f128597y;
        if (likedTimelinePresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ggVar.f134512n = likedTimelinePresenter.f122646g;
        ggVar.U6(getIntent().getExtras());
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, cVar)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f128598z;
        if (likedTimelineViewCallback == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        likedTimelineViewCallback.getRecyclerView().V0(this.D);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f128598z;
        if (likedTimelineViewCallback2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = likedTimelineViewCallback2.f122703e;
        likedTimelinePresenter.f122646g.unregister(likedTimelineViewCallback2.a());
        likedTimelinePresenter.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f128598z;
        if (likedTimelineViewCallback != null) {
            zy2.zb.Kh(zbVar, likedTimelineViewCallback.getRecyclerView(), ml2.x1.f328203g, "2", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f128598z;
        if (likedTimelineViewCallback != null) {
            zy2.zb.Kh(zbVar, likedTimelineViewCallback.getRecyclerView(), ml2.x1.f328203g, "2", ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f128597y;
        if (likedTimelinePresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = likedTimelinePresenter.f122646g;
        android.content.Intent intent = getIntent();
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f128597y;
        if (likedTimelinePresenter2 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(baseFinderFeedLoader, intent, likedTimelinePresenter2.f122646g.getInitPos(), null, 4, null);
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }
}
