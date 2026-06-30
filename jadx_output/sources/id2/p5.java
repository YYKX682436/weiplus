package id2;

/* loaded from: classes2.dex */
public final class p5 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f290743d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f290744e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f290745f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f290746g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f290747h;

    /* renamed from: i, reason: collision with root package name */
    public r45.hu1 f290748i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290746g = new java.util.ArrayList();
    }

    public static final java.lang.String O6(id2.p5 p5Var) {
        java.lang.String num;
        androidx.appcompat.app.AppCompatActivity activity = p5Var.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        return (mMFinderUI == null || (num = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) ? "" : num;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f290743d = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f290744e = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f486588lr5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f290747h = (com.tencent.mm.ui.widget.MMProcessBar) findViewById3;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f290744e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveSelfLotteryHistoryResultUIC$onViewCreated$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.lottery.history.p();
            }
        }, this.f290746g, false);
        wxRecyclerAdapter.f293105o = new id2.m5(this);
        this.f290745f = wxRecyclerAdapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f290744e;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        in5.o.b(recyclerView2, new id2.n5(this), in5.k.f293079d);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f290744e;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f290745f;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView3.setAdapter(wxRecyclerAdapter2);
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f290743d;
        if (finderRefreshLayout == null) {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
        finderRefreshLayout.setOnSimpleAction(new id2.o5(this));
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f290747h;
        if (mMProcessBar == null) {
            kotlin.jvm.internal.o.o("loadingBar");
            throw null;
        }
        mMProcessBar.setVisibility(0);
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), kotlinx.coroutines.q1.f310570c, null, new id2.j5(this, new id2.k5(this), null), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f290746g = new java.util.ArrayList();
    }
}
