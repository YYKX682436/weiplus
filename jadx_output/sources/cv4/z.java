package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/z;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class z extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        jz5.f0 f0Var = null;
        objArr[1] = jSONObject != null ? jSONObject.toString() : null;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiStartCircleToSearch", "appid: %s data: %s", objArr);
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("entrance", 0);
            java.util.Map t17 = kz5.c1.t(com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo.f181442u.a(jSONObject).b());
            java.lang.Object obj = jSONObject.get("imageLocalId");
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 != null) {
                if (str2.length() > 0) {
                    t17.put("imgPath", ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, str2));
                }
            }
            tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
            android.content.Context c17 = c();
            kotlin.jvm.internal.o.f(c17, "getContext(...)");
            ((sg0.e) f1Var).Ai(c17, 7, optInt, t17);
            this.f143443f.d(false);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f143443f.a("data is null");
        }
    }
}
