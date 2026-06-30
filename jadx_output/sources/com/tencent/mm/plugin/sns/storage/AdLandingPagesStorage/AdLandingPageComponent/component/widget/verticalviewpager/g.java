package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

/* loaded from: classes4.dex */
public class g implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165774d = "";

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f165775e;

    public static /* synthetic */ t21.h0 f(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        t21.h0 h0Var = gVar.f165775e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return h0Var;
    }

    public static /* synthetic */ java.lang.String g(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        java.lang.String str = gVar.f165774d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return str;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        if (this.f165774d.equals(str)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().requestVideoData(str, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        this.f165774d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingOnlineVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().downloadLandingPageVideo(str, str3, str2, 0, false, -1, true, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.f(this, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingOnlineVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        if (this.f165774d.equals(str)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().stopDownloadLandingPageVideo(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        this.f165775e = h0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingOnlineVideoProxy", "%s, check video data available[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!this.f165774d.equals(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
            return false;
        }
        boolean isVideoDataAvailable = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isVideoDataAvailable(str, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return isVideoDataAvailable;
    }
}
