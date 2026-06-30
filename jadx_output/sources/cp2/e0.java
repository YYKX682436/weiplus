package cp2;

/* loaded from: classes2.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f220789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f220790f;

    public e0(cp2.v0 v0Var, int i17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f220788d = v0Var;
        this.f220789e = i17;
        this.f220790f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp2.q1 q1Var = (cp2.q1) this.f220788d.z();
        androidx.recyclerview.widget.f2 adapter = q1Var.o().getAdapter();
        cp2.z0 z0Var = adapter instanceof cp2.z0 ? (cp2.z0) adapter : null;
        int i17 = this.f220789e;
        if (z0Var != null) {
            z0Var.f220958e = i17;
        }
        androidx.recyclerview.widget.f2 adapter2 = q1Var.o().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f220790f.getLayoutManager();
        if (layoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
