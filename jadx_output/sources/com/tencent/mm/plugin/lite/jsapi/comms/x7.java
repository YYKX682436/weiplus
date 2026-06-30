package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public final class x7 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.y7 f143827a;

    public x7(com.tencent.mm.plugin.lite.jsapi.comms.y7 y7Var) {
        this.f143827a = y7Var;
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
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = result.f93927e;
        objArr[1] = z24Var != null ? java.lang.Integer.valueOf(z24Var.f391634d) : null;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiWebTransfer", "webTransfer errMsg: %s, response: %s", objArr);
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        com.tencent.mm.plugin.lite.jsapi.comms.y7 y7Var = this.f143827a;
        if (z24Var == null) {
            y7Var.f143443f.a("webTransfer: fail");
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f391634d));
        java.lang.String str = z24Var.f391636f;
        if (str == null) {
            str = "";
        }
        hashMap.put("respJson", str);
        java.util.LinkedList<r45.cw3> header = z24Var.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            kotlin.jvm.internal.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str2 = cw3Var.f371860d;
                if (!(str2 == null || str2.length() == 0)) {
                    jSONObject.put(cw3Var.f371860d, cw3Var.f371861e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        if (z24Var.f391634d == 0) {
            y7Var.f143443f.b(hashMap);
        } else {
            y7Var.f143443f.a("webTransfer: fail");
        }
    }
}
