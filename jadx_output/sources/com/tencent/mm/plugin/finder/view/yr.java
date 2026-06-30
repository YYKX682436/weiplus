package com.tencent.mm.plugin.finder.view;

/* loaded from: classes13.dex */
public final class yr extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.PageIndicatorView f133416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.y1 f133417e;

    public yr(com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView, androidx.recyclerview.widget.y1 y1Var) {
        this.f133416d = pageIndicatorView;
        this.f133417e = y1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView rv6, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = this.f133416d;
        if (i17 == 0) {
            pageIndicatorView.f131562s = false;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = rv6.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            android.view.View f17 = this.f133417e.f(linearLayoutManager);
            int position = f17 != null ? linearLayoutManager.getPosition(f17) : -1;
            if (position != -1 && (i18 = pageIndicatorView.f131555i) > 0) {
                int f18 = e06.p.f(position, 0, i18 - 1);
                pageIndicatorView.f131556m = f18;
                int d17 = pageIndicatorView.d(f18);
                boolean z17 = !(((float) d17) == pageIndicatorView.f131558o);
                float f19 = f18;
                boolean z18 = !(pageIndicatorView.f131557n == f19);
                if (z17 || z18) {
                    if (z17) {
                        pageIndicatorView.b(d17, new com.tencent.mm.plugin.finder.view.as(pageIndicatorView, f18));
                    } else {
                        pageIndicatorView.a(f19);
                    }
                }
            }
        } else if (i17 == 1) {
            pageIndicatorView.f131562s = true;
            android.animation.ValueAnimator valueAnimator = pageIndicatorView.f131560q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            pageIndicatorView.f131560q = null;
            android.animation.ValueAnimator valueAnimator2 = pageIndicatorView.f131561r;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            pageIndicatorView.f131561r = null;
        } else if (i17 == 2) {
            pageIndicatorView.f131562s = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView rv6, int i17, int i18) {
        float f17;
        int height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = this.f133416d;
        if (!pageIndicatorView.f131562s) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = rv6.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int w17 = linearLayoutManager.w();
        if (w17 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
        if (findViewByPosition == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        if (linearLayoutManager.H() == 0) {
            f17 = -findViewByPosition.getLeft();
            height = findViewByPosition.getWidth();
        } else {
            f17 = -findViewByPosition.getTop();
            height = findViewByPosition.getHeight();
        }
        float f18 = height;
        float e17 = f18 > 0.0f ? w17 + e06.p.e(f17 / f18, 0.0f, 1.0f) : w17;
        if (pageIndicatorView.f131555i > 0) {
            float e18 = e06.p.e(e17, 0.0f, r11 - 1);
            pageIndicatorView.f131557n = e18;
            int f19 = e06.p.f((int) (e18 + 0.5f), 0, pageIndicatorView.f131555i - 1);
            pageIndicatorView.f131556m = f19;
            int d17 = pageIndicatorView.d(f19);
            if (d17 != pageIndicatorView.f131559p) {
                pageIndicatorView.b(d17, null);
            } else {
                pageIndicatorView.invalidate();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
