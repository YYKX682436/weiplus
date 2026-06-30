package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.wallet_core.tenpay.model.o {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public com.tencent.mm.plugin.wallet_core.utils.n E;
    public com.tencent.mm.plugin.remittance.model.BusiRemittanceResp F;
    public java.lang.String H;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f156988d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f156989e;

    /* renamed from: f, reason: collision with root package name */
    public double f156990f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156991g;

    /* renamed from: h, reason: collision with root package name */
    public int f156992h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156993i;

    /* renamed from: q, reason: collision with root package name */
    public int f156998q;

    /* renamed from: t, reason: collision with root package name */
    public int f157001t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f157002u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f157003v;

    /* renamed from: w, reason: collision with root package name */
    public int f157004w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f157005x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f157006y;

    /* renamed from: z, reason: collision with root package name */
    public int f157007z;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156994m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f156995n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f156996o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f156997p = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156999r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f157000s = "";
    public boolean G = false;

    public r0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, int i18, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("transfer_url", java.net.URLEncoder.encode(str));
        if (str2 != null && str2.length() > 0) {
            hashMap.put("qq_extend_info", java.net.URLEncoder.encode(str2));
        }
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("channel", i17 + "");
        hashMap2.put("qrcode_sender_username", str3);
        hashMap2.put("user_wallet_region", ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() + "");
        hashMap2.put("chat_msg_svr_id", j17 + "");
        hashMap2.put("chat_msg_type", i18 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap2.put("chat_user_name", str4);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            hashMap2.put("msg_sender_name", str5);
        }
        setWXRequestData(hashMap2);
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceGetUsername", "[NetSceneTenpayRemittanceGetUsername] transferUrl: %s, msgSvrId: %s. username:%s ,chatType:%s, msg_sender_name:%s", str, java.lang.Long.valueOf(j17), str4, java.lang.Integer.valueOf(i18), str5);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1515;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/transferscanqrcode";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            jSONObject.toString();
            this.f156988d = jSONObject.optString("user_name", "");
            this.f156989e = jSONObject.optString("true_name");
            this.f156990f = jSONObject.optDouble("fee") / 100.0d;
            this.f156991g = jSONObject.optString("desc");
            this.f156992h = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f156993i = java.net.URLEncoder.encode(jSONObject.optString("transfer_qrcode_id"));
            this.f156994m = jSONObject.optString("f2f_pay_desc");
            this.f156995n = jSONObject.optString("rcvr_desc");
            this.f156996o = jSONObject.optString("payer_desc");
            this.f156997p = jSONObject.optString("rcvr_ticket");
            this.f156998q = jSONObject.optInt("busi_type", 0);
            this.f156999r = jSONObject.optString("mch_name");
            this.f157000s = jSONObject.optString("mch_photo");
            this.f157003v = jSONObject.optString("mch_type", "");
            this.f157001t = jSONObject.optInt("mch_time", 0);
            this.f157002u = jSONObject.optString("receiver_openid");
            this.f157004w = jSONObject.optInt("get_pay_wifi");
            this.f157006y = jSONObject.optString("receiver_true_name");
            this.f157005x = jSONObject.optString("mch_info_string");
            this.f157007z = jSONObject.optInt("amount_remind_bit");
            this.A = jSONObject.optInt("action_type");
            this.B = jSONObject.optInt("retcode");
            this.C = jSONObject.optString("jump_url");
            this.D = jSONObject.optString("jump_route_info");
            if (jSONObject.has("intercept_win")) {
                this.E = com.tencent.mm.plugin.wallet_core.utils.n.a(jSONObject.optJSONObject("intercept_win"));
            }
            this.G = jSONObject.optBoolean("payer_desc_required", false);
            this.H = jSONObject.optString("payer_desc_placeholder");
            this.F = new com.tencent.mm.plugin.remittance.model.BusiRemittanceResp(jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceGetUsername", e17, "", new java.lang.Object[0]);
        }
    }
}
