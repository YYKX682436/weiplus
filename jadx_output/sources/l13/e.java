package l13;

/* loaded from: classes15.dex */
public final class e extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager f314992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f314993e;

    public e(com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f314992d = stackLayoutManager;
        this.f314993e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager = this.f314992d;
        if (i17 != 0) {
            if (i17 == 1) {
                stackLayoutManager.f137361n = false;
            }
        } else if (stackLayoutManager.f137361n) {
            stackLayoutManager.f137361n = false;
        } else {
            stackLayoutManager.f137361n = true;
            com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager.m(stackLayoutManager, this.f314993e, l13.b.f314988f);
        }
        if (i17 != 1) {
            stackLayoutManager.f137362o = false;
        } else if (!stackLayoutManager.f137362o) {
            stackLayoutManager.f137362o = true;
            stackLayoutManager.f137364q = (stackLayoutManager.f137360m / stackLayoutManager.getHeight()) * stackLayoutManager.getHeight();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
