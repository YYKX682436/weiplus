package nf1;

/* loaded from: classes7.dex */
public final class b implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf1.c f336643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f336644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f336645c;

    public b(nf1.c cVar, int i17, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f336643a = cVar;
        this.f336644b = i17;
        this.f336645c = c0Var;
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
        nf1.c cVar = this.f336643a;
        java.lang.String C = cVar.C();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        int i17 = this.f336644b;
        sb6.append(i17);
        sb6.append("] errMsg: ");
        sb6.append(result.f93927e);
        sb6.append(", response: ");
        sb6.append(z24Var != null ? z24Var.f391634d : -1);
        com.tencent.mars.xlog.Log.i(C, sb6.toString());
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).a(hashMap, result);
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f336645c;
        if (z24Var == null) {
            hashMap.put("errCode", -1);
            cVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", -1);
            c0Var.a(i17, cVar.t("fail", hashMap));
            return;
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(z24Var.f391634d));
        java.lang.String str2 = z24Var.f391636f;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("result", str2);
        java.util.LinkedList<r45.cw3> header = z24Var.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        if (!header.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            kotlin.jvm.internal.o.f(header, "header");
            for (r45.cw3 cw3Var : header) {
                java.lang.String str3 = cw3Var.f371860d;
                if (!(str3 == null || str3.length() == 0)) {
                    jSONObject.put(cw3Var.f371860d, cw3Var.f371861e);
                }
            }
            hashMap.put("header", jSONObject);
        }
        int i18 = z24Var.f391634d;
        if (i18 == 0) {
            cVar.getClass();
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            c0Var.a(i17, cVar.t("ok", hashMap));
            return;
        }
        java.lang.String str5 = "fail " + z24Var.f391635e;
        cVar.getClass();
        java.lang.String str6 = str5 != null ? str5 : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", java.lang.Integer.valueOf(i18));
        c0Var.a(i17, cVar.t(str6, hashMap));
    }
}
