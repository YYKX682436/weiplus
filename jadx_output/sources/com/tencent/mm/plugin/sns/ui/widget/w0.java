package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.y0 f171287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.sns.ui.widget.y0 y0Var) {
        super(1);
        this.f171287d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
        com.tencent.mm.plugin.sns.ui.widget.y0 y0Var = this.f171287d;
        y0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        y0Var.f171317d.setOnPrepared(null);
        com.tencent.mars.xlog.Log.e("SnsAdTimelineVideoViewKtProxy", "prepare called with Exception " + th6, th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
        return f0Var;
    }
}
