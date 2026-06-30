package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class v5 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.e1 f145665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145666i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145667m;

    /* renamed from: n, reason: collision with root package name */
    public int f145668n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch f145669o;

    public v5() {
        this.f145665h = null;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/qrydetailwxhb";
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
            if (r2 == 0) goto L4e
        L39:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145669o
            if (r0 != 0) goto L44
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch
            r0.<init>()
            r4.f145669o = r0
        L44:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145669o
            r0.f145153d = r3
            r0.f145154e = r3
            r0.f145155f = r3
            r0.f145156g = r3
        L4e:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f145669o
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.NetSceneLuckyMoneyDetail"
            java.lang.String r2 = "localSwitch() luckyMoneyEmojiSwitch:%s "
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.v5.K():void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.u6.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        try {
            this.f145665h = com.tencent.mm.plugin.luckymoney.model.g5.d(jSONObject);
            this.f145666i = jSONObject.optString("processContent");
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch a17 = com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch.a(jSONObject);
            this.f145669o = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "luckyMoneyEmojiSwitch:%s", a17.toString());
            this.f145667m = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f145668n = optInt;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "expressionmd5:%s expressiontype:%s", this.f145667m, java.lang.Integer.valueOf(optInt));
            K();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + e17.getLocalizedMessage());
        }
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this(str, i17, i18, str2, str3, "", "");
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
        this.f145665h = null;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f145665h = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            hashMap.put("receiveId", str5);
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        setRequestData(hashMap);
    }
}
