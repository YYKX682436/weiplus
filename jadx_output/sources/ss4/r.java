package ss4;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.wallet_core.tenpay.model.o {
    public r() {
        setRequestData(new java.util.HashMap());
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return ss4.p0.f412124a.a(ss4.n0.f412107f, 1631);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1631;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return ss4.p0.f412124a.b(ss4.n0.f412107f, "/cgi-bin/mmpay-bin/tenpay/queryuserwallet");
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueryUserWallet", "errCode is : " + i17);
        if (i17 == 0) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().f243241d.A("WalletKindInfo", "delete from WalletKindInfo");
            if (jSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueryUserWallet", "resp json " + jSONObject.toString());
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("UserWalletInfoList");
            if (optJSONArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
                return;
            }
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                at4.j1 j1Var = null;
                if (optJSONObject == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletKindInfo", "json is null");
                } else {
                    at4.j1 j1Var2 = new at4.j1();
                    j1Var2.field_wallet_tpa_country = optJSONObject.optString("wallet_tpa_country");
                    j1Var2.field_wallet_name = optJSONObject.optString("wallet_name");
                    j1Var2.field_wallet_selected = optJSONObject.optInt("wallet_selected");
                    j1Var2.field_wallet_type = optJSONObject.optInt("wallet_type");
                    j1Var2.field_wallet_balance = optJSONObject.optInt("wallet_balance");
                    j1Var2.field_wallet_tpa_country_mask = optJSONObject.optInt("wallet_tpa_country_mask");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(j1Var2.field_wallet_tpa_country)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
                    } else {
                        j1Var = j1Var2;
                    }
                }
                if (j1Var != null) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().insert(j1Var);
                }
            }
        }
    }
}
