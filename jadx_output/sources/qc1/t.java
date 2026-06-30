package qc1;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.widget.input.q0 {
    public final /* synthetic */ java.lang.ref.WeakReference G;
    public final /* synthetic */ int H;
    public final /* synthetic */ java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ qc1.v f361498J;

    public t(qc1.v vVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f361498J = vVar;
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
            uVar.f82374f = new org.json.JSONObject().put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str)).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f361498J.F(i17)).put("cursor", 0).put("inputId", i17).put("keyCode", 8).toString();
            v5Var.i(uVar, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowKeyboard", "onBackspacePressedWhileValueNoChange, e = %s", e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void v(java.lang.String str, int i17, boolean z17, boolean z18) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) weakReference.get();
        if (lVar == null) {
            return;
        }
        try {
            str2 = new org.json.JSONObject().put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str)).put("inputId", this.f91611p).put("cursor", i17).toString();
        } catch (org.json.JSONException e17) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            str2 = null;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (z17) {
                lVar.g("onKeyboardConfirm", str2);
            }
            if (!z18) {
                lVar.g("onKeyboardComplete", str2);
            }
        }
        if (z18 || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null || v5Var.a2() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void w(java.lang.String str, int i17, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) weakReference.get();
        if (lVar == null) {
            return;
        }
        java.lang.String str4 = null;
        try {
            org.json.JSONObject put = new org.json.JSONObject().put("value", com.tencent.mm.plugin.appbrand.utils.s0.d(str)).put("inputId", this.f91611p).put("cursor", i17);
            if (str2 != null) {
                put.put("encryptValue", str2);
            }
            if (str3 != null) {
                put.put("encryptError", str3);
            }
            str4 = put.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowKeyboard", "onInputDoneWithEncryptedValue, eventData: %s", str4);
        } catch (org.json.JSONException e17) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            if (z17) {
                lVar.g("onKeyboardConfirm", str4);
            }
            if (!z18) {
                lVar.g("onKeyboardComplete", str4);
            }
        }
        if (z18 || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null || v5Var.a2() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void x() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            int i17 = this.f91611p;
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("inputId", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            qc1.v vVar = this.f361498J;
            v5Var.a(this.H, vVar.p("ok", hashMap));
            vVar.E(i17, this.I);
            vVar.D(i17, (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get());
            vVar.L((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get(), i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void y() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).a(this.H, this.f361498J.o("fail"));
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            if (v5Var == null || v5Var.a2() == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
        }
    }
}
