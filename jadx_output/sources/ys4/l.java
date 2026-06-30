package ys4;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.wallet_core.tenpay.model.o {
    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put("user_country", str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("user_province", str2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("user_city", str3);
        }
        if (profession != null) {
            hashMap.put("profession_name", profession.f179421d);
            hashMap.put("profession_type", java.lang.String.valueOf(profession.f179422e));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap.put("nationality", str4);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1978;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1978;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/setuserexinfo";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpaySetUserExInfo", "errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), str);
    }
}
