package fe1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.b f261461d = new fe1.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            java.lang.String optString = jSONObject.optString("brandName", "");
            java.lang.String optString2 = jSONObject.optString("walletVersionCode", "");
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() > 0) {
                kotlin.jvm.internal.o.d(optString2);
                ie1.a.f290976a = optString;
                ie1.a.f290977b = optString2;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.DeviceInfo", "update, brandName=" + optString + ", walletVersionCode=" + optString2);
            }
            return kz5.c1.i(new jz5.l("brandName", optString), new jz5.l("walletVersionCode", optString2));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.JsApiCheckSupport", "parse checkSupport result error: " + e17.getMessage());
            return null;
        }
    }
}
