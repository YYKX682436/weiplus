package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes15.dex */
public class o2 extends androidx.recyclerview.widget.RecyclerView.LayoutManager {
    public o2(com.tencent.mm.ui.widget.dialog.l2 l2Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (getItemCount() == 0) {
            return;
        }
        detachAndScrapAttachedViews(z2Var);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        java.util.ArrayList arrayList = new java.util.ArrayList(getItemCount());
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        for (int i18 = 0; i18 < getItemCount(); i18++) {
            android.view.View f17 = z2Var.f(i18);
            calculateItemDecorationsForChild(f17, rect);
            i17 += rect.left + rect.right;
            arrayList.add(new android.util.Pair(f17, java.lang.Integer.valueOf(rect.left + rect.right)));
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int max = java.lang.Math.max(0, width - i17) / arrayList.size();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            measureChildWithMargins((android.view.View) pair.first, (width - max) - ((java.lang.Integer) pair.second).intValue(), 0);
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) ((android.view.View) pair.first).getLayoutParams();
            addView((android.view.View) pair.first);
            int intValue = paddingLeft + ((java.lang.Integer) pair.second).intValue() + max;
            layoutDecorated((android.view.View) pair.first, paddingLeft + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, paddingTop + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, intValue - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (((getHeight() - getPaddingTop()) - getPaddingBottom()) + paddingTop) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            paddingLeft = intValue;
        }
    }
}
