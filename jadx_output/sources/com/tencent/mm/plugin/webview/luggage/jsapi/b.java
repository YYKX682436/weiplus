package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.c f182262b;

    public b(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.webview.luggage.jsapi.c cVar) {
        this.f182261a = q5Var;
        this.f182262b = cVar;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        java.lang.String str;
        boolean i17 = (transferRequestInfo == null || (str = transferRequestInfo.f93914e) == null) ? false : hy4.i.i(str);
        if (!i17) {
            this.f182261a.a("interceptRequest url is not GameCenterUrl ", null);
        }
        return !i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        r45.z24 z24Var = result.f93928f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).getClass();
        jSONObject.put("h5auth", result.f93929g ? 1 : 0);
        jSONObject.put("retry", result.f93930h ? 1 : 0);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182261a;
        if (z24Var == null) {
            java.lang.String str = result.f93927e;
            q5Var.a(str == null || str.length() == 0 ? this.f182262b.f() + " failed" : result.f93927e, jSONObject);
            return;
        }
        java.lang.Object obj = z24Var.f391635e;
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("err_desc", obj);
        java.lang.Object obj2 = z24Var.f391636f;
        jSONObject.put("respJson", obj2 != null ? obj2 : "");
        java.util.LinkedList<r45.cw3> header = z24Var.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (r45.cw3 cw3Var : header) {
                java.lang.String str2 = cw3Var.f371860d;
                if ((str2 == null || str2.length() == 0) == false) {
                    jSONObject2.put(cw3Var.f371860d, cw3Var.f371861e);
                }
            }
            jSONObject.put("header", jSONObject2);
        }
        if (z24Var.f391634d == 0) {
            q5Var.a(null, jSONObject);
            return;
        }
        q5Var.a("failed " + z24Var.f391634d, jSONObject);
    }
}
