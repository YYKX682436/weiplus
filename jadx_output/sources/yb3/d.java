package yb3;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.plugin.luckymoney.model.v5 {
    public d(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i19) {
        this(str, i17, i18, str2, str3, "", str4, str5, i19);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v5, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveqrydetailwxhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v5, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4339;
    }

    public d(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19) {
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
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i19 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i19));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveQryLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }

    public d(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i19 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i19));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveQryLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }
}
