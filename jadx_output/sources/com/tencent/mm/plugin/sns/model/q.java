package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164585e;

    public q(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, java.lang.String str) {
        this.f164585e = adLandingPagesProxy;
        this.f164584d = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onImageFinish, mediaId=" + str + ", isOk=" + z17);
        java.lang.String str2 = this.f164584d;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2) && str.equals(str2)) {
            this.f164585e.CLIENT_CALL("onImgDownloadCallback", str, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onSightFinish, mediaId=" + str + ", isOk=" + z17);
        java.lang.String str2 = this.f164584d;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2) && str.equals(str2)) {
            this.f164585e.CLIENT_CALL("onSightDownloadCallback", str, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNMediaDownloadListener");
    }
}
