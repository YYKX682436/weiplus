package te2;

/* loaded from: classes8.dex */
public final class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f418040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f418042f;

    public g9(bm2.p8 p8Var, int i17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f418040d = p8Var;
        this.f418041e = i17;
        this.f418042f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.p8 p8Var = this.f418040d;
        if (p8Var.getItemCount() != 0) {
            int itemCount = p8Var.getItemCount();
            int i17 = this.f418041e;
            if (i17 >= itemCount) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f418042f;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            if (linearLayoutManager.w() <= i17 && i17 <= linearLayoutManager.y()) {
                p8Var.x(i17);
                return;
            }
            recyclerView.i(new te2.f9(p8Var, i17));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f418042f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelPresenter$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelPresenter$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
