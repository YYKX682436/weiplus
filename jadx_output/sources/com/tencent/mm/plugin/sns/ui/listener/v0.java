package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f169856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 f169857e;

    public v0(com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 timelineClickListener$4, long j17) {
        this.f169857e = timelineClickListener$4;
        this.f169856d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
        com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4 timelineClickListener$4 = this.f169857e;
        if (com.tencent.mm.plugin.sns.ui.listener.i.p(timelineClickListener$4.f169744d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "detailItemClickAnimation==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.i.p(timelineClickListener$4.f169744d).a(this.f169856d);
        wb4.j p17 = com.tencent.mm.plugin.sns.ui.listener.i.p(timelineClickListener$4.f169744d);
        com.tencent.mm.plugin.sns.ui.listener.u0 u0Var = new com.tencent.mm.plugin.sns.ui.listener.u0(this);
        p17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        p17.f444413a = u0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
    }
}
