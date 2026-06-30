package ma1;

/* loaded from: classes7.dex */
public class f extends ma1.d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0091  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r12, org.json.JSONObject r13, int r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.f.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public void F(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: fail errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(i19));
        e9Var.a(i17, p(java.lang.String.format("fail: errType: %d, errCode: %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str), hashMap));
    }

    public void G(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, ta1.n0 n0Var, org.json.JSONObject jSONObject) {
        java.lang.String str2 = cVar.f325153b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            F(c0Var, i17, 1, 802, "clipped file lost");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errCode", 0);
        hashMap.put("videoPath", str2);
        c0Var.a(i17, p("ok", hashMap));
    }
}
