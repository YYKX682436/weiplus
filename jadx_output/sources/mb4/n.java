package mb4;

/* loaded from: classes4.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final mb4.o a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".color"));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str.concat(".colorDark"));
        mb4.o oVar = new mb4.o(str2, str3 != null ? str3 : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity$Companion");
        return oVar;
    }
}
