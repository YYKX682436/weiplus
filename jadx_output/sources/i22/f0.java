package i22;

/* loaded from: classes15.dex */
public final class f0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.g0 f287960d;

    public f0(i22.g0 g0Var) {
        this.f287960d = g0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        i22.g0 g0Var = this.f287960d;
        g0Var.f287973n = i17;
        if (i17 == 0 && g0Var.f287977r) {
            g0Var.f287977r = false;
            if (g0Var.f287976q != null) {
                g0Var.x(recyclerView.getLayoutManager());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i18 != 0) {
            i22.g0 g0Var = this.f287960d;
            java.lang.String str = g0Var.f287968f;
            g0Var.f287977r = true;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) && (lVar = g0Var.f287971i) != null) {
                lVar.invoke(java.lang.Boolean.valueOf(((androidx.recyclerview.widget.GridLayoutManager) layoutManager).w() == 0));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
