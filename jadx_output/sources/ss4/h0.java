package ss4;

/* loaded from: classes9.dex */
public class h0 extends ss4.e0 {
    public ss4.m0 E;

    @Override // ss4.e0, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 2750;
    }

    @Override // ss4.e0, com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 2750;
    }

    @Override // ss4.e0, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/savebindquery";
    }

    @Override // ss4.e0, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("save_to_lqt_entry");
        if (optJSONObject != null) {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC, optJSONObject.toString());
            this.E = ss4.m0.a(optJSONObject);
        } else {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC, "");
            this.E = null;
        }
    }
}
