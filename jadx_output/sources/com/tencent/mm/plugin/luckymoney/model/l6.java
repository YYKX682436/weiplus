package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class l6 extends com.tencent.mm.plugin.luckymoney.model.c6 {
    public int A;
    public com.tencent.mm.plugin.luckymoney.model.s4 B;

    /* renamed from: J, reason: collision with root package name */
    public int f145417J;
    public java.lang.String M;
    public int N;
    public java.lang.String P;
    public com.tencent.mm.plugin.luckymoney.model.r6 Q;
    public boolean R;

    /* renamed from: h, reason: collision with root package name */
    public int f145418h;

    /* renamed from: i, reason: collision with root package name */
    public int f145419i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145420m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145421n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145422o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145424q;

    /* renamed from: r, reason: collision with root package name */
    public long f145425r;

    /* renamed from: s, reason: collision with root package name */
    public int f145426s;

    /* renamed from: t, reason: collision with root package name */
    public int f145427t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f145428u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145429v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145430w;

    /* renamed from: x, reason: collision with root package name */
    public int f145431x;

    /* renamed from: y, reason: collision with root package name */
    public int f145432y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f145433z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f145423p = false;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public java.lang.String F = null;
    public java.lang.String G = null;
    public long H = 0;
    public int I = 0;
    public int K = 0;
    public int L = 0;
    public boolean S = false;

    public l6(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
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
        hashMap.put("group_name", str4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap.put("sessionUsername", str4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "NetSceneReceiveLuckyMoney request");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/receivewxhb";
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
            if (r2 == 0) goto L3d
        L39:
            r4.L = r3
            r4.K = r3
        L3d:
            int r0 = r4.L
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.K
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.NetSceneReceiveLuckyMoney"
            java.lang.String r2 = "localSwitch() showRecNormalExpression:%s showYearExpression:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.l6.K():void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return fe1.l.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.r6 r6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145422o)) {
            this.f145423p = true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f145433z) && com.tencent.mm.sdk.platformtools.t8.K0(this.f145422o)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f145433z;
            ((sg3.a) v0Var).getClass();
            this.f145422o = c01.a2.e(str2);
        }
        com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationTail"));
        this.B = com.tencent.mm.plugin.luckymoney.model.g5.g(jSONObject.optJSONObject("new_year_cover_config"));
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
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "scenePicSwitch:" + this.I);
        this.f145417J = jSONObject.optInt("preStrainFlag", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "preStrainFlag:" + this.f145417J);
        int optInt = jSONObject.optInt("showYearExpression");
        this.K = optInt;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "showYearExpression:%s", java.lang.Integer.valueOf(optInt));
        int optInt2 = jSONObject.optInt("showRecNormalExpression");
        this.L = optInt2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "showRecNormalExpression:%s", java.lang.Integer.valueOf(optInt2));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, java.lang.Integer.valueOf(this.f145417J));
        this.P = jSONObject.optString("timingIdentifier");
        jSONObject.optString("effectResource");
        this.R = jSONObject.optBoolean("enable_set_status", false);
        this.M = jSONObject.optString("expression_md5");
        this.N = jSONObject.optInt("expression_type");
        this.A = jSONObject.optInt("not_show_avatar", 0);
        this.S = jSONObject.optBoolean("others_can_visit_normal_hb_detail", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReceiveLuckyMoney", "[onGYNetEnd] expressionmd5:%s、expressiontype:%s、enableSetStatus:%s、canVisitNormalDetail: %s", this.M, java.lang.Integer.valueOf(this.N), java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(this.S));
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

    public l6() {
    }
}
