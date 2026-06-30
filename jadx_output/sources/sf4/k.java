package sf4;

/* loaded from: classes4.dex */
public final class k extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f407513e;

    /* renamed from: g, reason: collision with root package name */
    public int f407515g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f407516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView f407517i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f407512d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f407514f = -1;

    public k(com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView galleryRecyclerView) {
        this.f407517i = galleryRecyclerView;
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        this.f407516h = y2Var;
        y2Var.e(0, 2);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f407512d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        sf4.k2 holder = (sf4.k2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f407512d;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        pf4.x xVar = holder.f407522e;
        xVar.getClass();
        java.util.ArrayList arrayList2 = xVar.f353908f;
        arrayList2.clear();
        arrayList2.addAll((java.util.List) obj);
        xVar.f353909g = this.f407517i.isActive;
        xVar.notifyDataSetChanged();
        java.lang.Object obj2 = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView galleryHorizontalControlView = holder.f407523f;
        galleryHorizontalControlView.a((java.util.List) obj2);
        yz5.l lVar = this.f407513e;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        int i18 = i17 == this.f407514f ? this.f407515g : 0;
        androidx.recyclerview.widget.RecyclerView recyclerView = holder.f407521d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
        galleryHorizontalControlView.setSelection(i18);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cwn, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = parent.getWidth();
        layoutParams.height = parent.getHeight();
        inflate.setLayoutParams(layoutParams);
        sf4.k2 k2Var = new sf4.k2(inflate, parent.getWidth(), parent.getHeight());
        k2Var.f407521d.setRecycledViewPool(this.f407516h);
        return k2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        sf4.k2 holder = (sf4.k2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        androidx.recyclerview.widget.RecyclerView recyclerView = holder.f407521d;
        if (recyclerView.getChildCount() > 0) {
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(recyclerView.getChildAt(0));
            if (w07 instanceof pf4.y) {
                ((pf4.y) w07).i();
            }
        }
    }
}
