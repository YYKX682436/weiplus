package fe1;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str) {
        super(1);
        this.f261483d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("cards");
            }
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.JsApiGetCardList", "getCardList, issuerID=" + this.f261483d + ", result=" + optJSONArray.length());
            return kz5.c1.i(new jz5.l("cards", optJSONArray));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCardList", "parse getCardList result error: " + e17.getMessage());
            return null;
        }
    }
}
