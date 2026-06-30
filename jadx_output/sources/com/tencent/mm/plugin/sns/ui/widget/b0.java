package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        super(1);
        this.f171082d = snsAdBreakFrameVideoView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView mPlayerView = this.f171082d.getMPlayerView();
        if (mPlayerView != null && (cVar = mPlayerView.f163479e) != null) {
            ((kk4.f0) cVar).setOnSeekCompleteListener(null);
        }
        com.tencent.mars.xlog.Log.e("SnsAdBreakFrameVideoView", "seek called with Exception " + th6, th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
        return f0Var;
    }
}
