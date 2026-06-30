package u93;

/* loaded from: classes.dex */
public class d extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int optInt = jSONObject != null ? jSONObject.optInt("count") : 8;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "invoke loadMoreGamePluginMessages count: %d", java.lang.Integer.valueOf(optInt));
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        java.util.List z18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z1("gh_25d9ac85a4bc", r53.f.f392658f, optInt);
        if (z18 == null || z18.isEmpty()) {
            this.f143442e.b("no more message");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < z18.size(); i17++) {
            if (i17 == z18.size() - 1) {
                m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
                long createTime = ((com.tencent.mm.storage.f9) z18.get(i17)).getCreateTime();
                ((com.tencent.mm.plugin.game.p0) l1Var).getClass();
                r53.f.f392658f = createTime;
            }
            arrayList.add(((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).ij((com.tencent.mm.storage.f9) z18.get(i17)));
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "loadMoreGamePluginMessages getMsgcount: %d return arr: %d", java.lang.Integer.valueOf(z18.size()), java.lang.Integer.valueOf(arrayList.size()));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("messageContent", new org.json.JSONArray((java.util.Collection) arrayList));
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "messageContent:%s", hashMap.toString());
        this.f143442e.e(hashMap);
    }
}
