package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsScrollControllableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsScrollControllableLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f167364v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsScrollControllableLinearLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f167364v = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        boolean z17 = this.f167364v && super.canScrollHorizontally();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        return z17;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollVertically", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        boolean z17 = this.f167364v && super.getF123307r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollVertically", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        return z17;
    }
}
