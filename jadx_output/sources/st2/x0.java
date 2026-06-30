package st2;

/* loaded from: classes3.dex */
public final class x0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412495e;

    public x0(st2.h1 h1Var, int i17) {
        this.f412494d = h1Var;
        this.f412495e = i17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        st2.h1 h1Var = this.f412494d;
        h1Var.q().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h1Var.q().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(this.f412495e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
