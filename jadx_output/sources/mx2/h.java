package mx2;

/* loaded from: classes2.dex */
public final class h extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332488d;

    public h(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        this.f332488d = finderImageBanner;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView rv6, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332488d;
        if (!finderImageBanner.f132324v) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (finderImageBanner.i()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        ym5.o1 indicator = finderImageBanner.getIndicator();
        com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView = indicator instanceof com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView ? (com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView) indicator : null;
        if (finderPageIndicatorView != null) {
            android.animation.ValueAnimator valueAnimator = finderPageIndicatorView.f132367n;
            if (valueAnimator != null && valueAnimator.isPaused()) {
                long remainingDurationMs = finderPageIndicatorView.getRemainingDurationMs();
                android.animation.ValueAnimator valueAnimator2 = finderPageIndicatorView.f132367n;
                if (valueAnimator2 != null) {
                    valueAnimator2.resume();
                }
                finderImageBanner.f();
                finderImageBanner.l(remainingDurationMs);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            }
        }
        kotlinx.coroutines.r2 r2Var = finderImageBanner.f132326x;
        if (!(r2Var != null && ((kotlinx.coroutines.a) r2Var).a())) {
            finderImageBanner.l(finderImageBanner.f132316n);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
