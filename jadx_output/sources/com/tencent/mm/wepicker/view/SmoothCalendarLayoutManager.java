package com.tencent.mm.wepicker.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/wepicker/view/SmoothCalendarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SmoothCalendarLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final float f214346v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothCalendarLayoutManager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f214346v = 100.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 state, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(state, "state");
        mq5.b bVar = new mq5.b(this, recyclerView.getContext());
        bVar.f12049a = i17;
        startSmoothScroll(bVar);
    }
}
