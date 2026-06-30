package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f169852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 f169853e;

    public t0(com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 timelineClickListener$4, long j17) {
        this.f169853e = timelineClickListener$4;
        this.f169852d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
        com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 timelineClickListener$4 = this.f169853e;
        if (com.tencent.mm.plugin.sns.ui.listener.i.o(timelineClickListener$4.f169744d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "timelineClickAnimation==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.i.o(timelineClickListener$4.f169744d).a(this.f169852d);
        xb4.y o17 = com.tencent.mm.plugin.sns.ui.listener.i.o(timelineClickListener$4.f169744d);
        com.tencent.mm.plugin.sns.ui.listener.s0 s0Var = new com.tencent.mm.plugin.sns.ui.listener.s0(this);
        o17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        o17.f453001b = s0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
    }
}
