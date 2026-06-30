package md3;

/* loaded from: classes4.dex */
public final class q extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "openEcsJumpInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 param) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(param, "param");
        java.lang.String optString = param.optString("ecsJumpInfo", "");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("MBJsApiOpenEcsJumpInfo", "error: ecsJumpInfo is empty");
            s().invoke(j(lc3.x.f317937d, "ecsJumpInfo is empty"));
            return;
        }
        java.lang.String optString2 = param.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        com.tencent.mars.xlog.Log.i("MBJsApiOpenEcsJumpInfo", "jump, ecsJumpInfo: " + optString + ", extraData: " + optString2);
        kotlin.jvm.internal.o.d(optString2);
        org.json.JSONObject jSONObject = null;
        if (optString2.length() > 0) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                jSONObject2.put("nativeExtraData", new org.json.JSONObject(jSONObject2.toString()));
                jSONObject = jSONObject2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBJsApiOpenEcsJumpInfo", "failed to parse extraData: " + e17);
            }
        }
        lc3.e eVar = this.f317890a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        pq.a aVar = new pq.a(context);
        aVar.b(jSONObject);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q.se((pq.q) c17, aVar, optString, null, 4, null);
        s().invoke(k());
    }
}
