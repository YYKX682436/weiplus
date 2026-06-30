package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer) {
        super(0);
        this.f163720d = adLivingStreamContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163720d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
        try {
            adLivingStreamContainer.setMIsPlayCompleted(true);
            adLivingStreamContainer.getMmHandler().removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayerPaused$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            boolean z17 = adLivingStreamContainer.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayerPaused$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            if (!z17) {
                adLivingStreamContainer.f();
            }
            android.widget.FrameLayout mPlayerContainerBackground = adLivingStreamContainer.getMPlayerContainerBackground();
            if (mPlayerContainerBackground != null) {
                mPlayerContainerBackground.setVisibility(8);
            }
            android.widget.ImageView mStatusIcon = adLivingStreamContainer.getMStatusIcon();
            if (mStatusIcon != null) {
                mStatusIcon.setVisibility(0);
            }
            android.widget.FrameLayout mPlayerContainer = adLivingStreamContainer.getMPlayerContainer();
            if (mPlayerContainer != null) {
                mPlayerContainer.setVisibility(8);
            }
            android.widget.ProgressBar mLoading = adLivingStreamContainer.getMLoading();
            if (mLoading != null) {
                mLoading.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMWallpaperImageView$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            android.widget.ImageView imageView = adLivingStreamContainer.L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMWallpaperImageView$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFrontImageView$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            android.widget.ImageView imageView2 = adLivingStreamContainer.M;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFrontImageView$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "onLiveFinishCallback, exp is" + th6);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "onLiveFinishCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
        return f0Var;
    }
}
