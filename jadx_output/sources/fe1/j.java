package fe1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.j f261477d = new fe1.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cardInfo");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            return kz5.c1.i(new jz5.l("cardInfo", jSONObject));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCardInfo", "parse getCardInfo result error: " + e17.getMessage());
            return null;
        }
    }
}
