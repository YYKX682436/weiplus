package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class uy extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f136187f;

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        if (this.f136187f == null) {
            this.f136187f = new androidx.recyclerview.widget.u1(layoutManager);
        }
        androidx.recyclerview.widget.w1 w1Var = this.f136187f;
        kotlin.jvm.internal.o.d(w1Var);
        return new int[]{w1Var.e(targetView) - targetView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn), 0};
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        if (this.f136187f == null) {
            this.f136187f = new androidx.recyclerview.widget.u1(layoutManager);
        }
        androidx.recyclerview.widget.w1 w1Var = this.f136187f;
        kotlin.jvm.internal.o.d(w1Var);
        int w17 = linearLayoutManager.w();
        int x17 = linearLayoutManager.x();
        int itemCount = linearLayoutManager.getItemCount() - 1;
        if (w17 == -1) {
            return null;
        }
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
        return w1Var.b(findViewByPosition) < w1Var.c(findViewByPosition) / 2 ? linearLayoutManager.findViewByPosition(w17 + 1) : x17 == itemCount ? linearLayoutManager.findViewByPosition(itemCount) : findViewByPosition;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        android.view.View f17 = f(layoutManager);
        if (f17 == null) {
            return -1;
        }
        int position = layoutManager.getPosition(f17);
        if (i17 >= 0) {
            int i19 = position + 1;
            int itemCount = layoutManager.getItemCount() - 1;
            return i19 > itemCount ? itemCount : i19;
        }
        int i27 = position - 1;
        if (i27 < 0) {
            return 0;
        }
        return i27;
    }
}
