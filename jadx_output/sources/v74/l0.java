package v74;

/* loaded from: classes4.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    public final android.graphics.Point a(android.content.Context context, s34.s sVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlidePagViewSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        if (context == null || sVar == null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlidePagViewSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
            return point;
        }
        if (!c(sVar)) {
            android.graphics.Point point2 = new android.graphics.Point(0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlidePagViewSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
            return point2;
        }
        float f17 = (i17 * 2.0f) / 3.0f;
        android.graphics.Point point3 = new android.graphics.Point((int) ((sVar.f402757b * f17) / sVar.f402758c), (int) f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlidePagViewSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        return point3;
    }

    public final boolean b(v74.m mVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasPagAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        if (mVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasPagAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
            return false;
        }
        boolean c17 = c(mVar.e());
        boolean z18 = c(mVar.g()) && c(mVar.h());
        if (z17) {
            if (c17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:3");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:4");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            }
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:5");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:6");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            }
        }
        boolean z19 = c17 || z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasPagAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        return z19;
    }

    public final boolean c(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAnimPagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        boolean z17 = (sVar == null || sVar.f402757b <= 0 || sVar.f402758c <= 0 || android.text.TextUtils.isEmpty(sVar.pagUrl) || android.text.TextUtils.isEmpty(sVar.f402756a)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAnimPagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$Companion");
        return z17;
    }
}
