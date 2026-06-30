package in5;

/* loaded from: classes10.dex */
public final class b1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f293012d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f293013e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final int f293014f;

    /* renamed from: g, reason: collision with root package name */
    public int f293015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293016h;

    public b1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f293016h = wxRecyclerAdapter;
        this.f293014f = android.view.ViewConfiguration.get(wxRecyclerAdapter.b0().getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        recyclerView.post(new in5.a1(i17, this, recyclerView, this.f293016h));
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.d(layoutManager);
        if (!layoutManager.getF98486n()) {
            i17 = i18;
        }
        int i19 = this.f293015g + i17;
        this.f293015g = i19;
        if (java.lang.Math.abs(i19) > this.f293014f * 5) {
            onScrollStateChanged(recyclerView, 3);
            this.f293015g = 0;
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
