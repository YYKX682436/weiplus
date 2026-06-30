package s34;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f402620a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f402621b;

    public e(java.lang.Integer num, java.util.List list) {
        this.f402620a = num;
        this.f402621b = list;
    }

    public static final s34.e a(s34.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromAdConsultInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromAdConsultInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        s34.e eVar = (gVar == null || !gVar.c()) ? null : new s34.e(3000, kz5.c0.k(gVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromAdConsultInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromAdConsultInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
        return eVar;
    }

    public static final s34.e b(java.util.Map map, java.lang.String str) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        s34.e eVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".firstAnimInterval")), 3000));
            java.lang.String concat = str.concat(".adConsultBarInfoList");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseAdConsultInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
            if (concat == null) {
                arrayList = new java.util.ArrayList();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAdConsultInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int i17 = 0;
                while (true) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(concat);
                    sb6.append(".adConsultBarInfo");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    if (!map.containsKey(sb7)) {
                        break;
                    }
                    s34.g a17 = s34.g.f402631k.a(map, sb7);
                    if (a17 != null && a17.c()) {
                        arrayList2.add(a17);
                    }
                    i17++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAdConsultInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
                arrayList = arrayList2;
            }
            eVar = new s34.e(valueOf, arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
        return eVar;
    }
}
