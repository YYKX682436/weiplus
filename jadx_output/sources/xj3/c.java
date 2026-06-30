package xj3;

/* loaded from: classes14.dex */
public abstract class c extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f454871d;

    public c(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f454871d = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f454871d;
        kotlin.jvm.internal.o.d(linearLayoutManager);
        int childCount = linearLayoutManager.getChildCount();
        kotlin.jvm.internal.o.d(linearLayoutManager);
        int itemCount = linearLayoutManager.getItemCount();
        kotlin.jvm.internal.o.d(linearLayoutManager);
        int w17 = linearLayoutManager.w();
        uj3.b1 b1Var = ((uj3.z0) this).f428408e;
        if (!b1Var.f428238p && !b1Var.f428239q && childCount + w17 >= itemCount && w17 >= 0) {
            b1Var.f428238p = true;
            b1Var.f428240r++;
            b1Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
