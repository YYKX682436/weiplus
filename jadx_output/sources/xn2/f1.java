package xn2;

/* loaded from: classes2.dex */
public final class f1 implements xn2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f455492d;

    /* renamed from: e, reason: collision with root package name */
    public final xn2.a f455493e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455494f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f455495g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f455496h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f455497i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f455498m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f455499n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f455500o;

    public f1(android.app.Activity context, xn2.a megaVideoPresenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(megaVideoPresenter, "megaVideoPresenter");
        this.f455492d = context;
        this.f455493e = megaVideoPresenter;
        this.f455496h = jz5.h.b(new xn2.c1(this));
        this.f455497i = jz5.h.b(new xn2.x0(this));
        this.f455498m = jz5.h.b(new xn2.z0(this));
        this.f455499n = jz5.h.b(new xn2.b1(this));
        this.f455500o = jz5.h.b(new xn2.e1(this));
    }

    public ym5.q1 a() {
        return new xn2.s0(this, j());
    }

    public final com.tencent.mm.ui.widget.MMProcessBar g() {
        return (com.tencent.mm.ui.widget.MMProcessBar) ((jz5.n) this.f455497i).getValue();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        android.app.Activity activity = this.f455492d;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        return (com.tencent.mm.ui.MMFragmentActivity) activity;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f455500o).getValue();
        kotlin.jvm.internal.o.f(wxRecyclerView, "<get-rv>(...)");
        return wxRecyclerView;
    }

    public final android.view.View h() {
        return (android.view.View) ((jz5.n) this.f455496h).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout j() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f455499n).getValue();
    }

    public void l(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoViewCallback", "onUserVisible new visible=" + z17 + ",fetching=" + this.f455495g);
        this.f455494f = z17;
        if (!z17) {
            g().setVisibility(8);
        } else if (this.f455495g) {
            g().setVisibility(0);
        } else {
            g().setVisibility(8);
        }
    }
}
