package x92;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC f452718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC finderBaseContentUIC) {
        super(0);
        this.f452718d = finderBaseContentUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f452718d.findViewById(com.tencent.mm.R.id.oh9);
        int i17 = com.tencent.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.dft);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.f484229dg3;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f484229dg3);
            if (frameLayout != null) {
                i17 = com.tencent.mm.R.id.l9m;
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l9m);
                if (coordinatorLayout != null) {
                    i17 = com.tencent.mm.R.id.lbi;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.lbi);
                    if (progressBar != null) {
                        i17 = com.tencent.mm.R.id.m2g;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.m2g);
                        if (textView2 != null) {
                            i17 = com.tencent.mm.R.id.m6e;
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                            if (refreshLoadMoreLayout != null) {
                                i17 = com.tencent.mm.R.id.oah;
                                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.oah);
                                if (frameLayout2 != null) {
                                    i17 = com.tencent.mm.R.id.oh8;
                                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.oh8);
                                    if (recyclerView != null) {
                                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) findViewById;
                                        return new vb2.c(frameLayout3, textView, frameLayout, coordinatorLayout, progressBar, textView2, refreshLoadMoreLayout, frameLayout2, recyclerView, frameLayout3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
