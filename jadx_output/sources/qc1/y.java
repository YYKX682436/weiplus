package qc1;

/* loaded from: classes7.dex */
public final class y extends qc1.x {
    private static final int CTRL_INDEX = 111;
    private static final java.lang.String NAME = "updateTextArea";

    @Override // qc1.x, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A((com.tencent.mm.plugin.appbrand.page.v5) lVar, jSONObject, i17);
    }

    @Override // qc1.a
    public boolean G(pl1.g gVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        pl1.i iVar = (pl1.i) gVar;
        boolean G = super.G(iVar, jSONObject, v5Var, i17);
        iVar.f356607u = java.lang.Boolean.TRUE;
        java.lang.Object opt = jSONObject.opt("confirm");
        iVar.f356608v = opt == null ? null : nf.f.b(opt);
        if (jSONObject.has("adjustKeyboardTo")) {
            iVar.C = jSONObject.optString("adjustKeyboardTo", "cursor");
        }
        return G;
    }

    @Override // qc1.x
    /* renamed from: H */
    public void A(com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super.A(v5Var, jSONObject, i17);
    }
}
