package zd;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "logInJava";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        try {
            int i18 = jSONObject.getInt(ya.b.LEVEL);
            java.lang.String string = jSONObject.getString("logs");
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogInJava", string);
            } else if (i18 == 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLogInJava", string);
            } else if (i18 == 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogInJava", string);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogInJava", e17.toString());
        }
    }
}
