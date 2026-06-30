package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ce implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI f168122e;

    public ce(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI, java.lang.String str) {
        this.f168122e = snsAdStreamVideoPlayUI;
        this.f168121d = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        java.lang.String str2 = this.f168121d;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2) && str.equals(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "download image finish %s", str);
            int i18 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = this.f168122e;
            java.lang.String str3 = snsAdStreamVideoPlayUI.f166780m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str3, null);
            if (J2 != null) {
                com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.T6(snsAdStreamVideoPlayUI).setCover(J2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }
}
