package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class x5 extends com.tencent.mm.plugin.luckymoney.model.c6 {
    public int A;
    public int B;
    public int C;
    public java.util.LinkedList D;
    public java.lang.String E;
    public java.lang.String F;
    public boolean G;
    public r45.tw4 H;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145696h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f145697i;

    /* renamed from: m, reason: collision with root package name */
    public int f145698m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145699n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145700o;

    /* renamed from: p, reason: collision with root package name */
    public int f145701p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145702q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145703r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145704s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o6 f145705t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o6 f145706u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o6 f145707v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o6 f145708w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f145709x;

    /* renamed from: y, reason: collision with root package name */
    public int f145710y;

    /* renamed from: z, reason: collision with root package name */
    public int f145711z;

    public x5() {
        this.f145710y = 0;
        this.f145711z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/operationwxhb";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if ((r1 == 1) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            r4 = this;
            gm0.j1.i()
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.m(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r3 = e42.d0.clicfg_hongbao_emoji_all_switch
            h62.d r1 = (h62.d) r1
            int r1 = r1.Ni(r3, r2)
            r3 = 1
            if (r0 != r3) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L39
            if (r1 != r3) goto L37
            r2 = r3
        L37:
            if (r2 == 0) goto L41
        L39:
            r4.B = r3
            r4.C = r3
            r4.f145711z = r3
            r4.A = r3
        L41:
            int r0 = r4.B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r4.f145711z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.A
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "MicroMsg.NetSceneLuckyMoneyGetConfig"
            java.lang.String r2 = "[localSwitch] enableNormalSelfie:%s enableNormalAllExpression:%s enableSelfie:%s enableYearHbExpression:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.x5.K():void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1554;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] hongbao operation fail, errCode:" + i17 + ", errMsg:" + str);
            return;
        }
        this.f145698m = jSONObject.optInt("randomAmount");
        this.f145696h = jSONObject.optString("randomWishing");
        this.f145699n = jSONObject.optString("notice");
        this.f145700o = jSONObject.optString("notice_url");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("notice_item");
        if (optJSONObject != null) {
            r45.tw4 tw4Var = new r45.tw4();
            this.H = tw4Var;
            tw4Var.f386831d = optJSONObject.optInt("is_show_notice", 0);
            this.H.f386832e = optJSONObject.optString("wording");
            this.H.f386834g = optJSONObject.optString("jump_url");
            this.H.f386833f = optJSONObject.optString("left_icon");
            this.H.f386835h = optJSONObject.optString("notice_id");
        }
        this.f145697i = jSONObject.optInt("hasCanShareHongBao") == 1;
        this.f145701p = jSONObject.optInt(ya.b.CURRENCY);
        this.f145702q = jSONObject.optString("currencyUint");
        this.f145703r = jSONObject.optString("currencyWording");
        this.f145704s = jSONObject.optString("unique_id");
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = new com.tencent.mm.plugin.luckymoney.model.c1();
        c1Var.f145184f = jSONObject.optString("groupHint");
        c1Var.f145185g = jSONObject.optString("personalHint");
        c1Var.f145183e = jSONObject.optLong("totalAmount", 200000L) / 100.0d;
        c1Var.f145182d = jSONObject.optInt("totalNum", 100);
        c1Var.f145186h = jSONObject.optLong("perPersonMaxValue", 20000L) / 100.0d;
        c1Var.f145187i = jSONObject.optLong("perGroupMaxValue", 20000L) / 100.0d;
        c1Var.f145188m = jSONObject.optLong("perMinValue", 1L) / 100.0d;
        c1Var.f145189n = jSONObject.optInt("payShowBGFlag");
        c1Var.f145197v = jSONObject.optBoolean("enableExclusiveHb");
        c1Var.f145190o = this.f145701p;
        c1Var.f145191p = this.f145702q;
        c1Var.f145192q = this.f145703r;
        c1Var.f145193r = jSONObject.optString("foreignFaqUrl");
        c1Var.f145194s = jSONObject.optString("foreignHongBaoName");
        c1Var.f145195t = jSONObject.optString("showSourceAndMac");
        c1Var.f145196u = jSONObject.optString("coverinfo");
        c1Var.f145199x = jSONObject.optInt("f2f_total_num", 100);
        c1Var.A = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("f2f_pay_max_amount", "200000"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f145200y = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("f2f_person_max_amount", "20000"), "100", 2, java.math.RoundingMode.HALF_UP);
        c1Var.f145201z = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("f2f_person_min_amount", "1"), "100", 2, java.math.RoundingMode.HALF_UP);
        java.lang.String optString = jSONObject.optString("cover_jumpaction");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] get cover_jumpaction: %s", optString);
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
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyGetConfig", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [foreign config] foreignFaqUrl: %s, foreignHongBaoName: %s, enableExclusiveHb: %s", c1Var.f145193r, c1Var.f145194s, java.lang.Boolean.valueOf(c1Var.f145197v));
        hb3.o.Ni().wi().i(c1Var);
        this.f145705t = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationHeader"));
        this.f145706u = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationTail"));
        this.f145707v = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationNext"));
        this.f145708w = com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationMiddle"));
        int optInt = jSONObject.optInt("sceneSwitch");
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt));
        this.f145710y = jSONObject.optInt("scenePicSwitch");
        this.A = jSONObject.optInt("enableYearHbExpression");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [newYear config 1] sceneSwitch:%s, scenePicSwitch:%s , enableYearHbExpression:%s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(this.f145710y), java.lang.Integer.valueOf(this.A));
        this.f145711z = jSONObject.optInt("enableSelfie");
        this.B = jSONObject.optInt("enableNormalSelfie");
        this.C = jSONObject.optInt("enableNormalAllExpression");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [SelfIe config] enableSelfIe:%s, enableNormalSelfie:%s enableNormalAllExpression:%s", java.lang.Integer.valueOf(this.f145711z), java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(this.C));
        int optInt2 = jSONObject.optInt("enableWeishiHb");
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt2));
        int optInt3 = jSONObject.optInt("enableLiveHb");
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_LIVE_SWITCH_INT_SYNC, java.lang.Integer.valueOf(optInt3));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [hbtype config] newYearSwitch:%s , liveHbSwitch: %s , weishiHbSwitch: %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt2));
        java.lang.String optString2 = jSONObject.optString("wishing");
        this.f145709x = optString2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [normal config 1]  wishing: %s , maxTotalAmount: %s, perPersonMaxValue: %s，perGroupMaxValue：%s , erMinValue:%s", optString2, java.lang.Double.valueOf(c1Var.f145183e), java.lang.Double.valueOf(c1Var.f145186h), java.lang.Double.valueOf(c1Var.f145187i), java.lang.Double.valueOf(c1Var.f145188m));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [normal config 2] currency: %s 、currencyUint : %s 、currencyWording: %s、uniqueId : %s", java.lang.Integer.valueOf(this.f145701p), this.f145702q, this.f145703r, this.f145704s);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] yearMessJson is empty!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[onGYNetEnd] [newYear config 2] has yearMessJson, length: " + optJSONArray.length());
            this.D = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                com.tencent.mm.plugin.luckymoney.model.f5 f5Var = new com.tencent.mm.plugin.luckymoney.model.f5();
                f5Var.f145274a = optJSONObject2.optInt("yearAmount", 0);
                f5Var.f145275b = optJSONObject2.optString("yearWish");
                f5Var.f145276c = optJSONObject2.optString("wishKeyWord");
                f5Var.f145277d = optJSONObject2.optString("pagName");
                f5Var.f145278e = optJSONObject2.optString("maskPagName");
                org.json.JSONArray optJSONArray2 = optJSONObject2.optJSONArray("cloud_words");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                        linkedList.add(optJSONArray2.optString(i19));
                    }
                    f5Var.f145279f = linkedList;
                }
                this.D.add(f5Var);
            }
        }
        this.E = jSONObject.optString("cdnFileId");
        this.F = jSONObject.optString("cdnAesKey");
        this.G = jSONObject.optBoolean("enable_year_voice", false);
        K();
    }

    public x5(int i17, java.lang.String str, int i18) {
        this(i17, str, i18, "");
    }

    public x5(int i17, java.lang.String str, int i18, java.lang.String str2) {
        int i19 = 0;
        this.f145710y = 0;
        this.f145711z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17 + "");
        hashMap.put("ver", str);
        gm0.j1.i();
        hashMap.put("walletType", java.lang.String.valueOf(gm0.j1.u().c().l(339975, null)));
        hashMap.put("hasSource", "" + i18);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.storage.z3.R4(str2)) {
            i19 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2);
            hashMap.put("chatroomUserCnt", i19 + "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "[NetSceneLuckyMoneyGetConfig] request，scene：%s chatroomUserCnt：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        setRequestData(hashMap);
    }
}
