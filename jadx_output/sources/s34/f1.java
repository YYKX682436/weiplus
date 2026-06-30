package s34;

/* loaded from: classes4.dex */
public final class f1 {
    public f1(kotlin.jvm.internal.i iVar) {
    }

    public final s34.g1 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".color"));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str.concat(".colorDark"));
        s34.g1 g1Var = new s34.g1(str2, str3 != null ? str3 : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
        return g1Var;
    }
}
