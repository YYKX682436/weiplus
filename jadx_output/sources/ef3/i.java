package ef3;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public ef3.d f252409d;

    public i() {
        setRequestData(new java.util.HashMap());
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 2713;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/geteuinfo";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f252409d = new ef3.d(jSONObject.toString());
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetEUInfo", e17, "", new java.lang.Object[0]);
        }
    }
}
