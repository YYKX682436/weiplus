package ym5;

/* loaded from: classes3.dex */
public final class p3 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f463460d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f463461e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f463462f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RecyclerHorizontalViewPager f463463g;

    public p3(com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager) {
        this.f463463g = recyclerHorizontalViewPager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f463463g;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerHorizontalViewPager.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerHorizontalViewPager.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
        androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
        android.view.View view = p07 != null ? p07.itemView : null;
        androidx.recyclerview.widget.k3 p08 = recyclerView.p0(y17);
        android.view.View view2 = p08 != null ? p08.itemView : null;
        android.graphics.Rect rect = this.f463461e;
        if (view != null) {
            view.getLocalVisibleRect(rect);
        }
        android.graphics.Rect rect2 = this.f463462f;
        if (view2 != null) {
            view2.getLocalVisibleRect(rect2);
        }
        if (rect.width() <= rect2.width()) {
            w17 = y17;
        }
        if (w17 != this.f463460d && w17 != -1) {
            recyclerHorizontalViewPager.post(new ym5.o3(recyclerHorizontalViewPager, w17));
            this.f463460d = w17;
        }
        yj0.a.h(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
