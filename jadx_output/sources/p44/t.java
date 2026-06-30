package p44;

/* loaded from: classes4.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final p44.u a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
            return null;
        }
        p44.u uVar = new p44.u();
        int e17 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorAvailable")), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f351854a = e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e18 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorAvailableDark")), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f351855b = e18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e19 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorPicked")), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f351856c = e19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e27 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorPickedDark")), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f351857d = e27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".backgroundImageUrl"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        uVar.backgroundImageUrl = str2;
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".cardItems.cardItem");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                break;
            }
            p44.s sVar = new p44.s();
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".imageUrl");
            if (str3 == null) {
                str3 = "";
            }
            sVar.imageUrl = str3;
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".title");
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f351848a = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            java.lang.String str5 = (java.lang.String) map.get(sb7 + ".cardId");
            if (str5 == null) {
                str5 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f351849b = str5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f351851d = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            java.lang.String b17 = sVar.b();
            if (b17 == null || b17.length() == 0) {
                com.tencent.mars.xlog.Log.e("RandomPickCardInfo", "cardId==null");
            } else {
                uVar.cardItemList.add(sVar);
            }
            if (uVar.cardItemList.size() >= 5) {
                break;
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
        return uVar;
    }
}
