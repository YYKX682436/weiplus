package qt2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.e f366545d;

    public a(qt2.e eVar) {
        this.f366545d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC$initContent$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.e eVar = this.f366545d;
        eVar.Z6();
        androidx.recyclerview.widget.RecyclerView recyclerView = eVar.f366590g;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int w17 = linearLayoutManager.w() + 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC$initContent$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
