package cp2;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f220782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f220783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f220784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220785g;

    public d0(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18, cp2.v0 v0Var) {
        this.f220782d = layoutManager;
        this.f220783e = i17;
        this.f220784f = i18;
        this.f220785g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f220782d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f220784f));
        arrayList.add(java.lang.Integer.valueOf(this.f220783e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        this.f220785g.f(false, "IInitDone");
    }
}
