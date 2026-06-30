package cp2;

/* loaded from: classes2.dex */
public abstract class q1 implements cp2.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f220882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment f220883e;

    /* renamed from: f, reason: collision with root package name */
    public final cp2.c f220884f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f220885g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f220886h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.dd2 f220887i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f220888m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f220889n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f220890o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f220891p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f220892q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f220893r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.d f220894s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f220895t;

    /* renamed from: u, reason: collision with root package name */
    public final cp2.u1 f220896u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220897v;

    /* renamed from: w, reason: collision with root package name */
    public final cp2.p1 f220898w;

    public q1(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment, cp2.c presenter, android.view.View parent, boolean z17, r45.dd2 dd2Var) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f220882d = baseContext;
        this.f220883e = absNearByFragment;
        this.f220884f = presenter;
        this.f220885g = parent;
        this.f220886h = z17;
        this.f220887i = dd2Var;
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "#init");
        this.f220888m = jz5.h.b(new cp2.k1(this));
        this.f220889n = jz5.h.b(new cp2.j1(this));
        this.f220890o = jz5.h.b(new cp2.b1(this));
        jz5.h.b(new cp2.l1(this));
        this.f220891p = jz5.h.b(new cp2.m1(this));
        this.f220892q = jz5.h.b(new cp2.n1(this));
        this.f220893r = jz5.h.b(new cp2.o1(this));
        this.f220894s = new ml2.d();
        this.f220896u = new cp2.u1(baseContext, absNearByFragment, presenter.getCommentScene(), presenter);
        this.f220898w = new cp2.p1(this, l());
    }

    public final r45.qt2 a() {
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = this.f220883e;
        if (absNearByFragment != null) {
            return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(absNearByFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        com.tencent.mm.ui.MMActivity activity = this.f220882d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView g() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f220889n).getValue();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f220882d;
    }

    public com.tencent.mm.view.refreshLayout.WxRefreshLayout j() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout l17 = l();
        kotlin.jvm.internal.o.f(l17, "<get-rlLayout>(...)");
        return l17;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout l() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) this.f220888m.getValue();
    }

    public final androidx.recyclerview.widget.RecyclerView o() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f220893r).getValue();
    }

    public final int q() {
        r45.dd2 dd2Var;
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = this.f220883e;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
        if (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121519s) == null) {
            return 0;
        }
        return dd2Var.getInteger(0);
    }

    public void s(java.util.List cacheData) {
        java.util.List data;
        kotlin.jvm.internal.o.g(cacheData, "cacheData");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f220895t;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            data.clear();
            data.addAll(cacheData);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f220895t;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }
}
