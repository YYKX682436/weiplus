package df2;

/* loaded from: classes3.dex */
public final class hj implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230332a;

    public hj(df2.oj ojVar) {
        this.f230332a = ojVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        boolean z17;
        df2.oj ojVar = this.f230332a;
        try {
            com.tencent.mars.xlog.Log.i(ojVar.f230971m, "[liteAppStoreCallBack] actionName = " + str + ", " + obj);
            if (kotlin.jvm.internal.o.b(str, ojVar.f230972n)) {
                kotlinx.coroutines.r2 r2Var = ojVar.f230979u;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                df2.oj.Z6(ojVar);
                return false;
            }
            if (kotlin.jvm.internal.o.b(str, ojVar.f230974p)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                df2.oj.a7(ojVar, jSONObject);
                return false;
            }
            if (kotlin.jvm.internal.o.b(str, ojVar.f230975q)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                java.lang.String optString = ((org.json.JSONObject) obj).optString("giftId");
                boolean c76 = df2.oj.c7(ojVar, jSONObject);
                if (optString != null && optString.length() != 0) {
                    z17 = false;
                    if (z17 && c76) {
                        ojVar.f230982x = new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                        return true;
                    }
                }
                z17 = true;
                return z17 ? false : false;
            }
            if (kotlin.jvm.internal.o.b(str, ojVar.f230976r)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                df2.oj.b7(ojVar, jSONObject);
                return false;
            }
            if (!kotlin.jvm.internal.o.b(str, ojVar.f230977s)) {
                return false;
            }
            jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                return false;
            }
            java.lang.String optString2 = jSONObject.optString("liveId");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            byte[] bArr = ((mm2.e1) ojVar.business(mm2.e1.class)).f328985o;
            if (kotlin.jvm.internal.o.b(optString2, pm0.v.u(((mm2.e1) ojVar.business(mm2.e1.class)).f328988r.getLong(0))) && bArr != null) {
                jSONObject2.put("liveCookies", android.util.Base64.encodeToString(bArr, 2));
            }
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mars.xlog.Log.i(ojVar.f230971m, "[getLiveCookies] json = ".concat(jSONObject3));
            com.tencent.mm.plugin.lite.s sVar = ojVar.f230980v;
            if (sVar == null) {
                return false;
            }
            sVar.c(j17, i17, jSONObject3);
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(ojVar.f230971m, "liteApp err: " + e17.getMessage());
            return false;
        }
    }
}
