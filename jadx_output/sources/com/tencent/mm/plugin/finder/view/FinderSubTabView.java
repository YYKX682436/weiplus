package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u001b\f\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderSubTabView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lin5/u;", "Lcom/tencent/mm/plugin/finder/view/kl;", "", "j2", "I", "getSelectedId", "()I", "setSelectedId", "(I)V", "selectedId", "Lcom/tencent/mm/plugin/finder/view/jl;", "onTabSelectedListener", "Lcom/tencent/mm/plugin/finder/view/jl;", "getOnTabSelectedListener", "()Lcom/tencent/mm/plugin/finder/view/jl;", "setOnTabSelectedListener", "(Lcom/tencent/mm/plugin/finder/view/jl;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/il", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSubTabView extends com.tencent.mm.view.recyclerview.WxRecyclerView implements in5.u {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int selectedId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSubTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setPadding(dimension, dimension, dimension, dimension);
        setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSubTabView.1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.view.il(com.tencent.mm.plugin.finder.view.FinderSubTabView.this);
            }
        }, arrayList, false));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context2, 0, false);
        finderLinearLayoutManager.C = false;
        setLayoutManager(finderLinearLayoutManager);
        setItemAnimator(null);
    }

    public final com.tencent.mm.plugin.finder.view.jl getOnTabSelectedListener() {
        return null;
    }

    public final int getSelectedId() {
        return this.selectedId;
    }

    public final void setOnTabSelectedListener(com.tencent.mm.plugin.finder.view.jl jlVar) {
    }

    public final void setSelectedId(int i17) {
        this.selectedId = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSubTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setPadding(dimension, dimension, dimension, dimension);
        setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSubTabView.1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.view.il(com.tencent.mm.plugin.finder.view.FinderSubTabView.this);
            }
        }, arrayList, false));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context2, 0, false);
        finderLinearLayoutManager.C = false;
        setLayoutManager(finderLinearLayoutManager);
        setItemAnimator(null);
    }
}
