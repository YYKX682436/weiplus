package f54;

/* loaded from: classes.dex */
public final class s {
    public s(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".bulletComment");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String str2 = (java.lang.String) map.get(sb6.toString());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = str2 != null ? str2 : "";
            if (str3.length() == 0) {
                break;
            }
            arrayList.add(str3);
            if (arrayList.size() >= 3) {
                break;
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        return arrayList;
    }
}
