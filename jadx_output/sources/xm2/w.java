package xm2;

/* loaded from: classes14.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f455272d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f455273e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f455274f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f455275g;

    public w(java.util.List items, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f455272d = items;
        this.f455273e = obj;
        this.f455274f = adapter;
        this.f455275g = itemSelectionHandler;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f455272d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lo0.b bVar;
        xm2.v holder = (xm2.v) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f455272d.get(i17);
        zm2.d dVar = (zm2.d) this.f455274f.a(obj);
        if (!kotlin.jvm.internal.o.b(holder.f455271m, dVar)) {
            zm2.d dVar2 = holder.f455271m;
            if (dVar2 != null && (bVar = dVar2.f474161c) != null) {
                bVar.c(holder);
            }
            holder.f455271m = dVar;
            if (!(dVar == null)) {
                int i18 = dVar.f474160b;
                java.lang.Integer num = holder.f455270i;
                if (num == null || num.intValue() != i18) {
                    holder.f455270i = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = holder.f455267f;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                holder.f455268g.setText(dVar.f474159a);
                lo0.b bVar2 = dVar.f474161c;
                if (bVar2 != null && bVar2.b()) {
                    android.view.View view2 = holder.f455269h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar2.a(holder);
                } else {
                    android.view.View view3 = holder.f455269h;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        holder.i(kotlin.jvm.internal.o.b(obj, this.f455273e));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new xm2.v(context, this.f455275g);
    }
}
