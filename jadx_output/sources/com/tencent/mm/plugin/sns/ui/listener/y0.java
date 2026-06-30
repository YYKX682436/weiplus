package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class y0 implements xb4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.z0 f169864a;

    public y0(com.tencent.mm.plugin.sns.ui.listener.z0 z0Var) {
        this.f169864a = z0Var;
    }

    @Override // xb4.x
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "timeline back animation end");
        boolean z17 = com.tencent.mm.plugin.sns.ui.listener.i.q(this.f169864a.f169867e.f169745d) instanceof xb4.z0;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169864a.f169867e.f169745d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169802e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1$1");
    }

    @Override // xb4.x
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$1$1");
    }
}
