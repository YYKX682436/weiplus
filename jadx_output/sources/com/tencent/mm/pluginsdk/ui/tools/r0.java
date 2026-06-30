package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public final class r0 extends com.tencent.mm.pluginsdk.ui.tools.r3 implements com.tencent.mm.pluginsdk.ui.tools.u3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.u3 f191858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.util.SparseArray headerViews, android.util.SparseArray footerViews, androidx.recyclerview.widget.f2 innerAdapter, com.tencent.mm.pluginsdk.ui.tools.u3 chatInnerAdapter) {
        super(headerViews, footerViews, innerAdapter);
        kotlin.jvm.internal.o.g(headerViews, "headerViews");
        kotlin.jvm.internal.o.g(footerViews, "footerViews");
        kotlin.jvm.internal.o.g(innerAdapter, "innerAdapter");
        kotlin.jvm.internal.o.g(chatInnerAdapter, "chatInnerAdapter");
        this.f191858g = chatInnerAdapter;
        innerAdapter.registerAdapterDataObserver(new com.tencent.mm.pluginsdk.ui.tools.q0(this));
        setHasStableIds(innerAdapter.hasStableIds());
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public java.lang.Object getItem(int i17) {
        if ((i17 < y()) || z(i17)) {
            return null;
        }
        return this.f191858g.getItem(i17 - y());
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        if ((i17 < y()) || z(i17)) {
            return -1L;
        }
        return this.f191863f.getItemId(i17 - y());
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (i17 < y()) {
            return (android.view.View) this.f191861d.get(getItemViewType(i17));
        }
        if (z(i17)) {
            return (android.view.View) this.f191862e.get(getItemViewType(i17));
        }
        return this.f191858g.getView(i17 - y(), view, viewGroup);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public void h(java.lang.Object obj) {
        this.f191858g.h(obj);
    }
}
