package dx2;

/* loaded from: classes2.dex */
public final class b extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f244496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f244497e;

    public b(android.graphics.drawable.Drawable divider, int i17) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f244496d = divider;
        this.f244497e = 1;
        divider.setBounds(0, 0, 0, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
        if (valueOf != null && valueOf.intValue() == -2) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -3) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -5) {
            return;
        }
        int i17 = this.f244497e;
        android.graphics.drawable.Drawable drawable = this.f244496d;
        if (i17 == 0) {
            outRect.set(0, 0, drawable.getBounds().width(), 0);
        } else {
            outRect.set(0, 0, 0, drawable.getBounds().height());
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int i17 = this.f244497e;
        android.graphics.drawable.Drawable drawable = this.f244496d;
        if (i17 != 0) {
            int childCount = parent.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = parent.getChildAt(i18);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                int left = (childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + 0;
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + 0;
                drawable.setBounds(left, bottom, (childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) - 0, (drawable.getBounds().height() + bottom) - 0);
                drawable.draw(c17);
            }
            return;
        }
        int childCount2 = parent.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            android.view.View childAt2 = parent.getChildAt(i19);
            androidx.recyclerview.widget.k3 w07 = parent.w0(childAt2);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
            if ((valueOf == null || valueOf.intValue() != -2) && ((valueOf == null || valueOf.intValue() != -3) && ((valueOf == null || valueOf.intValue() != -4) && (valueOf == null || valueOf.intValue() != -5)))) {
                android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams3;
                int right = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                drawable.setBounds(right, childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin, drawable.getBounds().width() + right, childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
                drawable.draw(c17);
            }
        }
    }
}
