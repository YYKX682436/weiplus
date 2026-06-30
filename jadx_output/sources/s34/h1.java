package s34;

/* loaded from: classes4.dex */
public final class h1 {
    public h1(kotlin.jvm.internal.i iVar) {
    }

    public final s34.i1 a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
        if (jSONObject == null) {
            s34.i1 i1Var = new s34.i1(null, null, 3, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
            return i1Var;
        }
        java.lang.String optString = jSONObject.optString("color", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONObject.optString("colorDark", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        s34.i1 i1Var2 = new s34.i1(optString, optString2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
        return i1Var2;
    }
}
