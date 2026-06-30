package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes10.dex */
public class b extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f145750f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f145751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f145752h = false;

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return this.f145752h ? e(layoutManager) : new com.tencent.mm.plugin.luckymoney.scaledLayout.a(this, this.f145751g, layoutManager);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        android.view.View f17 = super.f(layoutManager);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < layoutManager.getChildCount(); i19++) {
            android.view.View childAt = layoutManager.getChildAt(i19);
            if (childAt == f17) {
                i17 = i19;
            }
            if (childAt == this.f145750f) {
                i18 = i19;
            }
        }
        int i27 = i17 - i18;
        return i27 > 1 ? layoutManager.findViewByPosition(i18 + 1) : i27 < -1 ? layoutManager.findViewByPosition(i18 - 1) : f17;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        android.view.View n17;
        int i19;
        int i27;
        if (layoutManager.getItemCount() == 0 || (n17 = n(layoutManager)) == null) {
            return -1;
        }
        android.view.View view = this.f145750f;
        if (view != null && view != n17) {
            n17 = view;
        }
        int position = layoutManager.getPosition(n17);
        return (i17 < 100 || (i27 = position + 1) >= layoutManager.getItemCount()) ? (i17 > -100 || (i19 = position + (-1)) < 0) ? position : i19 : i27;
    }

    public android.view.View n(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        new android.graphics.Rect();
        int paddingLeft = layoutManager.getClipToPadding() ? layoutManager.getPaddingLeft() + (((layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight()) / 2) : layoutManager.getWidth() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int decoratedLeft = layoutManager.getDecoratedLeft(childAt) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams();
            int abs = java.lang.Math.abs((decoratedLeft + (((layoutManager.getDecoratedMeasuredWidth(childAt) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) / 2)) - paddingLeft);
            if (abs < i17) {
                view = childAt;
                i17 = abs;
            }
        }
        return view;
    }
}
