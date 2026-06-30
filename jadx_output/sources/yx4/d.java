package yx4;

/* loaded from: classes7.dex */
public final class d implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f467974a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f467975b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f467976c;

    public d(java.lang.String callbackId, java.lang.String funcName, java.lang.ref.WeakReference jsApiHandlerReference) {
        kotlin.jvm.internal.o.g(callbackId, "callbackId");
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(jsApiHandlerReference, "jsApiHandlerReference");
        this.f467974a = callbackId;
        this.f467975b = funcName;
        this.f467976c = jsApiHandlerReference;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        r45.z24 z24Var = result.f93928f;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        java.lang.String str = this.f467975b;
        sb6.append(str);
        sb6.append("] errMsg: %s, response: %s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = result.f93927e;
        objArr[1] = z24Var != null ? java.lang.Integer.valueOf(z24Var.f391634d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiTransferRequestBase", sb7, objArr);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1454L, 184L, 1L);
        nw4.g gVar = (nw4.g) this.f467976c.get();
        if (gVar == null) {
            g0Var.C(1454L, 185L, 1L);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiTransferRequestBase", "jsApiHandler is recycled");
            return;
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        java.lang.String str2 = this.f467974a;
        if (z24Var == null) {
            hashMap.put("errCode", -1);
            gVar.e(str2, str + ":fail", hashMap);
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f391634d));
        java.lang.String str3 = z24Var.f391636f;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("result", str3);
        java.util.LinkedList<r45.cw3> header = z24Var.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            kotlin.jvm.internal.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str4 = cw3Var.f371860d;
                if (!(str4 == null || str4.length() == 0)) {
                    jSONObject.put(cw3Var.f371860d, cw3Var.f371861e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f391634d == 0) {
            gVar.e(str2, str + ":ok", hashMap);
            return;
        }
        gVar.e(str2, str + ":fail " + z24Var.f391635e, hashMap);
    }
}
