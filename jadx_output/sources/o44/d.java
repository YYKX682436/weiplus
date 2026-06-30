package o44;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f342886a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f342887b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342888c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342889d;

    /* renamed from: e, reason: collision with root package name */
    public int f342890e;

    /* renamed from: f, reason: collision with root package name */
    public long f342891f;

    public static o44.d a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("subCardType");
            if (optInt != 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                return null;
            }
            o44.d dVar = new o44.d();
            dVar.f342887b = jSONObject.optString("giveCardId");
            dVar.f342890e = optInt;
            dVar.f342888c = jSONObject.optString("senderUserName");
            dVar.f342889d = jSONObject.optString("senderNickName");
            dVar.f342891f = jSONObject.optLong("shareTime");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return dVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShareGiveHBCardInfo", "toExtInfoJsonString, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromExtJson", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
    }

    public static o44.d b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        java.lang.String str2 = str + ".giveHBCardInfo";
        if (!map.containsKey(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return null;
        }
        o44.d dVar = new o44.d();
        java.lang.String str3 = (java.lang.String) map.get(str2 + ".twistCardId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        dVar.f342886a = str3;
        java.lang.String str4 = (java.lang.String) map.get(str2 + ".giveCardId");
        if (str4 == null) {
            str4 = "";
        }
        dVar.f342887b = str4;
        java.lang.String str5 = (java.lang.String) map.get(str2 + ".senderUserName");
        if (str5 == null) {
            str5 = "";
        }
        dVar.f342888c = str5;
        java.lang.String str6 = (java.lang.String) map.get(str2 + ".senderNickName");
        dVar.f342889d = str6 != null ? str6 : "";
        dVar.f342890e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".subCardType"), 0);
        dVar.f342891f = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str2 + ".shareTime"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        return dVar;
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("giveCardId", this.f342887b);
            jSONObject.put("subCardType", this.f342890e);
            jSONObject.put("cardType", 2);
            jSONObject.put("senderUserName", this.f342888c);
            jSONObject.put("senderNickName", this.f342889d);
            jSONObject.put("shareTime", this.f342891f);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShareGiveHBCardInfo", "toExtInfoJsonString, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toExtInfoJsonString", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            return "";
        }
    }
}
