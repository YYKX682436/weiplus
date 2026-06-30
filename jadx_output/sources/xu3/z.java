package xu3;

/* loaded from: classes5.dex */
public final class z extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f457276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457277e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f457278f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f457279g;

    public z(int i17, int i18, int i19, boolean z17, kotlin.jvm.internal.i iVar) {
        this.f457276d = i17;
        this.f457277e = i18;
        this.f457278f = z17;
        this.f457279g = new android.graphics.drawable.ColorDrawable(i19);
    }

    public final int d(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            return ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).f11861w;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            return ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).f11920d;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int d17 = d(parent);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        kotlin.jvm.internal.o.d(adapter);
        int itemCount = adapter.getItemCount();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        if (b17 < 0) {
            return;
        }
        int i19 = b17 % d17;
        int i27 = this.f457277e;
        int i28 = (i19 * i27) / d17;
        boolean z17 = true;
        int i29 = i27 - (((i19 + 1) * i27) / d17);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) ? !(layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) || (((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).f11924h != 1 ? (b17 + 1) % d17 != 0 : (i17 = itemCount % d17) != 0 ? b17 < itemCount - i17 : b17 < itemCount - d17) : (i18 = itemCount % d17) != 0 ? b17 < itemCount - i18 : b17 < itemCount - d17) {
            z17 = false;
        }
        outRect.set(i28, 0, i29, (!z17 || this.f457278f) ? this.f457276d : 0);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        boolean z17;
        android.graphics.drawable.Drawable drawable;
        int i17;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int childCount = parent.getChildCount();
        int i18 = 0;
        while (true) {
            z17 = this.f457278f;
            drawable = this.f457279g;
            i17 = this.f457276d;
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = parent.getChildAt(i18);
            if (i18 != childCount - 1 || z17) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                int right = childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                drawable.setBounds(left, bottom, right, i17 + bottom);
                drawable.draw(c17);
            }
            i18++;
        }
        int childCount2 = parent.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            if (i19 != childCount2 - 1 || z17) {
                android.view.View childAt2 = parent.getChildAt(i19);
                int d17 = d(parent);
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) parent.getLayoutManager();
                androidx.recyclerview.widget.t0 t0Var = gridLayoutManager != null ? gridLayoutManager.B : null;
                if (((t0Var != null ? t0Var.b(parent.w0(childAt2).getAdapterPosition(), d(parent)) : 0) + (t0Var != null ? t0Var.c(parent.w0(childAt2).getAdapterPosition()) : 0)) % d17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams3;
                    int top = childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                    int bottom2 = childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i17;
                    int right2 = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                    drawable.setBounds(right2 - this.f457277e, top, right2, bottom2);
                    drawable.draw(c17);
                }
            }
        }
    }
}
