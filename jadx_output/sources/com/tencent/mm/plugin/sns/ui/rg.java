package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class rg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f170420e;

    public rg(int i17, com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f170419d = i17;
        this.f170420e = snsCommentImageFlowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$2");
        int i17 = this.f170419d;
        int i18 = i17 > 0 ? i17 - 1 : 0;
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView t76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.t7(this.f170420e);
        if (t76 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(t76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$3$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        t76.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(t76, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$3$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$2");
    }
}
