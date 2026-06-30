package qt2;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public float f366570d = 100.0f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt2.j f366571e;

    public f(qt2.j jVar) {
        this.f366571e = jVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            qt2.j jVar = this.f366571e;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = jVar.f366590g;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
            if (jVar.f366589f && jVar.f366596p > 0 && y17 == 0 && (finderVideoLayout = jVar.f366591h) != null && !finderVideoLayout.J()) {
                finderVideoLayout.M();
            }
            jVar.f366596p = y17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        float f17 = this.f366570d - (i18 / 5.0f);
        this.f366570d = f17;
        float a17 = h3.a.a(f17, 0.0f, 100.0f);
        this.f366570d = a17;
        if (a17 <= 0.0f) {
            this.f366571e.V6(a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
