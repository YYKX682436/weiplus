package xx0;

/* loaded from: classes5.dex */
public final class a0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457852d;

    public a0(xx0.d0 d0Var) {
        this.f457852d = d0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        e06.k kVar = new e06.k(w17, ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y());
        if (!kotlin.jvm.internal.o.b(kVar, this.f457852d.f457883n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", "onScrolled tab: " + this.f457852d.f457877e.f440039a + ", currentVisibleTemplatePositionRange: " + kVar);
        }
        if (this.f457852d.f457884o) {
            if (kotlin.jvm.internal.o.b(this.f457852d.f457883n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE))) {
                int i19 = kVar.f246210e;
                if (w17 <= i19) {
                    while (true) {
                        this.f457852d.f457881i.B(w17);
                        if (w17 == i19) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
            } else {
                java.util.Iterator it = kz5.n0.G0(kVar, this.f457852d.f457883n).iterator();
                while (it.hasNext()) {
                    this.f457852d.f457881i.B(((java.lang.Number) it.next()).intValue());
                }
                java.util.Iterator it6 = kz5.n0.G0(this.f457852d.f457883n, kVar).iterator();
                while (it6.hasNext()) {
                    this.f457852d.f457881i.z(((java.lang.Number) it6.next()).intValue());
                }
            }
        }
        this.f457852d.f457883n = kVar;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
