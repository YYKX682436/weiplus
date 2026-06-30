package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/g;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.l lVar;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLiveCustomBusiness", "invoke appId:" + str + ",data:" + jSONObject);
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        if (jSONObject.optInt("type") == 4) {
            java.lang.String optString = jSONObject.optString("themeId");
            if (optString == null || optString.length() == 0) {
                lVar = new jz5.l(java.lang.Boolean.FALSE, "themId is error: " + optString);
            } else {
                android.content.Intent intent = new android.content.Intent();
                uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                if (optString == null) {
                    optString = "";
                }
                ((v40.s) nVar).Bi(c17, intent, optString);
                lVar = new jz5.l(java.lang.Boolean.TRUE, "");
            }
        } else {
            lVar = new jz5.l(java.lang.Boolean.FALSE, "unknown type");
        }
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            this.f143443f.d(false);
        } else {
            this.f143443f.a((java.lang.String) lVar.f302834e);
        }
    }
}
