package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class a1 implements xb4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.b1 f169747a;

    public a1(com.tencent.mm.plugin.sns.ui.listener.b1 b1Var) {
        this.f169747a = b1Var;
    }

    @Override // xb4.x
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "detail back animation end");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169747a.f169752e.f169745d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169804g = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2$1");
    }

    @Override // xb4.x
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2$1");
    }
}
