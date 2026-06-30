package fe1;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.g f261472d = new fe1.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            return optJSONObject != null ? kz5.c1.i(new jz5.l("cplc", optJSONObject.optString("cplc", "")), new jz5.l("seid", optJSONObject.optString("seid", "")), new jz5.l("walletVersionCode", optJSONObject.optString("walletVersionCode", ""))) : kz5.c1.i(new jz5.l("cplc", jSONObject.optString("cplc", "")), new jz5.l("seid", jSONObject.optString("seid", "")), new jz5.l("walletVersionCode", jSONObject.optString("walletVersionCode", "")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCPLC", "parse getCPLC result error: " + e17.getMessage());
            return null;
        }
    }
}
