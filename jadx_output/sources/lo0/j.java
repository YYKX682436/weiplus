package lo0;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320015a;

    /* renamed from: b, reason: collision with root package name */
    public lo0.k f320016b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f320017c;

    public j(org.json.JSONObject groupJson, java.util.Map beautyItems) {
        kotlin.jvm.internal.o.g(groupJson, "groupJson");
        kotlin.jvm.internal.o.g(beautyItems, "beautyItems");
        java.lang.String optString = groupJson.optString(dm.i4.COL_ID);
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            org.json.JSONArray optJSONArray = groupJson.optJSONArray("items");
            if (!(optJSONArray == null) && optJSONArray.length() >= 2) {
                java.util.HashMap hashMap = new java.util.HashMap();
                c75.c.d(optJSONArray, new lo0.i(beautyItems, hashMap));
                if (hashMap.size() >= 2) {
                    this.f320015a = optString;
                    this.f320017c = hashMap;
                    this.f320016b = null;
                    return;
                }
                throw new lo0.u("Exclusive group contains less than 2 valid items. ".concat(optString));
            }
            throw new lo0.u("Exclusive group contains less than 2 items. ".concat(optString));
        }
        throw new lo0.u("Exclusive group ID is empty.");
    }

    public j(lo0.j jVar, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = jVar.f320017c.entrySet().iterator();
        while (it.hasNext()) {
            lo0.k kVar = (lo0.k) map.get((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            if (!(kVar == null)) {
                hashMap.put(kVar.f320018a, kVar);
            }
        }
        this.f320015a = jVar.f320015a;
        this.f320017c = hashMap;
        this.f320016b = null;
    }
}
