package qc1;

/* loaded from: classes7.dex */
public final class i extends qc1.v {
    public static final int CTRL_INDEX = 110;
    public static final java.lang.String NAME = "insertTextArea";

    @Override // qc1.v, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A((com.tencent.mm.plugin.appbrand.page.v5) lVar, jSONObject, i17);
    }

    @Override // qc1.v
    public void H(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        q0Var.f91603e = new qc1.f(this, q0Var);
    }

    @Override // qc1.v
    public com.tencent.mm.plugin.appbrand.widget.input.q0 I(java.lang.ref.WeakReference weakReference, java.lang.String str, int i17) {
        return new qc1.g(this, weakReference, i17, str);
    }

    @Override // qc1.v
    /* renamed from: K */
    public void A(com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super.A(v5Var, jSONObject, i17);
    }

    @Override // qc1.v
    public boolean M(pl1.f fVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        if (!super.M(fVar, jSONObject, v5Var, i17)) {
            return false;
        }
        fVar.f356607u = java.lang.Boolean.TRUE;
        fVar.R = "textarea";
        fVar.S = false;
        fVar.T = false;
        fVar.f356608v = java.lang.Boolean.valueOf(jSONObject.optBoolean("confirm", true));
        fVar.G = java.lang.Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        fVar.C = jSONObject.optString("adjustKeyboardTo", "cursor");
        return true;
    }
}
