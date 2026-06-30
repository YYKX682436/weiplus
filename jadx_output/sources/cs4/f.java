package cs4;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f222116e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222118g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f222119h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f222120i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f222121m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f222122n;

    /* renamed from: p, reason: collision with root package name */
    public final int f222124p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f222125q;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f222115d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f222117f = 0;

    /* renamed from: o, reason: collision with root package name */
    public zr4.d f222123o = null;

    public f(com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, int i17) {
        this.f222116e = null;
        this.f222124p = 0;
        if (payInfo == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "error payinfo is null %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            this.f222116e = "";
        } else {
            this.f222116e = payInfo.f192114m;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        hashMap.put("support_cardtag3", "1");
        hashMap.put("req_key", this.f222116e);
        hashMap.put("bind_query_scene", "" + i17);
        hashMap.put("is_merge", "1");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.isRoot()) {
            hashMap.put("is_root", "0");
        } else {
            hashMap.put("is_root", "1");
        }
        if (aVar == null || !(aVar.yh() || aVar.a1())) {
            hashMap.put("is_device_open_touch", "0");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is false");
        } else {
            hashMap.put("is_device_open_touch", "1");
            java.util.Map C = aVar.C();
            if (C != null) {
                hashMap.putAll(C);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is true");
        }
        if (payInfo != null) {
            this.f222124p = payInfo.f192109e;
        }
        setPayInfo(payInfo, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.game.h.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 112;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/qrcodeusebindquery";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            this.f222125q = str;
            com.tencent.mm.plugin.wallet_core.model.Orders a17 = com.tencent.mm.plugin.wallet_core.model.Orders.a(jSONObject);
            this.f222115d = a17;
            if (a17 != null) {
                a17.f179675e = this.f222116e;
            }
            long optLong = jSONObject.optJSONObject("bindqueryresp").optLong("time_stamp");
            if (optLong > 0) {
                com.tencent.mm.wallet_core.model.f1.b("" + optLong);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "no time_stamp in qrcodeusebindquery.");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query_order_info");
            if (optJSONObject != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "get query_order_info");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14009r = optJSONObject.optInt("query_order_time", 5) * 1000;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14010s = optJSONObject.optInt("query_order_count", 0);
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14011t = optJSONObject.optString("default_query_order_wording", "");
            }
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14012u = jSONObject.optString("pay_remind_wording");
            at4.r1.k(jSONObject.optJSONObject("bindqueryresp"), this.f222124p, false, false);
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is not null");
                aVar.af();
                int G = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
                if (G == 0) {
                    if (aVar.Ic()) {
                        ((mz2.a) aVar).e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                        ((mz2.a) aVar).d(false);
                    } else if (aVar.Rb()) {
                        ((mz2.a) aVar).d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                        ((mz2.a) aVar).e(false);
                    }
                } else if (G == 1 && aVar.Ic()) {
                    ((mz2.a) aVar).e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    ((mz2.a) aVar).d(false);
                } else if (G == 2 && aVar.Rb()) {
                    ((mz2.a) aVar).d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    ((mz2.a) aVar).e(false);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is null");
            }
            if (jSONObject.has("real_name_info")) {
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("real_name_info");
                this.f222118g = optJSONObject2.optString("guide_flag");
                this.f222119h = optJSONObject2.optString("guide_wording");
                this.f222120i = optJSONObject2.optString("left_button_wording");
                this.f222121m = optJSONObject2.optString("right_button_wording");
                this.f222122n = optJSONObject2.optString("upload_credit_url");
                this.f222117f = optJSONObject2.optInt("guide_type", 0);
            }
            if (jSONObject.has("user_notify_info")) {
                this.f222123o = zr4.d.a(jSONObject.optJSONObject("user_notify_info"));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "hy: " + e17.toString());
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        int i17;
        int i18 = oVar.f213952a;
        java.lang.String str = this.f222116e;
        int i19 = this.f222124p;
        if (i18 == 0 && (i17 = oVar.f213953b) == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15000, java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15000, java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(oVar.f213953b));
        }
    }
}
