package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class u0 implements xb4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.v0 f169855a;

    public u0(com.tencent.mm.plugin.sns.ui.listener.v0 v0Var) {
        this.f169855a = v0Var;
    }

    @Override // xb4.x
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "detail click animation end");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169855a.f169857e.f169744d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169803f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
    }

    @Override // xb4.x
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
    }
}
