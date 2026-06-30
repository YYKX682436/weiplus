package j44;

/* loaded from: classes4.dex */
public interface a {
    static /* synthetic */ void a(j44.a aVar, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenBtnClick$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$HalfScreenBtnClick");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onHalfScreenBtnClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenBtnClick$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$HalfScreenBtnClick");
            throw unsupportedOperationException;
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        ((com.tencent.mm.plugin.sns.ad.download.DownloadHelper) aVar).l(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenBtnClick$default", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$HalfScreenBtnClick");
    }
}
