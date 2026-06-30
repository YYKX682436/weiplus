package sx2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager f413529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f413530e;

    public e(com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager adStackLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f413529d = adStackLayoutManager;
        this.f413530e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager adStackLayoutManager = this.f413529d;
        adStackLayoutManager.getClass();
        if (i17 != 0) {
            if (i17 == 1) {
                adStackLayoutManager.f132650o = false;
                adStackLayoutManager.f132651p = true;
            }
        } else if (adStackLayoutManager.f132650o) {
            adStackLayoutManager.f132650o = false;
        } else {
            adStackLayoutManager.f132650o = true;
            com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager.m(adStackLayoutManager, this.f413530e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
