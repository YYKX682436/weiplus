package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class y5 extends com.tencent.mm.plugin.luckymoney.model.x5 {
    public y5(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ver", str);
        gm0.j1.i();
        hashMap.put("walletType", java.lang.String.valueOf(gm0.j1.u().c().l(339975, null)));
        hashMap.put("hasSource", "" + i17);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "20");
        hashMap.put("union_source", "0");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.storage.z3.R4(str2)) {
            hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) + "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "NetSceneLuckyMoneyGetConfigUnion request");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.x5, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/operationunionhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.x5, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4605;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.x5, com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "hongbao operation fail, errCode:" + i17 + ", errMsg:" + str);
            return;
        }
        this.f145698m = jSONObject.optInt("randomAmount");
        this.f145696h = jSONObject.optString("randomWishing");
        this.f145699n = jSONObject.optString("notice");
        this.f145700o = jSONObject.optString("notice_url");
        this.f145697i = jSONObject.optInt("hasCanShareHongBao") == 1;
        jSONObject.optInt(ya.b.CURRENCY);
        this.f145701p = 1;
        this.f145702q = jSONObject.optString("currencyUint");
        this.f145703r = jSONObject.optString("currencyWording");
        this.f145704s = jSONObject.optString("unique_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "currency=" + this.f145701p + ";currencyUint=" + this.f145702q + ";currencyWording=" + this.f145703r + ";uniqueId=" + this.f145704s);
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = new com.tencent.mm.plugin.luckymoney.model.c1();
        c1Var.f145184f = jSONObject.optString("groupHint");
        c1Var.f145185g = jSONObject.optString("personalHint");
        c1Var.f145182d = jSONObject.optInt("totalNum", 100);
        c1Var.f145183e = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("totalAmount", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f145186h = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("perPersonMaxValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f145187i = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("perGroupMaxValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f145188m = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("perMinValue", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "config.maxTotalAmount: %s, config.perPersonMaxValue: %s，config.perGroupMaxValue：%s , config.perMinValue:%s", java.lang.Double.valueOf(c1Var.f145183e), java.lang.Double.valueOf(c1Var.f145186h), java.lang.Double.valueOf(c1Var.f145187i), java.lang.Double.valueOf(c1Var.f145188m));
        c1Var.f145189n = jSONObject.optInt("payShowBGFlag");
        c1Var.f145190o = this.f145701p;
        c1Var.f145191p = this.f145702q;
        c1Var.f145192q = this.f145703r;
        c1Var.f145193r = jSONObject.optString("foreignFaqUrl");
        c1Var.f145194s = jSONObject.optString("foreignHongBaoName");
        c1Var.f145195t = jSONObject.optString("showSourceAndMac");
        c1Var.f145196u = jSONObject.optString("coverinfo");
        java.lang.String optString = jSONObject.optString("cover_jumpaction");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "cover_jumpaction: %s", optString);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                com.tencent.mm.plugin.luckymoney.model.q0 q0Var = new com.tencent.mm.plugin.luckymoney.model.q0();
                q0Var.f145550d = jSONObject2.optBoolean("is_show");
                q0Var.f145551e = jSONObject2.optString("wording");
                q0Var.f145552f = jSONObject2.optString("icon_url");
                q0Var.f145555i = jSONObject2.optString("action_app_username");
                q0Var.f145553g = jSONObject2.optInt("action_type", 0);
                q0Var.f145554h = jSONObject2.optString("action_url");
                c1Var.f145198w = q0Var;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "foreignFaqUrl: %s, foreignHongBaoName: %s", c1Var.f145193r, c1Var.f145194s);
        hb3.o.Ni().Di().i(c1Var);
        this.f145705t = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationHeader"));
        this.f145706u = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationTail"));
        this.f145707v = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationNext"));
        this.f145708w = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationMiddle"));
        int optInt = jSONObject.optInt("sceneSwitch");
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "sceneSwitch:" + optInt);
        this.f145710y = jSONObject.optInt("scenePicSwitch");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "scenePicSwitch:" + this.f145710y);
        int optInt2 = jSONObject.optInt("enableYearHbExpression");
        this.A = optInt2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableYearHbExpression:%s", java.lang.Integer.valueOf(optInt2));
        this.f145711z = jSONObject.optInt("enableSelfie");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableSelfIe:" + this.f145711z);
        this.B = jSONObject.optInt("enableNormalSelfie");
        this.C = jSONObject.optInt("enableNormalAllExpression");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableNormalSelfie:%s enableNormalAllExpression:%s", java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(this.C));
        int optInt3 = jSONObject.optInt("enableWeishiHb");
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt3));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "weishiHbSwitch:" + optInt3);
        java.lang.String optString2 = jSONObject.optString("wishing");
        this.f145709x = optString2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "wishing: %s", optString2);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson is empty!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson length:" + optJSONArray.length());
            this.D = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                com.tencent.mm.plugin.luckymoney.model.f5 f5Var = new com.tencent.mm.plugin.luckymoney.model.f5();
                f5Var.f145274a = optJSONObject.optInt("yearAmount", 0);
                f5Var.f145275b = optJSONObject.optString("yearWish");
                this.D.add(f5Var);
            }
        }
        K();
    }
}
