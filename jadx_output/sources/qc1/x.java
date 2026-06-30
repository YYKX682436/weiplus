package qc1;

/* loaded from: classes7.dex */
public class x extends qc1.a {
    private static final int CTRL_INDEX = 112;
    private static final java.lang.String NAME = "updateInput";

    @Override // qc1.a
    public boolean C() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        pl1.i iVar = new pl1.i();
        if (G(iVar, jSONObject, v5Var, i17)) {
            try {
                int i18 = jSONObject.getInt("inputId");
                java.lang.Integer num = iVar.f356588b;
                if (num != null && num.intValue() < 0) {
                    iVar.f356588b = 0;
                }
                java.lang.Integer num2 = iVar.f356589c;
                if (num2 != null && num2.intValue() < 0) {
                    iVar.f356589c = 0;
                }
                java.lang.Object opt = jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (opt != null && org.json.JSONObject.NULL != opt) {
                    E(i18, opt.toString());
                }
                com.tencent.mm.plugin.appbrand.widget.input.h6.c(jSONObject, iVar);
                com.tencent.mm.plugin.appbrand.widget.input.l4.c(jSONObject, iVar);
                ik1.h0.b(new qc1.w(this, v5Var, i18, iVar, i17));
            } catch (org.json.JSONException unused) {
                v5Var.a(i17, o("fail:invalid data"));
            }
        }
    }
}
