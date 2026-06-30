package mx0;

/* loaded from: classes10.dex */
public final class aa extends androidx.recyclerview.widget.p1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f331839f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f331840g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f331841h;

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f331839f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f331839f;
        return new mx0.z9(this, recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var;
        android.view.View view;
        int top;
        int measuredHeight;
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.getF98486n()) {
            w1Var = this.f331841h;
            if (w1Var == null || w1Var.f12259a != layoutManager) {
                w1Var = new androidx.recyclerview.widget.u1(layoutManager);
                this.f331841h = w1Var;
            }
        } else {
            w1Var = this.f331840g;
            if (w1Var == null || w1Var.f12259a != layoutManager) {
                w1Var = new androidx.recyclerview.widget.v1(layoutManager);
                this.f331840g = w1Var;
            }
        }
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            view = null;
        } else {
            int k17 = layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
            int i17 = Integer.MAX_VALUE;
            view = null;
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = layoutManager.getChildAt(i18);
                if (childAt != null) {
                    if (layoutManager.getF98486n()) {
                        top = childAt.getLeft();
                        measuredHeight = childAt.getMeasuredWidth() / 2;
                    } else {
                        top = childAt.getTop();
                        measuredHeight = childAt.getMeasuredHeight() / 2;
                    }
                    int abs = java.lang.Math.abs((top + measuredHeight) - k17);
                    if (abs < i17) {
                        view = childAt;
                        i17 = abs;
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.a();
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        return super.g(layoutManager, i17, i18);
    }
}
