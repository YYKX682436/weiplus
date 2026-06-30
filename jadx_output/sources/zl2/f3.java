package zl2;

/* loaded from: classes.dex */
public final class f3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f473764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473766f;

    public f3(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.f473764d = recyclerView;
        this.f473765e = i17;
        this.f473766f = i18;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f473764d;
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(this.f473766f));
            arrayList.add(java.lang.Integer.valueOf(this.f473765e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$rvScrollToPos$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$rvScrollToPos$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
