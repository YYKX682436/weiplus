package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f163725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer, int i17, int i18) {
        super(0);
        this.f163724d = adLivingStreamContainer;
        this.f163725e = i17;
        this.f163726f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1$1");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163724d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1$1");
        try {
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.d(adLivingStreamContainer, this.f163725e, this.f163726f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnSizeChangedFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            kotlinx.coroutines.flow.i2 i2Var = adLivingStreamContainer.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnSizeChangedFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "onSizeChangeCallback, exp is" + th6);
            ca4.q.c("MicroMsg.AdLivingStreamContainer.onSizeChangeCallback", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1$1");
        return f0Var;
    }
}
