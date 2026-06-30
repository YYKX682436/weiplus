package t74;

/* loaded from: classes4.dex */
public final class z1 {
    public z1(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.Map map, java.lang.String str) {
        t74.g2 g2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseMediaCardHolesList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".cardHole");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseMediaCardHolesList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                return arrayList;
            }
            java.lang.String str2 = (java.lang.String) map.get(sb7);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = str2 == null ? "" : str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
            if (str3.length() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
                g2Var = null;
            } else {
                java.util.List f07 = r26.n0.f0(str3, new java.lang.String[]{"|"}, false, 0, 6, null);
                t74.g2 g2Var2 = new t74.g2();
                float parseFloat = java.lang.Float.parseFloat((java.lang.String) f07.get(0));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLeftRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f416141a = parseFloat;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLeftRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat2 = java.lang.Float.parseFloat((java.lang.String) f07.get(1));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f416142b = parseFloat2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat3 = java.lang.Float.parseFloat((java.lang.String) f07.get(2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidthRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f416143c = parseFloat3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidthRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat4 = java.lang.Float.parseFloat((java.lang.String) f07.get(3));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeightRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f416144d = parseFloat4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeightRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
                g2Var = g2Var2;
            }
            if (g2Var != null) {
                arrayList.add(g2Var);
            }
            i17++;
        }
    }
}
