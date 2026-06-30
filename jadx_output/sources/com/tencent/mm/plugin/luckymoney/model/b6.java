package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class b6 extends com.tencent.mm.plugin.luckymoney.model.c6 {
    public b6(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str + "");
        hashMap.put("offset", i18 + "");
        hashMap.put("type", i17 + "");
        hashMap.put("receiveId", str2);
        hashMap.put("ver", str3);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/deletelistwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1612;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("NetSceneLuckyMoneyMyRecordDelete", "onGYNetEnd");
    }
}
