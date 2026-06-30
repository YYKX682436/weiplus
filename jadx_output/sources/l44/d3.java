package l44;

/* loaded from: classes4.dex */
public final class d3 {
    public d3(kotlin.jvm.internal.i iVar) {
    }

    public final l44.e3 a(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord$Companion");
        kotlin.jvm.internal.o.g(adSnsInfo, "adSnsInfo");
        int a17 = i64.z0.a(adSnsInfo);
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = adSnsInfo.getAdInfo();
        java.lang.String str = adInfo != null ? adInfo.aid : null;
        java.lang.String str2 = str == null ? "" : str;
        int i19 = adSnsInfo.field_createAdTime;
        java.lang.String t07 = ca4.z0.t0(adSnsInfo.field_snsId);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo2 = adSnsInfo.getAdInfo();
        java.lang.String str3 = adInfo2 != null ? adInfo2.traceid : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo3 = adSnsInfo.getAdInfo();
        java.lang.String str5 = adInfo3 != null ? adInfo3.uxInfo : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String b17 = n74.d2.b(str5, 10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String str6 = "getTid";
        l44.e3 e3Var = new l44.e3(i17, i18, str2, i19, a17, t07, str4, b17, adSnsInfo.isCollectedAd(), null, 512, null);
        if (adSnsInfo.isCollectedAd()) {
            java.util.Iterator it = ((java.util.ArrayList) adSnsInfo.getAdXml().collectedAdInfo.a()).iterator();
            while (it.hasNext()) {
                s34.v1 v1Var = (s34.v1) it.next();
                java.lang.String a18 = v1Var.a();
                java.lang.String str7 = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str7, "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                java.lang.String str8 = v1Var.f402794g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                s34.w1 w1Var = new s34.w1(a18, str8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSubAd", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
                e3Var.f316118j.add(w1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSubAd", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
                str6 = str7;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord$Companion");
        return e3Var;
    }
}
