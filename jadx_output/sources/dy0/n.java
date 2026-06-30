package dy0;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f244559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dy0.m f244560e;

    public n(androidx.recyclerview.widget.RecyclerView recyclerView, dy0.m mVar) {
        this.f244559d = recyclerView;
        this.f244560e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f244559d.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).startSmoothScroll(this.f244560e);
    }
}
