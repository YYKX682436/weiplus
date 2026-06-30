package ws4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f449207d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f449208e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, java.lang.String str7) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPaidOrderDetail", "do NetSceneGetPaidOrderDetail");
        this.f449207d = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : fp.s0.a(str));
        hashMap.put("timeStamp", com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str2 : fp.s0.a(str2));
        hashMap.put("nonceStr", com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : fp.s0.a(str3));
        hashMap.put("package", com.tencent.mm.sdk.platformtools.t8.K0(str4) ? str4 : fp.s0.a(str4));
        hashMap.put("reqKey", com.tencent.mm.sdk.platformtools.t8.K0(str5) ? str5 : fp.s0.a(str5));
        hashMap.put("payScene", fp.s0.a(i17 + ""));
        hashMap.put("signType", com.tencent.mm.sdk.platformtools.t8.K0(str6) ? str6 : fp.s0.a(str6));
        hashMap.put("paySign", com.tencent.mm.sdk.platformtools.t8.K0(str7) ? str7 : fp.s0.a(str7));
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return this.f449207d == 2 ? 2516 : 2570;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return this.f449207d == 2 ? 2516 : 2570;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return this.f449207d == 2 ? "/cgi-bin/mmpay-bin/tenpay/offlinegetpaidorderdetail" : "/cgi-bin/mmpay-bin/tenpay/getpaidorderdetail";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPaidOrderDetail", "errCode: " + i17 + " errMsg: " + str);
        if (jSONObject == null || !isPayEnd()) {
            return;
        }
        if (this.f449208e == null) {
            this.f449208e = new com.tencent.mm.plugin.wallet_core.model.Orders();
        }
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("payresult");
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = new com.tencent.mm.plugin.wallet_core.model.Orders.Commodity();
                commodity.f179714r = jSONObject2.getString(ya.b.TRANSACTION_ID);
                commodity.f179706g = jSONObject2.optString("sp_name");
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f449208e.f179681m)) {
                    this.f449208e.f179681m = jSONObject2.optString("fee_type");
                }
                this.f449208e.M.add(commodity);
            }
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f449208e;
        this.f449208e = orders;
        com.tencent.mm.plugin.wallet_core.model.Orders.g(jSONObject, orders);
        this.f449208e = orders;
    }
}
