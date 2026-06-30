package xm2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455258a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f455259b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f455260c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455261d;

    /* renamed from: e, reason: collision with root package name */
    public final xm2.p f455262e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f455263f;

    public t(android.view.ViewGroup controlPanelLayout, java.util.List items, java.lang.Object obj, ym2.c itemsAdapter, yz5.l itemSelectionHandler, yz5.l itemFineTuningHandler) {
        kotlin.jvm.internal.o.g(controlPanelLayout, "controlPanelLayout");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(itemsAdapter, "itemsAdapter");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        kotlin.jvm.internal.o.g(itemFineTuningHandler, "itemFineTuningHandler");
        this.f455258a = items;
        this.f455259b = itemSelectionHandler;
        this.f455260c = itemFineTuningHandler;
        this.f455261d = obj;
        xm2.p pVar = new xm2.p(items, obj, itemsAdapter, new xm2.s(this), new xm2.r(this));
        this.f455262e = pVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) controlPanelLayout.findViewById(com.tencent.mm.R.id.usx);
        android.content.Context context = controlPanelLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(new xm2.q(context));
        recyclerView.setAdapter(pVar);
        this.f455263f = recyclerView;
    }

    public final void a() {
        int indexOf = this.f455258a.indexOf(this.f455261d);
        if (indexOf == -1) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f455263f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
