package cr2;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f221870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f221872f;

    public o(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        this.f221870d = layoutManager;
        this.f221871e = i17;
        this.f221872f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f221870d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f221872f));
        arrayList.add(java.lang.Integer.valueOf(this.f221871e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeFragmentViewCallback$loadCacheData$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeFragmentViewCallback$loadCacheData$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
