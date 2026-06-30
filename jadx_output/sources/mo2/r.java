package mo2;

/* loaded from: classes2.dex */
public final class r extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f330401d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f330402e;

    public r(android.graphics.drawable.Drawable divider, int[] padding, int i17) {
        kotlin.jvm.internal.o.g(divider, "divider");
        kotlin.jvm.internal.o.g(padding, "padding");
        this.f330401d = divider;
        this.f330402e = padding;
        divider.setBounds(0, 0, 0, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.v0(view) == 0) {
            return;
        }
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
        if (valueOf != null && valueOf.intValue() == -17) {
            return;
        }
        outRect.set(0, this.f330401d.getBounds().height(), 0, 0);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 1; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            androidx.recyclerview.widget.k3 w07 = parent.w0(childAt);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
            if (valueOf == null || valueOf.intValue() != -17) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                int[] iArr = this.f330402e;
                int i18 = left + iArr[0];
                int right = (childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) - iArr[2];
                int top = childAt.getTop();
                android.graphics.drawable.Drawable drawable = this.f330401d;
                drawable.setBounds(i18, (top - drawable.getBounds().height()) + iArr[1], right, childAt.getTop() - iArr[3]);
                drawable.draw(c17);
            }
        }
    }
}
