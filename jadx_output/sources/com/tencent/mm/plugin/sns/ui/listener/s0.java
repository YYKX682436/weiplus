package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class s0 implements xb4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.t0 f169850a;

    public s0(com.tencent.mm.plugin.sns.ui.listener.t0 t0Var) {
        this.f169850a = t0Var;
    }

    @Override // xb4.x
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "timeline click animation end");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169850a.f169853e.f169744d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169801d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
    }

    @Override // xb4.x
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
    }
}
