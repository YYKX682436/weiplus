package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class r implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164622e;

    public r(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, java.lang.String str) {
        this.f164622e = adLandingPagesProxy;
        this.f164621d = str;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f164621d)) {
            this.f164622e.CLIENT_CALL("onCdnVideoProgress", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f164621d)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 30);
            this.f164622e.CLIENT_CALL("onCdnVideoFinish", str, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f164621d)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 28);
            this.f164622e.CLIENT_CALL("onCdnVideoDataAvailable", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f164621d)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 26);
            this.f164622e.CLIENT_CALL("onCdnVideoMoovReady", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), videoInfo != null ? videoInfo.svrFlag : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }
}
