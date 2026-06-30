package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class rc extends com.tencent.mm.plugin.webview.ui.tools.newjsapi.oc {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f186500c;

    public rc(java.lang.String str) {
        super(str);
        this.f186500c = new java.util.ArrayList();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f186416a = true;
            }
            org.json.JSONArray jSONArray = str != null ? new org.json.JSONArray(str) : null;
            if (jSONArray != null) {
                c75.c.d(jSONArray, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.pc(this));
            }
        } catch (java.lang.RuntimeException e17) {
            this.f186417b = true;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "CustomData: RuntimeException, e = " + e17.getMessage());
        } catch (org.json.JSONException e18) {
            this.f186417b = true;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "CustomData: JSONException, e = " + e18.getMessage());
        }
    }

    public boolean a() {
        if (!this.f186416a) {
            return true;
        }
        if (this.f186417b) {
            return false;
        }
        for (com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc qcVar : this.f186500c) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(qcVar.f186461a) || com.tencent.mm.sdk.platformtools.t8.K0(qcVar.f186463c) || qcVar.f186464d == null) {
                return false;
            }
        }
        return true;
    }
}
