package in4;

/* loaded from: classes10.dex */
public abstract class e0 extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f292961a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f292962b = new in4.d0(this);

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        androidx.recyclerview.widget.o1 d17;
        int f17;
        boolean z17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f292961a.getLayoutManager();
        if (layoutManager == null || this.f292961a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f292961a.getMinFlingVelocity();
        if (java.lang.Math.abs(i18) <= minFlingVelocity && java.lang.Math.abs(i17) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3) || (d17 = d(layoutManager)) == null || (f17 = f(layoutManager, i17, i18)) == -1) {
            z17 = false;
        } else {
            d17.f12049a = f17;
            layoutManager.startSmoothScroll(d17);
            z17 = true;
        }
        return z17;
    }

    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f292961a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        androidx.recyclerview.widget.w2 w2Var = this.f292962b;
        if (recyclerView2 != null) {
            recyclerView2.V0(w2Var);
            this.f292961a.setOnFlingListener(null);
        }
        this.f292961a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f292961a.i(w2Var);
            this.f292961a.setOnFlingListener(this);
            new android.widget.Scroller(this.f292961a.getContext(), new android.view.animation.DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view);

    public abstract androidx.recyclerview.widget.o1 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager);

    public abstract android.view.View e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager);

    public abstract int f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18);

    public void g() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View e17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f292961a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e17 = e(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, e17);
        int i17 = c17[0];
        if (i17 == 0 && c17[1] == 0) {
            return;
        }
        this.f292961a.smoothScrollBy(i17, c17[1]);
    }
}
