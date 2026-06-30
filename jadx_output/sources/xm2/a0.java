package xm2;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455184a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.c f455185b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f455186c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f455187d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider f455188e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f455189f;

    /* renamed from: g, reason: collision with root package name */
    public final xm2.w f455190g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f455191h;

    public a0(android.view.ViewGroup controlPanelLayout, java.util.List items, java.lang.Object obj, ym2.c itemsAdapter, yz5.p itemValueChangedHandler, yz5.l itemSelectedHandler) {
        kotlin.jvm.internal.o.g(controlPanelLayout, "controlPanelLayout");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(itemsAdapter, "itemsAdapter");
        kotlin.jvm.internal.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        kotlin.jvm.internal.o.g(itemSelectedHandler, "itemSelectedHandler");
        this.f455184a = items;
        this.f455185b = itemsAdapter;
        this.f455186c = itemValueChangedHandler;
        this.f455187d = itemSelectedHandler;
        xm2.z zVar = new xm2.z(this);
        com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider = (com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider) controlPanelLayout.findViewById(com.tencent.mm.R.id.v6t);
        finderLiveBeautySlider.setValueChangedHandler(zVar);
        this.f455188e = finderLiveBeautySlider;
        this.f455189f = obj;
        xm2.w wVar = new xm2.w(items, obj, itemsAdapter, new xm2.y(this));
        this.f455190g = wVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) controlPanelLayout.findViewById(com.tencent.mm.R.id.u6h);
        android.content.Context context = controlPanelLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(new xm2.x(context));
        recyclerView.setAdapter(wVar);
        this.f455191h = recyclerView;
        a(obj);
    }

    public final void a(java.lang.Object obj) {
        zm2.d dVar = (zm2.d) this.f455185b.a(obj);
        boolean z17 = dVar.f474171e;
        com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider = this.f455188e;
        if (!z17) {
            finderLiveBeautySlider.setVisibility(8);
        } else {
            finderLiveBeautySlider.setVisibility(0);
            finderLiveBeautySlider.A(dVar.f474173g, dVar.f474172f, dVar.f474174h, dVar.f474175i);
        }
    }
}
