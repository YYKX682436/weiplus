package wo3;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.tenpay.model.o {
    public n(int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("residue_num", "" + i17);
        hashMap.put("entry_scene", i18 + "");
        hashMap.put("is_snapshot", i19 + "");
        hashMap.put("user_view_digit", i27 + "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        gm0.j1.i();
        sb6.append(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb6.toString());
        hashMap.put("card_id", yo3.m.f464164k);
        hashMap.put("user_card_id", yo3.m.f464165l);
        hashMap.put("card_code", yo3.m.f464166m);
        hashMap.put("ext_business_attach", str);
        hashMap.put("is_new_authcodes", str2);
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.field_bindSerial);
            hashMap.put("prefer_bank_type", a17.field_bankcardType);
        }
        setRequestData(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "hy: residue_num == %d, entryscene = %d,is_snapshot = %d, user_view_digit: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1645;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 102;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineshowcode";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "onGynetEnd %s %s", java.lang.Integer.valueOf(i17), str);
    }
}
