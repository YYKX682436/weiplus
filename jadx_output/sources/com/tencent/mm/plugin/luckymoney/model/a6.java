package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class a6 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.n4 f145165h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f145166i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145167m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145168n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145169o = null;

    public a6(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        hashMap.put("type", i19 + "");
        hashMap.put("year", str);
        hashMap.put("ver", str2);
        hashMap.put("processContent", str3);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/qrylistwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1514;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String[] split;
        try {
            this.f145165h = com.tencent.mm.plugin.luckymoney.model.g5.f(jSONObject);
            this.f145166i = new java.util.ArrayList();
            java.lang.String optString = jSONObject.optString("years");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && (split = optString.split("\\|")) != null) {
                for (java.lang.String str2 : split) {
                    this.f145166i.add(str2);
                }
            }
            this.f145167m = jSONObject.optString("recordYear");
            this.f145169o = jSONObject.optString("clickedUrl");
            this.f145168n = jSONObject.optString("processContent");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyNormalBase", e17, "", new java.lang.Object[0]);
        }
    }
}
