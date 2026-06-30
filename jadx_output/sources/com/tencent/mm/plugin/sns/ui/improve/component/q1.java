package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class q1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f168975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168977g;

    public q1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, int i17, int i18, kotlin.jvm.internal.f0 f0Var) {
        this.f168974d = improveMainUIC;
        this.f168975e = i17;
        this.f168976f = i18;
        this.f168977g = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168974d;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager layoutManager = improveMainUIC.getLayoutManager();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        int i17 = this.f168976f;
        arrayList.add(java.lang.Integer.valueOf(i17));
        int i18 = this.f168975e;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int i19 = 0;
        layoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int w17 = improveMainUIC.getLayoutManager().w();
        androidx.recyclerview.widget.k3 p07 = improveMainUIC.getRecycleView().p0(i18);
        if (p07 != null && (view = p07.itemView) != null) {
            i19 = view.getTop();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume recyclerView position:");
        sb6.append(i18);
        sb6.append(" offset:");
        sb6.append(i17);
        sb6.append(" nowPos:");
        sb6.append(w17);
        sb6.append(" nowOffset:");
        sb6.append(i19);
        sb6.append(" index:");
        kotlin.jvm.internal.f0 f0Var = this.f168977g;
        int i27 = f0Var.f310116d;
        f0Var.f310116d = i27 + 1;
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", sb6.toString());
        if ((w17 == i18 && i19 == i17) || f0Var.f310116d >= 10) {
            improveMainUIC.getRecycleView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (!com.tencent.mm.sdk.platformtools.t8.U0(improveMainUIC.getContext())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
                return;
            }
            pm0.v.V(200L, new com.tencent.mm.plugin.sns.ui.improve.component.p1(improveMainUIC));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
    }
}
