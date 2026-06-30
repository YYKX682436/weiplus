package wo3;

/* loaded from: classes9.dex */
public class g extends wo3.h {
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("buss_type", str);
        hashMap.put(ya.b.METHOD, str2);
        hashMap.put("network", com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : com.tencent.mars.comm.NetStatusUtil.isWap(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wap" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.eclipsesource.mmv8.Platform.UNKNOWN);
        hashMap.put("transactionid", str3);
        setRequestData(hashMap);
    }

    @Override // wo3.h
    public int getFuncId() {
        return 1602;
    }

    @Override // wo3.h
    public int getTenpayCgicmd() {
        return 122;
    }

    @Override // wo3.h
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/datareport";
    }

    @Override // wo3.h
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
