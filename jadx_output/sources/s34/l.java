package s34;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402698a = "";

    public static final s34.l a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo$Companion");
        s34.l lVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo$Companion");
        } else {
            lVar = new s34.l();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            lVar.f402698a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
        return lVar;
    }
}
