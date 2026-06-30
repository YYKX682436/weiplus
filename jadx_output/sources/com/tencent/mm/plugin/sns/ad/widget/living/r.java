package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class r extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlinx.coroutines.q0 q0Var, com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer) {
        super(q0Var);
        this.f163759d = adLivingStreamContainer;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.f163623z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasError$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163759d;
        adLivingStreamContainer.K = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasError$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        android.widget.FrameLayout mPlayerContainer = adLivingStreamContainer.getMPlayerContainer();
        if (mPlayerContainer != null) {
            mPlayerContainer.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$special$$inlined$CoroutineExceptionHandler$1");
    }
}
