package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class z5 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145738h;

    public z5(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i19) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalNum", i17 + "");
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put(ya.b.CURRENCY, i19 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str3));
        }
        hashMap.put("nickName", java.net.URLEncoder.encode(str4 == null ? "" : str4));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put(dm.i4.COL_USERNAME, java.net.URLEncoder.encode(str2));
            if (com.tencent.mm.storage.z3.R4(str2)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) + "");
            }
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5requestwxhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public int I() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1647;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=" + i17 + " content:" + jSONObject.toString());
        if (i17 == 0) {
            this.f145738h = jSONObject.optString("payUrl");
        }
    }
}
