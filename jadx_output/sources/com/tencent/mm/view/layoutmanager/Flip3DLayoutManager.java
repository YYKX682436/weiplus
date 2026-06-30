package com.tencent.mm.view.layoutmanager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/view/layoutmanager/Flip3DLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Flip3DLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f213604v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f213605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Flip3DLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213604v = true;
        this.f213605w = true;
    }

    public final void W() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                float width = getWidth() / 2.0f;
                float left = ((((childAt.getLeft() + childAt.getRight()) / 2) - width) / getWidth()) * 45.0f;
                childAt.setPivotX(width);
                childAt.setPivotY(getHeight() / 2.0f);
                if (left < 0.0f) {
                    childAt.setPivotX(getWidth());
                } else {
                    childAt.setPivotX(0.0f);
                }
                childAt.setRotationY(left);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        return super.getF98486n() && this.f213605w;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return super.getF123307r() && this.f213604v;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        W();
        com.tencent.mars.xlog.Log.i("MicroMsg.Flip3DLayoutManager", "onLayoutCompleted childCount:" + getChildCount());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, recycler, state);
        W();
        com.tencent.mars.xlog.Log.i("MicroMsg.Flip3DLayoutManager", "scrollHorizontallyBy childCount:" + getChildCount() + ", dx:" + i17);
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        super.scrollToPosition(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Flip3DLayoutManager", "scrollToPosition childCount:" + getChildCount() + ", position:" + i17);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        super.smoothScrollToPosition(recyclerView, h3Var, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Flip3DLayoutManager", "smoothScrollToPosition childCount:" + getChildCount() + ", position:" + i17);
    }
}
