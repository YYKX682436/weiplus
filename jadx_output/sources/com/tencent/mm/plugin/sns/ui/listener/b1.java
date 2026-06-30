package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f169751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 f169752e;

    public b1(com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 timelineClickListener$5, long j17) {
        this.f169752e = timelineClickListener$5;
        this.f169751d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
        com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 timelineClickListener$5 = this.f169752e;
        if (com.tencent.mm.plugin.sns.ui.listener.i.r(timelineClickListener$5.f169745d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "detailItemBackAnimation==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.i.r(timelineClickListener$5.f169745d).a(this.f169751d);
        wb4.i r17 = com.tencent.mm.plugin.sns.ui.listener.i.r(timelineClickListener$5.f169745d);
        com.tencent.mm.plugin.sns.ui.listener.a1 a1Var = new com.tencent.mm.plugin.sns.ui.listener.a1(this);
        r17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        r17.f444412a = a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
    }
}
