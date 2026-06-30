package s34;

/* loaded from: classes4.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final s34.g a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo$Companion");
            return null;
        }
        s34.g gVar = new s34.g();
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402633a = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str3 = (java.lang.String) map.get(str.concat(".titleColor.color"));
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColor", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402634b = str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColor", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str4 = (java.lang.String) map.get(str.concat(".titleColor.colorDark"));
        if (str4 == null) {
            str4 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402635c = str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str5 = (java.lang.String) map.get(str.concat(".consultText"));
        if (str5 == null) {
            str5 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setConsultText", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402636d = str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setConsultText", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str6 = (java.lang.String) map.get(str.concat(".consultTextColor.color"));
        if (str6 == null) {
            str6 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setConsultTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402637e = str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setConsultTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str7 = (java.lang.String) map.get(str.concat(".consultTextColor.colorDark"));
        if (str7 == null) {
            str7 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setConsultTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        gVar.f402638f = str7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setConsultTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str8 = (java.lang.String) map.get(str.concat(".iconLight"));
        if (str8 == null) {
            str8 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.storage.h1 h1Var = gVar.f402639g;
        f06.v[] vVarArr = s34.g.f402632l;
        ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(gVar, vVarArr[0], str8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str9 = (java.lang.String) map.get(str.concat(".iconDark"));
        java.lang.String str10 = str9 != null ? str9 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconDarkUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        ((com.tencent.mm.plugin.sns.storage.r0) gVar.f402640h).b(gVar, vVarArr[1], str10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconDarkUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".titleJumpActionInfo"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        ((com.tencent.mm.plugin.sns.storage.k0) gVar.f402641i).b(gVar, vVarArr[2], f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f18 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".consultButtonJumpActionInfo"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setConsultButtonJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        ((com.tencent.mm.plugin.sns.storage.k0) gVar.f402642j).b(gVar, vVarArr[3], f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setConsultButtonJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo$Companion");
        return gVar;
    }
}
