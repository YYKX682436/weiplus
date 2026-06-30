package qs1;

/* loaded from: classes8.dex */
public final class a extends androidx.recyclerview.widget.w2 {
    public a(qs1.m mVar) {
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        b(recyclerView);
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        db5.g4 g4Var;
        int childCount;
        int u07;
        boolean z17;
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        qs1.c cVar = adapter instanceof qs1.c ? (qs1.c) adapter : null;
        if (cVar == null || (g4Var = cVar.f366212d) == null || (childCount = recyclerView.getChildCount()) <= 0) {
            return;
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            if (childAt != null && (u07 = recyclerView.u0(childAt)) != -1) {
                android.view.MenuItem item = g4Var.getItem(u07);
                db5.h4 h4Var = item instanceof db5.h4 ? (db5.h4) item : null;
                if (h4Var != null) {
                    db5.v4 v4Var = h4Var.f228362J;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    boolean globalVisibleRect2 = recyclerView.getGlobalVisibleRect(rect2);
                    if (globalVisibleRect && globalVisibleRect2) {
                        android.graphics.Rect rect3 = new android.graphics.Rect();
                        if (rect3.setIntersect(rect, rect2) && rect3.height() >= childAt.getHeight() / 2) {
                            z17 = true;
                            if (z17 && v4Var != null) {
                                v4Var.a(h4Var, childAt);
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        v4Var.a(h4Var, childAt);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        b(recyclerView);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        b(recyclerView);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
