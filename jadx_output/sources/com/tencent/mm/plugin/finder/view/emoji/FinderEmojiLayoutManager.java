package com.tencent.mm.plugin.finder.view.emoji;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderEmojiLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    public final android.graphics.Rect D;

    public FinderEmojiLayoutManager(android.content.Context context, int i17) {
        super(context, i17);
        this.D = new android.graphics.Rect();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return false;
    }

    public final void e0() {
        android.graphics.Rect rect = this.D;
        if (rect.isEmpty()) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                float f17 = 1.0f;
                if (getItemViewType(childAt) != 1) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setEnabled(true);
                } else {
                    getDecoratedBoundsWithMargins(childAt, rect2);
                    int decoratedRight = getDecoratedRight(childAt);
                    int decoratedBottom = getDecoratedBottom(childAt);
                    if (decoratedRight > rect.left && decoratedBottom > rect.top) {
                        f17 = 1.0f - ((decoratedBottom - rect.top) / ((decoratedBottom - getDecoratedTop(childAt)) * 0.4f));
                    }
                    float f18 = f17;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(f18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setEnabled(((double) f18) > 0.7d);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutChildren(z2Var, h3Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, z2Var, h3Var);
        e0();
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i17, z2Var, h3Var);
        e0();
        return scrollVerticallyBy;
    }
}
