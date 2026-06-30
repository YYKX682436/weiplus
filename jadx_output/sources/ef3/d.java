package ef3;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252405a;

    public d(java.lang.String str) {
        this.f252405a = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jSONObject.optString("eu_protocol_url");
            jSONObject.optInt("0");
            this.f252405a = jSONObject.optString("wxpay_protocol_url");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MciroMsg.EUInfo", e17, "", new java.lang.Object[0]);
        }
    }
}
