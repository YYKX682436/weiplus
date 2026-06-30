package xm2;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455222a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.c f455223b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f455224c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f455225d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f455226e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider f455227f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f455228g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.e f455229h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f455230i;

    public l(android.view.ViewGroup controlPanelLayout, java.util.List groups, yz5.l itemsSelector, ym2.c itemsAdapter, yz5.p itemValueChangedHandler, yz5.l itemSelectedHandler, yz5.l lVar) {
        kotlin.jvm.internal.o.g(controlPanelLayout, "controlPanelLayout");
        kotlin.jvm.internal.o.g(groups, "groups");
        kotlin.jvm.internal.o.g(itemsSelector, "itemsSelector");
        kotlin.jvm.internal.o.g(itemsAdapter, "itemsAdapter");
        kotlin.jvm.internal.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        kotlin.jvm.internal.o.g(itemSelectedHandler, "itemSelectedHandler");
        this.f455222a = groups;
        this.f455223b = itemsAdapter;
        this.f455224c = itemValueChangedHandler;
        this.f455225d = itemSelectedHandler;
        this.f455226e = lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : groups) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.List list = (java.util.List) itemsSelector.invoke(obj);
            if (i17 != this.f455222a.size() - 1 && !list.isEmpty()) {
                list = kz5.n0.u0(list, null);
            }
            kz5.h0.u(arrayList, list);
            i17 = i18;
        }
        xm2.j jVar = new xm2.j(this);
        com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider = (com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider) controlPanelLayout.findViewById(com.tencent.mm.R.id.v6t);
        finderLiveBeautySlider.setValueChangedHandler(jVar);
        this.f455227f = finderLiveBeautySlider;
        java.lang.Object Z = kz5.n0.Z(arrayList);
        if (Z == null) {
            throw new java.lang.IllegalArgumentException("Empty item list.");
        }
        this.f455228g = Z;
        xm2.e eVar = new xm2.e(arrayList, Z, this.f455223b, new xm2.i(this));
        this.f455229h = eVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) controlPanelLayout.findViewById(com.tencent.mm.R.id.u6h);
        android.content.Context context = controlPanelLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(new xm2.f(context, arrayList, new xm2.k(this)));
        recyclerView.setAdapter(eVar);
        this.f455230i = recyclerView;
        a(this.f455228g);
    }

    public final void a(java.lang.Object obj) {
        zm2.b bVar = (zm2.b) this.f455223b.a(obj);
        com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider = this.f455227f;
        if (bVar.f474168j) {
            finderLiveBeautySlider.A(-bVar.f474164f, -bVar.f474165g, -bVar.f474166h, -bVar.f474167i);
        } else {
            finderLiveBeautySlider.A(bVar.f474165g, bVar.f474164f, bVar.f474166h, bVar.f474167i);
        }
    }
}
