package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.improve.component.y1 f169060d = new com.tencent.mm.plugin.sns.ui.improve.component.y1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC$onDestroy$1");
        java.util.HashMap hashMap = nd4.f.f336478a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
        nd4.f.f336478a.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC$onDestroy$1");
    }
}
