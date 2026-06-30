package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class i1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168914d;

    public i1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168914d = improveMainUIC;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "changeToNormalData onGlobalLayout");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168914d;
        improveMainUIC.getRecycleView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = improveMainUIC.getRecycleView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recycleView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1$1", "onGlobalLayout", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recycleView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recycleView, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1$1", "onGlobalLayout", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1$1");
    }
}
