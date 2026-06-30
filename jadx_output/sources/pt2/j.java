package pt2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        super(0);
        this.f358250d = finderMixSearchFeedFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f358250d.getView();
        kotlin.jvm.internal.o.d(view);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i17 = com.tencent.mm.R.id.l9m;
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) x4.b.a(view, com.tencent.mm.R.id.l9m);
        if (coordinatorLayout != null) {
            i17 = com.tencent.mm.R.id.lqa;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(view, com.tencent.mm.R.id.lqa);
            if (recyclerView != null) {
                i17 = com.tencent.mm.R.id.m6e;
                com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(view, com.tencent.mm.R.id.m6e);
                if (finderRefreshLayout != null) {
                    return new vb2.r(frameLayout, frameLayout, coordinatorLayout, recyclerView, finderRefreshLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }
}
