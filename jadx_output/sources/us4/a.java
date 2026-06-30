package us4;

/* loaded from: classes9.dex */
public class a extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f430573d;

    public a() {
        this("", true);
    }

    @Override // op5.a
    public int H() {
        return 1;
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard I(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard(1);
        bankcard.O2 = jSONObject.optInt("avail_balance") / 100.0d;
        bankcard.Q2 = jSONObject.optInt("fetch_balance") / 100.0d;
        bankcard.field_bankcardType = jSONObject.optString("balance_bank_type");
        bankcard.field_bindSerial = jSONObject.optString("balance_bind_serial");
        bankcard.field_forbidWord = jSONObject.optString("balance_forbid_word");
        bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kmd);
        bankcard.field_cardType |= 8;
        return bankcard;
    }

    public final java.util.ArrayList J(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                jSONObject.put("extra_bind_flag", "NORMAL");
                if (ct4.a.f222304b == null) {
                    ct4.a.f222304b = new ct4.a();
                }
                arrayList.add(ct4.a.f222304b.c(jSONObject));
            }
        }
        return arrayList;
    }

    public final at4.v1 K(org.json.JSONObject jSONObject) {
        at4.v1 v1Var = new at4.v1();
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        v1Var.field_is_reg = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("is_reg"), 0);
        v1Var.field_true_name = jSONObject.optString("true_name");
        v1Var.field_main_card_bind_serialno = jSONObject.optString("main_card_bind_serialno");
        v1Var.field_ftf_pay_url = jSONObject.optString("transfer_url");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().D(v1Var.field_main_card_bind_serialno);
        return v1Var;
    }

    @Override // op5.a, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return super.doScene(sVar, u0Var);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (i17 != 0) {
            return;
        }
        try {
            long optLong = jSONObject.optLong("time_stamp");
            if (optLong > 0) {
                com.tencent.mm.wallet_core.model.f1.b("" + optLong);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
            }
            at4.v1 K = K(jSONObject.getJSONObject("user_info"));
            K.field_switchConfig = jSONObject.getJSONObject("switch_info").getInt("switch_bit");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().C(K, J(jSONObject.optJSONArray("Array")), null, I(jSONObject.optJSONObject("balance_info")), null, null, null, null, 0, 0, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetScenePayUQueryBoundBankcard", e17, "", new java.lang.Object[0]);
        }
        if (!this.f430573d || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            return;
        }
        this.callback.onSceneEnd(1000, -100869, "", this);
        this.isChildConsume = true;
    }

    public a(java.lang.String str, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("req_key", str);
        setRequestData(hashMap);
        this.f430573d = z17;
    }
}
