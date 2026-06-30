package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class f6 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.e1 f145280h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145281i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145282m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145283n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145284o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f145285p;

    /* renamed from: q, reason: collision with root package name */
    public int f145286q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch f145287r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145288s;

    /* renamed from: t, reason: collision with root package name */
    public int f145289t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n f145290u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145291v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145292w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.s4 f145293x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f145294y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f145295z;

    public f6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this(i17, i18, str, str2, str3, str4, str5, str6, str7, "");
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/openwxhb";
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
            if (r2 == 0) goto L50
        L39:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145287r
            if (r0 != 0) goto L44
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch
            r0.<init>()
            r4.f145287r = r0
        L44:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145287r
            r0.f145153d = r3
            r0.f145154e = r3
            r0.f145155f = r3
            r0.f145156g = r3
            r4.f145286q = r3
        L50:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145287r
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.NetSceneOpenLuckyMoney"
            java.lang.String r2 = "localSwitch() luckyMoneyEmojiSwitch:%s "
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.f6.K():void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1685;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String e17;
        org.json.JSONObject optJSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        try {
            this.f145280h = com.tencent.mm.plugin.luckymoney.model.g5.d(jSONObject);
            this.f145293x = com.tencent.mm.plugin.luckymoney.model.g5.g(jSONObject.optJSONObject("new_year_cover_config"));
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch a17 = com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch.a(jSONObject);
            this.f145287r = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoney", "luckyMoneyEmojiSwitch:%s", a17.toString());
            this.f145288s = jSONObject.optString("expression_md5");
            this.f145289t = jSONObject.optInt("expression_type");
            this.f145295z = jSONObject.optBoolean("enable_set_status", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoney", "expressionmd5:%s expressiontype:%s enableSetStatus:%s", this.f145288s, java.lang.Integer.valueOf(this.f145289t), java.lang.Boolean.valueOf(this.f145295z));
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
            if (jSONObject.has("intercept_win_after")) {
                this.f145291v = jSONObject.optJSONObject("intercept_win_after").toString();
            }
            if (jSONObject.has("left_button_continue")) {
                this.f145292w = jSONObject.optString("left_button_continue");
            }
            if (jSONObject.has("half_page_info")) {
                this.f145294y = jSONObject.optString("half_page_info");
            }
            this.f145284o = jSONObject.optString("SystemMsgContext");
            int optInt = jSONObject.optInt("showYearExpression");
            this.f145286q = optInt;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoney", "showYearExpression:%s", java.lang.Integer.valueOf(optInt));
            if (i17 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f145284o) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f145280h.Q) && !c01.e2.L(this.f145283n)) {
                try {
                    if (c01.z1.r().equals(this.f145280h.Q)) {
                        e17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492444go1);
                    } else {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String str2 = this.f145280h.Q;
                        ((sg3.a) v0Var).getClass();
                        e17 = c01.a2.e(str2);
                    }
                    java.lang.String replace = this.f145284o.replace("$" + this.f145280h.Q + "$", e17);
                    this.f145284o = replace;
                    com.tencent.mm.plugin.luckymoney.model.m5.q(replace, this.f145283n);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneOpenLuckyMoney", "insertLocalSysMsgIfNeed error: %s", e18.getMessage());
                }
            }
            K();
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneOpenLuckyMoney", "parse luckyMoneyDetail fail: " + e19.getLocalizedMessage());
        }
    }

    public f6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f145280h = null;
        this.f145286q = 0;
        this.f145291v = "";
        this.f145292w = "";
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
        hashMap.put("left_button_continue", str8);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLuckyMoney", "NetSceneOpenLuckyMoney request");
        setRequestData(hashMap);
    }

    public f6() {
        this.f145280h = null;
        this.f145286q = 0;
        this.f145291v = "";
        this.f145292w = "";
    }
}
