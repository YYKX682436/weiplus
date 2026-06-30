package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f169866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 f169867e;

    public z0(com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 timelineClickListener$5, long j17) {
        this.f169867e = timelineClickListener$5;
        this.f169866d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1");
        com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 timelineClickListener$5 = this.f169867e;
        if (com.tencent.mm.plugin.sns.ui.listener.i.q(timelineClickListener$5.f169745d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "timelineBackAnimation==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.i.q(timelineClickListener$5.f169745d).a(this.f169866d);
        xb4.w q17 = com.tencent.mm.plugin.sns.ui.listener.i.q(timelineClickListener$5.f169745d);
        com.tencent.mm.plugin.sns.ui.listener.y0 y0Var = new com.tencent.mm.plugin.sns.ui.listener.y0(this);
        q17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineBackAnimation");
        q17.f452997a = y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineBackAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1");
    }
}
