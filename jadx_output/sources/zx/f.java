package zx;

/* loaded from: classes14.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView f476949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.t f476950e;

    public f(com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView, zx.t tVar) {
        this.f476949d = cBTBrandLiveQueryListView;
        this.f476950e = tVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView = this.f476949d;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = cBTBrandLiveQueryListView.f65290h;
        if (linearLayoutManager != null) {
            cBTBrandLiveQueryListView.a(recyclerView, this.f476950e, false);
            int w17 = linearLayoutManager.w();
            if (w17 == 0 || w17 == -1) {
                cBTBrandLiveQueryListView.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
