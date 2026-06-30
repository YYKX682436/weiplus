package v74;

/* loaded from: classes4.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final s34.s a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
        if (map != null && !map.isEmpty()) {
            boolean z17 = true;
            if (!(str == null || str.length() == 0)) {
                if (!map.containsKey(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                    return null;
                }
                s34.s sVar = new s34.s();
                java.lang.String str2 = (java.lang.String) map.get(str + ".pagUrl");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                sVar.pagUrl = str2;
                java.lang.String str3 = (java.lang.String) map.get(str + ".pagMD5");
                sVar.f402756a = str3 != null ? str3 : "";
                sVar.f402757b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".width"), 0);
                sVar.f402758c = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".height"), 0);
                java.lang.String str4 = sVar.pagUrl;
                if (!(str4 == null || str4.length() == 0)) {
                    java.lang.String str5 = sVar.f402756a;
                    if (str5 != null && str5.length() != 0) {
                        z17 = false;
                    }
                    if (!z17 && sVar.f402757b > 0 && sVar.f402758c > 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                        return sVar;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                return null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
        return null;
    }
}
