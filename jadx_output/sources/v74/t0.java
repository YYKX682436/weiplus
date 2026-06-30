package v74;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v74.t0 f433920a = new v74.t0();

    /* renamed from: b, reason: collision with root package name */
    public static int f433921b;

    public final java.lang.String a(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
        if (sVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            return "";
        }
        java.lang.String b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(sVar.pagUrl, sVar.f402756a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
        return b17;
    }

    public final void b(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
        if (sVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            return;
        }
        java.lang.String str = sVar.pagUrl;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "downloadPagFile, url is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "downloadPagFile, url=" + sVar.pagUrl);
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(sVar.pagUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
    }
}
