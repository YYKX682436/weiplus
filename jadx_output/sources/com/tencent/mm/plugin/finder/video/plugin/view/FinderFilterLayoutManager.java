package com.tencent.mm.plugin.finder.video.plugin.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/plugin/view/FinderFilterLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "jw2/a", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderFilterLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final jw2.a f130790v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFilterLayoutManager(android.content.Context context) {
        super(context, 0, false);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130790v = new jw2.a(this, context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        jw2.a aVar = this.f130790v;
        aVar.f12049a = i17;
        startSmoothScroll(aVar);
    }
}
