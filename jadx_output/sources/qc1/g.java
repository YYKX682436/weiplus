package qc1;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.widget.input.v3 {
    public final /* synthetic */ java.lang.ref.WeakReference G;
    public final /* synthetic */ int H;
    public final /* synthetic */ java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ qc1.i f361466J;

    public g(qc1.i iVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f361466J = iVar;
        this.G = weakReference;
        this.H = i17;
        this.I = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void u(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.G.get();
        if (v5Var == null) {
            return;
        }
        try {
            int i17 = this.f91611p;
            qc1.u uVar = new qc1.u();
            uVar.f82374f = new org.json.JSONObject().put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str)).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f361466J.F(i17)).put("cursor", 0).put("inputId", i17).put("keyCode", 8).toString();
            v5Var.i(uVar, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertTextArea", "onBackspacePressedWhileValueNoChange, e = %s", e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void v(java.lang.String str, int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            try {
                java.lang.String jSONObject = new org.json.JSONObject().put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str)).put("inputId", this.f91611p).put("cursor", i17).toString();
                if (z17) {
                    ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).g("onKeyboardConfirm", jSONObject);
                }
                if (!z18) {
                    ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).g("onKeyboardComplete", jSONObject);
                }
            } catch (org.json.JSONException e17) {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertTextArea", "dispatch input done, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            if (z18 || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null || v5Var.a2() == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void x() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            int i17 = this.f91611p;
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("inputId", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            qc1.i iVar = this.f361466J;
            v5Var.a(this.H, iVar.p("ok", hashMap));
            iVar.E(i17, this.I);
            iVar.D(i17, (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void y() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).a(this.H, this.f361466J.o("fail"));
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            if (v5Var == null || v5Var.a2() == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
        }
    }
}
