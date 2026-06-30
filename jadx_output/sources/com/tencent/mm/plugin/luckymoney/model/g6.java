package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class g6 extends com.tencent.mm.plugin.luckymoney.model.f6 {
    public g6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f145281i = str;
        this.f145282m = str2;
        this.f145283n = str5;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i18 + "");
        hashMap.put("sendId", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str3));
            hashMap.put("nickName", java.net.URLEncoder.encode(str4 == null ? "" : str4));
        }
        hashMap.put("sessionUserName", str5);
        hashMap.put("ver", str6);
        hashMap.put("timingIdentifier", str7);
        hashMap.put("union_source", "0");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            hashMap.put("left_button_continue", str8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "NetSceneOpenLuckyMoneyUnion request，left_button_continue：%s", str8);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.f6, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/openunionhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.f6, com.tencent.mm.modelbase.m1
    public int getType() {
        return 5148;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.f6, com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        try {
            this.f145280h = com.tencent.mm.plugin.luckymoney.model.g5.d(jSONObject);
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch a17 = com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch.a(jSONObject);
            this.f145287r = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "luckyMoneyEmojiSwitch:%s", a17.toString());
            this.f145288s = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f145289t = optInt;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "expressionmd5:%s expressiontype:%s", this.f145288s, java.lang.Integer.valueOf(optInt));
            if (i17 == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
                java.lang.String optString = optJSONObject.optString("guide_flag");
                java.lang.String optString2 = optJSONObject.optString("guide_wording");
                java.lang.String optString3 = optJSONObject.optString("left_button_wording");
                java.lang.String optString4 = optJSONObject.optString("right_button_wording");
                java.lang.String optString5 = optJSONObject.optString("upload_credit_url");
                com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                this.f145285p = realnameGuideHelper;
                realnameGuideHelper.d(optString, optString2, optString3, optString4, optString5, 1003);
            }
            if (jSONObject.has("intercept_win")) {
                this.f145290u = com.tencent.mm.plugin.wallet_core.utils.n.a(jSONObject.optJSONObject("intercept_win"));
            }
            if (jSONObject.has("left_button_continue")) {
                this.f145292w = jSONObject.optString("left_button_continue");
            }
            this.f145284o = jSONObject.optString("SystemMsgContext");
            int optInt2 = jSONObject.optInt("showYearExpression");
            this.f145286q = optInt2;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "showYearExpression:%s", java.lang.Integer.valueOf(optInt2));
            if (i17 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f145284o) && !c01.e2.L(this.f145283n)) {
                try {
                    com.tencent.mm.plugin.luckymoney.model.m5.q(this.f145284o, this.f145283n);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneOpenLuckyMoneyUnion", "insertLocalSysMsgIfNeed error: %s", e17.getMessage());
                }
            }
            K();
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneOpenLuckyMoneyUnion", "parse luckyMoneyDetail fail: " + e18.getLocalizedMessage());
        }
    }
}
