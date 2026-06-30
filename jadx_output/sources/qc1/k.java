package qc1;

/* loaded from: classes7.dex */
public final class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 119;
    private static final java.lang.String NAME = "removeTextArea";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        try {
            ik1.h0.b(new qc1.j(this, new java.lang.ref.WeakReference(v5Var), jSONObject.getInt("inputId"), i17));
        } catch (org.json.JSONException unused) {
            v5Var.a(i17, o("fail:invalid data"));
        }
    }
}
