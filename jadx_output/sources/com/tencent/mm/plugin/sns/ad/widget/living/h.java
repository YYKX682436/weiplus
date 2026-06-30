package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer) {
        super(0);
        this.f163719d = adLivingStreamContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
        try {
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163719d;
            int i17 = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.f163623z1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnFirstFrameRendStartFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            kotlinx.coroutines.flow.i2 i2Var = adLivingStreamContainer.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnFirstFrameRendStartFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "onFirstFrameRendStartCallback");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "onFirstFrameRendStartCallback, exp is" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
        return f0Var;
    }
}
