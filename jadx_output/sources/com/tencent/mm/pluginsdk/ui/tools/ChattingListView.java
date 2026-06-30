package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001b\rB\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView;", "Landroid/widget/ListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/v3;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "Ljz5/f0;", "setLayoutManager", "Landroidx/recyclerview/widget/y2;", "getRecycledViewPool", "", "visibility", "setVisibility", "getFirstCompletelyVisiblePosition", "Lcom/tencent/mm/pluginsdk/ui/tools/t0;", "d", "Lcom/tencent/mm/pluginsdk/ui/tools/t0;", "getMCompatAdapter", "()Lcom/tencent/mm/pluginsdk/ui/tools/t0;", "setMCompatAdapter", "(Lcom/tencent/mm/pluginsdk/ui/tools/t0;)V", "mCompatAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/pluginsdk/ui/tools/s0", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class ChattingListView extends android.widget.ListView implements com.tencent.mm.pluginsdk.ui.tools.v3 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.pluginsdk.ui.tools.t0 mCompatAdapter;

    static {
        new com.tencent.mm.pluginsdk.ui.tools.s0(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View C(int i17, int i18) {
        return getChildAt(i17 - i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View F(int i17) {
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("ChattingListView", "null == view index:%s", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(i17 + getHeaderViewsCount());
        }
        return childAt;
    }

    @Override // android.widget.ListView, com.tencent.mm.pluginsdk.ui.tools.v3
    public void addFooterView(android.view.View view) {
        super.addFooterView(view);
    }

    @Override // android.widget.ListView, com.tencent.mm.pluginsdk.ui.tools.v3
    public void addHeaderView(android.view.View view) {
        super.addHeaderView(view);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.ViewGroup f() {
        return this;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getFirstCompletelyVisiblePosition() {
        return getFirstVisiblePosition();
    }

    public final com.tencent.mm.pluginsdk.ui.tools.t0 getMCompatAdapter() {
        return this.mCompatAdapter;
    }

    public androidx.recyclerview.widget.y2 getRecycledViewPool() {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void i(androidx.recyclerview.widget.w2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void k(com.tencent.mm.pluginsdk.ui.tools.u3 u3Var) {
        super.setAdapter(u3Var instanceof android.widget.ListAdapter ? (android.widget.ListAdapter) u3Var : null);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View q(int i17) {
        return findViewById(i17);
    }

    @Override // android.widget.ListView, com.tencent.mm.pluginsdk.ui.tools.v3
    public boolean removeFooterView(android.view.View view) {
        return super.removeFooterView(view);
    }

    @Override // android.widget.ListView, com.tencent.mm.pluginsdk.ui.tools.v3
    public boolean removeHeaderView(android.view.View view) {
        return super.removeHeaderView(view);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public com.tencent.mm.pluginsdk.ui.tools.u3 s() {
        android.widget.ListAdapter adapter = getAdapter();
        boolean z17 = adapter instanceof com.tencent.mm.pluginsdk.ui.tools.u3;
        if (z17 || !(adapter instanceof android.widget.Adapter)) {
            if (z17) {
                return (com.tencent.mm.pluginsdk.ui.tools.u3) adapter;
            }
            return null;
        }
        com.tencent.mm.pluginsdk.ui.tools.t0 t0Var = this.mCompatAdapter;
        if (kotlin.jvm.internal.o.b(t0Var != null ? t0Var.f191902d : null, adapter)) {
            return this.mCompatAdapter;
        }
        com.tencent.mm.pluginsdk.ui.tools.t0 t0Var2 = new com.tencent.mm.pluginsdk.ui.tools.t0(adapter);
        this.mCompatAdapter = t0Var2;
        return t0Var2;
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }

    public final void setMCompatAdapter(com.tencent.mm.pluginsdk.ui.tools.t0 t0Var) {
        this.mCompatAdapter = t0Var;
    }

    @Override // android.view.View, com.tencent.mm.pluginsdk.ui.tools.v3
    public void setVisibility(int i17) {
        super.setVisibility(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int x(int i17, int i18) {
        return java.lang.Math.max(i17, i18 - getFirstVisiblePosition());
    }

    @Override // android.widget.ListView
    public void addFooterView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addFooterView(view, obj, z17);
    }

    @Override // android.widget.ListView
    public void addHeaderView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addHeaderView(view, obj, z17);
    }
}
