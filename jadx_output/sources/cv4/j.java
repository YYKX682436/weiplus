package cv4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/j;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {
    public final void A(int i17, java.lang.String str, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "onTeachSearchDataReady");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("requestType", i17);
        jSONObject.put("json", str);
        jSONObject.put("isCacheData", i18);
        jSONObject.put("requestId", str2);
        this.f143443f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "[getTeachSearchData] params: %s", hashMap);
            int e17 = com.tencent.mm.plugin.websearch.l2.e(hashMap, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int e18 = com.tencent.mm.plugin.websearch.l2.e(hashMap, "type", 0);
            java.lang.String str2 = (java.lang.String) hashMap.get("requestId");
            java.lang.String str3 = (java.lang.String) hashMap.get("guideInfo");
            java.lang.String str4 = (java.lang.String) hashMap.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            java.lang.Object obj = hashMap.get("h5Version");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj).intValue();
            if (intValue == 0) {
                intValue = com.tencent.mm.plugin.websearch.l2.a(9);
            }
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            su4.z1 z1Var = new su4.z1(e17, e18, intValue, hashCode(), f17, su4.o2.d("discoverSearchEntry").optLong("guideParam"), str2, str4, str3, null);
            gm0.j1.d().a(1048, this);
            gm0.j1.d().g(z1Var);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f143443f.a("data is nil");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof su4.z1) {
            su4.z1 z1Var = (su4.z1) m1Var;
            int i19 = z1Var.f413152i;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ", webviewID = " + i19);
            if (i19 == hashCode()) {
                gm0.j1.d().q(1048, this);
                if (i17 == 0 && i18 == 0) {
                    A(0, z1Var.f413149f.f386438d, 0, z1Var.f413153m);
                } else {
                    A(0, "", 0, z1Var.f413153m);
                }
            }
        }
    }
}
