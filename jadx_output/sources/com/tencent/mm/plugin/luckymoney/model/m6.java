package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class m6 extends com.tencent.mm.plugin.luckymoney.model.l6 {
    public m6(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3) {
        this.f145418h = i17;
        this.f145419i = i18;
        this.f145420m = str;
        this.f145421n = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i18 + "");
        hashMap.put("sendId", str);
        hashMap.put("inWay", i19 + "");
        hashMap.put("ver", str3);
        hashMap.put("union_source", "0");
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            if (java.lang.System.currentTimeMillis() < longValue) {
                hashMap.put("agreeDuty", "0");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, 1));
                sb6.append("");
                hashMap.put("agreeDuty", sb6.toString());
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "NetSceneReceiveLuckyMoneyUnion request");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.l6, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/receiveunionhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.l6, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4536;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.l6, com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.r6 r6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f145422o = jSONObject.optString("sendNick");
        this.f145424q = jSONObject.optString("sendHeadImg");
        this.f145426s = jSONObject.optInt("hbStatus");
        this.f145427t = jSONObject.optInt("receiveStatus");
        this.f145428u = jSONObject.optString("statusMess");
        this.f145430w = jSONObject.optString("wishing");
        this.f145431x = jSONObject.optInt("isSender");
        this.f145425r = jSONObject.optLong("sceneAmount");
        jSONObject.optLong("sceneRecTimeStamp");
        this.f145432y = jSONObject.optInt("hbType");
        jSONObject.optString("watermark");
        this.f145429v = jSONObject.optString("externMess");
        this.f145433z = jSONObject.optString("sendUserName");
        com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationTail"));
        this.I = jSONObject.optInt("scenePicSwitch");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject != null) {
            this.C = optJSONObject.optString("agreed_flag", "-1");
            this.D = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            this.E = optJSONObject.optString("service_protocol_wording", "");
            this.F = optJSONObject.optString("service_protocol_url", "");
            this.G = optJSONObject.optString("button_wording", "");
            this.H = optJSONObject.optLong("delay_expired_time", 0L);
        }
        if (this.H > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (this.H * 1000)));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "scenePicSwitch:" + this.I);
        this.f145417J = jSONObject.optInt("preStrainFlag", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "preStrainFlag:" + this.f145417J);
        int optInt = jSONObject.optInt("showYearExpression");
        this.K = optInt;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "showYearExpression:%s", java.lang.Integer.valueOf(optInt));
        int optInt2 = jSONObject.optInt("showRecNormalExpression");
        this.L = optInt2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "showRecNormalExpression:%s", java.lang.Integer.valueOf(optInt2));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, java.lang.Integer.valueOf(this.f145417J));
        this.P = jSONObject.optString("timingIdentifier");
        jSONObject.optString("effectResource");
        this.M = jSONObject.optString("expression_md5");
        int optInt3 = jSONObject.optInt("expression_type");
        this.N = optInt3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "expressionmd5:%s expressiontype:%s", this.M, java.lang.Integer.valueOf(optInt3));
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("showSourceRec");
        if (optJSONObject2 == null) {
            r6Var = null;
        } else {
            com.tencent.mm.plugin.luckymoney.model.r6 r6Var2 = new com.tencent.mm.plugin.luckymoney.model.r6();
            r6Var2.f145593a = com.tencent.mm.plugin.luckymoney.model.g5.b(optJSONObject2);
            r6Var = r6Var2;
        }
        this.Q = r6Var;
        K();
    }
}
