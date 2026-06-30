package sc3;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sc3.k1 k1Var) {
        super(0);
        this.f406440d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc3.a aVar;
        java.util.Iterator<java.lang.String> keys;
        java.util.Iterator<java.lang.String> keys2;
        bf3.g0 g0Var = bf3.g0.f19627a;
        sc3.k1 k1Var = this.f406440d;
        jc3.x xVar = k1Var.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, "magicbrush.json");
        java.lang.String str = k1Var.Q;
        if (c17 != null) {
            java.lang.String charBuffer = java.nio.charset.StandardCharsets.UTF_8.decode(c17).toString();
            kotlin.jvm.internal.o.f(charBuffer, "toString(...)");
            com.tencent.mars.xlog.Log.i(str, "mbBizConfigInfo txt: ".concat(charBuffer));
            oc3.a aVar2 = oc3.a.f344326c;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(charBuffer);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("plugins");
                if (optJSONObject != null && (keys2 = optJSONObject.keys()) != null) {
                    while (keys2.hasNext()) {
                        java.lang.String next = keys2.next();
                        org.json.JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                        kotlin.jvm.internal.o.d(next);
                        kotlin.jvm.internal.o.d(jSONObject2);
                        java.lang.String string = jSONObject2.getString("version");
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        java.lang.String string2 = jSONObject2.getString("provider");
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        hashMap.put(next, new oc3.b(string, r26.i0.t(string2, "wx2f3fb5db9f226462", "MagicSclPublicService", false)));
                        optJSONObject = optJSONObject;
                    }
                }
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("publicservices");
                if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
                    while (keys.hasNext()) {
                        java.lang.String next2 = keys.next();
                        org.json.JSONObject jSONObject3 = optJSONObject2.getJSONObject(next2);
                        kotlin.jvm.internal.o.d(next2);
                        kotlin.jvm.internal.o.d(jSONObject3);
                        java.lang.String string3 = jSONObject3.getString("version");
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        java.lang.String string4 = jSONObject3.getString("provider");
                        kotlin.jvm.internal.o.f(string4, "getString(...)");
                        hashMap2.put(next2, new oc3.b(string3, r26.i0.t(string4, "wx2f3fb5db9f226462", "MagicSclPublicService", false)));
                    }
                }
                aVar = new oc3.a(hashMap, hashMap2);
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.i("MBBizConfigInfo", "generate biz config failed, src = ".concat(charBuffer));
                aVar = oc3.a.f344326c;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        oc3.a aVar3 = oc3.a.f344326c;
        com.tencent.mars.xlog.Log.i(str, "Read MB config = " + aVar3);
        return aVar3;
    }
}
