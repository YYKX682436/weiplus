package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class h6 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145323h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145324i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145325m;

    /* renamed from: n, reason: collision with root package name */
    public int f145326n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145327o;

    public h6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7) {
        this(i17, j17, j18, i18, str, str2, str3, str4, str5, str6, i19, str7, "", 0, 0, "", "", 0, "");
    }

    public static boolean K(com.tencent.mm.modelbase.m1 m1Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(x51.j1.f(((r45.ex3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a).f373781d));
            if (jSONObject.has("showmess")) {
                int optInt = jSONObject.optJSONObject("showmess").optInt("return_to_session", 0);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (optInt == 1) {
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "ifReturnByReturnToSession() Exception：%s", e17.getMessage());
        }
        return false;
    }

    public static at4.a L(com.tencent.mm.plugin.luckymoney.model.h6 h6Var, org.json.JSONObject jSONObject) {
        at4.a aVar = new at4.a();
        aVar.f13795a = jSONObject.optString("retmsg");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("showmess");
        aVar.f13796b = optJSONObject.optString("left_button_wording");
        aVar.f13797c = optJSONObject.optString("right_button_wording");
        aVar.f13798d = optJSONObject.optString("right_button_url");
        if (h6Var != null) {
            jSONObject.optInt("return_to_session", 0);
        }
        return aVar;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/requestwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1575;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f145323h = jSONObject.optString("sendId");
        this.f145324i = jSONObject.optString("reqkey");
        this.f145325m = jSONObject.optString("sendMsgXml");
        jSONObject.optString("guide_flag", "0");
        jSONObject.optString("guide_wording");
        jSONObject.optString("left_button_wording", "");
        jSONObject.optString("right_button_wording", "");
        jSONObject.optString("upload_credit_url", "");
        this.f145327o = jSONObject.optString("id_sign", "");
        if (jSONObject.has("showmess")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "has alert item");
            L(this, jSONObject);
        }
    }

    public h6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.lang.String str8, int i27, int i28, java.lang.String str9, java.lang.String str10, int i29, java.lang.String str11) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str8;
        objArr[1] = java.lang.Integer.valueOf(i27);
        objArr[2] = java.lang.Integer.valueOf(i28);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[3] = str9 == null ? "" : str9;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareLuckyMoney", "NetScenePrepareLuckyMoney() uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", objArr);
        this.f145326n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i18 == 3) {
            hashMap.put("totalNum", "1");
        } else {
            hashMap.put("totalNum", i17 + "");
        }
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str5);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            hashMap.put("unique_id", str8);
        }
        hashMap.put("user_confirm_jump", java.lang.String.valueOf(i27));
        hashMap.put("unpay_type", java.lang.String.valueOf(i28));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i29);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put(dm.i4.COL_USERNAME, str3);
            if (com.tencent.mm.storage.z3.R4(str3)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str3) + "");
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
            hashMap.put("nickName", java.net.URLEncoder.encode(str6 == null ? "" : str6));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                hashMap.put("receiveNickName", java.net.URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i19 + "");
        if (i19 == 0 || i19 == 1 || i19 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            hashMap.put("showSourceMac", java.net.URLEncoder.encode(str7));
        }
        hashMap.put("exclusiveRecvUsername", str11);
        setRequestData(hashMap);
    }
}
