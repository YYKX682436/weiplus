package com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ScreenThumbLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public int f150393v;

    /* renamed from: w, reason: collision with root package name */
    public int f150394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenThumbLayoutManager(androidx.recyclerview.widget.RecyclerView recyclerView, android.content.Context context, int i17) {
        super(context, i17, false);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        super.onLayoutChildren(recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        return super.scrollHorizontallyBy(i17, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        int i18 = (this.f150394w - this.f150393v) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 state, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(state, "state");
        if (i17 == -1) {
            return;
        }
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xj3.a aVar = new xj3.a(context);
        aVar.f12049a = i17;
        startSmoothScroll(aVar);
    }
}
