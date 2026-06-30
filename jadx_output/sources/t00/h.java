package t00;

/* loaded from: classes9.dex */
public final class h extends t00.b {
    public h() {
        super(bw5.ef0.class);
    }

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.F;
    }

    @Override // t00.r0
    public void e(int i17, org.json.JSONObject data, org.json.JSONObject jSONObject, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        super.e(i17, data, jSONObject, envHandler);
        java.lang.String optString = jSONObject != null ? jSONObject.optString("h5ReqId") : null;
        if (optString == null) {
            optString = "";
        }
        if (optString.length() > 0) {
            z20.e eVar = z20.e.f469543e;
            z20.b bVar = new z20.b();
            bVar.f469537a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f31999d = "commonCgi";
            q9Var.f32013u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f469538b = q9Var;
            bVar.c("Native_cbOnSubProcess");
            bVar.f(optString);
            bVar.f469538b.f32012t.add("Native");
            bVar.a();
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        java.lang.String optString = data.optString("h5ReqId");
        if (optString == null) {
            optString = "";
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        org.json.JSONObject jSONObject = null;
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonCgiEcsActionHandler", "prepareEnvData params is null");
        } else {
            com.tencent.mm.protobuf.f h17 = h(context, optJSONObject, envHandler);
            if (h17 != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String encodeToString = android.util.Base64.encodeToString(h17.toByteArray(), 2);
                if (!(encodeToString == null || encodeToString.length() == 0)) {
                    jSONObject2.put("mmModel", encodeToString);
                    data.remove("params");
                    jSONObject = jSONObject2;
                }
            }
        }
        if (jSONObject != null) {
            jSONObject.put("h5ReqId", optString);
        }
        return jSONObject;
    }

    @Override // t00.b
    public com.tencent.mm.protobuf.f h(android.content.Context context, org.json.JSONObject jSONObject, c00.q3 q3Var) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("reqName") : null;
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("reqParams") : null;
        if (optString2 == null) {
            optString2 = "";
        }
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString(ya.b.METHOD) : null;
        java.lang.String str = optString3 != null ? optString3 : "";
        if (!(optString.length() == 0)) {
            if (!(optString2.length() == 0)) {
                bw5.ef0 ef0Var = new bw5.ef0();
                ef0Var.f26886d = optString;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                android.util.ArrayMap arrayMap = ef0Var.f26890h;
                arrayMap.put(2, bool);
                ef0Var.f26887e = com.tencent.mm.protobuf.g.c(optString2);
                arrayMap.put(3, bool);
                ef0Var.f26888f = jSONObject != null ? jSONObject.optString("h5ReqId") : null;
                arrayMap.put(100001, bool);
                ef0Var.f26889g = jSONObject != null ? jSONObject.optLong("h5TimeOut", 0L) : 0L;
                arrayMap.put(100002, bool);
                java.lang.String b17 = ef0Var.b();
                if (!(b17 == null || b17.length() == 0)) {
                    z20.e eVar = z20.e.f469543e;
                    z20.b bVar = new z20.b();
                    bVar.f469537a = eVar;
                    bw5.q9 q9Var = new bw5.q9();
                    q9Var.f31999d = "commonCgi";
                    q9Var.f32013u[1] = true;
                    q9Var.c(java.lang.System.currentTimeMillis());
                    q9Var.b(2);
                    bVar.f469538b = q9Var;
                    bVar.c("Native_handlerJsAction");
                    bVar.f(ef0Var.b());
                    bVar.e(kz5.c1.k(new jz5.l("reqName", optString), new jz5.l(ya.b.METHOD, str)));
                    bVar.b("Native");
                    bVar.a();
                }
                return ef0Var;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CommonCgiEcsActionHandler", "reqType or reqParams is null");
        return null;
    }
}
