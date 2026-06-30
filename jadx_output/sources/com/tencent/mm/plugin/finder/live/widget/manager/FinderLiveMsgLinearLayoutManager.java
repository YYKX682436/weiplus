package com.tencent.mm.plugin.finder.live.widget.manager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/manager/FinderLiveMsgLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveMsgLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f119057v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.Context f119058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMsgLinearLayoutManager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119057v = "FinderLiveMsgLinearLayoutManager";
        this.f119058w = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        android.content.Context context = this.f119058w;
        if (context == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        en2.b bVar = new en2.b(this, context);
        bVar.f12049a = i17;
        startSmoothScroll(bVar);
    }
}
