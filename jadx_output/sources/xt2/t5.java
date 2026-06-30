package xt2;

/* loaded from: classes3.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f457032d;

    public t5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        this.f457032d = finderLiveShoppingSkuList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$attachLoadMoreItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f457032d;
        yz5.a onLoadMoreCallback = finderLiveShoppingSkuList.getOnLoadMoreCallback();
        if (onLoadMoreCallback != null) {
            onLoadMoreCallback.invoke();
        }
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList.a(finderLiveShoppingSkuList);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$attachLoadMoreItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
