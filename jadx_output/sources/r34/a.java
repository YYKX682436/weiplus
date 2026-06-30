package r34;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final r34.b a(org.json.JSONObject json) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
        kotlin.jvm.internal.o.g(json, "json");
        long optLong = json.optLong("snsId");
        java.lang.String optString = json.optString("aboveSnsId", "");
        java.lang.String optString2 = json.optString("belowSnsId", "");
        long optLong2 = json.optLong("createTime");
        if (optLong == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
            return null;
        }
        if (optString == null || optString.length() == 0) {
            if (optString2 == null || optString2.length() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
                return null;
            }
        }
        java.lang.String t07 = ca4.z0.t0(optLong);
        kotlin.jvm.internal.o.d(t07);
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        r34.b bVar = new r34.b(optLong, t07, optLong2, 0, 0, 0, null, optString, optString2, false, false, null, 3704, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
        return bVar;
    }
}
