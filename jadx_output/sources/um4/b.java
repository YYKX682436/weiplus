package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiBatchGetUserIcon", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("usernameList");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiBatchGetUserIcon", "empty usernameList");
                this.f143443f.a("empty usernameList");
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.lang.String optString = optJSONArray.optString(i17);
                com.tencent.mm.storage.z3 q17 = Bi.q(optString);
                if (q17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiBatchGetUserIcon", "unable to find contact with name " + optString);
                    kotlin.jvm.internal.o.d(optString);
                    hashMap.put(optString, "");
                } else {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(q17.d1());
                    java.lang.String d17 = n07 != null ? n07.d() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    if (d17.length() == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiBatchGetUserIcon", "no icon url for username " + optString);
                        kotlin.jvm.internal.o.d(optString);
                        hashMap.put(optString, "");
                    } else {
                        kotlin.jvm.internal.o.d(optString);
                        hashMap.put(optString, d17);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                this.f143443f.a("none of the usernames have icon");
                return;
            }
            com.tencent.mm.plugin.lite.api.o oVar = this.f143443f;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("icons", new org.json.JSONObject(hashMap));
            oVar.c(jSONObject2, false);
        }
    }
}
