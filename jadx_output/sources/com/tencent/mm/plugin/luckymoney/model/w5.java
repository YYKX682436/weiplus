package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class w5 extends com.tencent.mm.plugin.luckymoney.model.v5 {
    public w5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this(str, i17, i18, str2, str3, "");
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v5, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/qrydetailunionhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v5, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4395;
    }

    public w5(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("befortTimestamp", j17 + "");
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("union_source", "0");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetailUnion", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }

    public w5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("union_source", "0");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetailUnion", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }
}
