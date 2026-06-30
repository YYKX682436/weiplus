package com.tencent.mm.plugin.vlog.ui.plugin.caption;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "cp4/c", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class EditorCaptionLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorCaptionLayoutManager(android.content.Context context, int i17) {
        super(context, i17, false);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        cp4.c cVar = new cp4.c(this, context);
        cVar.f12049a = i17;
        startSmoothScroll(cVar);
    }
}
