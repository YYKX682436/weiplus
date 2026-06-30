package ss4;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.wallet_core.tenpay.model.o {
    public a0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("appid", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c));
            hashMap.put("noncestr", java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c));
            hashMap.put("package", java.net.URLEncoder.encode(str4, com.tencent.mapsdk.internal.rv.f51270c));
            hashMap.put("sign", java.net.URLEncoder.encode(str5, com.tencent.mapsdk.internal.rv.f51270c));
            setRequestData(hashMap);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fJsapiCheck", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1973;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvdlistjsapicheck";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
