package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0016\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006."}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/v3;", "", "resID", "Ljz5/f0;", "setSelector", "color", "setCacheColorHint", "Landroid/graphics/drawable/Drawable;", "divider", "setDivider", "getLastVisiblePosition", "getHeaderViewsCount", "getFirstCompletelyVisiblePosition", "getFirstVisiblePosition", "getCount", "Landroid/widget/AbsListView$OnScrollListener;", "l", "setOnScrollListener", "Landroidx/recyclerview/widget/f2;", "adapter", "setAdapter", "getFooterViewsCount", "position", "setSelection", "mode", "setTranscriptMode", "visibility", "setVisibility", "Landroid/util/SparseArray;", "Landroid/view/View;", "b2", "Landroid/util/SparseArray;", "getHeaderViews", "()Landroid/util/SparseArray;", "headerViews", "c2", "getFooterViews", "footerViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class ChattingRecyclerView extends androidx.recyclerview.widget.RecyclerView implements com.tencent.mm.pluginsdk.ui.tools.v3 {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public final android.util.SparseArray headerViews;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public final android.util.SparseArray footerViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.headerViews = new android.util.SparseArray();
        this.footerViews = new android.util.SparseArray();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View C(int i17, int i18) {
        androidx.recyclerview.widget.k3 p07 = p0(i17);
        if (p07 != null) {
            return p07.itemView;
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View F(int i17) {
        getFirstVisiblePosition();
        androidx.recyclerview.widget.k3 p07 = p0(i17);
        if (p07 != null) {
            return p07.itemView;
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void addFooterView(android.view.View view) {
        if (view != null) {
            android.util.SparseArray sparseArray = this.footerViews;
            sparseArray.put(sparseArray.size() + 200000, view);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void addHeaderView(android.view.View view) {
        if (view != null) {
            android.util.SparseArray sparseArray = this.headerViews;
            sparseArray.put(sparseArray.size() + 100000, view);
        }
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.ViewGroup f() {
        return this;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getCount() {
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getFirstCompletelyVisiblePosition() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getFirstVisiblePosition() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public final android.util.SparseArray<android.view.View> getFooterViews() {
        return this.footerViews;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getFooterViewsCount() {
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = adapter instanceof com.tencent.mm.pluginsdk.ui.tools.r0 ? (com.tencent.mm.pluginsdk.ui.tools.r0) adapter : null;
        if (r0Var != null) {
            return r0Var.f191862e.size();
        }
        return 0;
    }

    public final android.util.SparseArray<android.view.View> getHeaderViews() {
        return this.headerViews;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getHeaderViewsCount() {
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = adapter instanceof com.tencent.mm.pluginsdk.ui.tools.r0 ? (com.tencent.mm.pluginsdk.ui.tools.r0) adapter : null;
        if (r0Var != null) {
            return r0Var.y();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getLastVisiblePosition() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getPositionForView(android.view.View view) {
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, com.tencent.mm.pluginsdk.ui.tools.v3
    public void i(androidx.recyclerview.widget.w2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        V0(listener);
        super.i(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void k(com.tencent.mm.pluginsdk.ui.tools.u3 u3Var) {
        setAdapter(u3Var instanceof androidx.recyclerview.widget.f2 ? (androidx.recyclerview.widget.f2) u3Var : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View q(int i17) {
        android.util.SparseArray sparseArray = this.headerViews;
        int size = sparseArray.size();
        for (int i18 = 0; i18 < size; i18++) {
            sparseArray.keyAt(i18);
            android.view.View findViewById = ((android.view.View) sparseArray.valueAt(i18)).findViewById(i17);
            if (findViewById != null) {
                return findViewById;
            }
        }
        android.util.SparseArray sparseArray2 = this.footerViews;
        int size2 = sparseArray2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            sparseArray2.keyAt(i19);
            android.view.View findViewById2 = ((android.view.View) sparseArray2.valueAt(i19)).findViewById(i17);
            if (findViewById2 != null) {
                return findViewById2;
            }
        }
        return findViewById(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public boolean removeFooterView(android.view.View view) {
        if (view == null) {
            return false;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        android.util.SparseArray sparseArray2 = this.footerViews;
        int size = sparseArray2.size();
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray2.keyAt(i17);
            android.view.View view2 = (android.view.View) sparseArray2.valueAt(i17);
            if (kotlin.jvm.internal.o.b(view2, view)) {
                z17 = true;
            } else {
                sparseArray.put(sparseArray.size() + 200000, view2);
            }
        }
        if (!z17) {
            return false;
        }
        sparseArray2.clear();
        int size2 = sparseArray.size();
        for (int i18 = 0; i18 < size2; i18++) {
            sparseArray2.put(sparseArray.keyAt(i18), sparseArray.valueAt(i18));
        }
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public boolean removeHeaderView(android.view.View view) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        android.util.SparseArray sparseArray2 = this.headerViews;
        int size = sparseArray2.size();
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray2.keyAt(i17);
            android.view.View view2 = (android.view.View) sparseArray2.valueAt(i17);
            if (kotlin.jvm.internal.o.b(view2, view)) {
                z17 = true;
            } else {
                sparseArray.put(sparseArray.size() + 100000, view2);
            }
        }
        if (!z17) {
            return false;
        }
        sparseArray2.clear();
        int size2 = sparseArray.size();
        for (int i18 = 0; i18 < size2; i18++) {
            sparseArray2.put(sparseArray.keyAt(i18), sparseArray.valueAt(i18));
        }
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public com.tencent.mm.pluginsdk.ui.tools.u3 s() {
        java.lang.Object adapter = super.getAdapter();
        if (adapter instanceof com.tencent.mm.pluginsdk.ui.tools.u3) {
            return (com.tencent.mm.pluginsdk.ui.tools.u3) adapter;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        android.util.SparseArray sparseArray = this.headerViews;
        android.util.SparseArray sparseArray2 = this.footerViews;
        com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = f2Var;
        r0Var = f2Var;
        r0Var = f2Var;
        if (f2Var != 0 && sparseArray != null && sparseArray2 != null) {
            boolean z17 = f2Var instanceof com.tencent.mm.pluginsdk.ui.tools.r0;
            r0Var = f2Var;
            if (!z17) {
                boolean z18 = f2Var instanceof com.tencent.mm.pluginsdk.ui.tools.u3;
                r0Var = f2Var;
                if (z18) {
                    r0Var = new com.tencent.mm.pluginsdk.ui.tools.r0(sparseArray, sparseArray2, f2Var, (com.tencent.mm.pluginsdk.ui.tools.u3) f2Var);
                }
            }
        }
        super.setAdapter(r0Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setCacheColorHint(int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setDivider(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setItemChecked(int i17, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(new com.tencent.mm.pluginsdk.ui.tools.u0());
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setSelection(int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setSelectionFromTop(int i17, int i18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setSelector(int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void setTranscriptMode(int i17) {
    }

    @Override // android.view.View, com.tencent.mm.pluginsdk.ui.tools.v3
    public void setVisibility(int i17) {
        super.setVisibility(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void smoothScrollToPositionFromTop(int i17, int i18, int i19) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        c1(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int x(int i17, int i18) {
        return i18;
    }
}
