package lq0;

/* loaded from: classes7.dex */
public class f extends tp0.i {
    @Override // lc3.c0
    public java.lang.String f() {
        return "updateFrameSet";
    }

    @Override // tp0.i
    public void z(java.lang.Object view, org.json.JSONObject data) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        super.z(view, data);
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        org.json.JSONObject optJSONObject2 = data.optJSONObject("status");
        if (optJSONObject2 != null) {
            int optInt = optJSONObject != null ? optJSONObject.optInt("width") : 0;
            int optInt2 = optJSONObject != null ? optJSONObject.optInt("height") : 0;
            java.lang.String optString = optJSONObject2.optString("frameSetId");
            boolean optBoolean = optJSONObject2.optBoolean("isOutOfBounds");
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiUpdateFrameSet.SCL", "setFrameSetStatus " + optString + ' ' + optBoolean + ' ' + optInt + ' ' + optInt2);
            gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
            kotlin.jvm.internal.o.d(optString);
            fq0.x Ai = ((fq0.z) rVar).Ai(optString);
            jz5.f0 f0Var = null;
            if (Ai != null) {
                if (optJSONObject2.has("isOutOfBounds")) {
                    boolean z17 = !optBoolean;
                    Ai.f265486j = z17;
                    pm0.v.X(new fq0.s(Ai, z17));
                }
                Ai.j(optInt, optInt2);
                if (optInt2 > 0 && (aVar = Ai.f265484h) != null) {
                    aVar.invoke();
                    Ai.f265484h = null;
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBJsApiUpdateFrameSet.SCL", "frameSet not found!");
            }
        }
    }
}
