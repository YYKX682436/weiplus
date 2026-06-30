package qc1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 70;
    public static final java.lang.String NAME = "hideKeyboard";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Integer num;
        try {
            num = java.lang.Integer.valueOf(jSONObject.getInt("inputId"));
        } catch (org.json.JSONException unused) {
            num = null;
        }
        ik1.h0.b(new qc1.d(this, lVar, num, i17));
    }
}
