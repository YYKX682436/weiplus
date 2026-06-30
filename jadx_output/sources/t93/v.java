package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/v;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String liteAppId, org.json.JSONObject jSONObject, boolean z17) {
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("items");
            int optInt = jSONObject.optInt("batchLoadScene");
            cl0.e eVar = new cl0.e(optString);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int length = eVar.length();
            if (length > 20) {
                length = 20;
            }
            com.tencent.mars.xlog.Log.i("LiteJsApiPreloadFinderFeed", "preload %s", java.lang.Integer.valueOf(eVar.length()));
            for (int i17 = 0; i17 < length; i17++) {
                r45.rv0 rv0Var = new r45.rv0();
                java.lang.Object obj = eVar.get(i17);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.json.InnerJSONObject");
                cl0.c cVar = (cl0.c) obj;
                rv0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(cVar.getString("feedId"))));
                rv0Var.set(1, cVar.getString("encryptId"));
                rv0Var.set(2, cVar.getString("nonceId"));
                linkedList.add(rv0Var);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, optInt);
            this.f143443f.d(false);
        } catch (org.json.JSONException unused) {
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
