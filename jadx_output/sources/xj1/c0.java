package xj1;

/* loaded from: classes2.dex */
public final class c0 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        if (w07 == null || !(w07 instanceof xj1.h0)) {
            return;
        }
        xj1.h0 h0Var = (xj1.h0) w07;
        android.view.View view2 = h0Var.f454797g;
        int adapterPosition = h0Var.getAdapterPosition();
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int i17 = adapterPosition == (adapter != null ? adapter.getItemCount() : -1) + (-1) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
