package xm2;

/* loaded from: classes14.dex */
public final class p extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f455244d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f455245e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f455246f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f455247g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f455248h;

    public p(java.util.List items, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler, yz5.l itemFineTuningHandler) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        kotlin.jvm.internal.o.g(itemFineTuningHandler, "itemFineTuningHandler");
        this.f455244d = items;
        this.f455245e = obj;
        this.f455246f = adapter;
        this.f455247g = itemSelectionHandler;
        this.f455248h = itemFineTuningHandler;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f455244d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lo0.f fVar;
        lo0.b bVar;
        xm2.o holder = (xm2.o) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f455244d.get(i17);
        zm2.c cVar = (zm2.c) this.f455246f.a(obj);
        if (!kotlin.jvm.internal.o.b(holder.f455243q, cVar)) {
            zm2.c cVar2 = holder.f455243q;
            if (cVar2 != null && (bVar = cVar2.f474161c) != null) {
                bVar.c(holder);
            }
            zm2.c cVar3 = holder.f455243q;
            if (cVar3 != null && (fVar = cVar3.f474170f) != null) {
                kz5.h0.B(fVar.f319989e, new lo0.e(holder));
            }
            holder.f455243q = cVar;
            if (!(cVar == null)) {
                int i18 = cVar.f474160b;
                java.lang.Integer num = holder.f455242p;
                if (num == null || num.intValue() != i18) {
                    holder.f455242p = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = holder.f455236g;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                holder.f455237h.setText(cVar.f474159a);
                lo0.b bVar2 = cVar.f474161c;
                if (bVar2 != null && bVar2.b()) {
                    android.view.View view2 = holder.f455240n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar2.a(holder);
                } else {
                    android.view.View view3 = holder.f455240n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                lo0.f fVar2 = cVar.f474170f;
                if (fVar2.a()) {
                    android.view.View view4 = holder.f455241o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((java.util.ArrayList) fVar2.f319989e).add(new java.lang.ref.WeakReference(holder));
                } else {
                    android.view.View view5 = holder.f455241o;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        holder.i(kotlin.jvm.internal.o.b(obj, this.f455245e));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new xm2.o(context, this.f455247g, this.f455248h);
    }
}
