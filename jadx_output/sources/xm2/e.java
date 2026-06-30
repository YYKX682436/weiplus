package xm2;

/* loaded from: classes14.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f455204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f455205e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f455206f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f455207g;

    public e(java.util.List flattenedItems, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler) {
        kotlin.jvm.internal.o.g(flattenedItems, "flattenedItems");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f455204d = flattenedItems;
        this.f455205e = obj;
        this.f455206f = adapter;
        this.f455207g = itemSelectionHandler;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f455204d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (this.f455204d.get(i17) != null) {
            xm2.d[] dVarArr = xm2.d.f455203d;
            return 0;
        }
        xm2.d[] dVarArr2 = xm2.d.f455203d;
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lo0.b bVar;
        xm2.h holder = (xm2.h) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f455204d.get(i17);
        if (obj == null) {
            return;
        }
        xm2.c cVar = holder instanceof xm2.c ? (xm2.c) holder : null;
        if (cVar == null) {
            return;
        }
        zm2.b bVar2 = (zm2.b) this.f455206f.a(obj);
        if (!kotlin.jvm.internal.o.b(cVar.f455202p, bVar2)) {
            zm2.b bVar3 = cVar.f455202p;
            if (bVar3 != null && (bVar = bVar3.f474161c) != null) {
                bVar.c(cVar);
            }
            cVar.f455202p = bVar2;
            if (!(bVar2 == null)) {
                int i18 = bVar2.f474160b;
                java.lang.Integer num = cVar.f455200n;
                if (num == null || num.intValue() != i18) {
                    cVar.f455200n = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = cVar.f455195f;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                zl2.r4 r4Var = zl2.r4.f473950a;
                int i19 = cVar.f455201o;
                android.graphics.Bitmap u27 = r4Var.u2(bVar2.f474163e, i19, i19);
                boolean z17 = u27 != null;
                android.widget.ImageView imageView = cVar.f455196g;
                if (z17) {
                    imageView.setImageBitmap(u27);
                } else {
                    imageView.setImageURI(null);
                }
                cVar.f455197h.setText(bVar2.f474159a);
                cVar.i(bVar2);
                lo0.b bVar4 = bVar2.f474161c;
                if (bVar4 != null && bVar4.b()) {
                    android.view.View view2 = cVar.f455199m;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar4.a(cVar);
                } else {
                    android.view.View view3 = cVar.f455199m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        cVar.j(kotlin.jvm.internal.o.b(obj, this.f455205e));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        xm2.d[] dVarArr = xm2.d.f455203d;
        if (i17 == 0) {
            android.content.Context context = parent.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return new xm2.c(context, this.f455207g);
        }
        if (i17 == 1) {
            android.content.Context context2 = parent.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            return new xm2.g(context2);
        }
        throw new java.lang.IllegalArgumentException("Unsupported view type " + i17 + '.');
    }
}
