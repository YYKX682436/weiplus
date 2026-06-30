package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String liteAppId, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.util.LinkedList<r45.of1> a17 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            int integer = g92.b.f269769e.k2().getInteger(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.of1 of1Var : a17) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("nickname", of1Var.getString(0));
                jSONObject2.put("headURL", of1Var.getString(1));
                jSONObject2.put("role", of1Var.getInteger(2));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("selectRole", integer);
            jSONObject.put("roleArray", jSONArray);
            this.f143443f.c(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiGetFinderAliasInfos", e17, "", new java.lang.Object[0]);
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
