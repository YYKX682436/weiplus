package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/flow/LinearLayoutManagerWrapper;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LinearLayoutManagerWrapper extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f120883v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearLayoutManagerWrapper(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f120883v = "Finder.LinearLayoutManagerWrapper";
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            pm0.z.b(xy2.b.f458155b, "longVideoMergeAndNotify", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, this.f120883v + "_longVideoMergeAndNotify");
        }
    }
}
