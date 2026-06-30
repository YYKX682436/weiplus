package com.tencent.mm.plugin.finder.profile.filter;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lso2/d0;", "adapter", "Ljz5/f0;", "setOnItemClickListener", "Landroidx/recyclerview/widget/p2;", "getItemDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderCollectionFilterView extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f123340h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.filter.b f123341d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f123342e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager f123343f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f123344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setOnItemClickListener(com.tencent.mm.view.recyclerview.WxRecyclerAdapter<so2.d0> wxRecyclerAdapter) {
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.filter.f(wxRecyclerAdapter, this);
    }

    public final void a(com.tencent.mm.plugin.finder.profile.filter.b contract) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f123341d = contract;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b6h, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.e4q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.f123342e = wxRecyclerView;
        wxRecyclerView.N(getItemDecoration());
        com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager flowLayoutManager = new com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager();
        this.f123343f = flowLayoutManager;
        flowLayoutManager.f106762o = 2;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f123342e;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView2.setLayoutManager(flowLayoutManager);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter<so2.d0> wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter<>(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != so2.d0.class.getName().hashCode()) {
                    hc2.l.a("Finder.FinderCollectionFilterView", type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                com.tencent.mm.plugin.finder.profile.filter.b bVar = com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView.this.f123341d;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                if (bVar != null) {
                    return new com.tencent.mm.plugin.finder.convert.c0(bVar.f123356c, bVar.f123355b.c());
                }
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }, contract.f123357d, false);
        setOnItemClickListener(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f123342e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView3.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f123342e;
        if (wxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView4.setItemAnimator(new rs.k());
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.e4c);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f123344g = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.filter.d(this));
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        long j17 = -1;
        if (activity != null && (intent = activity.getIntent()) != null) {
            j17 = intent.getLongExtra("finder_read_feed_id", -1L);
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.widget.TextView textView2 = this.f123344g;
        if (textView2 != null) {
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, textView2, "more_collection", 0, 0, kz5.b1.e(new jz5.l("feed_id", pm0.v.u(j17))), null, 44, null);
        } else {
            kotlin.jvm.internal.o.o("moreArrow");
            throw null;
        }
    }

    public final androidx.recyclerview.widget.p2 getItemDecoration() {
        return new com.tencent.mm.plugin.finder.profile.filter.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
