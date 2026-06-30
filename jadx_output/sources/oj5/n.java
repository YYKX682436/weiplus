package oj5;

/* loaded from: classes14.dex */
public final class n extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f345859d;

    /* renamed from: e, reason: collision with root package name */
    public int f345860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345861f;

    public n(oj5.o oVar) {
        this.f345861f = oVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f345859d += i18;
        if (this.f345860e == 0) {
            android.view.View view = (android.view.View) q26.h0.l(q26.h0.v(new n3.r1(recyclerView), new oj5.m()));
            int height = view != null ? view.getHeight() : 0;
            if (20 >= height) {
                height = 20;
            }
            this.f345860e = height;
        }
        if (java.lang.Math.abs(this.f345859d) >= this.f345860e) {
            oj5.o.b(this.f345861f, i18 > 0, "onScrolled", 0L, 4, null);
            this.f345859d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
